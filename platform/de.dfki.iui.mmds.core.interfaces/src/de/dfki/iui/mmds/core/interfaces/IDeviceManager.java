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
package de.dfki.iui.mmds.core.interfaces;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.model.base.Modality;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.SimpleService;
import de.dfki.iui.mmds.core.model.project.SiamInternalServiceInterface;

public interface IDeviceManager {

	ComponentContext getComponentContext();

	// a device is discovered by the knowledge manager or another bundle that
	// provides a device connection

	void deviceDiscovered(SimpleService service);

	void deviceLost(SimpleService device);

	void deviceConnected(String siamId, SimpleService device);

	void deviceDisconnected(String siamId);

	// adds a device to the list supported devices. The device is not
	// necessarily active.
	void registerDevice(SiamInternalServiceInterface device);

	void unregisterDevice(String deviceId);

	void reset();

	List<Service> findServiceForModality(Modality modality);

	List<String> findServiceForType(EClass speech);

	Map<String, SimpleService> getConnectedServices();

	SiamInternalServiceInterface getSiamInternalInterface(String id);

}