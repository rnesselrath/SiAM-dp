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
package de.dfki.iui.mmds.sdk.editors.grammar_rules.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.provider.Grammar_rulesItemProviderAdapterFactory;


/**
 * 
 * This class is an extension to the Grammar_rulesItemProviderAdapter.
 * It assigns the custom ItemProvider to the classes of type Entity and SemanticMapping
 * 
 * @author Evica Ilieva
 *
 */
public class Grammar_rulesCustomItemProviderAdapterFactory extends Grammar_rulesItemProviderAdapterFactory {
	 @Override
	    public Adapter createEntityAdapter() {
	        if (entityItemProvider == null)
	        {

	        	entityItemProvider = new EntitiyCustomItemProvider(this);
	        }
	        return entityItemProvider;
	      }
	 
	 @Override
	    public Adapter createSemanticMappingAdapter() {
		 

	        if (semanticMappingItemProvider == null)
	        {
	        	

	        	semanticMappingItemProvider = new SemanticMappingCustomItemProvider(this);
	        }
	        return semanticMappingItemProvider;
	      }
}
