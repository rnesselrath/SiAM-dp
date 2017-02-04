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
package de.dfki.iui.mmds.dialogue.fade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.mmds.core.emf.computation.Unification;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.io.Message;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.pattern.PObject;

public class WorkingMemory implements Iterable<SemanticContentEntry> {

	public final List<SemanticContentEntry> discourseContext = Collections.synchronizedList(new ArrayList<SemanticContentEntry>());
	public final List<Message> discourseHistory = Collections.synchronizedList(new ArrayList<Message>());
	IKnowledgeManager knowledgeManager;

	public WorkingMemory(IKnowledgeManager knowledgeManager) {
		this.knowledgeManager = knowledgeManager;
	}

	public List<Message> getDiscourseHistory() {
		return discourseHistory;
	}

	public List<SemanticContentEntry> getDiscourseContext() {
		return discourseContext;
	}

	@Override
	public Iterator<SemanticContentEntry> iterator() {
		return new WorkingMemoryIterator(discourseContext);
	}

	void clear() {
		discourseContext.clear();
		// longTermMemory.clear();
		discourseHistory.clear();
	}

	public List<Entity> findMatchingPhysicalEntities(PObject pattern, boolean findMany, boolean deepSearch) {
		Logger logger = Logger.getLogger(getClass());
		List<Entity> newList = new ArrayList<Entity>();
		logger.debug("Lookup for entities in knowledge base:");
		Queue<Entity> queue = new LinkedList<Entity>();

		knowledgeManager.getWorld().getEntries().forEach(entry -> queue.add(entry.getContent()));

		Entity w = queue.poll();
		while (w != null) {
			if (pattern.matches(w)) {
				newList.add(w);
				if (!findMany) {
					break;
				}
			}
			if (deepSearch) {
				TreeIterator<Object> iterator = EcoreUtil.getAllContents(w, true);
				while (iterator.hasNext()) {
					EObject next = (EObject) iterator.next();
					if (next instanceof Entity && !queue.contains(next)) {
						queue.add((Entity) next);
					}
				}
			}
			w = queue.poll();
		}
		return newList;
	}

	public void updateDiscourseContext(List<SemanticContent> entities, String description) {
		Logger.getLogger(getClass()).debug("Update the working memory with following entities: ");
		boolean resolved = false;
		for (SemanticContent content : entities) {
			Entity entity = content.getContent();
			Logger.getLogger(getClass()).debug(EmfPersistence.writeToString(entity));
			entity.setBinding(null);
		}
		// TODO Ersetzt aktuell nur elemente mit einem eintrag
		if (entities.size() == 1) {
			for (int i = 0; i < discourseContext.size(); ++i) {
				SemanticContentEntry workingMemoryEntry = discourseContext.get(i);
				List<Entity> validEntities = workingMemoryEntry.getValidEntities();
				if (validEntities.size() == 1) {
					SemanticContent semanticContent = entities.get(0);
					EObject unify = Unification.compute(semanticContent.getContent(), validEntities.get(0));
					if (unify != null) {
						semanticContent = EmfUtils.clone(semanticContent);
						discourseContext.remove(i);
						semanticContent.setContent((Entity) unify);
						workingMemoryEntry.set(0, semanticContent);
						discourseContext.add(0, workingMemoryEntry);
						resolved = true;
						break;
					}
				}
			}
		}
		if (!resolved) {
			discourseContext.add(0, new SemanticContentEntry(entities, description));
		}
	}

	class WorkingMemoryIterator implements Iterator<SemanticContentEntry> {

		ListIterator<SemanticContentEntry> iterator;

		WorkingMemoryIterator(List<SemanticContentEntry> entries) {
			iterator = entries.listIterator();
		}

		@Override
		public boolean hasNext() {
			while (iterator.hasNext()) {
				SemanticContentEntry next = iterator.next();
				if (next.getValidEntities().isEmpty()) {
					iterator.remove();
				} else {
					iterator.previous();
					break;
				}
			}
			return iterator.hasNext();
		}

		@Override
		public SemanticContentEntry next() {
			if (hasNext())
				return iterator.next();
			else
				return null;
		}
	}
}
