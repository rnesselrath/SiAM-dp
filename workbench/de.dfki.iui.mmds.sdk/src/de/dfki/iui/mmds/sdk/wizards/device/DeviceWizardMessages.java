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
package de.dfki.iui.mmds.sdk.wizards.device;

import org.eclipse.osgi.util.NLS;

public class DeviceWizardMessages extends NLS {

	private static final String BUNDLE_NAME = "de.dfki.iui.mmds.sdk.wizards.device.device_wizard";

	public static String NewProjectWizard_title;
	public static String NewProjectWizard_MainPage_title;
	public static String NewProjectWizard_MainPage_desc;
	public static String PluginContentPage_noEE;
	public static String PluginContentPage_applicationGroup;
	public static String PluginContentPage_appName;
	public static String ContentPage_title;
	public static String ContentPage_desc;
	public static String ContentPage_pGroup;
	public static String ContentPage_pid;
	public static String ContentPage_pversion;
	public static String ContentPage_pname;
	public static String ContentPage_pprovider;
	public static String NewProjectCreationPage_executionEnvironments_label;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, DeviceWizardMessages.class);
	}

}
