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
package de.dfki.iui.mmds.dialogue;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.env.jexl.JexlContext;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EDataType;

import de.dfki.iui.mmds.core.emf.datatypes.BDataType;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.State;
import de.dfki.iui.mmds.scxml.TransitionTarget;
import de.dfki.iui.mmds.scxml.XData;

class SiamContext extends JexlContext {

	static SiamStateMachine siamStateMachine;

	public SiamContext(SiamStateMachine _siamStateMachine) {
		super();
		siamStateMachine = _siamStateMachine;
	}

	SiamContext(Context parent) { 
		super(parent);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void setLocal(String name, Object value) {
		if (value != null && value.toString().equals("[data: null]") && has("stateID")) {
			// value is variable from scxml model
			String stateID = (String) get("stateID");
			value = null;
			if (DialogueComponent.INSTANCE.idToScxmlState.containsKey(stateID)) {
				TransitionTarget tt = DialogueComponent.INSTANCE.idToScxmlState.get(stateID);
				State state = null;
				if (tt instanceof State) {
					state = (State) tt;
				}
				while (value == null && state != null) {
					// search for variable in scxml-model and set variable with
					// default value in context.
					for (Data data : state.getDatamodel().getData()) {
						if (data instanceof XData && ((XData) data).getId().equals(name)) {
							value = ((XData) data).getObject();
							if (name.startsWith("_variable$")) {
								Object defaultValue = null;
								String variableName = name.split("\\$")[1];
								Variable variable = (Variable) value;
								if (variable.getDefault() != null && !variable.getDefault().isEmpty()) {
									if (variable.getEmfType() != null && variable.getEmfType() instanceof EDataType) {
										defaultValue = variable.getEmfType().getEPackage().getEFactoryInstance().createFromString((EDataType) variable.getEmfType(), variable.getDefault());
									} else if (variable.getType() != null && !variable.getType().isEmpty()) {
										try {
											defaultValue = siamStateMachine.siamEvaluator.eval(this, variable.getDefault());
										} catch (IllegalArgumentException | SecurityException | SCXMLExpressionException e) {
											final Writer result = new StringWriter();
											final PrintWriter printWriter = new PrintWriter(result);
											e.printStackTrace(printWriter);
											Logger.getLogger(this.getClass()).warn(
													String.format("Cannot create default variable value \"%s\" for variable \"%s\" of type %s!\n%s", variable.getDefault(), variable.getName(),
															variable.getType(), result.toString()));
										}
										if (defaultValue == null) {
											Logger.getLogger(this.getClass()).warn(
													String.format("Cannot create default variable value \"%s\" for variable \"%s\" of type %s!", variable.getDefault(), variable.getName(),
															variable.getType()));
										}
									} else {
										Logger.getLogger(this.getClass()).warn(
												String.format("Cannot create default value for variable \"%s\". The type %s is not serializable.", variable.getName(), variable.getEmfType()));
									}
								}
								super.setLocal(variableName, defaultValue);
							}
							break;
						}
					}
					// go up to containing state and search for variable here
					if (state.eContainer() instanceof State) {
						state = (State) state.eContainer();
					} else {
						state = null;
					}
				}
			}
		} else {
			// type check. Convert BDataType to DataType or vice versa if
			// necessary.
			Variable variable = (Variable) get("_variable$" + name);

			if (variable != null && value != null) {
				Class variableInstanceClass;
				if (variable.getEmfType() != null) {
					variableInstanceClass = variable.getEmfType().getInstanceClass();
				} else if (variable.getType() != null && !variable.getType().isEmpty()) {
					try {
						variableInstanceClass = DialogueComponent.INSTANCE.projectContext.getBundleContext().getBundle().loadClass(variable.getType());
					} catch (ClassNotFoundException e) {
						throw new IllegalArgumentException(
								String.format("Cannot assign value to variable \"%s\" of type %s. Class \'%s\' does not exist", name, variable.getType(), variable.getType()));
					}
				} else
					throw new IllegalArgumentException(String.format("No type defined for variable \"%s\" in scope of state \"%s\".", variable.getName(), get("stateID")));
				if (!(variableInstanceClass.isInstance(value)) && !areMatchingClassTypes(variableInstanceClass, value.getClass())) {
					boolean success = false;
					if (value instanceof BDataType) {
						ParameterizedType type = (ParameterizedType) value.getClass().getGenericSuperclass();
						if (((Class) type.getActualTypeArguments()[0]).getName().equals(variableInstanceClass.getName())) {
							if (!((BDataType) value).isResolved() && ((BDataType) value).getExpression().isEmpty()) {
								value = "";
							} else {
								value = ((BDataType) value).getValue();
							}
							success = true;
						} else if (((Class) type.getActualTypeArguments()[0]).getName().equals(String.class.getName())) {
							if (BDataType.class.isAssignableFrom(variableInstanceClass)) {
								try {
									value = variableInstanceClass.getMethod("valueOf", String.class).invoke(null, value.toString());
									success = true;
								} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					} else if (variableInstanceClass.getSuperclass() == BDataType.class) {
						BDataType newValue;
						try {
							newValue = (BDataType) variableInstanceClass.newInstance();
							newValue.setValue(value);
							value = newValue;
							success = true;
						} catch (InstantiationException | IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ClassCastException e) {
							success = false;
						}
					}
					if (!success) {
						String message = String.format("Cannot assign value of type %s to variable \"%s\" of type %s: Wrong type.", value.getClass().getName(), name, variableInstanceClass.getName());
						Logger.getLogger(this.getClass()).error(message);
						throw new IllegalArgumentException(message);
					}
				}
			}
		}
		super.setLocal(name, value);
	}

	static boolean areMatchingClassTypes(Class clazz1, Class clazz2) {
		clazz1 = wrap(clazz1);
		clazz2 = wrap(clazz2);
		return clazz1.equals(clazz2);
	}

	private static final Map<Class<?>, Class<?>> PRIMITIVES_TO_WRAPPERS = new HashMap<Class<?>, Class<?>>();

	private static <T> Class<T> wrap(Class<T> c) {
		if (PRIMITIVES_TO_WRAPPERS.isEmpty()) {
			PRIMITIVES_TO_WRAPPERS.put(boolean.class, Boolean.class);
			PRIMITIVES_TO_WRAPPERS.put(byte.class, Byte.class);
			PRIMITIVES_TO_WRAPPERS.put(char.class, Character.class);
			PRIMITIVES_TO_WRAPPERS.put(double.class, Double.class);
			PRIMITIVES_TO_WRAPPERS.put(float.class, Float.class);
			PRIMITIVES_TO_WRAPPERS.put(int.class, Integer.class);
			PRIMITIVES_TO_WRAPPERS.put(long.class, Long.class);
			PRIMITIVES_TO_WRAPPERS.put(short.class, Short.class);
			PRIMITIVES_TO_WRAPPERS.put(void.class, Void.class);
		}
		return c.isPrimitive() ? (Class<T>) PRIMITIVES_TO_WRAPPERS.get(c) : c;
	}

	private static final long serialVersionUID = 3244867294078681578L;

}
