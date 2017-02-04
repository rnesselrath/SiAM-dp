package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.StyleUtil;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.ParallelState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;
import de.dfki.iui.mmds.core.model.dialogue.statechart.impl.StateImpl;

/**
 * Util helper class for static methods called from more places
 * 
 * @author Dragan Milchevski
 *
 */
public class ExecutableContentHoldersUtil {

	/**
	 * Set text on the More shape. This text is usually counter of assigned {@link ExecutableContent} objects
	 * 
	 * @param parent the parent container
	 * @param moreEntryExitValue the more entry exit value
	 * @param textValue the value to assign
	 */
	public static void setMoreShapeTextValue(ContainerShape parent, String moreEntryExitValue, final String textValue){
		for(Shape shape : parent.getChildren()){
			if(moreEntryExitValue.equals(PropertyUtil.MORE_ENTRY_VALUE)){
				if(PropertyUtil.isMoreEntry(shape)){
					//if(!shape.isActive()){
					shape.setActive(true);
					//}
					ContainerShape cs = (ContainerShape)shape;
					if(!cs.getChildren().isEmpty()){
						final GraphicsAlgorithm ga = cs.getChildren().get(0).getGraphicsAlgorithm();
						if(ga instanceof Text){
							TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ga);

							domain.getCommandStack().execute(new RecordingCommand(domain) {
								@Override
								public void doExecute() {

									Text text = (Text)ga;
									text.setFilled(false);
									text.setValue(textValue);
								}
							});
						}
					}
				}
			}else if(moreEntryExitValue.equals(PropertyUtil.MORE_EXIT_VLUE)){
				if(PropertyUtil.isMoreExit(shape)){
					if(!shape.isActive()){
						shape.setActive(true);
					}
					ContainerShape cs = (ContainerShape)shape;
					if(!cs.getChildren().isEmpty()){
						final GraphicsAlgorithm ga1 = cs.getChildren().get(0).getGraphicsAlgorithm();
						if(ga1 instanceof Text){
							TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ga1);
							domain.getCommandStack().execute(new RecordingCommand(domain) {
								@Override
								public void doExecute() {

									Text text = (Text)ga1;
									text.setValue(textValue);
									text.setFilled(false);
								}
							});


						}
					}
				}
			}
		}
	}

	/**
	 * Create executable content holders
	 * 
	 * @param containerShape the {@link ContainerShape} on which the holders are created
	 * @param width the width of the holders
	 * @param diagram the {@link Diagram}
	 */
	public static void createHolders(ContainerShape containerShape, int width, Diagram diagram){
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(containerShape);

		{ //SHAPE WITH LINE
			final ContainerShape shape = peCreateService.createContainerShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			Rectangle rec1 = gaService.createRectangle(shape);
			rec1.setStyle(StyleUtil.getStyleForEntryExitHolder(diagram));
			if(bo instanceof StateImpl && !(bo instanceof CompositeState) && !(bo instanceof StateChart) && !(bo instanceof ParallelState)){
				rec1.setFilled(false);
				rec1.setLineVisible(false);
			}

			gaService.setLocationAndSize(rec1, 0, 20, width, 45);
			PropertyUtil.setEntryExitHolder(shape, PropertyUtil.ENTRY_EXIT_HOLDER_VALUE);
		}



		// RECTANGLE SHAPE FOR THE ON ENTRY OBJECT
		{
			final ContainerShape entryShape = peCreateService.createContainerShape(containerShape, true);
			PropertyUtil.setServiceShape(entryShape);
			// create and set graphics algorithm
			final Rectangle rec1 = gaService.createRectangle(entryShape);
			rec1.setStyle(StyleUtil.getStyleForState(diagram));
			rec1.setFilled(false);
			gaService.setLocationAndSize(rec1, 28, 24, width-56, 18);
			PropertyUtil.setEntryExit(entryShape, PropertyUtil.ON_ENTRY_VALUE);
			PropertyUtil.setCollapsed(entryShape, "true");

		}
		// RECTANGLE SHAPE FOR THE MORE ON ENTRY
		{
			// create shape for line
			final ContainerShape moreShape = peCreateService.createContainerShape(containerShape, false);
			PropertyUtil.setServiceShape(moreShape);
			// create and set graphics algorithm
			final Rectangle rec2 = gaService.createRectangle(moreShape);
			rec2.setStyle(StyleUtil.getStyleForState(diagram));
			rec2.setFilled(false);
			rec2.setLineVisible(false);
			gaService.setLocationAndSize(rec2, width-26, 24, 20, 18);
			PropertyUtil.setMoreEntryExit(moreShape, PropertyUtil.MORE_ENTRY_VALUE);


			// create shape for text
			Shape shape2 = peCreateService.createShape(moreShape, false);
			PropertyUtil.setServiceShape(shape2);
			// create and set text graphics algorithm
			Text text = gaService.createPlainText(shape2, "");
			text.setStyle(StyleUtil.getStyleForStateText(diagram));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setValue("");
			text.setFilled(false);
			gaService.setLocationAndSize(text, 0,0, 20, 20);


		}


		{ //SHAPE WITH IMAGE ON ENTRY
			ContainerShape shape = peCreateService.createContainerShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			Image image = gaService.createImage(shape, DialogueImageProvider.IMG_ON_ENTRY);

			// calculate position for icon
			int iconWidthAndHeight = 16;

			gaService.setLocationAndSize(image, 10, 26, iconWidthAndHeight, iconWidthAndHeight);
			PropertyUtil.setEntryExitImage(shape, PropertyUtil.ENTRY_IMG_VALUE);
		}

		// RECTANGLE SHAPE FOR THE ON EXIT OBJECT
		{
			// create shape for line
			final ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
			PropertyUtil.setServiceShape(shape);
			// create and set graphics algorithm
			final Rectangle rec1 = gaService.createRectangle(shape);
			rec1.setStyle(StyleUtil.getStyleForState(diagram));
			rec1.setFilled(false);
			gaService.setLocationAndSize(rec1, 28, 44, width-100, 18);
			PropertyUtil.setEntryExit(shape, PropertyUtil.ON_EXIT_VALUE);
			PropertyUtil.setCollapsed(shape, "true");
		}
		// RECTANGLE SHAPE FOR THE MORE ON EXIT
		{
			// create shape for line
			final ContainerShape shape = peCreateService.createContainerShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			// create and set graphics algorithm
			final Rectangle rec1 = gaService.createRectangle(shape);
			rec1.setStyle(StyleUtil.getStyleForState(diagram));
			rec1.setFilled(false);
			rec1.setLineVisible(false);
			gaService.setLocationAndSize(rec1, width-26, 44, 20, 18);
			PropertyUtil.setMoreEntryExit(shape, PropertyUtil.MORE_EXIT_VLUE);


			// create shape for text
			Shape shape2 = peCreateService.createShape(shape, false);
			PropertyUtil.setServiceShape(shape2);
			// create and set text graphics algorithm
			Text text = gaService.createPlainText(shape2, "");
			text.setStyle(StyleUtil.getStyleForStateText(diagram));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFilled(false);

			gaService.setLocationAndSize(text, 0,0, 20, 20);

		}

		{ //SHAPE WITH IMAGE ON EXIT
			ContainerShape shape = peCreateService.createContainerShape(containerShape, false);
			PropertyUtil.setServiceShape(shape);
			Image image = gaService.createImage(shape, DialogueImageProvider.IMG_ON_EXIT);
			
			// calculate position for icon
			int iconWidthAndHeight = 16;
			gaService.setLocationAndSize(image, 10, 46/*yPos*/, iconWidthAndHeight, iconWidthAndHeight);
			PropertyUtil.setEntryExitImage(shape, PropertyUtil.EXIT_IMG_VALUE);
		}
		{
			// create shape for line
			final ContainerShape shape = peCreateService.createContainerShape(containerShape, true);
			PropertyUtil.setServiceShape(shape);
			// create and set graphics algorithm
			final Rectangle rec1 = gaService.createRectangle(shape);
			rec1.setStyle(StyleUtil.getStyleForState(diagram));
			rec1.setFilled(false);
			gaService.setLocationAndSize(rec1, 28, 64, width-56, 18);
			PropertyUtil.setConnectionHolder(shape, PropertyUtil.STATE_CONNECTIONS);
			
			// create shape for text
			Shape shape2 = peCreateService.createShape(shape, false);
			PropertyUtil.setServiceShape(shape2);
			// create and set text graphics algorithm
			Text text = gaService.createPlainText(shape2, "Connections...");
			text.setStyle(StyleUtil.getStyleForStateText(diagram));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFilled(false);

			gaService.setLocationAndSize(text, 0,0, 80, 20);
		}
	}

	/**
	 * Static method that layouts all the {@link ExecutableContent} holders
	 * 
	 * @param shape the layouting shape
	 * @param graphicsAlgorithm the pictogram element
	 * @param rectangleWidth the width of the rectangle
	 * @param initialVisible whether there is an initial shape visible
	 */
	public static void layoutHolders(Shape shape, GraphicsAlgorithm graphicsAlgorithm, int rectangleWidth, boolean initialVisible){
		//Layout the onEntry onExit shapes
		if(PropertyUtil.isOnEntry(shape) || PropertyUtil.isOnExit(shape)){
			Rectangle rec1 = (Rectangle)graphicsAlgorithm;
			rec1.setWidth(rectangleWidth-36);
			rec1.setX(28);
			
			if(PropertyUtil.isOnEntry(shape)){
				rec1.setY(24);
			}
			
			if(PropertyUtil.isOnExit(shape)){
				rec1.setY(44);
			}
			
		}

		//Layout the moreEntry moreExit text shapes
		if(PropertyUtil.isMoreEntry(shape) || PropertyUtil.isMoreExit(shape)){
			Rectangle rec2 = (Rectangle)graphicsAlgorithm;
			rec2.setWidth(20);
			if(initialVisible){
				rec2.setX(50+rectangleWidth-28);
			}else{
				rec2.setX(rectangleWidth-28);
			}
			
			if(PropertyUtil.isMoreEntry(shape)){
				rec2.setY(24);
			}
			
			if(PropertyUtil.isMoreExit(shape)){
				
				rec2.setY(44);
			}
			
		}

		//Layout entry/exit images
		if(PropertyUtil.isEntryImage(shape) || PropertyUtil.isExitImage(shape)){
			Image image = (Image)graphicsAlgorithm;
			if(initialVisible){
				image.setX(60);
			}else{

				image.setX(10);
			}
		}

		//Layout other holders like EntryExit holder, ExecContentHolder, CondEventHolder...
		if(PropertyUtil.isEntryExitHolder(shape) || PropertyUtil.isExecContentHolder(shape) || PropertyUtil.isCondEventHolder(shape)){	
			Rectangle rec3 = (Rectangle)graphicsAlgorithm;
			rec3.setWidth(rectangleWidth);
			rec3.setX(0);
		}
		

	}

	/**
	 * Set text on the more shape
	 * 
	 * @param bo the business that holds the {@link ExecutableContent} objects
	 * @param targetContainer the target container to which the text is shown
	 * @param parent the parent shape
	 */
	public static void setMoreText(EObject bo, ContainerShape targetContainer, ContainerShape parent){
		if (bo instanceof State) {
			State parentState = (State)bo;
			if(PropertyUtil.isOnEntry(targetContainer)){
				ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, PropertyUtil.MORE_ENTRY_VALUE, "");

				if( parentState.getOnEntry().size()>1){
					ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, PropertyUtil.MORE_ENTRY_VALUE, "+"+(parentState.getOnEntry().size()-1));
					//y = (parentState.getOnEntry().size() * 18)-18;
				}
			}else if(PropertyUtil.isOnExit(targetContainer)){
				ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, PropertyUtil.MORE_EXIT_VLUE, "");
				if(parentState.getOnExit().size()>1){
					ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, PropertyUtil.MORE_EXIT_VLUE, "+"+(parentState.getOnExit().size()-1));
					//y = (parentState.getOnExit().size() * 18)-18;
				}
			}
		}
		if(bo instanceof ExecutableContentNode){
			if(PropertyUtil.isExecContentHolder(targetContainer)){
				ExecutableContentNode ecn = (ExecutableContentNode)bo;
				ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, PropertyUtil.MORE_ENTRY_VALUE, "");
				if(ecn.getContent().size()>1){
					ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, PropertyUtil.MORE_ENTRY_VALUE, "+"+(ecn.getContent().size()-1));
				}
			}
		}
	}
}
