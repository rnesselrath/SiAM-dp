package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.ISingleClickContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.StackEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.CollapseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.OpenExecutableContentEditorFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.OpenStateConnectionsContentEditorFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.MoveDownSeqenceContent;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.MoveUpSeqenceContent;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.ConvertToInitialFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.RenameStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Class for characterizing the tool behavior of the diagram editor.
 * 1. Customizing the palate
 * 2. Adding Button pad around the shapes
 * 3. Double clicking
 * 4. Decorators
 * 5. Tool tips
 * ...
 * 
 * @author Dragan Milcevski
 * @date Apr 12, 2013
 *
 */
public class DialogueToolBehaviourProvider extends DefaultToolBehaviorProvider{


	/**
	 * Creates a new {@link DialogueToolBehaviourProvider}.
	 *  
	 * @param diagramTypeProvider the diagram type provider
	 */
	public DialogueToolBehaviourProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);

	}

	/**
	 * Returns the context button pad data for the given pictogram element context. 
	 * The context button pad data defines, which context buttons to show for a given pictogram element. 
	 * Can return null, if no there is no context button pad for the given pictogram element.
	 * 
	 * @param context the context
	 * @return The context button pad data for the given pictogram element context.
	 */
	@Override
	public IContextButtonPadData getContextButtonPad(IPictogramElementContext context) {
		IContextButtonPadData data = super.getContextButtonPad(context);
		PictogramElement pe = context.getPictogramElement();


		EObject bo = (EObject) getFeatureProvider().getBusinessObjectForPictogramElement(pe);

		// 1. set the generic context buttons
		if(!PropertyUtil.isOnEntry(pe) && !PropertyUtil.isOnExit(pe) && !PropertyUtil.isMoreEntry(pe) && !PropertyUtil.isMoreExit(pe) 
				&& !PropertyUtil.isThen(pe) && !PropertyUtil.isElse(pe) && !PropertyUtil.isCondEventHolder(pe)){
			setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_UPDATE );
		}else{
			setGenericContextButtons(data, pe, 0);
		}

		// 2. set the collapse button 
		CustomContext cc = new CustomContext(new PictogramElement[] { pe });
		ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
		for (int i = 0; i < cf.length; i++) {
			ICustomFeature iCustomFeature = cf[i];
			if (iCustomFeature instanceof CollapseFeature && iCustomFeature.canExecute(cc)) {

				String image = IPlatformImageConstants.IMG_EDIT_COLLAPSE;
				String collapseExpand = "Collapse";
				if(Boolean.parseBoolean(Graphiti.getPeService().getPropertyValue(pe, "isCollapsed"))){
					image = IPlatformImageConstants.IMG_EDIT_EXPAND;
					collapseExpand = "Expand";
				}
				String name = "";
				if(bo instanceof HistoryState){
					name = ((HistoryState)bo).getId();
				}
				if(bo instanceof DialogueDesignerElement){
					DialogueDesignerElement dde = (DialogueDesignerElement)bo;

					if(dde!=null && dde.getDisplayName()!=null){
						name = dde.getDisplayName();
					}
				}

				IContextButtonEntry collapseButton  = new ContextButtonEntry(iCustomFeature, cc); 
				collapseButton.setDescription(collapseExpand+" "+name);
				collapseButton.setText(collapseExpand);
				collapseButton.setIconId(image);
				//ContextEntryHelper.createCollapseContextButton(true, iCustomFeature, cc);
				data.setCollapseContextButton(collapseButton);
				break;
			}


			//				if(iCustomFeature instanceof CollapseExecutableContentHolderFeature && iCustomFeature.canExecute(cc)){
			//					
			//					IContextButtonEntry collapseButton  = new ContextButtonEntry(iCustomFeature, cc); 
			//					String image = IPlatformImageConstants.IMG_EDIT_COLLAPSE;
			//					if(PropertyUtil.isCollapsed(pe)){
			//						image = IPlatformImageConstants.IMG_EDIT_EXPAND;
			//					}
			////					collapseButton.setDescription(collapseExpand+" "+name);
			////					collapseButton.setText(collapseExpand);
			//					collapseButton.setIconId(image);
			//					//ContextEntryHelper.createCollapseContextButton(true, iCustomFeature, cc);
			//					data.setCollapseContextButton(collapseButton);
			//					break;
			//				}
		}

		if(pe instanceof ContainerShape && PropertyUtil.isSequenceHolder(((ContainerShape)pe).getContainer())){
			CustomContext cuCo = new CustomContext(new PictogramElement[] { ((ContainerShape)pe).getContainer() });
			ICustomFeature[] cuFe = getFeatureProvider().getCustomFeatures(cuCo);

			for (int i = 0; i < cuFe.length; i++) {
				ICustomFeature iCustomFeature = cuFe[i];

				if(iCustomFeature instanceof MoveDownSeqenceContent){

					ContextButtonEntry downBtn = new ContextButtonEntry(iCustomFeature, cuCo);
					downBtn.setText("Move Down");
					downBtn.setIconId(DialogueImageProvider.IMG_DOWN);
					data.getGenericContextButtons().add(downBtn);
				}
				if(iCustomFeature instanceof MoveUpSeqenceContent){
					ContextButtonEntry upBtn = new ContextButtonEntry(iCustomFeature, cuCo);
					upBtn.setText("Move Up");
					upBtn.setIconId(DialogueImageProvider.IMG_UP);
					data.getGenericContextButtons().add(upBtn);
				}
			}
		}

		// 3. add one domain specific context-button, which offers all 
		// available connection-features as drag&drop features...

		// 3.a. create new CreateConnectionContext
		CreateConnectionContext ccc = new CreateConnectionContext();
		ccc.setSourcePictogramElement(pe);
		Anchor anchor = null;
		if (pe instanceof Anchor) {
			anchor = (Anchor) pe;
		} else if (pe instanceof AnchorContainer) {
			// assume, that our shapes always have chopbox anchors
			anchor = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) pe);
		}
		ccc.setSourceAnchor(anchor);

		// 3.b. create context button and add all applicable features

		ContextButtonEntry button = new ContextButtonEntry(null, context);
		button.setText("Create connection");
		button.setIconId(DialogueImageProvider.IMG_EREFERENCE);
		ICreateConnectionFeature[] features = getFeatureProvider().getCreateConnectionFeatures();
		for (ICreateConnectionFeature feature : features) {
			if (feature.isAvailable(ccc) && feature.canStartConnection(ccc))
				button.addDragAndDropFeature(feature);
		}

		// 3.c. add context button, if it contains at least one feature
		if (button.getDragAndDropFeatures().size() > 0) {
			data.getDomainSpecificContextButtons().add(button);
		}

		//4. Custom buttons for each separate business object

		//4.a Add buttons to State object
		if(bo instanceof State){
			State state = (State)bo;
			CustomContext cc3 = new CustomContext(new PictogramElement[] { pe });
			ICustomFeature[] cf3 = getFeatureProvider().getCustomFeatures(cc3);
			CompositeState parent = null;
			if(state.eContainer() instanceof CompositeState){
				parent = (CompositeState) state.eContainer();
			}

			for (int i = 0; i < cf3.length; i++) {
				ICustomFeature iCustomFeature = cf3[i];
				if(parent!= null){
					if(parent.getInitialState() == null){
						if(iCustomFeature instanceof ConvertToInitialFeature){
							ContextButtonEntry createStateBtn4 = new ContextButtonEntry(iCustomFeature, cc3);
							createStateBtn4.setText(iCustomFeature.getName());
							createStateBtn4.setDescription(iCustomFeature.getDescription());
							createStateBtn4.setIconId(iCustomFeature.getImageId());
							data.getDomainSpecificContextButtons().add(createStateBtn4);
							//break;
						}
					}else{
						if(!parent.getInitialState().equals(state)){
							if(iCustomFeature instanceof ConvertToInitialFeature){
								ContextButtonEntry createStateBtn4 = new ContextButtonEntry(iCustomFeature, cc3);
								createStateBtn4.setText(iCustomFeature.getName());
								createStateBtn4.setDescription(iCustomFeature.getDescription());
								createStateBtn4.setIconId(iCustomFeature.getImageId());
								data.getDomainSpecificContextButtons().add(createStateBtn4);
								//break;
							}
						}
					}
				}
			}
		}

		//4.b Add buttons for the available objects that can be added
		if(!(bo instanceof ExecutableContent)){
			ICreateFeature[] features1 = getFeatureProvider().getCreateFeatures();
			for(ICreateFeature feature1 : features1 ){
				//if(stateChartFeatures.contains(feature1.getCreateName())){

				CreateContext cc1 = new CreateContext();
				if(pe instanceof ContainerShape){
					cc1.setTargetContainer((ContainerShape) pe);

					if(feature1.canCreate(cc1)){
						ContextButtonEntry createStateBtn = new ContextButtonEntry(feature1, cc1);
						createStateBtn.setText(feature1.getCreateName());

						createStateBtn.setDescription(feature1.getCreateDescription());
						createStateBtn.setIconId(feature1.getCreateImageId());

						// Check if there are more objects created already, then locate it to on another position
						//TODO: THIS IS NOT VERY CLAVER!!! PLEASE CHECK THIS CODE AGAIN. FOR NOW X and Y are static
						int x=5;
						int y=40;
						int parentWidth = 1000;
						//Calculate the position of newly added state to avoid collisions
						//TODO: think of algorithm to populate empty spaces
						for(int i=0; i< cc1.getTargetContainer().getChildren().size(); i++){

							Shape shape = cc1.getTargetContainer().getChildren().get(i);
							Object bo2 = getFeatureProvider().getBusinessObjectForPictogramElement(shape);


							if((bo2 instanceof StateChart)){
								parentWidth = shape.getGraphicsAlgorithm().getWidth();
							}else if(((bo2 instanceof State) || (bo2 instanceof CompositeState)) && !(bo2 instanceof StateChart) ){

								if((x < (shape.getGraphicsAlgorithm().getX()+shape.getGraphicsAlgorithm().getWidth())) && x < (parentWidth-shape.getGraphicsAlgorithm().getWidth()-40)){
									x = shape.getGraphicsAlgorithm().getX()+shape.getGraphicsAlgorithm().getWidth()+40;
								}else if(x > (parentWidth-shape.getGraphicsAlgorithm().getWidth()-40)){
									x = 5;
									y = shape.getGraphicsAlgorithm().getY()+shape.getGraphicsAlgorithm().getHeight()+10;
								}
							}
						}
						//System.out.println("XX "+x);
						//x = 5;
						cc1.setLocation(x, y);
						data.getDomainSpecificContextButtons().add(createStateBtn);
					}
				}
			}
		}


		return data;
	}


	/**
	 * @return the palette entries
	 */
	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();

		// add compartments from super class
		IPaletteCompartmentEntry[] superCompartments = super.getPalette();
		//	    for (int i = 0; i < superCompartments.length; i++)
		//	        ret.add(superCompartments[i]);


		// add new compartment at the end of the existing compartments
		PaletteCompartmentEntry compartmentEntryMSg = new PaletteCompartmentEntry("Messaging", DialogueImageProvider.IMG_MESSAGING);
		ret.add(compartmentEntryMSg);

		// add only those create-features that belong to the state chart package
		IFeatureProvider featureProvider = getFeatureProvider();
		ICreateFeature[] createFeatures2 = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures2) {
			IContext context = new CreateContext();
			context.putProperty(PropertyUtil.PACKAGE_KEY, PropertyUtil.MESSAGING_PACKAGE_VALUE);

			if(cf.isAvailable(context)){
				ObjectCreationToolEntry objectCreationToolEntry =  new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
				compartmentEntryMSg.addToolEntry(objectCreationToolEntry);
			}
		}


		// add new compartment at the end of the existing compartments
		PaletteCompartmentEntry compartmentEntryFC = new PaletteCompartmentEntry("Flow Chart", DialogueImageProvider.IMG_FLOW_CHART);
		ret.add(compartmentEntryFC);


		// add only those create-features that belong to the flow chart package	
		ICreateFeature[] createFeaturesFC = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeaturesFC) {
			IContext context = new CreateContext();
			context.putProperty(PropertyUtil.PACKAGE_KEY, PropertyUtil.FLOW_CHART_PACKAGE_VALUE);

			if(cf.isAvailable(context)){
				ObjectCreationToolEntry objectCreationToolEntry =  new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
				compartmentEntryFC.addToolEntry(objectCreationToolEntry);
			}
		}


		// add new compartment at the end of the existing compartments
		PaletteCompartmentEntry compartmentEntrySC = new PaletteCompartmentEntry("State Chart", DialogueImageProvider.IMG_STATECHART);
		ret.add(compartmentEntrySC);

		// add new stack entry to new compartment
		StackEntry stackEntry = new StackEntry("EObject", "EObject", DialogueImageProvider.IMG_STATECHART);
		compartmentEntrySC.addToolEntry(stackEntry);

		// add only those create-features that belong to the state chart package	
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		for (ICreateFeature cf : createFeatures) {
			IContext context = new CreateContext();
			context.putProperty(PropertyUtil.PACKAGE_KEY, PropertyUtil.STATE_CHART_PACKAGE_VALUE);

			if(cf.isAvailable(context)){
				ObjectCreationToolEntry objectCreationToolEntry =  new ObjectCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
				compartmentEntrySC.addToolEntry(objectCreationToolEntry);
			}
		}




		// add all create-connection-features to the new stack-entry
		ICreateConnectionFeature[] createConnectionFeatures =
				featureProvider.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry =  new ConnectionCreationToolEntry(cf.getCreateName(), cf.getCreateDescription(), cf.getCreateImageId(), cf.getCreateLargeImageId());
			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			compartmentEntrySC.addToolEntry(connectionCreationToolEntry);
		}



		return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	} 

	/**
	 * Returns the context menu for the current mouse location.
	 * 
	 * @param context the custom context which contains the info about the location where the context menu appears.
	 * @return the context menu
	 */
	@Override
	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
		// create a sub-menu for all custom features
		ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
		//subMenu.setText("Custom");
		//subMenu.setDescription("Custom features submenu");
		// display sub-menu hierarchical or flat
		subMenu.setSubmenu(false);

		// create a menu-entry in the sub-menu for each custom feature
		ICustomFeature[] customFeatures = getFeatureProvider().getCustomFeatures(context);
		for (int i = 0; i < customFeatures.length; i++) {
			ICustomFeature customFeature = customFeatures[i];
			if (customFeature.canExecute(context)) {
				ContextMenuEntry menuEntry = new ContextMenuEntry(customFeature, context);
				subMenu.add(menuEntry);
			}
		}

		IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
		return ret;
	}


	/**
	 * Returns a feature which will be executed at at a single click on an already selected shape. 
	 * If the feature provider already returned a direct editing feature for that single click, then this method will not be called.
	 * 
	 * @param context contains information where the single click gesture has happened.
	 * @return the feature to execute
	 */
	@Override
	public ICustomFeature getSingleClickFeature(ISingleClickContext context) {
		return super.getSingleClickFeature(context);
	}

	/**
	 * Returns a feature which will be executed at at double click. 
	 * For that purpose a custom feature is used, because custom features appear in the context menu and the double click feature should also appear in the context menu (usual UI guideline).
	 * 
	 * @param context contains information where the double click gesture has happened
	 * @return the feature to execute
	 */
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
		ICustomFeature customFeature =
				new RenameStateChartFeature(getFeatureProvider());
		// canExecute() tests especially if the context contains a EClass
		if (customFeature.canExecute(context)) {
			return customFeature;
		}

		ICustomFeature openExecutableEditor = new OpenExecutableContentEditorFeature(getFeatureProvider());
		if(openExecutableEditor.canExecute(context)){
			return openExecutableEditor;
		}
		ICustomFeature openConnectionsEditor = new OpenStateConnectionsContentEditorFeature(getFeatureProvider());
		if(openConnectionsEditor.canExecute(context)){
			return openConnectionsEditor;
		}
		
		return super.getDoubleClickFeature(context);
	}

	/**
	 * Returns decorators which will be used at rendering time to decorate the graphical representation of the given pictogram element.
	 * Currently only decorators of type IImageDecorator are supported.
	 * 
	 * @param pe the pictogram element
	 * @return the decorators
	 */
	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
