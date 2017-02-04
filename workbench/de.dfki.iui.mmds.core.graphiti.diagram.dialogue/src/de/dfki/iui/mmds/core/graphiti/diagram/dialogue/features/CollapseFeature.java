package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;

/**
 * Collapse Feature class. It is use to collapse bigger shapes
 * 
 * @author Dragan
 *
 */
public class CollapseFeature extends AbstractCustomFeature{
	private boolean isAutoExecuted_ = false;
	/**
	 * Creates a new {@link CollapseFeature}.
	 * 
	 * @param fp the feature provider
	 */
	public CollapseFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return "Collapse";
	}
	
	public void setAuto(boolean autoMode) {
		isAutoExecuted_ = autoMode;
	}

	/**
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return "Collapse this Shape";
	}

	/**
	 * Checks if the shape allows collapsing
	 * 
	 * @param context the context
	 * @return true if collapsing is allowed
	 */
	@Override
	public boolean canExecute(ICustomContext context) {
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			//Add more of the objects that collapse here
			if (bo instanceof AbstractCompositeState || bo instanceof Node) {
				ret = true;
			}
		}
		return ret;
	}

	/**
	 * Decides if the current feature is available with the given context.
	 * 
	 * @return always true in this project
	 */
	@Override
	public boolean isAvailable(IContext context) {

		return true;
	}

	/**
	 * Execute the collapsing
	 * 
	 * @param context the context
	 */
	public void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);

			if(bo instanceof AbstractCompositeState || bo instanceof Node){
				collapseAbstractCompositeState(pes[0]);
			}
		}

	}

	/**
	 * Collapse the shape for objects of type StateChart, CompositeState, ParallelState
	 * 
	 * @param pe PictogamElement for the shape of the object
	 */
	public void collapseAbstractCompositeState(PictogramElement pe){
		ContainerShape cs = (ContainerShape) pe;
		int width = pe.getGraphicsAlgorithm().getWidth();
		if(Graphiti.getPeService().getPropertyValue(pe, "initial_width") != null)
			width = Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, "initial_width"));
		int height = pe.getGraphicsAlgorithm().getHeight();
		int x = pe.getGraphicsAlgorithm().getX();
		int y = pe.getGraphicsAlgorithm().getY();

		int changeWidth = width;
		int changeHeight = 50;

		boolean visible = false;
		if(Graphiti.getPeService().getPropertyValue(pe, "isCollapsed") == null 
				|| Graphiti.getPeService().getPropertyValue(pe, "isCollapsed").equals("false")) {
			Graphiti.getPeService().setPropertyValue(pe, "initial_width", String.valueOf(width));
			Graphiti.getPeService().setPropertyValue(pe, "initial_height", String.valueOf(height));
			visible = false;
			HashSet<Shape> except = new HashSet<Shape>();
			except.add(cs);
			if(!isAutoExecuted_)
				makeChildrenInvisible(cs.getContainer(), true, except, false);
			
			if(Graphiti.getPeService().getPropertyValue(pe, "initial_x") != null) {
				x = Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, "initial_x"));
				y = Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe, "initial_y"));	
			}
					
		} else if(Graphiti.getPeService().getPropertyValue(pe, "isCollapsed") != null 
				&& Graphiti.getPeService().getPropertyValue(pe, "isCollapsed").equals("true")){
			changeWidth = cs.getContainer().getGraphicsAlgorithm().getWidth()-10;
			changeHeight = cs.getContainer().getGraphicsAlgorithm().getHeight()-50;
			
			Graphiti.getPeService().setPropertyValue(pe, "initial_x", String.valueOf(cs.getGraphicsAlgorithm().getX()));
			Graphiti.getPeService().setPropertyValue(pe, "initial_y", String.valueOf(cs.getGraphicsAlgorithm().getY()));
			
			x = cs.getContainer().getGraphicsAlgorithm().getX();
			y = cs.getContainer().getGraphicsAlgorithm().getY();
			
			Graphiti.getPeService().setPropertyValue(pe, "isCollapsed", "false");
			visible = true;		
			HashSet<Shape> except = new HashSet<Shape>();
			except.add(cs);
			if(!isAutoExecuted_)
				makeChildrenInvisible(cs.getContainer(), false, except, false);
		}

		ResizeShapeContext context1 = new ResizeShapeContext(cs);
		context1.setSize(changeWidth, changeHeight);
		context1.setLocation(x, y);
		IResizeShapeFeature rsf = getFeatureProvider().getResizeShapeFeature(context1);
		if (rsf.canExecute(context1)) {
			rsf.execute(context1);
		}

		if(!visible){
			Graphiti.getPeService().setPropertyValue(pe, "isCollapsed", "true");
		}
		//visible/invisible all the children
		makeChildrenInvisible(cs, visible, new HashSet(), true);
	}

	/**
	 * Recursive function that makes all the children inside a shape visible/invisible
	 * 
	 * @param cs ContainerShape, visible the previous state
	 * @param visible true/false
	 */
	public void makeChildrenInvisible(ContainerShape cs, boolean visible, Set<Shape> except, boolean hideServiceShapes){
		if(cs.getChildren().isEmpty()){
			return;
		}else{
			Iterator<Shape> iter = cs.getChildren().iterator();
			while (iter.hasNext()) {
				Shape shape = iter.next();
				if(!hideServiceShapes && PropertyUtil.isServiceShape(shape))
					continue;
				if(except.contains(shape))
					continue;
				
				if(shape instanceof ContainerShape) { //It is another shape
					
//					if(!isAutoExecuted_)
//						continue;
					
					makeChildrenInvisible((ContainerShape) shape, visible, except,true);

				
					shape.setVisible(visible);
					Anchor anchor = null;
					if(!shape.getAnchors().isEmpty()){
						anchor = shape.getAnchors().get(0);
					}
					boolean initVisible = false;

					//Check whether the initial shape is visible or not
					for(Shape shape1 : ((ContainerShape) shape).getChildren()){
						if(shape1.getGraphicsAlgorithm() instanceof Ellipse){
							initVisible = shape1.isVisible();
						}
					}
					if(anchor != null){
						for(int i=0; i<anchor.getIncomingConnections().size(); i++){
							Connection conn = anchor.getIncomingConnections().get(i);
							if(initVisible){ //Change visibility only to visible connections
								conn.setVisible(visible);
								for(int j=0; j< conn.getConnectionDecorators().size(); j++){
									conn.getConnectionDecorators().get(j).setVisible(visible);
								}
							}
						}
						for(int i=0; i<anchor.getOutgoingConnections().size(); i++){

							Connection conn = anchor.getOutgoingConnections().get(i);
							conn.setVisible(visible);
							for(int j=0; j< conn.getConnectionDecorators().size(); j++){
								conn.getConnectionDecorators().get(j).setVisible(visible);
							}
						}
					}
				} 
			}
		}
	}
}
