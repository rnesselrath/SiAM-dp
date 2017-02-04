package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.impl.DiagramImpl;
import org.eclipse.jface.viewers.IFilter;

/**
 * The Class AbstractPropertySectionFilter.
 */
abstract public class AbstractPropertySectionFilter implements IFilter {

	final public boolean select(Object object) {
		
		if (object instanceof EditPart) {
			EditPart editPart = (EditPart) object;
			Object model = editPart.getModel();
			
			
			if (model instanceof PictogramElement) {
				
				PictogramElement pictogramElement = (PictogramElement) model;
				return accept(pictogramElement);
			}
			
		} else if (object instanceof EObject) {
			if (object instanceof PictogramElement) {
				return accept((PictogramElement) object);
			}
		} else if (object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) object;
			Object editPartAdapter = adaptable.getAdapter(EditPart.class);
			if (editPartAdapter instanceof EditPart) {
				return select(editPartAdapter);
			}
			Object eObjectAdapter = adaptable.getAdapter(EObject.class);
			if (eObjectAdapter instanceof EObject) {
				return select(eObjectAdapter);
			}
		}
		return false;
	}

	/**
	 * Check the given pictogram element for acceptance.
	 * 
	 * @param pictogramElement
	 *            the pictogram element
	 * @return true, if pictogram element is accepted, otherwise false
	 */
	abstract protected boolean accept(PictogramElement pictogramElement);
}
