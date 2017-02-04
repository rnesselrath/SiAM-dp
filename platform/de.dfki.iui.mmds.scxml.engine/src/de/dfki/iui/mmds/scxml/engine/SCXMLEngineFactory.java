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
package de.dfki.iui.mmds.scxml.engine;

import java.net.URL;

import de.dfki.iui.mmds.scxml.engine.impl.SCXMLEngineImpl;

public class SCXMLEngineFactory {
	private static SCXMLEngineFactory instance = null;

	/**
	 * Instance of ProcessEngineFactory is returned
	 * 
	 * @return ProcessEngineFactory
	 */
	public static SCXMLEngineFactory getInstance() {
		if (instance == null) {
			instance = new SCXMLEngineFactory();
		}
		return instance;
	}

	public SCXMLEngine createSCXMLEngine(URL url) {
		SCXMLEngine scxmlEngine = new SCXMLEngineImpl();
		URL preurl = scxmlEngine.preprocess(url);
		scxmlEngine.initialize(preurl);
		return scxmlEngine;
	}
	
	public SCXMLEngine createSCXMLEngine(URL url,String id) {
		SCXMLEngine scxmlEngine = createSCXMLEngine(url);
		scxmlEngine.setId(id);
		return scxmlEngine;
	}
	
	public SCXMLEngine createSCXMLEngine() {
		SCXMLEngine scxmlEngine = new SCXMLEngineImpl();
		return scxmlEngine;
	}

	/**
	 * Creates an scxml engine and gives the given input to the scxml engine to set a specific engine id.
	 * 
	 * @param url
	 * @param idSuffix
	 * @return
	 */
	public SCXMLEngine createSCXMLEngineIdSuffix( URL url, String idSuffix ) {
		SCXMLEngine scxmlEngine = new SCXMLEngineImpl();
		scxmlEngine.initialize( scxmlEngine.preprocess( url ), idSuffix );
		return scxmlEngine;
	}
}
