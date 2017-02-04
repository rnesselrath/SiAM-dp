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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.pattern.PObject;

public class SemanticContentEntry {
	private long timestamp;

	public long getTimestamp() {
		return timestamp;
	}

	private final List<Element> elements = new ArrayList<Element>();
	String description;

	public String getDescription() {
		return description;
	}

	public SemanticContentEntry(List<SemanticContent> contents, String description) {
		for (SemanticContent content : contents) {
			if (content.getContent() != null) {
				elements.add(new Element(content.getContent(), content.getValidity()));
			}
		}
		this.timestamp = System.currentTimeMillis();
		this.description = description;
	}

	public SemanticContentEntry(SemanticContent content, String description) {
		elements.add(new Element(content.getContent(), content.getValidity()));
		this.timestamp = System.currentTimeMillis();
		this.description = description;
	}

	void set(int index, SemanticContent content) {
		elements.set(index, new Element(content.getContent(), content.getValidity()));
		timestamp = System.currentTimeMillis();
	}

	public List<Entity> getValidEntities() {
		List<Entity> result = new ArrayList<Entity>();
		Iterator<Element> iterator = elements.iterator();
		while (iterator.hasNext()) {
			Element next = iterator.next();
			long validity = next.validity == -1 ? FadeComponent.expiration_time : next.validity;
			if (validity != -1 && (System.currentTimeMillis() - timestamp) > validity) {
				iterator.remove();
			} else {
				result.add(next.entity);
			}
		}
		return result;
	}

	List<Entity> getMatchingContent(PObject pattern, boolean many, boolean deepSearch) {
		Queue<Entity> queue = new LinkedList<Entity>();
		List<Entity> result = new ArrayList<Entity>();

		for (int i = 0; i < elements.size(); ++i) {
			queue.add(elements.get(i).entity);
		}

		Entity w = queue.poll();
		while (w != null) {
			if (pattern.matches(w)) {
				result.add(w);
				if (!many) {
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
		return result;
	}

	class Element {
		Entity entity;
		long validity;

		Element(Entity entity, long validity) {
			this.entity = entity;
			this.validity = validity;
		}
	}
}
