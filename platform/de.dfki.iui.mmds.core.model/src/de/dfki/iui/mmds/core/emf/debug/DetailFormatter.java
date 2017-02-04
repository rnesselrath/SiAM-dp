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
package de.dfki.iui.mmds.core.emf.debug;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;

public class DetailFormatter {

	static public String format(Map.Entry<Object, Object> entry) {
		String key = entry.getKey() == null ? "null" : entry.getKey().toString();
		Object value = entry.getValue();
		String v = "null";
		if (value != null)
			if (value instanceof EObject) {
				v = ((EObject) value).eClass().getName();
			} else {
				v = value.toString();
			}
		return key + ": " + v;
	}

	static public String format(EObject object) {
		return EmfPersistence.writeToString(object);
	}

}
