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
package de.dfki.iui.mmds.knowledge_server;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManager;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManagerListener;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;
import de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry;

public class KnowledgeManager implements IKnowledgeManager {

	private Logger logger = Logger.getLogger(getClass());
	private KnowledgeManagerInternal internalManager;

	public KnowledgeManager() {
		this.internalManager = KnowledgeManagerInternal.getInstance();
	}

	// methods from IKnowledgeManger

	@Override
	public Entity getEntity(String entity_id) {
		logger.debug("Call method getEntity with id: " + entity_id);
		try {
			return EmfUtils.clone(internalManager._getEntity(entity_id));
		} catch (KnowledgeManagerException ex) {
			logger.warn(ex.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public String addEntity(Entity entity, String source, float confidence) {
		logger.debug("Call method addEntity for entity with id " + entity.getENTITY_ID());
		try {
			return internalManager._addEntity(EmfUtils.clone(entity), source, confidence);
		} catch (KnowledgeManagerException ex) {
			logger.warn(ex.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public void replaceEntity(String entityID, Entity entity, String source, float confidence) {
		logger.debug("Replace entity with id " + entityID);
		internalManager._replaceEntity(entityID, EmfUtils.clone(entity), source, confidence);
	}

	@Override
	public String createEntity(String type, String source, float confidence) {
		logger.debug("Create entity of type " + type);
		try {
			return internalManager._createEntity(type, source, confidence);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public void removeEntity(String entityID) {
		logger.debug("Call method addEntity for entity with id " + entityID);
		internalManager._removeEntity(entityID);
	}

	@Override
	public Object getFeature(String id, String featureName) {
		logger.debug(String.format("Get feature '%s' of entity with id '%s'", featureName, id));
		try {
			Object result = internalManager._getFeature(id, featureName);
			if (result instanceof EObject)
				return EmfUtils.clone((EObject) result);
			else
				return result;
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public Object getFeature(String id, String featureName, int index) {
		logger.debug(String.format("Get feature '%s' at index %d of entity with id '%s'", featureName, index, id));
		try {
			Object result = internalManager._getFeature(id, featureName, index);
			if (result instanceof EObject)
				return EmfUtils.clone((EObject) result);
			else
				return result;
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public Object getFeature(String id, EStructuralFeature feature) {
		return getFeature(id, feature.getName());
	}

	@Override
	public Object getFeature(String id, EStructuralFeature feature, int index) {
		return getFeature(id, feature.getName(), index);
	}

	@Override
	public Object setFeature(String id, String featureName, String newContent) {
		logger.debug(String.format("Set content '%s' for feature '%s' of entity with id '%s'", newContent, featureName, id));
		try {
			return internalManager._setFeature(id, featureName, newContent);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public Object setFeature(String id, EStructuralFeature feature, String newContent) {
		return setFeature(id, feature.getName(), newContent);
	}

	@Override
	public Object setFeature(String id, String featureName, int index, String newContent) {
		logger.debug(String.format("Set content '%s' at index %d for feature '%s' of entity with id '%s'", newContent, index, featureName, id));
		try {
			return internalManager._setFeature(id, featureName, index, newContent);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public Object setFeature(String id, EStructuralFeature feature, int index, String newContent) {
		return setFeature(id, feature.getName(), index, newContent);
	}

	@Override
	public Object addFeature(String id, String featureName, String newContent) {
		logger.debug(String.format("Add content '%s' to feature '%s' of entity with id '%s'", newContent, featureName, id));
		try {
			return internalManager._addFeature(id, featureName, newContent);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public Object addFeature(String id, EStructuralFeature feature, String newContent) {
		return addFeature(id, feature.getName(), newContent);
	}

	@Override
	public void removeFeature(String id, String featureName) {
		logger.debug(String.format("Remove feature '%s' of entity with id '%s'", featureName, id));
		try {
			internalManager._removeFeature(id, featureName);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
		}
	}

	@Override
	public void removeFeature(String id, EStructuralFeature feature) {
		removeFeature(id, feature.getName());
	}

	@Override
	public void removeFeature(String id, String featureName, int index) {
		logger.debug(String.format("Remove index %d in feature '%s' of entity with id '%s'", index, featureName, id));
		try {
			internalManager._removeFeature(id, featureName, index);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
		}
	}

	@Override
	public void removeFeature(String id, EStructuralFeature feature, int index) {
		removeFeature(id, feature.getName(), index);
	}

	@Override
	public void removeFeature(String entityID, EStructuralFeature feature, String childID) {
		removeFeature(entityID, feature.getName(), childID);
	}

	@Override
	public void removeFeature(String entityID, String featureName, String childID) {
		logger.debug(String.format("Remove feature with id %s in feature '%s' of entity with id '%s'", childID, featureName, entityID));
		try {
			internalManager._removeFeature(entityID, featureName, childID);
		} catch (KnowledgeManagerException e) {
			logger.warn(e.getLocalizedMessage());
		}
	}

	@Override
	public KnowledgeBase getWorld() {
		logger.debug("Retrieve complete world knowledge (Warning: You retrieve the original instance)");
		return internalManager._getWorld();
	}

	@Override
	public void setWorld(KnowledgeBase knowledgeBase) {
		logger.debug("Set new world knowledge.");
		internalManager._setWorld(knowledgeBase);
	}

	@Override
	public void registerForType(EClass type, IKnowledgeManagerListener listener) {
		internalManager._registerForType(type, listener);
	}

	@Override
	public void registerForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener) {
		internalManager._registerForFeature(feature, listener);
	}

	@Override
	public void unregisterForType(EClass type, IKnowledgeManagerListener listener) {
		internalManager._unregisterForType(type, listener);
	}

	@Override
	public void unregisterForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener) {
		internalManager._unregisterForFeature(feature, listener);
	}

	@Override
	public List<? extends Entity> getEntitiesOfType(EClass type) {
//		logger.debug(String.format("Retrieve entities of type '%s'", type.getName()));
		return internalManager._getEntitiesOfType(type);
	}

	@Override
	public void addToWorld(KnowledgeBase knowledgeBase) {
		logger.debug("Call method addToWorld");
		KnowledgeBase clone = EmfUtils.clone(knowledgeBase);
		try {
			for (KnowledgeBaseEntry entry : clone.getEntries().toArray(new KnowledgeBaseEntry[clone.getEntries().size()])) {
				internalManager._addEntity(entry.getContent(), entry.getSource(), entry.getConfidence());
			}
		} catch (KnowledgeManagerException ex) {
			logger.warn(ex.getLocalizedMessage());
		}
	}

}
