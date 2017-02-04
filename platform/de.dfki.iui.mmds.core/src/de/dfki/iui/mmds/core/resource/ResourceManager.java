/****************************************************************************** 
 * Copyright 2012-2016 (C) DFKI GmbH
 * Author: Robert Neßelrath
 *******************************************************************************/

package de.dfki.iui.mmds.core.resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.interfaces.IResourceManager;
import de.dfki.iui.mmds.core.model.base.LocalizationResource;

/**
 * The Class ResourceManager provides a central management of EObject resources. Internally any resource is added to a resource category. Additionally it gets an identifier. Furthermore the
 * ResourceManager provides helper functions for loading resources from the resource directory. The resource directory is specified with the <mmds.resources.location> - property.
 */
public class ResourceManager implements IResourceManager {

	/**
	 * The path of the resource directory defined with the <mmds.resources.location> - property
	 */
	static private URI resourcePathURI;
	static Logger logger = Logger.getLogger(ResourceManager.class);
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * The resource collection. First map for categories. Inner Map for entities with key as identifier
	 */
	static HashMap<String, HashMap<String, EObject>> resourceCollection = new HashMap<String, HashMap<String, EObject>>();

	public ResourceManager() {
	}

	protected void activate(ComponentContext context) {
		String path = System.getProperty("mmds.resources.location");
		if (path == null) {
			// TODO throw configuration exception
			logger.error("Resource location  <mmds.resources.location> is not set! ");
		} else {
			if (path.indexOf('\\') != -1) {
				// logger.info(String.format("System property
				// <bundles.configuration.location> contains '\\'. For Linux
				// compatibility reason it is replaced with '/': %s",
				// path));
				path = path.replace('\\', '/');
			}
			try {
				path = new File(path).getCanonicalPath();
			} catch (IOException e) {
				e.printStackTrace();
			}
			resourcePathURI = URI.createFileURI(path);
		}
		modified(context);
	}

	protected void deactivate(ComponentContext context) {
	}

	public synchronized void modified(ComponentContext context) {
		setLanguage((String) context.getProperties().get("LANGUAGE"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#loadResource (java.lang.String)
	 */
	@Override
	public Resource loadResource(String location) {
		try {

			URI resourcePath = resourcePathURI.appendSegment(location);

			if (resourcePath == null) {
				logger.error(String.format("Cannot load resource %s. Platform resource path does not exist.", location));
			} else {
				Resource resource = EmfPersistence.readFromUri(resourcePath);
				logger.info(String.format("Resource %s with content size %d loaded", location, resource.getContents().size()));
				return resource;
			}
		} catch (FileNotFoundException e) {
			logger.warn(String.format("Resource %s does not exist!", location));
		} catch (IOException e) {
			logger.error(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#addResources (java.lang.String, java.util.HashMap)
	 */
	@Override
	public void addResources(String category, HashMap<String, EObject> resources) {
		logger.debug(String.format("Registering %d resources to category %s", resources.size(), category));
		resourceCollection.put(category, resources);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#addResource (java.lang.String, java.lang.String, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void addResource(String category, String resourceId, EObject resource) {
		logger.debug(String.format("Registering 1 resource to category %s", category));
		if (!resourceCollection.containsKey(category)) {
			resourceCollection.put(category, new HashMap<String, EObject>());
		}
		resourceCollection.get(category).put(resourceId, resource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#removeResources (java.lang.String)
	 */
	@Override
	public void removeResources(String category) {
		logger.debug(String.format("Remove resource category %s", category));
		resourceCollection.remove(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#removeResource (java.lang.String, java.lang.String)
	 */
	@Override
	public void removeResource(String category, String resourceId) {
		logger.debug(String.format("Remove resource with id %s from category %s", resourceId, category));
		if (resourceCollection.containsKey(category)) {
			resourceCollection.get(category).remove(resourceId);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#getResource (java.lang.String, java.lang.String)
	 */
	@Override
	public EObject getResource(String category, String resourceId) {
		if (resourceCollection.containsKey(category) && resourceCollection.get(category).containsKey(resourceId))
			return resourceCollection.get(category).get(resourceId);
		else
			return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#getResources (java.lang.String)
	 */
	@Override
	public HashMap<String, EObject> getResources(String category) {
		if (resourceCollection.containsKey(category))
			return resourceCollection.get(category);
		else
			return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.dfki.iui.mmds.core.interfaces.IResourceManager#clear()
	 */
	@Override
	public void clear() {
		resourceCollection.clear();
	}

	@Override
	public Set<String> getCategories() {
		return resourceCollection.keySet();
	}

	@Override
	public String getString(String from, String language) {
		LocalizationResource resource = (LocalizationResource) getResource("localization", language);
		if (resource == null) {
			Logger.getLogger(getClass()).warn(String.format("No resource defined for language %s.", language));
			return from;
		}
		BString content = resource.getEntries().get(from);
		if (content == null) {
			Logger.getLogger(getClass()).warn(String.format("No resource defined for entry %s in language %s.", from, language));
			return from;
		}
		return content.toString();
	}

	@Override
	public String getString(String from) {
		return getString(from, language);
	}
}
