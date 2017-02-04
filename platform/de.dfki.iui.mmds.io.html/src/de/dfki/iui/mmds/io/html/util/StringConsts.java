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
package de.dfki.iui.mmds.io.html.util;

public class StringConsts {
	// can be set from outside
	public static String MMDS_ROOT_PATH = "/html";

	private static final String MMDS_APP_PATH = "/app/";
	private static final String MMDS_PLATFORM_PATH = "/platform/";
	public static final String MMDS_JS_CORE = "mmds-core.js";

	public static final String JQUERY_CSS_URL = "css/jquery-ui.min.css";
	public static final String JQUERY_URL = "jquery-1.9.1.js";
	public static final String JQUERY_UI_URL = "ui/jquery-ui.min.js";
	public static final String JQUERY_BLOCKUI = "jquery.blockUI.js";

	public static String getMmdsAppPath() {
		return MMDS_ROOT_PATH + MMDS_APP_PATH;
	}

	public static String getMmdsPlatformPath() {
		return MMDS_ROOT_PATH + MMDS_PLATFORM_PATH;
	}

}
