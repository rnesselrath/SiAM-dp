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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.mmds.core.interfaces.IKnowledgeManagerListener;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.KnowledgeBase;
import de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry;

public class KnowledgeManagerInternal {

	private Resource resource;
	private KnowledgeBase knowledgeBase;
	private Logger logger = Logger.getLogger(getClass());
	static private KnowledgeManagerInternal eInstance;

	private KnowledgeManagerInternal() {
		// init ns2factory map
		ns2Package = new HashMap<String, EPackage>();
		new HashSet<String>(EPackage.Registry.INSTANCE.keySet()).forEach(new Consumer<String>() {
			@Override
			public void accept(String key) {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(key);
				ns2Package.put(ePackage.getNsPrefix(), ePackage);
			}
		});
	}

	private static HashMap<String, EPackage> ns2Package = null;
	private WorldContentAdapter worldContentAdapter = new WorldContentAdapter();

	static KnowledgeManagerInternal getInstance() {
		if (eInstance == null)
			eInstance = new KnowledgeManagerInternal();
		return eInstance;
	}

	// helper methods

	void createResource() throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resource = resSet.createResource(URI.createURI("temp.entities"));
		resource.eAdapters().add(worldContentAdapter);
		knowledgeBase = BaseFactory.eINSTANCE.createKnowledgeBase();
		resource.getContents().add(knowledgeBase);
	}

	private void generateMissingEntityIDs(KnowledgeBase kb) {
		kb.eContents().stream().filter(content -> content instanceof Entity).forEach(content -> generateMissingEntityIDs((Entity) content));
	}

	private void generateMissingEntityIDs(Entity entity) {
		if (entity.getENTITY_ID() == null || entity.getENTITY_ID().isEmpty()) {
			entity.setENTITY_ID(EcoreUtil.generateUUID());
		}

		TreeIterator<Object> allContents = EcoreUtil.getAllContents(entity, true);
		while (allContents.hasNext()) {
			Object next = allContents.next();
			if (next instanceof Entity) {
				Entity newEntity = (Entity) next;
				if (newEntity.getENTITY_ID() == null || newEntity.getENTITY_ID().isEmpty()) {
					newEntity.setENTITY_ID(EcoreUtil.generateUUID());
				}
			}
		}
	}

	private void searchForNonContainmentAndReplace(EObject eObject, EObject oldEntity, EObject newEntity) {
		eObject.eClass().getEAllReferences().stream().filter(reference -> !reference.isContainment()).forEach(new Consumer<EReference>() {
			@Override
			public void accept(EReference reference) {
				if (reference.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> list = (EList<EObject>) eObject.eGet(reference);
					int index = list.indexOf(oldEntity);
					if (index != -1) {
						logger.debug(String.format("Fix non-containment link in many-reference %s in entity of type '%s'", reference.getName(), oldEntity.eClass().getName()));
						list.set(index, newEntity);
					}
				} else if (eObject.eGet(reference) == oldEntity) {
					logger.debug(String.format("Fix non-containment link in reference %s in entity of type '%s'", reference.getName(), oldEntity.eClass().getName()));
					eObject.eSet(reference, newEntity);
				}
			}
		});
		for (EObject content : eObject.eContents())
			searchForNonContainmentAndReplace(content, oldEntity, newEntity);
	}

	private void searchForNonContainmentAndDelete(EObject eObject, EObject oldEntity) {
		eObject.eClass().getEAllReferences().stream().filter(reference -> !reference.isContainment()).forEach(new Consumer<EReference>() {
			@Override
			public void accept(EReference reference) {
				if (reference.isMany()) {
					List<?> list = ((List<?>) eObject.eGet(reference));
					Iterator<?> iterator = list.iterator();
					while (iterator.hasNext()) {
						if (iterator.next() == oldEntity)
							iterator.remove();
					}
				} else {
					if (eObject.eGet(reference) == oldEntity)
						eObject.eUnset(reference);
				}
			}
		});
		for (EObject content : eObject.eContents())
			searchForNonContainmentAndDelete(content, oldEntity);
	}

	private Object createNewObjectFromNewContent(String id, EStructuralFeature eStructuralFeature, String newContent) throws KnowledgeManagerException {
		Object newObject;
		if (eStructuralFeature instanceof EAttribute)
			newObject = EcoreUtil.createFromString(((EAttribute) eStructuralFeature).getEAttributeType(), newContent);
		else {
			newObject = _getEntity(newContent);
			if (newObject == null)
				throw new KnowledgeManagerException(
						String.format("Error when setting the feature '%s' in entity with id '%s'. A feature with id '%s' does not exist", eStructuralFeature.getName(), id, newContent));
		}
		return newObject;
	}

	/**
	 * Tries to resolve the EClass of the given Type. It has to extend Entity.
	 * 
	 * @param type
	 *            e.g. "madmacs:Robot"
	 * @return
	 * @throws KnowledgeManagerException
	 */
	public EClass findClass(String type) throws KnowledgeManagerException {
		String[] split = type.split(":");
		if (split.length != 2 || split[0].isEmpty() || split[1].isEmpty())
			throw new KnowledgeManagerException(String.format("Type identifier '%s' is invalid: The identifier must have the format '<namespace>:<classname>'", type));

		if (!ns2Package.containsKey(split[0]))
			throw new KnowledgeManagerException(String.format("No package with namespace '%s' found.", split[0]));

		EPackage ePackage = ns2Package.get(split[0]);
		EClass eClass = (EClass) ePackage.getEClassifier(split[1]);

		if (eClass == null)
			throw new KnowledgeManagerException(String.format("Package '%s' does not contain a class of type '%s'.", split[0], split[1]));
		if (!BasePackage.eINSTANCE.getEntity().isSuperTypeOf(eClass)) {
			throw new KnowledgeManagerException(String.format("Classifier '%s' is not an Entity.", type));
		}
		return eClass;
	}
	
	public EClass findEClass(String type) throws KnowledgeManagerException {
		String[] split = type.split(":");
		if (split.length != 2 || split[0].isEmpty() || split[1].isEmpty())
			throw new KnowledgeManagerException(String.format("Type identifier '%s' is invalid: The identifier must have the format '<namespace>:<classname>'", type));

		if (!ns2Package.containsKey(split[0]))
			throw new KnowledgeManagerException(String.format("No package with namespace '%s' found.", split[0]));

		EPackage ePackage = ns2Package.get(split[0]);
		EClass eClass = (EClass) ePackage.getEClassifier(split[1]);

		if (eClass == null) {
			throw new KnowledgeManagerException(String.format("Package '%s' does not contain a class of type '%s'.", split[0], split[1]));
		}
		return eClass;
	}

	// knowledge management methods

	synchronized Entity _getEntity(String entity_id) throws KnowledgeManagerException {
		try {
			Entity result = (Entity) resource.getEObject(entity_id);
			if (result == null)
				throw new KnowledgeManagerException("No entity found for id " + entity_id);
			return result;
		} catch (IllegalArgumentException e) {
			throw new KnowledgeManagerException("No entity found for id " + entity_id, e);
		}
	}

	synchronized List<Entity> _getEntitiesOfType(EClass type) {
		List<Entity> result = new ArrayList<Entity>();
		for (KnowledgeBaseEntry entry : knowledgeBase.getEntries()) {
			Entity entity = entry.getContent();
			if (type.isInstance(entity))
				result.add(entity);
		}
		return result;
	}

	synchronized public List<Entity> getEntitiesOfSource(String source) {
		List<Entity> result = new ArrayList<Entity>();
		for (KnowledgeBaseEntry entry : knowledgeBase.getEntries()) {
			Entity entity = entry.getContent();
			if (entry.getSource() != null && entry.getSource().equals(source))
				result.add(entity);
		}
		return result;
	}
	
	synchronized public String getSource(String entityId) {
		for(KnowledgeBaseEntry entry : knowledgeBase.getEntries()) {
			if(entityId.equals(entry.getContent().getENTITY_ID())) {
				return entry.getSource();
			}
		}
		return null;
	}

	/**
	 * 
	 * Adds a new entry to the knowledge base.
	 * 
	 * @param entity
	 *            The new entity
	 * @param source
	 *            The source of the knowledge. May be null if no source is given.
	 * @param confidence
	 *            The confidence of the knowledge. Should be 1.0 if no special confidence is measured.
	 * @return The ENTITY_ID of the new entity
	 * @throws KnowledgeManagerException
	 */
	synchronized String _addEntity(Entity entity, String source, float confidence) throws KnowledgeManagerException {
		logger.debug(String.format("Add entity to KB with entityID '%s' source '%s'", entity.getENTITY_ID(), source));
		if (resource.getEObject(entity.getENTITY_ID()) != null)
			throw new KnowledgeManagerException(String.format("Entity with id %s already exists", entity.getENTITY_ID()));
		generateMissingEntityIDs(entity);
		KnowledgeBaseEntry entry = BaseFactory.eINSTANCE.createKnowledgeBaseEntry();
		entry.setConfidence(confidence);
		entry.setSource(source);
		entry.setContent(entity);
		knowledgeBase.getEntries().add(entry);
		return entity.getENTITY_ID();
	}

	/**
	 * 
	 * Replace an existing knowledge entity with a new one. If no entity with the entityID exists, a new one is created.
	 * 
	 * @param entityID
	 *            Id of the entity that is replaced
	 * @param entity
	 *            The new entity
	 * @param newSource
	 *            The knowledge source of the new entity. May be null if no source is given.
	 * @param newConfidence
	 *            The confidence of the new knowledge. Should be 1.0 if no special confidence is measured.
	 */
	synchronized void _replaceEntity(String entityID, Entity entity, String newSource, float newConfidence) {
		entity.setENTITY_ID(entityID);
		generateMissingEntityIDs(entity);
		Entity oldEntity = (Entity) resource.getEObject(entityID);
		if (oldEntity == null) {
			logger.info(String.format("Entity with id %s does not exist. Add entity instead.", entityID));
			try {
				_addEntity(entity, newSource, newConfidence);
			} catch (KnowledgeManagerException e) {
				e.printStackTrace();
			}
		} else {
			EcoreUtil.replace(oldEntity, entity);
			KnowledgeBaseEntry entry = (KnowledgeBaseEntry) entity.eContainer();
			entry.setSource(newSource);
			entry.setConfidence(newConfidence);
			// search for all non-containment references on old entity and
			// replace
			knowledgeBase.eContents().forEach(eObject -> searchForNonContainmentAndReplace(eObject, oldEntity, entity));
		}
	}

	/**
	 * 
	 * Create a new entity of a specific type.
	 * 
	 * @param type
	 *            Type of the new Entity. The value must be <nsPrefix:typeName>
	 * @param source
	 *            The knowledge source of the new entity. May be null if no source is given.
	 * @param confidence
	 *            The confidence of the new knowledge. Should be 1.0 if no special confidence is measured.
	 * @return The ENTITY_ID of the new entity
	 * @throws KnowledgeManagerException
	 */
	synchronized String _createEntity(String type, String source, float confidence) throws KnowledgeManagerException {
		EClass eClass = findClass(type);
		try {
			Entity entity = (Entity) EcoreUtil.create(eClass);
			return _addEntity(entity, source, confidence);
		} catch (IllegalArgumentException e) {
			throw new KnowledgeManagerException(String.format("Classifier '%s' is abstract.", type), e);
		}
	}

	synchronized void _removeEntity(String entityID) {
		logger.debug("Remove entity with id " + entityID);
		EObject eObject = resource.getEObject(entityID);
		if (eObject == null) {
			logger.warn("Entity with id '" + entityID + "' does not exist.");
			return;
		}
		EcoreUtil.remove(eObject.eContainer());

		// remove non-containment references to object
		knowledgeBase.getEntries().forEach(content -> searchForNonContainmentAndDelete(content.getContent(), eObject));
	}

	synchronized Object _getFeature(String id, String featureName) throws KnowledgeManagerException {
		EObject eObject = resource.getEObject(id);
		if (eObject == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' does not exist", id));
		}
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", id, featureName));
		}
		return eObject.eGet(eStructuralFeature);
	}

	@SuppressWarnings("unchecked")
	synchronized Object _getFeature(String id, String featureName, int index) throws KnowledgeManagerException {
		Object object = _getFeature(id, featureName);
		if (object instanceof List) {
			try {
				return ((List<Object>) object).get(index);
			} catch (IndexOutOfBoundsException ex) {
				throw new KnowledgeManagerException(String.format("Index %d out of bound for feature '%s' in entity with id '%s'.", index, featureName, id), ex);
			}
		} else if (index == 0) {
			return object;
		}
		throw new KnowledgeManagerException(String.format("Index %d out of bound. Feature '%s' in entity with id %s is not a list. Only index 0 is accepted.", index, featureName, id));
	}

	synchronized Object _setFeature(String id, String featureName, String newContent) throws KnowledgeManagerException {
		logger.debug(String.format("Set feature with id '%s' featureName '%s' with new content '%s'", id, featureName, newContent));
		EObject eObject = _getEntity(id);
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", id, featureName));
		}
		if (eStructuralFeature.isMany()) {
			throw new KnowledgeManagerException(String.format("Feature with name '%s' of entity with id '%s' is a 'many-feature' but no index is specified!", featureName, id));
		}
		Object newObject;
		try {
			newObject = createNewObjectFromNewContent(id, eStructuralFeature, newContent);
			eObject.eSet(eStructuralFeature, newObject);
		} catch (KnowledgeManagerException e) {
			throw e;
		} catch (Exception e) {
			throw new KnowledgeManagerException(String.format("Error when setting the feature value '%s' for feature '%s' in entity with id '%s'. Cause: %s: %s.", newContent, featureName, id,
					e.getClass().getName(), e.getLocalizedMessage()), e);
		}
		return newObject;
	}

	@SuppressWarnings("unchecked")
	synchronized Object _setFeature(String id, String featureName, int index, String newContent) throws KnowledgeManagerException {
		logger.debug(String.format("Set feature with id '%s' featureName '%s' at index '%s' with new content '%s'", id, featureName, index, newContent));
		EObject eObject = _getEntity(id);
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", id, featureName));
		}
		if (!eStructuralFeature.isMany()) {
			throw new KnowledgeManagerException(String.format("Feature with name '%s' of entity with id '%s' is not a 'many-feature' but an index is given.", featureName, id));
		}
		Object newObject;
		try {
			newObject = createNewObjectFromNewContent(id, eStructuralFeature, newContent);
			((List<Object>) eObject.eGet(eStructuralFeature)).set(index, newObject);
		} catch (KnowledgeManagerException e) {
			throw e;
		} catch (Exception e) {
			throw new KnowledgeManagerException(String.format("Error when setting the feature value '%s' for feature '%s' in entity with id '%s'. Cause: %s: %s.", newContent, featureName, id,
					e.getClass().getName(), e.getLocalizedMessage()), e);
		}
		return newObject;
	}

	@SuppressWarnings("unchecked")
	synchronized Object _addFeature(String id, String featureName, String newContent) throws KnowledgeManagerException {
		logger.debug(String.format("Add feature with id '%s' featureName '%s' with new content '%s'", id, featureName, newContent));
		EObject eObject = _getEntity(id);
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", id, featureName));
		}
		if (!eStructuralFeature.isMany()) {
			throw new KnowledgeManagerException(String.format("Feature with name '%s' of entity with id '%s' is not a 'many-feature'!", featureName, id));
		}
		Object newObject;
		try {
			newObject = createNewObjectFromNewContent(id, eStructuralFeature, newContent);
			((List<Object>) eObject.eGet(eStructuralFeature)).add(newObject);
		} catch (KnowledgeManagerException e) {
			throw e;
		} catch (Exception e) {
			throw new KnowledgeManagerException(String.format("Error when setting the feature value '%s' for feature '%s' in entity with id '%s'. Cause: %s: %s.", newContent, featureName, id,
					e.getClass().getName(), e.getLocalizedMessage()), e);
		}
		return newObject;
	}

	synchronized void _removeFeature(String id, String featureName) throws KnowledgeManagerException {
		logger.debug(String.format("Remove feature with id '%s' and featureName", id, featureName));
		EObject eObject = _getEntity(id);
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", id, featureName));
		}
		try {
			eObject.eUnset(eStructuralFeature);
		} catch (Exception e) {
			throw new KnowledgeManagerException(
					String.format("Error when removing the feature '%s' from entity with id '%s'. Cause: %s: %s.", featureName, id, e.getClass().getName(), e.getLocalizedMessage()), e);
		}
	}

	synchronized void _removeFeature(String id, String featureName, int index) throws KnowledgeManagerException {
		logger.debug(String.format("Remove feature with id '%s' featureName '%s' at index '%s'", id, featureName, index));
		EObject eObject = _getEntity(id);
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", id, featureName));
		}
		if (!eStructuralFeature.isMany()) {
			throw new KnowledgeManagerException(String.format("Feature with name '%s' of entity with id '%s' is not a 'many-feature' but an index is given!", featureName, id));
		}

		try {
			((List<?>) eObject.eGet(eStructuralFeature)).remove(index);
		} catch (Exception e) {
			throw new KnowledgeManagerException(
					String.format("Error when removing the feature '%s' from entity with id '%s'. Cause: %s: %s.", featureName, id, e.getClass().getName(), e.getLocalizedMessage()), e);
		}
	}

	synchronized public void _removeFeature(String entityID, String featureName, String childID) throws KnowledgeManagerException {
		logger.debug(String.format("Remove feature with entityID '%s' featureName '%s' and childID '%s'", entityID, featureName, childID));
		EObject eObject = _getEntity(entityID);
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null) {
			throw new KnowledgeManagerException(String.format("Entity with id '%s' has no feature with name '%s'", entityID, featureName));
		}

		EObject childObject = _getEntity(childID);
		if (eStructuralFeature.isMany()) {
			((List<?>) eObject.eGet(eStructuralFeature)).remove(childObject);
		} else {
			if (eObject.eGet(eStructuralFeature) != childObject)
				throw new KnowledgeManagerException(String.format("Child Entity %s is not in feature %s of entity %s.", childID, featureName, entityID));
		}
	}

	synchronized KnowledgeBase _getWorld() {
		return knowledgeBase;
	}

	synchronized void _setWorld(KnowledgeBase knowledgeBase) {
		generateMissingEntityIDs(knowledgeBase);
		this.knowledgeBase.getEntries().clear();
		this.knowledgeBase.getEntries().addAll(knowledgeBase.getEntries());
	}

	// notification listener

	public void _registerForType(EClass type, IKnowledgeManagerListener listener) {
		worldContentAdapter.registerForType(type, listener);
	}

	public void _registerForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener) {
		worldContentAdapter.registerForFeature(feature, listener);
	}

	public void _unregisterForType(EClass type, IKnowledgeManagerListener listener) {
		worldContentAdapter.unregisterForType(type, listener);
	}

	public void _unregisterForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener) {
		worldContentAdapter.unregisterForFeature(feature, listener);
	}

}
