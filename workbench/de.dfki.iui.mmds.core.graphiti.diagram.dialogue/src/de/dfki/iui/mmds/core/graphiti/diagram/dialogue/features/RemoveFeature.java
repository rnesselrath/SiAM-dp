package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.internal.services.GraphitiInternal;
import org.eclipse.graphiti.mm.pictograms.AdvancedAnchor;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.CompositeConnection;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

/**
 * The class Remove Feature. Used for removing shapes and business objects
 * @author Dragan Milchevski
 *
 */
public class RemoveFeature extends DefaultRemoveFeature{

	/**
	 * Creates new {@link RemoveFeature}
	 * 
	 * @param fp the feature provider
	 */
	public RemoveFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Checks if given object could be removed.
	 * 
	 * @param context contains object to remove
	 * @return true if remove is possible
	 */
	public boolean canRemove(IRemoveContext context) {
		return false;//!(context.getPictogramElement() instanceof Diagram);
	}
	
	/**
	 * Remove the given object.
	 * 
	 * @param context contains object to remove
	 */
	public void remove(IRemoveContext context) {
		if (!getUserDecision()) {
			return;
		}
		preRemove(context);

		PictogramElement pe = context.getPictogramElement();

		if (pe instanceof Shape) {
			Shape shape = (Shape) pe;
			
			removeAllConnections(shape);
		} else if (pe instanceof AdvancedAnchor) {
			removeAllConnections((AdvancedAnchor) pe);
		} else if (pe instanceof CompositeConnection) {
			removeCompositeConnections((CompositeConnection) pe);
		}
		if(!(pe instanceof Diagram)){ //Delete this PE only if it is not Diagram
			
			Graphiti.getPeService().deletePictogramElement(pe);
		}else{ //If it is Diagram, delete the children. This is when deleting StateChart
			if (pe instanceof Shape) {
				ContainerShape cs = (ContainerShape) pe;
				List<Shape> childList = cs.getChildren();
				List<Shape> l = new ArrayList<Shape>();
				for (Shape shape : childList) {
					l.add(shape);
				}
				for (Shape shape : l) {
					Graphiti.getPeService().deletePictogramElement(shape);
				}
				
			}else if (pe instanceof AdvancedAnchor) {
				removeAllConnections((AdvancedAnchor) pe);
			} else if (pe instanceof CompositeConnection) {
				removeCompositeConnections((CompositeConnection) pe);
			}
		}

		postRemove(context);
	}
	
	
	private void removeCompositeConnections(CompositeConnection composite) {
		List<Connection> children = new ArrayList<Connection>(composite.getChildren());
		for (Connection childConnection : children) {
			RemoveContext context = new RemoveContext(childConnection);
			remove(context);
		}
	}

	public void preRemove(IRemoveContext context) {
	}

	/**
	 * Removes the all connections.
	 * 
	 * @param shape the shape
	 */
	protected void removeAllConnections(Shape shape) {
		if (shape instanceof ContainerShape) {
			EList<Shape> children = ((ContainerShape) shape).getChildren();
			for (Shape childShape : children) {
				removeAllConnections(childShape);
			}
		}
		List<Anchor> anchors = shape.getAnchors();
		for (Anchor anchor : anchors) {
			removeAllConnections(anchor);
		}
	}

	/**
	 * @since 0.9
	 */
	protected void removeAllConnections(Anchor anchor) {
		IFeatureProvider featureProvider = getFeatureProvider();
		List<Connection> allConnections = Graphiti.getPeService().getAllConnections(anchor);
		for (Connection connection : allConnections) {
			if (GraphitiInternal.getEmfService().isObjectAlive(connection)) {
				IRemoveContext rc = new RemoveContext(connection);
				IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
				if (removeFeature != null) {
					ConnectionDecorator decorators[] = connection.getConnectionDecorators().toArray(
							new ConnectionDecorator[0]);
					for (ConnectionDecorator decorator : decorators) {
						if (decorator != null && GraphitiInternal.getEmfService().isObjectAlive(decorator)) {
							EcoreUtil.delete(decorator, true);
						}
					}
					removeFeature.remove(rc);
				}
			}
		}
	}

	public void postRemove(IRemoveContext context) {
	}

	public boolean canExecute(IContext context) {
		boolean ret = false;
		if (context instanceof IRemoveContext) {
			ret = canRemove((IRemoveContext) context);
		}
		return ret;
	}

	public void execute(IContext context) {
		if (context instanceof IRemoveContext) {
			remove((IRemoveContext) context);
		}
	}

	

}
