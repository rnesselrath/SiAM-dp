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
package de.dfki.iui.mmds.sdk.editors.model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import de.dfki.iui.mmds.core.emf.utils.EmfUtils;

public class ProjectEditorEditingDomain extends AdapterFactoryEditingDomain {

	static protected Collection<Object> globalClipboard;

	public ProjectEditorEditingDomain(AdapterFactory adapterFactory, CommandStack commandStack,
			Map<Resource, Boolean> resourceToReadOnlyMap) {
		super(adapterFactory, commandStack, resourceToReadOnlyMap);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object, Object sibling) {
		Collection<Object> childDescriptors = (Collection<Object>) super.getNewChildDescriptors(object, sibling);
		// If no object is specified, but an existing sibling is,
		// the object is
		// its parent.
		if (object == null) {
			object = getParent(sibling);
		}

		if (object instanceof EObject) {
			Set<EPackage> packages = EmfUtils.collectSiamPackages(false, true);
			EObject eObject = (EObject) object;

			EList<EReference> allContainments = eObject.eClass().getEAllContainments();
			for (EReference containment : allContainments) {
				for (EPackage p : packages) {
					for (EClassifier classifier : p.getEClassifiers()) {
						if (classifier instanceof EClass) {
							EClass clazz = (EClass) classifier;

							if (clazz.getInstanceClass() == null) {
								// EFactory factory = p.getEFactoryInstance();
								// EObject createdClass = factory.create(clazz);
								// generically create clazz
							} else if (!clazz.isAbstract() &&   (containment.getEReferenceType()==EcorePackage.eINSTANCE.getEObject() ||  containment.getEReferenceType().isSuperTypeOf(clazz))) {
								try {
									CommandParameter commandParameter = new CommandParameter(null, containment, EcoreUtil.create(clazz));
									childDescriptors.add(commandParameter);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		return childDescriptors;

	}

	@Override
	public Collection<Object> getClipboard() {
		return globalClipboard;
	}

	@Override
	public void setClipboard(Collection<Object> clipboard) {
		globalClipboard = clipboard;
	}

}
