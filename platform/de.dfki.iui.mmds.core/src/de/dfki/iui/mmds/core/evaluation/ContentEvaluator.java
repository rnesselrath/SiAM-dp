/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
package de.dfki.iui.mmds.core.evaluation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.dfki.iui.mmds.core.emf.computation.Overlay;
import de.dfki.iui.mmds.core.emf.datatypes.BDataType;
import de.dfki.iui.mmds.core.model.base.BObject;

class ContentEvaluator {

	private final Set<EObject> alreadyEvaluated = new HashSet<EObject>();
	static private final JexlEngine engine = new JexlEngine();

	// Evaluates object with help of the context.
	// Does affect the original object!!! (it is not cloned before changes are
	// performed)
	// 1. Evaluate all attributes of the object
	// 2. Evaluate inner objects
	// 3. If binding defined then evaluate and replace object with result of
	// binding evaluation and overly of original object

	List<EObject> evaluateContents(EObject object, JexlContext context) {
		List<EObject> result = new ArrayList<EObject>();
		if (object instanceof EClass || object.eClass().getEPackage().getName().equals("ecore") || alreadyEvaluated.contains(object)) {
			// does not need evaluation
			result.add(object);
		} else {
			alreadyEvaluated.add(object);
			// 1. Evaluate all attributes of the object
			evaluateAttributes(object, context);
			EClass eClass = object.eClass();
			// 2. Alle inneren Objekte evaluieren
			for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
				EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
				if (eStructuralFeature instanceof EReference && eStructuralFeature.isChangeable()) {
					EReference eReference = (EReference) eStructuralFeature;
					if (eReference.isMany()) {
						@SuppressWarnings("unchecked")
						List<EObject> contents = (List<EObject>) object.eGet(eReference);
						for (int j = 0; j < contents.size(); ++j) {
							EObject content = contents.get(j);
							List<EObject> newContent = evaluateContents(content, context);
							if (!newContent.isEmpty()) {
								contents.remove(j);
								contents.addAll(j, newContent);
							}
						}
					} else {
						EObject content = (EObject) object.eGet(eReference);
						if (content != null) {
							List<EObject> newContent = evaluateContents(content, context);
							if (!newContent.isEmpty()) {
								EObject newElement = newContent.get(0);
								if (newElement != content) {
									object.eSet(eReference, newContent.get(0));
								}
								if (newContent.size() > 1) {
									Logger.getLogger(getClass()).warn("Too many values for non multislot");
								}
							}
						}
					}
				}
			}
			// 3. Wenn Binding vorhanden, dann auswerten und aktuellen Eintrag
			// mit Overlay ersetzen
			result.addAll(checkAndEvalBinding(object, context));
		}
		return result;
	}

	private List<EObject> checkAndEvalBinding(EObject object, JexlContext context) {
		List<EObject> result = new ArrayList<EObject>();
		if (object instanceof BObject) {
			String binding = ((BObject) object).getBinding();
			if (binding != null && !binding.isEmpty()) {
				Expression expression = engine.createExpression(binding.replace("#", "__"));
				Object eval = expression.evaluate(context);
				if (eval instanceof EObject) {
					EObject overlay = Overlay.compute(object, (EObject) eval);
					((BObject) overlay).setBinding(null);
					result.add(overlay);
				} else if (eval instanceof List) {
					for (Object item : (List<?>) eval) {
						if (item instanceof EObject) {
							EObject overlay = Overlay.compute(object, (EObject) item);
							((BObject) overlay).setBinding(null);
							result.add(overlay);
						}
					}
				}
				if (result.isEmpty()) {
					Logger.getLogger(getClass()).error("Result of " + binding + " is empty!");
				}
			}
		}
		if (result.isEmpty()) {
			result.add(object);
		}
		return result;
	}

	private void evaluateAttributes(EObject object, JexlContext context) {
		for (EAttribute attribute : object.eClass().getEAllAttributes()) {
			if (attribute.getEType().getInstanceClass().getSuperclass() == BDataType.class) {
				if (attribute.isMany()) {
					@SuppressWarnings("unchecked")
					EList<BDataType<?>> dataTypes = (EList<BDataType<?>>) object.eGet(attribute, true);
					for (int i = 0; i < dataTypes.size(); ++i) {
						BDataType<?> value = dataTypes.get(i);
						if (value != null && !value.isResolved()) {
							Expression expression = engine.createExpression(value.getExpression());
							String newContent = expression.evaluate(context).toString();
							try {
								// search datatype constructor with string as
								// parameter and create a new instance
								dataTypes.set(i, value.getClass().getConstructor(String.class).newInstance(newContent));
							} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				} else {
					BDataType<?> value = (BDataType<?>) object.eGet(attribute, true);
					if (value != null && !value.isResolved()) {
						Expression expression = engine.createExpression(value.getExpression());
						Object result = expression.evaluate(context);
						String newContent;
						if (result == null) {
							newContent = "null";
						} else {
							newContent = result.toString();
						}
						try {
							object.eSet(attribute, value.getClass().getConstructor(String.class).newInstance(newContent));
						} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public Object eval(MapContext mergedContext, String expr) {
		Expression expression = engine.createExpression(expr);
		return expression.evaluate(mergedContext);
	}

}
