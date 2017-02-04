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
package de.dfki.iui.mmds.core.sessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.ISessionManager;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.DialogParticipant;
import de.dfki.iui.mmds.core.model.base.Person;
import de.dfki.iui.mmds.core.model.base.Session;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.Service;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;

public class SessionManager implements ISessionManager {

	private IKnowledgeManager knowledgeManager;

	protected void activate(ComponentContext context) {
		knowledgeManager = (IKnowledgeManager) context.locateService("IKnowledgeManager");
	}

	@Override
	public List<DialogParticipant> retrieveParticipantForService(String serviceInstance, String serviceName) {
		@SuppressWarnings("unchecked")
		List<ServiceInstance> entities = (List<ServiceInstance>) knowledgeManager
				.getEntitiesOfType(IoPackage.eINSTANCE.getServiceInstance());
		Optional<ServiceInstance> optional = entities.stream()
				.filter(s -> serviceInstance.equals(s.getServiceInstanceName())).findFirst();
		if (optional.isPresent()) {
			Optional<Service> service = optional.get().getServices().stream()
					.filter(s -> s.getServiceName().equals(serviceName)).findFirst();
			if (service.isPresent())
				return service.get().getUser();
		}
		return Collections.emptyList();
	}

	@Override
	public List<Session> retrieveSessionsForParticipant(String initiator) {
		@SuppressWarnings("unchecked")
		List<Session> sessions = (List<Session>) knowledgeManager.getEntitiesOfType(BasePackage.eINSTANCE.getSession());
		List<Session> result = new ArrayList<Session>();
		for (Session session : sessions) {
			Optional<DialogParticipant> optional = session.getParticipants().stream()
					.filter(p -> p.getParticipantId().equals(initiator)).findFirst();
			if (optional.isPresent())
				result.add(session);
		}
		return result;
	}

	@Override
	public List<DialogParticipant> retrieveParticipantsForSession(String session) {
		@SuppressWarnings("unchecked")
		List<Session> sessions = (List<Session>) knowledgeManager.getEntitiesOfType(BasePackage.eINSTANCE.getSession());
		Optional<Session> optional = sessions.stream().filter(s -> s.getSessionID().equals(session)).findFirst();
		if (optional.isPresent())
			return optional.get().getParticipants();
		else
			return Collections.emptyList();

	}

	@Override
	public DialogParticipant getParticipant(String participantId) {
		@SuppressWarnings("unchecked")
		List<DialogParticipant> participants = (List<DialogParticipant>) knowledgeManager
				.getEntitiesOfType(BasePackage.eINSTANCE.getDialogParticipant());
		Optional<DialogParticipant> optional = participants.stream()
				.filter(p -> p.getParticipantId().equals(participantId)).findFirst();
		return optional.orElse(null);
	}

	@Override
	public void addUser(Person user) {
		// users.put(user.getId().toString(), user);
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeUser(Person user) {
		// removeUser(user.getId().toString());
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeUser(String userId) {
		// users.remove(userId);
		throw new UnsupportedOperationException();
	}

	@Override
	public void registerSession(Session session) {
		// sessions.put(session.getSessionID(), session);
		throw new UnsupportedOperationException();
	}

	@Override
	public void registerSession(String sessionId) {
		// TODO Auto-generated method stub

	}

}
