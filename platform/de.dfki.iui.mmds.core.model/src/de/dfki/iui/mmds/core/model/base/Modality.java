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
package de.dfki.iui.mmds.core.model.base;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

public class Modality {
	public static BString GUI = new BString("GUI");
	public static BString SPEECH = new BString("SPEECH");
	public static BString EYEGAZE = new BString("EYEGAZE");
	public static BString HAND_GESTURE = new BString("HAND_GESTURE");
	public static BString AUDIO = new BString("AUDIO");
	public static BString VIRTUAL_CHARACTER = new BString("VIRTUAL_CHARACTER");
	public static BString TANGIBLE = new BString("TANGIBLE");
	public static BString HAPTIC = new BString("HAPTIC");

}
