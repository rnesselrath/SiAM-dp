/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2012, 2012 SAP AG.
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
package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.platform.GraphitiShapeEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.DialogueDesignerPropertySource;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state.CompositeStatePropertySource;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile.DoWhilePropertySource;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history.HistoryStatePropertySource;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.StateChartPropertySource;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee.WhilePropertySource;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Registered to adapt an {@link EditPart} that gets selected in the
 * {@link DiagramEditor} to A {@link IPropertySource} object that is used as
 * input for the properties view.
 */
public class ShapeEditPartToIPropertySourceAdapterFactory implements IAdapterFactory {

	public ShapeEditPartToIPropertySourceAdapterFactory() {
		super();

	}

	@Override
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {

		if (IPropertySource.class.equals(adapterType)) {
			if (adaptableObject instanceof GraphitiShapeEditPart) {

				GraphitiShapeEditPart editPart = (GraphitiShapeEditPart) adaptableObject;
				PictogramElement pictogramElement = editPart.getPictogramElement();
				// Object object =
				// editPart.getFeatureProvider().getBusinessObjectForPictogramElement(pictogramElement);
				Object object = null;
				if (!pictogramElement.getLink().getBusinessObjects().isEmpty()) {
					object = pictogramElement.getLink().getBusinessObjects().get(0);
				}

				if (object instanceof Dialogue)
					return new DialoguePropertySource((Dialogue) object, editPart.getFeatureProvider());
				if (object instanceof While)
					return new WhilePropertySource((While) object);
				if (object instanceof DoWhile)
					return new DoWhilePropertySource((DoWhile) object);
				else if (object instanceof HistoryState)
					return new HistoryStatePropertySource((HistoryState) object);
				else if (object instanceof StateChart)
					return new StateChartPropertySource((StateChart) object, editPart.getPictogramElement(), editPart.getFeatureProvider());
				else if (object instanceof CompositeState)
					return new CompositeStatePropertySource((CompositeState) object);
				else if (object instanceof DialogueDesignerElement)
					return new DialogueDesignerPropertySource((DialogueDesignerElement) object);
			}
		}
		return null;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { IPropertySource.class };
	}
}
