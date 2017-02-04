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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;

/**
 * The Interface KnowledgeServerInterface.
 */
public interface IKnowledgeManager {

	/**
	 * Retrieve the entity with the given id (id can also be the path).
	 *
	 * @param entity_id
	 *            The id of the entity. This can also be the path.
	 * @return The id or null if no instance is found
	 */

	Entity getEntity(String entityId);

	List<? extends Entity> getEntitiesOfType(EClass type);

	default void replaceEntity(Entity entity) {
		replaceEntity(entity.getENTITY_ID(), entity);
	}

	default void replaceEntity(String entityId, Entity entity) {
		replaceEntity(entityId, entity, null);
	}

	default void replaceEntity(String entityId, Entity entity, String source) {
		replaceEntity(entityId, entity, source, 1.0f);
	}

	void replaceEntity(String entityId, Entity entity, String source, float confidence);

	default String addEntity(Entity entity) {
		return addEntity(entity, null);
	}

	default String addEntity(Entity entity, String source) {
		return addEntity(entity, source, 1.0f);
	}

	String addEntity(Entity entity, String source, float confidence);

	default String createEntity(String type) {
		return createEntity(type, null);
	}

	default String createEntity(String type, String source) {
		return createEntity(type, source, 1.0f);
	}

	String createEntity(String type, String source, float confidence);

	void removeEntity(String entityId);

	Object getFeature(String entityId, String featureName);

	Object getFeature(String entityId, String featureName, int index);

	Object getFeature(String entityId, EStructuralFeature feature);

	Object getFeature(String entityId, EStructuralFeature feature, int index);

	Object setFeature(String entityId, String featureName, String newContent);

	Object setFeature(String entityId, EStructuralFeature feature, String newContent);

	Object setFeature(String entityId, String featureName, int index, String newContent);

	Object setFeature(String entityId, EStructuralFeature feature, int index, String newContent);

	Object addFeature(String entityId, String featureName, String newContent);

	Object addFeature(String entityId, EStructuralFeature feature, String newContent);

	void removeFeature(String entityId, String featureName);

	void removeFeature(String entityId, EStructuralFeature feature);

	void removeFeature(String entityId, String featureName, int index);

	void removeFeature(String entityId, EStructuralFeature feature, int index);

	void removeFeature(String entityId, EStructuralFeature feature, String childID);

	void removeFeature(String entityId, String name, String childID);

	KnowledgeBase getWorld();

	void setWorld(KnowledgeBase knowledgeBase);

	void registerForType(EClass type, IKnowledgeManagerListener listener);

	void registerForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener);

	void unregisterForType(EClass type, IKnowledgeManagerListener listener);

	void unregisterForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener);

	void addToWorld(KnowledgeBase knowledgeBase);

}
