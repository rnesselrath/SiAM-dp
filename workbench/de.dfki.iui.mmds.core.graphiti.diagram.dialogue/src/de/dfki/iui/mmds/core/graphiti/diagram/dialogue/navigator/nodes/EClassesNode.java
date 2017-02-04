/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.navigator.nodes;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.examples.common.ExamplesCommonPlugin;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.navigator.nodes.base.AbstractInstancesOfTypeContainerNode;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.Messages;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.Util;

/**
 * EClassesNode should display the EClasses of the currently activated diagram
 * editor.
 * 
 */
public class EClassesNode extends AbstractInstancesOfTypeContainerNode {
	private static final String NAME = Messages.EClassesNode_EClassesNodeName;

	private ResourceSetImpl rSet;

	public EClassesNode(Object parent, IProject project, Viewer viewer) {
		super(parent, project);
		rSet = new ResourceSetImpl();

	}

	@Override
	protected String getContainerName() {
		return NAME;
	}

	public Object[] getChildren() {
		return Util.getAllClasses(getProject(), rSet);
	}

	@Override
	public Image getImage() {
		
		return getEClassesNodeImage(); //super.getImage(); // ImagePool.getImage(ImagePool.ROOT_FOLDER_FOR_IMG);
	}

	/**
	 * @return the rSet
	 */
	public ResourceSet getResourceSet() {
		return rSet;
	}
	
	private Image getEClassesNodeImage() {
		ImageRegistry registry = ExamplesCommonPlugin.getDefault().getImageRegistry();
		String key = "icons/Dialogue.gif"; //$NON-NLS-1$
		Image image = registry.get(key);
		if (image == null) {
			ImageDescriptor desc = ExamplesCommonPlugin.imageDescriptorFromPlugin("de.dfki.iui.mmds.core.graphiti.diagram.dialogue", key); //org.eclipse.emf.ecore.edit //$NON-NLS-1$
			registry.put(key, desc);
			image = registry.get(key);
		}
		return image;
	}
}
