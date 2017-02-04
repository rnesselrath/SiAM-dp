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
package de.dfki.iui.mmds.scxml.engine.events;

import org.osgi.service.event.Event;


public class SCXMLEventHandler implements org.osgi.service.event.EventHandler {

	private SCXMLEventDelegate delegate = null;
	private String id = null;
	
	public SCXMLEventHandler(SCXMLEventDelegate delegate, String id) {
		this.id=id;
		this.delegate=delegate;
	}
	
	public SCXMLEventHandler(SCXMLEventDelegate delegate) {
		this.delegate=delegate;
	}
	
	@Override
	public void handleEvent(Event event) {
		if (id != null) {
			if (!id.equals(event.getProperty( SCXMLEvent.ID ))) {
				return;
			}
		}
		
		if (event instanceof SCXMLOnEntryEvent) {
			delegate.notifyOnEntry((SCXMLOnEntryEvent)event);
		} else if (event instanceof SCXMLOnExitEvent) {
			delegate.notifyOnExit((SCXMLOnExitEvent)event);
		} else if (event instanceof SCXMLOnTransitionEvent) {
			delegate.notifyOnTransition((SCXMLOnTransitionEvent)event);
		} else if (event instanceof SCXMLActiveStatesEvent) {
			delegate.notifyActiveStates((SCXMLActiveStatesEvent)event);
		}
		
	}

}
