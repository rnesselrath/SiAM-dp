package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

public class ConvertToHistoryFeature extends AbstractCustomFeature{

	public ConvertToHistoryFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			//Add more of the objects that collapse here
			if (bo instanceof State) {
				ret = true;
			}
		}

		return ret;
	}

	@Override
	public String getName() {
		return "History State"; //$NON-NLS-1$
	}

	@Override
	public String getDescription() {

		return "Make this State a History State"; //$NON-NLS-1$
	}

	@Override
	public String getImageId() {
		return DialogueImageProvider.IMG_HISTORY_STATE;
	}

	@Override
	public boolean isAvailable(IContext context) {
		return true;
	}

	@Override
	public void execute(ICustomContext context) {

		PictogramElement pe = context.getPictogramElements()[0];

		State state = (State)getBusinessObjectForPictogramElement(pe);
		EObject parentObject = state.eContainer();
		if(parentObject instanceof StateChart){
			StateChart stateChart = (StateChart)parentObject;
			//stateChart.setHistoryState(state);
		}
		if(parentObject instanceof CompositeState){
			CompositeState compositeParent = (CompositeState)parentObject;
			//compositeParent.setHistoryState(state);	
		}
		//System.out.println("parent ="+pe.);
		//		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		//		final IGaService gaService = Graphiti.getGaService();
		//		
		//		Ellipse ellipse = gaService.createEllipse(pe);
		//		gaService.setLocationAndSize(ellipse, pe.getGraphicsAlgorithm().getX(), pe.getGraphicsAlgorithm().getY(), 40, 40);

		transformShape(context);

	}


	private void transformShape(ICustomContext context){
		PictogramElement pe = context.getPictogramElements()[0];
		State state = (State)getBusinessObjectForPictogramElement(pe);

		ContainerShape targetContainer = (ContainerShape) pe.eContainer();
		
		
		// CONTAINER SHAPE WITH ELLIPSE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);

		int width = 80;
		int height = 80;
		int INVISIBLE_RECT_RIGHT = 6;

		IGaService gaService = Graphiti.getGaService();
		Ellipse ellipse; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, pe.getGraphicsAlgorithm().getX(),pe.getGraphicsAlgorithm().getY(), width, height);
			
			// create and set visible rectangle inside invisible rectangle
			//ellipse = gaService.createPlainRoundedRectangle(invisibleRectangle, 5, 5);

			ellipse = gaService.createPlainEllipse(invisibleRectangle);
			ellipse.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(ellipse, 40, 20, 30, 30);
			ellipse.setLineWidth(2);
			//pe.setGraphicsAlgorithm(ellipse);
			//pe.setGraphicsAlgorithm(ga);
			link(containerShape, state);
		}
		{//Create the letter H
			final Shape shape = peCreateService.createShape(containerShape, false);
			Polyline polyline = gaService.createPlainPolyline(shape, new int[] { 0, 0, 0, 20,  0, 10, 12, 10, 12, 0, 12, 20 });
			polyline.setStyle(StyleUtil.getStyleForState(getDiagram()));
			polyline.setLineWidth(3);
			gaService.setLocationAndSize(polyline, 49, 25, 20, 20);
		}
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);


			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, state.getDisplayName());
			text.setStyle(StyleUtil.getStyleForStateText(getDiagram()));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			//text.setX(0);
			//text.setY(0);
			gaService.setLocationAndSize(text, 15,45, width, 20);


			// create link and wire it
			link(shape, state);

			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(containerShape);
			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(shape);
			directEditingInfo.setGraphicsAlgorithm(text);
		}

		/*// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

		// create an additional box relative anchor at middle-right
		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		boxAnchor.setRelativeWidth(1.0);
		boxAnchor.setRelativeHeight(0.38); // Use golden section

		// anchor references visible rectangle instead of invisible rectangle
		boxAnchor.setReferencedGraphicsAlgorithm(ellipse);

		// assign a graphics algorithm for the box relative anchor
		final Ellipse ellipse2 = gaService.createPlainEllipse(boxAnchor);

		// anchor is located on the right border of the visible rectangle
		// and touches the border of the invisible rectangle
		final int w = INVISIBLE_RECT_RIGHT;
		gaService.setLocationAndSize(ellipse2, -w, 0, 2 * w, 2 * w);
		ellipse2.setStyle(StyleUtil.getStyleForState(getDiagram()));*/
		final int w = INVISIBLE_RECT_RIGHT;
		ContainerShape csTmp = (ContainerShape) pe;
		for(int i=0; i<csTmp.getAnchors().size(); i++){
			/*if(csTmp.getAnchors().get(i) instanceof BoxRelativeAnchor){
				
				BoxRelativeAnchor boxAnchor = (BoxRelativeAnchor) csTmp.getAnchors().get(i);
				//gaService.setLocationAndSize(boxAnchor.getGraphicsAlgorithm(),  -w, 0, 2 * w, 2 * w);
				containerShape.getAnchors().add(boxAnchor);
			}else{*/
				containerShape.getAnchors().add(csTmp.getAnchors().get(i));
			//}
			//System.out.println("anchors "+csTmp.getAnchors().get(i));
		}
		//containerShape.getAnchors().addAll(csTmp.getAnchors());
		
		IRemoveContext rc = new RemoveContext(pe);
		IFeatureProvider featureProvider = getFeatureProvider();
		IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
		if (removeFeature != null) {
			removeFeature.remove(rc);
		}

		
	}


}
