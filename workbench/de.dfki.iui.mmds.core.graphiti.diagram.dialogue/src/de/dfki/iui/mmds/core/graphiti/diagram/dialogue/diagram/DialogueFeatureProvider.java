package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.CollapseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.CopyStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.DeleteFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.DirectEditFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.MoveFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.RemoveFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.ResizeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.UpdateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.ZestLayoutDiagramFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state.AddCompositeStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state.CreateCompositeStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state.LayoutCompositeStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.condevent.AddCondEventFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.condevent.CreateCondEvent;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.AddDecisionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.CreateDecisionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.DirectEditDecisionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.LayoutDecisionFeauture;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.MoveThenElseHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.ResizeThenElseHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.decision.UpdateDecisionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile.AddDoWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile.CreateDoWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile.DirectEditDoWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile.LayoutDoWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile.UpdateDoWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.CollapseExecutableContentHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.LayoutExecutableContentFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.MoveOnEntryExitHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.OpenExecutableContentEditorFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ResizeMoreHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.ResizeOnEntryExitHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.AddAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.CreateAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.delay.AddDelayFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.delay.CreateDelayFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.iff.AddExecIfFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.iff.CreateExecIfFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.log.AddLogFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.log.CreateLogFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.node.AddExecutableContentNodeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.node.CreateExecutableContentNodeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.node.LayoutExecutableContentNodeFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.raise.AddRaiseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.raise.CreateRaiseFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.send.AddSendFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.send.CreateSendFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.final_state.AddFinalStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.final_state.CreateFinalStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.final_state.LayoutFinalStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.foreach.AddForEachFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.foreach.CreateForEachFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.foreach.LayoutForEachFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history.AddHistoryStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history.CreateHistoryStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history.LayoutHistoryStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history.MoveHistoryStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history.ResizeHistoryStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.parallel_state.AddParallelStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.parallel_state.CreateParallelStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.parallel_state.LayoutParallelStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.AddSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.CreateSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.LayoutSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.MoveDownSeqenceContent;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.MoveUpSeqenceContent;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.ResizeSequenceHolderFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.sequence.UpdateSequenceFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.AddStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.ConvertToHistoryFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.ConvertToInitialFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.CreateStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.DeleteTransitionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.LayoutStateFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.AddStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.CreateStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.LayoutStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.PasteStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart.RenameStateChartFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition.AddTransitionConnectionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition.CreateTransitionConnectionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition.DirectEditTransitionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition.TransitionReconnectionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition.UpdateTransitionFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.waitforevent.AddWaitForEventFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.waitforevent.CreateWaitForEventFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.waitforevent.LayoutWaitForEventFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee.AddWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee.CreateWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee.DirectEditWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee.LayoutWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee.UpdateWhileFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Assign;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Delay;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.Log;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.Raise;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Decision;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ForEach;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.FinalState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.ParallelState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

/**
 * The class DialogueFeatureProvider. The feature provider connects the diagram
 * type provider and the each implemented feature. For more information visit
 * {@link http
 * ://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.graphiti.
 * doc%2Fresources%2Fdocu%2Fgfw%2Ffeatures.htm&cp=25_1_3}
 * 
 * 
 * @author Dragan Milchevski
 *
 */
public class DialogueFeatureProvider extends DefaultFeatureProvider {

