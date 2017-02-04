package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;

/**
 * The class {@link CollapseExecutableContentHolderFeature}. It is used to collapse the shape of the {@link ExecutableContent}.
 * 
 * @author Dragan Milchevski
 *
 */
public class CollapseExecutableContentHolderFeature extends AbstractCustomFeature{

	/**
	 * Creates new {@link CollapseExecutableContentHolderFeature}.
	 * 
	 * @param fp the feature provider
	 */
	public CollapseExecutableContentHolderFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * 
	 * @return the name
	 */
	@Override
	public String getName() {
		return "Collapse";
	}

	/**
	 * 
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return "Collapse this holder";
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
			EObject bo = (EObject) getBusinessObjectForPictogramElement(pes[0]);
			return PropertyUtil.isOnEntry(pes[0]) || PropertyUtil.isOnExit(pes[0]) || bo instanceof ExecutableContent;
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
	@Override
	public void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			EObject bo = (EObject) getBusinessObjectForPictogramElement(pes[0]);
			if(PropertyUtil.isOnEntry(pes[0]) || PropertyUtil.isOnExit(pes[0])){
				collapseHolder(pes[0]);
			}else if(bo instanceof ExecutableContent){
				PictogramElement pe = (PictogramElement) pes[0].eContainer();
				collapseHolder(pe);
			}
		}
		
	}
	
	/**
	 * Collapse the shape for objects of type StateChart, CompositeState, ParallelState
	 * 
	 * @param pe PictogamElement for the shape of the object
	 */
	private void collapseHolder(PictogramElement pe){
		ContainerShape cs = (ContainerShape) pe;
		int width = pe.getGraphicsAlgorithm().getWidth();
		int height = pe.getGraphicsAlgorithm().getHeight();		

		int changeWidth = width;
		int changeHeight = 100;
		
		boolean visible = false;
		if(PropertyUtil.isCollapsed(pe)){
			PropertyUtil.setInitialWidth(pe, String.valueOf(width));
			PropertyUtil.setInitialHeight(pe, String.valueOf(height));
			PropertyUtil.setCollapsed(pe, "false");
			visible = true;
		}else if(!PropertyUtil.isCollapsed(pe)){
			changeWidth = PropertyUtil.getInitialWidth(pe);
			changeHeight= PropertyUtil.getInitialHeight(pe);
			
			visible = false;
		}
		
		ResizeShapeContext context1 = new ResizeShapeContext(cs);
		context1.setSize(changeWidth, changeHeight);
		context1.setLocation(cs.getGraphicsAlgorithm().getX(), cs.getGraphicsAlgorithm().getY());
		IResizeShapeFeature rsf = getFeatureProvider().getResizeShapeFeature(context1);
		if (rsf.canExecute(context1)) {
			rsf.execute(context1);
		}
		
		ContainerShape parent = cs.getContainer();
		GraphicsAlgorithm ga = cs.getGraphicsAlgorithm();
		

		
		
		if(!visible){
			PropertyUtil.setCollapsed(pe, "true");
		}
		
		int retVal = moveShapes(cs);
		if(retVal == 0){
			if(!PropertyUtil.isCollapsed(cs)){
				PropertyUtil.setInitialHeight(parent, String.valueOf(parent.getGraphicsAlgorithm().getHeight()));
				if(parent.getGraphicsAlgorithm().getHeight() < ga.getY()+ga.getHeight()){
					resizeParent(parent, changeHeight+48);
				}
			}else{
				if(PropertyUtil.getInitialHeight(parent) >= 0){
					resizeParent(parent, PropertyUtil.getInitialHeight(parent));
				}
			}
		}
	}
	
	/**
	 * Move the shapes to certain position
	 * 
	 * @param cs the current shape
	 * @return true if a shape is moved
	 */
	private int moveShapes(ContainerShape cs){
		int retVal = 0;
		ContainerShape parent = (ContainerShape) cs.getContainer();
		if(!parent.getChildren().isEmpty()){
			Iterator<Shape> iter = parent.getChildren().iterator();
			while (iter.hasNext()) {
				Shape shape = iter.next();
			
				if(shape instanceof ContainerShape ){ //It is another shape
					//moveShapes(shape);
					GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
					if(!shape.equals(cs)){
						
						if(!PropertyUtil.isCollapsed(cs)){
							if(ga.getY() < cs.getGraphicsAlgorithm().getY()+cs.getGraphicsAlgorithm().getHeight()
									&& ga.getY() > cs.getGraphicsAlgorithm().getY()){
								PropertyUtil.setInitialY(shape, String.valueOf(ga.getY()));
								PropertyUtil.setInitialHeight(parent, String.valueOf(parent.getGraphicsAlgorithm().getHeight()));
								int y = cs.getGraphicsAlgorithm().getHeight()+cs.getGraphicsAlgorithm().getY()+2;
								
								ga.setY(y);
								if(parent.getGraphicsAlgorithm().getHeight() < ga.getY()+ga.getHeight()){
									resizeParent(parent, y+22);
								}
								retVal = 1;
							}
						}else{
							
							if(PropertyUtil.getInitialY(shape) > 0){
								ga.setY(PropertyUtil.getInitialY(shape));
							}
							
							if(PropertyUtil.getInitialHeight(parent) >= 0){
								resizeParent(parent, PropertyUtil.getInitialHeight(parent));
							}
						}
					}
//					else{
//						if(!PropertyUtil.isCollapsed(cs)){
//							if(parent.getGraphicsAlgorithm().getHeight() < ga.getY()+ga.getHeight()){
//								resizeParent(parent, cs.getGraphicsAlgorithm().getHeight()+cs.getGraphicsAlgorithm().getY()+2+22);
//							}
//						}else{
//							if(PropertyUtil.getInitialHeight(parent) >= 0){
//								resizeParent(parent, PropertyUtil.getInitialHeight(parent));
//							}
//						}
//					}
					
				}
			}
		}
		return retVal;
	}
	
	/**
	 * Resize the parent with a {@link ResizeShapeContext}
	 * 
	 * @param cs the shape
	 * @param height the height of the shape
	 */
	public void resizeParent(ContainerShape cs, int height){
		ResizeShapeContext context1 = new ResizeShapeContext(cs);
		context1.setSize(cs.getGraphicsAlgorithm().getWidth(), height);
		context1.setLocation(cs.getGraphicsAlgorithm().getX(), cs.getGraphicsAlgorithm().getY());
		IResizeShapeFeature rsf = getFeatureProvider().getResizeShapeFeature(context1);
		if (rsf.canExecute(context1)) {
			rsf.execute(context1);
		}
	}

}