//		IFeatureProvider featureProvider = getFeatureProvider();
//		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
//		if (bo instanceof DialogueDesignerElement) {
//			DialogueDesignerElement node = (DialogueDesignerElement) bo;
//			String name = node.getDisplayName();
//			if (name != null && name.length() > 0
//					&& !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
//				IDecorator imageRenderingDecorator =
//						new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
//				imageRenderingDecorator.setMessage("Name should start with upper case letter");
//				return new IDecorator[] { imageRenderingDecorator };
//			}
//		}

		return super.getDecorators(pe);
	}

	/**
	 * Returns the tooltip to be attached to the graphical representation of the given graphics algorithm.
	 * 
	 * @param ga the graphics algorithm
	 * @return the tooltip
	 */
	@Override
	public String getToolTip(GraphicsAlgorithm ga) {
		PictogramElement pe = ga.getPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);

		if(PropertyUtil.isOnEntry(pe)){
			return "  On Entry  ";
		}
		else if(PropertyUtil.isOnExit(pe)){
			return "  On Exit  ";
		}
		else if (bo instanceof DialogueDesignerElement) {
			String name = ((DialogueDesignerElement)bo).getDisplayName();
			String id = ((DialogueDesignerElement)bo).getId();
			String retVal = "";
			if(id != null && !id.isEmpty()){
				retVal += "  Id: "+id+"  \n";
			}
			if (name != null && !name.isEmpty()) {
				retVal += "  Name: "+name+"  ";         
			}

			return retVal;
		}

		return (String) super.getToolTip(ga);
	}

	/**
	 * The returned graphics algorithm's define the area where the user can click to select the shape.
	 * 
	 * @param pe the pictogram element
	 * @return the clicked area
	 */
	@Override
	public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
		IFeatureProvider featureProvider = getFeatureProvider();
		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
		if (bo instanceof StateChart) {
			//GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
			GraphicsAlgorithm rectangle = pe.getGraphicsAlgorithm();
			return new GraphicsAlgorithm[] { rectangle };
		}
		return super.getClickArea(pe);
	}

	/**
	 * The returned graphics algorithm defines the selection border and the rectangle where the context buttons appear at.
	 * 
	 * @param pe the pictogram element
	 * @return the graphics algorithm which defines the selection border
	 */
	@Override
	public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
		if (pe instanceof ContainerShape) {
			GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
			if (!invisible.getLineVisible()) {
				EList<GraphicsAlgorithm> graphicsAlgorithmChildren =
						invisible.getGraphicsAlgorithmChildren();
				if (!graphicsAlgorithmChildren.isEmpty()) {
					return graphicsAlgorithmChildren.get(0);
				}
			}
		}
		return super.getSelectionBorder(pe);
	}

	/**
	 * Is asked to return the selection width (the tolerance area a user can click to still select) a lathy object (e.g. Polyline or Polygon for Shapes and Connections) in the diagram. The method is called when a new object is drawn for the first time onto a diagram (on creation of the object or on opening the diagram).
	 * The default implementation returns DEFAULT_LINE_SELECTION_WIDTH with the value 5 for all shapes.
	 */
	@Override
	public int getLineSelectionWidth(Polyline polyline) {
		return 10;
	}
}