	/**
	 * Creates a new {@link DialogueFeatureProvider}.
	 * 
	 * @param dtp
	 *            the default feature provider
	 */
	public DialogueFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	/**
	 * Returns a list of all create features. In the graphics framework they
	 * will be visualized in an editor as create tools.
	 */
	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new CreateStateChartFeature(this), new CreateCompositeStateFeature(this), new CreateParallelStateFeature(this), new CreateStateFeature(this),
				new CreateHistoryStateFeature(this), new CreateFinalStateFeature(this), new CreateSendFeature(this), new CreateRaiseFeature(this), new CreateLogFeature(this),
				new CreateAssignFeature(this), new CreateDelayFeature(this), new CreateSequenceFeature(this), new CreateDoWhileFeature(this), new CreateWhileFeature(this),
				new CreateForEachFeature(this), new CreateDecisionFeature(this), new CreateExecutableContentNodeFeature(this), new CreateExecIfFeature(this), new CreateWaitForEventFeature(this),
				new CreateCondEvent(this) };
	}

	/**
	 * Gets the create connection features.
	 * 
	 */
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { new CreateTransitionConnectionFeature(this) };
	}

	/**
	 * Add features create graphical representations of domain model objects.
	 * 
	 * @param context
	 *            the context
	 * @return add feature according to the given context
	 */
	@Override
	public IAddFeature getAddFeature(IAddContext context) {

		// The add feature is of a type Connection
		if (context instanceof IAddConnectionContext) {
			if (context.getNewObject() instanceof Transition)
				return new AddTransitionConnectionFeature(this);
		}

		// The add feature is of a type Shape
		// For each individual business object there is an add feature
		if (context instanceof IAddContext) {
			if (context.getNewObject() instanceof CondEvent)
				return new AddCondEventFeature(this);
			else if (context.getNewObject() instanceof WaitForEvent)
				return new AddWaitForEventFeature(this);
			else if (context.getNewObject() instanceof de.dfki.iui.mmds.core.model.dialogue.If)
				return new AddExecIfFeature(this);
			else if (context.getNewObject() instanceof ExecutableContentNode)
				return new AddExecutableContentNodeFeature(this);
			else if (context.getNewObject() instanceof Decision)
				return new AddDecisionFeature(this);
			else if (context.getNewObject() instanceof ForEach)
				return new AddForEachFeature(this);
			else if (context.getNewObject() instanceof While)
				return new AddWhileFeature(this);
			else if (context.getNewObject() instanceof DoWhile)
				return new AddDoWhileFeature(this);
			else if (context.getNewObject() instanceof Sequence)
				return new AddSequenceFeature(this);
			else if (context.getNewObject() instanceof ParallelState)
				return new AddParallelStateFeature(this);
			else if (context.getNewObject() instanceof StateChart)
				return new AddStateChartFeature(this);
			else if (context.getNewObject() instanceof CompositeState)
				return new AddCompositeStateFeature(this);
			else if (context.getNewObject() instanceof HistoryState)
				return new AddHistoryStateFeature(this);
			else if (context.getNewObject() instanceof FinalState)
				return new AddFinalStateFeature(this);
			else if (context.getNewObject() instanceof State)
				return new AddStateFeature(this);
			else if (context.getNewObject() instanceof Send)
				return new AddSendFeature(this);
			else if (context.getNewObject() instanceof Raise)
				return new AddRaiseFeature(this);
			else if (context.getNewObject() instanceof Log)
				return new AddLogFeature(this);
			else if (context.getNewObject() instanceof Assign)
				return new AddAssignFeature(this);
			else if (context.getNewObject() instanceof Delay)
				return new AddDelayFeature(this);
		}
		return super.getAddFeature(context);
	}

	/**
	 * if the user should be able to create connections directly from a
	 * pictogram element without using the connection tool you can provide an
	 * array of features. By providing one feature this feature will be executed
	 * directly on drop. By providing 2 or more features a popup menu will let
	 * the user select the feature.
	 * 
	 * @param context
	 *            - the pictogram element the drag and drop should be initiated
	 *            on
	 * @return all features to create connections
	 */
	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		// simply return all create connection features
		return getCreateConnectionFeatures();
	}

	/**
	 * Layout features do the layouting work (sizes and dimensions) inside
	 * (and/or) outside a pictogram element
	 * 
	 * @param context
	 *            the context
	 * @return layout feature according to the given context
	 */
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);

			if (bo instanceof WaitForEvent)
				return new LayoutWaitForEventFeature(this);
			else if (bo instanceof ExecutableContentNode)
				return new LayoutExecutableContentNodeFeature(this);
			else if (bo instanceof Decision)
				return new LayoutDecisionFeauture(this);
			else if (bo instanceof ForEach)
				return new LayoutForEachFeature(this);
			else if (bo instanceof While)
				return new LayoutWhileFeature(this);
			else if (bo instanceof DoWhile)
				return new LayoutDoWhileFeature(this);
			else if (bo instanceof Sequence)
				return new LayoutSequenceFeature(this);
			else if (bo instanceof ExecutableContent || bo instanceof CondEvent)
				return new LayoutExecutableContentFeature(this);
			else if (bo instanceof StateChart)
				return new LayoutStateChartFeature(this);
			else if (bo instanceof ParallelState)
				return new LayoutParallelStateFeature(this);
			else if (bo instanceof CompositeState)
				return new LayoutCompositeStateFeature(this);
			else if (bo instanceof HistoryState)
				return new LayoutHistoryStateFeature(this);
			else if (bo instanceof FinalState)
				return new LayoutFinalStateFeature(this);
			else if (bo instanceof State)
				return new LayoutStateFeature(this);
		}

		return super.getLayoutFeature(context);
	}

	/**
	 * Update features do the synchronization work and transport data from
	 * domain model to pictograms model elements.
	 * 
	 * @param context
	 *            the context
	 * @return update feature according to the given context
	 */
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		// Update for shapes
		if (pictogramElement instanceof ContainerShape) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);

			if (bo instanceof Sequence)
				return new UpdateSequenceFeature(this);

			if (bo instanceof Decision)
				return new UpdateDecisionFeature(this);
			if (bo instanceof While)
				return new UpdateWhileFeature(this);
			if (bo instanceof DoWhile)
				return new UpdateDoWhileFeature(this);

			if (bo instanceof DialogueDesignerElement)
				return new UpdateFeature(this);

			// if (bo instanceof StateChart ) { //TODO: Change the order of this
			// if needed
			// return new UpdateStateChartFeature(this);
			// }else if(bo instanceof State ){
			//
			// return new UpdateStateFeature(this);
			// }
		}
		// Update for Connections
		if (pictogramElement instanceof Connection) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);
			if (bo instanceof Transition)
				return new UpdateTransitionFeature(this);
		}

		return super.getUpdateFeature(context);
	}

	/**
	 * Resize shape features respond to user's resize requests.
	 * 
	 * @param context
	 *            the context
	 * @return resize feature according to the given context
	 */
	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);

		if (PropertyUtil.isSequenceHolder(shape))
			return new ResizeSequenceHolderFeature(this);

		if (bo instanceof HistoryState || bo instanceof FinalState)
			return new ResizeHistoryStateFeature(this);
		else if (bo instanceof AbstractState || bo instanceof Node)
			return new ResizeFeature(this);

		if (Graphiti.getPeService().getPropertyValue(shape, PropertyUtil.ON_ENTRY_EXIT_KEY) != null || bo instanceof ExecutableContent)
			return new ResizeOnEntryExitHolderFeature(this);
		if (PropertyUtil.isMoreEntry(shape) || PropertyUtil.isMoreExit(shape))
			return new ResizeMoreHolderFeature(this);
		if (PropertyUtil.isThen(shape) || PropertyUtil.isElse(shape))
			return new ResizeThenElseHolderFeature(this);

		return super.getResizeShapeFeature(context);
	}

	/**
	 * Custom features that can do various of things. In this project
	 * implemented custom features are:
	 * 
	 * - Renaming objects - Converting normal state to history state -
	 * Converting normal state to initial state - Layouting diagram feature -
	 * Collapsing Executable content holder feature - Opening external editor
	 * for editing executable content features - Moving up and down sequence
	 * contents
	 * 
	 * @param context
	 *            the context
	 * @return a custom feature
	 */
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] { new RenameStateChartFeature(this), new CollapseFeature(this), new ConvertToHistoryFeature(this), new ConvertToInitialFeature(this),
				new ZestLayoutDiagramFeature(this), new OpenExecutableContentEditorFeature(this), new CollapseExecutableContentHolderFeature(this), new MoveDownSeqenceContent(this),
				new MoveUpSeqenceContent(this) };
	}

	/**
	 * Direct editing features handle direct editing functionality (including
	 * drop down lists and text completion).
	 * 
	 * @param context
	 *            the context
	 * @return direct editing feature according to the given context
	 */
	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		// if(bo instanceof Sequence){
		// return new DirectEditSequenceFeature(this);
		// }else if (bo instanceof StateChart) {
		// return new DirectEditStateChartFeature(this);
		// } else if(bo instanceof ParallelState){
		// return new DirectEditParallelStateFeature(this);
		// } else if(bo instanceof CompositeState){
		// return new DirectEditCompositeStateFeature(this);
		// } else if(bo instanceof HistoryState){
		// return new DirectEditHistoryStateFeature(this);
		// } else if(bo instanceof State){
		// return new DirectEditStateFeature(this);
		// }

		if (bo instanceof Decision)
			return new DirectEditDecisionFeature(this);
		if (bo instanceof While)
			return new DirectEditWhileFeature(this);
		if (bo instanceof DoWhile)
			return new DirectEditDoWhileFeature(this);

		if (bo instanceof DialogueDesignerElement)
			return new DirectEditFeature(this);

		if (bo instanceof Transition)
			return new DirectEditTransitionFeature(this);
		return super.getDirectEditingFeature(context);
	}

	/**
	 * Copy features fill the clipboard. Right now only copy feature for a state
	 * chart is implemented. TODO: Implement a generic one or for each object
	 * separately
	 * 
	 * @param context
	 *            the context
	 * @return copy feature according to the context
	 */
	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		// try with this for multiple figures
		// PictogramElement pe = context.getPictogramElements()[0];
		// Object bo = getBusinessObjectForPictogramElement(pe);
		// Or make the copy class for all the business objects
		return new CopyStateChartFeature(this);

	}

	/**
	 * Paste features bring clipboard content to the diagram. Right now only
	 * copy feature for a state chart is implemented. TODO: Implement a generic
	 * one or for each object separately
	 * 
	 * @param context
	 *            the context
	 * @return paste feature according to the context
	 */
	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new PasteStateChartFeature(this);
	}

	/**
	 * Move shape features respond to user's move requests.
	 * 
	 * @param context
	 *            the context
	 * @return move feature according to the given context
	 */
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);

		if (PropertyUtil.isOnEntry(shape) || PropertyUtil.isOnExit(shape) || PropertyUtil.isMoreEntry(shape) || PropertyUtil.isMoreExit(shape) || PropertyUtil.isConnectionHolder(shape))
			return new MoveOnEntryExitHolderFeature(this);
		if (PropertyUtil.isThen(shape) || PropertyUtil.isElse(shape))
			return new MoveThenElseHolderFeature(this);

		if (bo instanceof AbstractState)
			return new MoveFeature(this);
		else if (bo instanceof HistoryState)
			return new MoveHistoryStateFeature(this);

		return super.getMoveShapeFeature(context);
	}

	/**
	 * Reconnection features handle the change of a connection's start or end
	 * anchor.
	 * 
	 * @param context
	 *            the context
	 * @return reconnection feature according to the given context
	 */
	@Override
	public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
		return new TransitionReconnectionFeature(this);
	}

	/**
	 * Delete features remove the graphical representations of domain model
	 * objects as well as the domain model objects itself.
	 * 
	 * @param context
	 *            the context
	 * @return delete feature according to the given context
	 */
	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (pictogramElement instanceof ContainerShape) {
			if (bo instanceof Transition)
				return new DeleteTransitionFeature(this);

		}

		return new DeleteFeature(this);
	}

	/**
	 * Remove features remove the grapical representations of domain model
	 * objects.
	 * 
	 * @param context
	 *            the context
	 * @return remove feature according to the given context
	 */
	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		// Custom remove that forbids removing,
		// but implements custom removing when delete is called
		return new RemoveFeature(this);
	}
}
