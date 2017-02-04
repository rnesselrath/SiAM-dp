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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EmfUtils {

	public static <T extends EObject> T clone(T eObject) {
		if (eObject instanceof EClass)
			return eObject;
		EmfCloner cloner = new EmfCloner();
		@SuppressWarnings("unchecked")
		T clone = (T) cloner.copy(eObject);
		cloner.copyReferences();
		return clone;
	}

	public static Set<EPackage> collectSiamPackages(boolean includeCore, boolean includeExtensions) {
		Set<EPackage> result = new HashSet<EPackage>();

		// collect the siam core packages
		Object[] keys = EPackage.Registry.INSTANCE.keySet().toArray();
		for (int i = 0; i < keys.length; ++i) {
			String key = (String) keys[i];
			EPackage temp = EPackage.Registry.INSTANCE.getEPackage(key);
			EList<EAnnotation> eAnnotations = temp.getEAnnotations();
			for (EAnnotation ann : eAnnotations) {
				if (ann.getSource().equals("http://de.dfki.iui.mmds/CoreModel") && includeCore) {
					addPackage(result, temp);
					break;
				} else if (ann.getSource().equals("http://de.dfki.iui.mmds/ExtensionModel") && includeExtensions) {
					addPackage(result, temp);
					break;
				}
			}
		}
		return result;
	}

	public static Set<EClass> collectSubTypes(EClass type, boolean includeAbstract) {
		Set<EClass> result = new HashSet<EClass>();
		Set<EPackage> siamPackages = collectSiamPackages(true, true);
		for (EPackage pkg : siamPackages) {
			for (EClassifier cls : pkg.getEClassifiers()) {
				if (cls instanceof EClass) {
					EClass c = (EClass) cls;
					if (type.isSuperTypeOf(c) && c.isAbstract() == includeAbstract) {
						result.add(c);
					}
				}
			}
		}
		return result;
	}

	private static void addPackage(Set<EPackage> result, EPackage p) {
		result.add(p);
		for (EPackage subPackage : p.getESubpackages()) {
			addPackage(result, subPackage);
		}
	}
	

	public <T extends EObject> T cloneEObject(T eObject) {
		return EmfUtils.clone(eObject);
	}

	public <T extends EObject> T copyEObject(T eObject) {
		return EcoreUtil.copy(eObject);
	}
	
	public <T> EList<T> createEList(T... obj) {
		EList<T> result = new BasicEList<T>();
		for (T o : obj) {
			result.add(o);
		}
		return result;
	}
	
	public <T> void addToEList(EList<T> list, T obj) {
		list.add(obj);
	}
	
	public <T> void addToEList(EList<T> list, int idx, T obj) {
		list.add(idx, obj);
	}
}
