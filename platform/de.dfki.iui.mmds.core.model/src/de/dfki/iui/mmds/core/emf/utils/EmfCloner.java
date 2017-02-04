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
package de.dfki.iui.mmds.core.emf.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.emf.datatypes.BDataType;

public class EmfCloner extends Copier {

	Queue<EObject> queue = new LinkedList<EObject>();

	@Override
	public void copyReferences() {
		List<EObject> eObjects = new ArrayList<EObject>();
		eObjects.addAll(keySet());

		for (int i = 0; i < eObjects.size(); ++i) {
			queue.add(eObjects.get(i));

			while (!queue.isEmpty()) {
				EObject eObject = (EObject) queue.poll();

				EClass eClass = eObject.eClass();
				for (int j = 0, size = eClass.getFeatureCount(); j < size; ++j) {
					EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(j);
					if (!eStructuralFeature.isChangeable() || eStructuralFeature.isDerived())
						continue;
					if (eStructuralFeature instanceof EReference) {
						EReference eReference = (EReference) eStructuralFeature;
						if (!eReference.isContainment() && !eReference.isContainer()) {
							copyReference(eReference, eObject, get(eObject));
						}
					} else if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
						FeatureMap featureMap = (FeatureMap) eObject.eGet(eStructuralFeature);
						FeatureMap copyFeatureMap = (FeatureMap) get(eObject).eGet(getTarget(eStructuralFeature));
						int copyFeatureMapSize = copyFeatureMap.size();
						for (int k = 0, featureMapSize = featureMap.size(); k < featureMapSize; ++k) {
							EStructuralFeature feature = featureMap.getEStructuralFeature(k);
							if (feature instanceof EReference) {
								Object referencedEObject = featureMap.getValue(k);
								Object copyReferencedEObject = get(referencedEObject);
								if (copyReferencedEObject == null && referencedEObject != null) {
									EReference reference = (EReference) feature;
									if (!useOriginalReferences || reference.isContainment() || reference.getEOpposite() != null) {
										continue;
									}
									copyReferencedEObject = referencedEObject;
								}
								// If we can't add it, it must already be in
								// the
								// list so find it and move it to the end.
								//
								if (!copyFeatureMap.add(feature, copyReferencedEObject)) {
									for (int l = 0; l < copyFeatureMapSize; ++l) {
										if (copyFeatureMap.getEStructuralFeature(l) == feature && copyFeatureMap.getValue(l) == copyReferencedEObject) {
											copyFeatureMap.move(copyFeatureMap.size() - 1, l);
											--copyFeatureMapSize;
											break;
										}
									}
								}
							} else {
								copyFeatureMap.add(featureMap.get(k));
							}
						}

					}
				}
			}
		}

	}

	@Override
	protected void copyAttributeValue(EAttribute eAttribute, EObject eObject, Object value, EStructuralFeature.Setting setting) {
		if (value instanceof BDataType) {
			try {
				BDataType<?> newValue = (BDataType<?>) value.getClass().newInstance();
				newValue.setValue(value.toString());
				value = newValue;
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		setting.set(value);
	}

	/**
	 * Called to handle the copying of a cross reference; this adds values or sets a single value as appropriate for the multiplicity while omitting any bidirectional reference that isn't in the copy
	 * map.
	 * 
	 * @param eReference
	 *            the reference to copy.
	 * @param eObject
	 *            the object from which to copy.
	 * @param copyEObject
	 *            the object to copy to.
	 */
	@Override
	protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {

		if (eObject.eIsSet(eReference)) {
			if (eReference.isMany()) {
				@SuppressWarnings("unchecked")
				InternalEList<EObject> source = (InternalEList<EObject>) eObject.eGet(eReference);
				@SuppressWarnings("unchecked")
				InternalEList<EObject> target = (InternalEList<EObject>) copyEObject.eGet(eReference);
				if (source.isEmpty()) {
					target.clear();
				} else {
					boolean isBidirectional = eReference.getEOpposite() != null;
					int index = 0;
					for (Iterator<EObject> k = resolveProxies ? source.iterator() : source.basicIterator(); k.hasNext();) {
						EObject referencedEObject = k.next();
						EObject copyOfReferencedEObject;
						if (referencedEObject.eClass().getEPackage() instanceof EcorePackage) {
							copyOfReferencedEObject = referencedEObject;
						} else {
							copyOfReferencedEObject = get(referencedEObject);
						}
						if (copyOfReferencedEObject == null) {
							// no clone available, yet
							EObject copy = copy(referencedEObject);
							queue.add(referencedEObject);
							target.addUnique(index, copy);
							++index;
						} else {
							if (isBidirectional) {
								int position = target.indexOf(copyOfReferencedEObject);
								if (position == -1) {
									target.addUnique(index, copyOfReferencedEObject);
								} else if (index != position) {
									target.move(index, copyOfReferencedEObject);
								}
							} else {
								target.addUnique(index, copyOfReferencedEObject);
							}
							++index;
						}
					}
				}
			} else {
				EObject referencedEObject = (EObject) eObject.eGet(eReference, true);
				if (referencedEObject == null) {
					copyEObject.eSet(eReference, null);
				} else {
					Object copyOfReferencedEObject;
					if (referencedEObject.eClass().getEPackage() instanceof EcorePackage) {
						copyOfReferencedEObject = referencedEObject;
					} else {
						copyOfReferencedEObject = get(referencedEObject);
					}
					if (copyOfReferencedEObject == null) {
						if (referencedEObject instanceof EObject) {
							Set<EObject> keys = new HashSet<EObject>(keySet());				// adaption
							
							EObject copy = copy(referencedEObject);
							
							Set<EObject> newKeys = new HashSet<EObject>(keySet());			// adaption
							newKeys.removeAll(keys);										// adaption
							queue.addAll(newKeys);											// adaption
							
//							queue.add(referencedEObject);									// adaption
							copyEObject.eSet(eReference, copy);
						} else {
							throw new UnsupportedOperationException("Check this in EmfCloner. This shouldn't happen.");
							// if (useOriginalReferences &&
							// eReference.getEOpposite() == null)
							// {
							// copyEObject.eSet(getTarget(eReference),
							// referencedEObject);
							// }
						}
					} else {
						copyEObject.eSet(eReference, copyOfReferencedEObject);
					}
				}
			}
		}
	}
}
