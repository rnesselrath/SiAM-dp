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

import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.base.Person;
import de.dfki.iui.mmds.core.model.base.Session;

public interface ISessionManager {

	DialogParticipant getParticipant(String participantId);

	List<DialogParticipant> retrieveParticipantForService(String serviceInstance, String serviceName);

	List<Session> retrieveSessionsForParticipant(String initiator);

	List<DialogParticipant> retrieveParticipantsForSession(String session);

	void addUser(Person user);

	void removeUser(Person user);

	void removeUser(String userId);

	void registerSession(Session session);

	void registerSession(String sessionId);

}