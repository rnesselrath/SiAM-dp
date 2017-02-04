package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

/**
 * Adding {@link Transition} feature
 * This class implements a pictogram element that has to be added. 
 * This pictogram element has to link to a {@link Transition} object.
 * 
 * @author Dragan Milchevski
 *
 */
public class AddTransitionConnectionFeature extends AbstractAddFeature {

	/**
	 * Creates new {@link AddTransitionConnectionFeature}
	 * @param fp the feature provider
	 */
	public AddTransitionConnectionFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Check the container if it is of a type entry or exit
	 * 
	 * @param context the adding context
	 * @return true if the feature can be added.
	 */
	@Override
	public boolean canAdd(IAddContext context) {
		if(context instanceof IAddConnectionContext  && context.getNewObject() instanceof Transition){
			return true;
		}
		return false;
	}

	/**
	 * Add the object on the diagram.
	 * 
	 * @param context the adding context
	 * @return the added pictogram element
	 */
	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		

		//CONNECTION WITH POLYLINE
		Connection connection =peCreateService.createFreeFormConnection(getDiagram());
		
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		Polyline polyline = gaService.createPlainPolyline(connection);
		polyline.setBackground(manageColor(IColorConstant.BLACK));
		//polyline.setLineWidth(2);
		polyline.setStyle(StyleUtil.getStyleForTransition(getDiagram()));
		polyline.setFilled(false);
		

		Transition addTransition = (Transition) context.getNewObject();
		link(connection, addTransition);
		
//		// SHAPE WITH TEXT
		{
			ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
			//Rectangle rectangle = gaService.createRectangle(textDecorator);
			//rectangle.setFilled(false);
			//gaService.setLocationAndSize(rectangle, 0, 0, 100, 30);
			
			//Text text = gaService.createPlainText(rectangle);
			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(textDecorator);
			text.setStyle(StyleUtil.getStyleForTextDecorator(getDiagram()));
			text.setFilled(false);
			gaService.setLocationAndSize(text, 0, 0, 100, 20);
			Transition transition = (Transition) context.getNewObject();
			
			String displayName = "";
			if(transition.getDisplayName()!=null){
				displayName = transition.getDisplayName();
			}
			text.setValue(displayName);
			
			//text.setBackground(manageColor(IColorConstant.BLACK));
			//text.setForeground(manageColor(IColorConstant.BLACK));
			
			// create link and wire it
			//link(textDecorator, addTransition);
			
			// provide information to support direct-editing directly
			// after object creation (must be activated additionally)
			final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
			// set container shape for direct editing after object creation
			directEditingInfo.setMainPictogramElement(connection);
			// set shape and graphics algorithm where the editor for
			// direct editing shall be opened after object creation
			directEditingInfo.setPictogramElement(textDecorator);
			directEditingInfo.setGraphicsAlgorithm(text);
			directEditingInfo.setActive(true);
		}
		
		
		// add static graphical decorators (composition and navigable)
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 0.5, true);
		ConnectionDecorator cd1;
		cd1 = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		
		//createRectangle(cd);
		createArrow2(cd1);
		return connection;
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		Polyline polyline = Graphiti.getGaCreateService().createPlainPolyline(gaContainer,
				new int[] { -15, 10, 0, 0, -15, -10 });
		polyline.setStyle(StyleUtil.getStyleForState(getDiagram()));
		return polyline;
	}
	
	private Polyline createArrow2(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
        Polygon polygon =gaService.createPolygon(gaContainer, new int[] { -10, 5, 0, 0, -10, -5 });
        //polygon.setForeground(manageColor(IColorConstant.BLACK));
        
        //polygon.setStyle(StyleUtil.getStyleForState(getDiagram()));
        polygon.setLineWidth(2);
        polygon.setBackground(manageColor(IColorConstant.BLACK));
        polygon.setFilled(true);
        return polygon;
	}
	
	private Polyline createRectangle(GraphicsAlgorithmContainer gaContainer) {
		
		IGaService gaService = Graphiti.getGaService();
        Polygon polygon =gaService.createPolygon(gaContainer, new int[] { 0, -12, 80, -12, 80, 12, 0, 12 });
        polygon.setStyle(StyleUtil.getStyleForState(getDiagram()));
        polygon.setLineWidth(1);
        //polygon.setFilled(true);
        return polygon;
	}
}
