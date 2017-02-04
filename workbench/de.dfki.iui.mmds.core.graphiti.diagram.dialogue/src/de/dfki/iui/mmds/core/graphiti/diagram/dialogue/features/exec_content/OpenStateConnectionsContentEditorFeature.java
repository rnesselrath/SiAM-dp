package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.CondEvent;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.WaitForEvent;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;


/**
 * Custom feature class {@link OpenStateConnectionsContentEditorFeature} that is used to open the {@link ExecutableContentChooserDialogue} dialogue 
 * for editing {@link ExecutableContent} and {@link CondEvent} objects.
 * 
 * @author Dragan Milchevski
 *
 */
public class OpenStateConnectionsContentEditorFeature extends AbstractCustomFeature {

	public static ArrayList<Integer> openedDialogs = new ArrayList<>();

	/**
	 * Creates new {@link OpenStateConnectionsContentEditorFeature}
	 * @param fp the feature provider
	 */
	public OpenStateConnectionsContentEditorFeature(IFeatureProvider fp) {
		super(fp);

	}

	/**
	 * The name of the feature 
	 * @return the name
	 */
	@Override
	public String getName() {
		return "Open Executable Content Editor";
	}

	/**
	 * The description of the feature
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return "Open the Executable Content Editor";
	}

	/**
	 * Check if the feature can be executed
	 * 
	 * @param context the custom context
	 * @return true if the feature can be executed.
	 */
	@Override
	public boolean canExecute(ICustomContext context) {
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof ExecutableContent || bo instanceof CondEvent || bo instanceof Transition) {
				ret = true;
			}
			if(PropertyUtil.isOnEntry(pes[0]) || PropertyUtil.isOnExit(pes[0]) || PropertyUtil.isExecContentHolder(pes[0]) || 
					PropertyUtil.isCondEventHolder(pes[0]) || PropertyUtil.isConnectionHolder(pes[0])){
				ret = true;
			}
		}
		return ret;
	}

	
	/**
	 * Execute the feature. This is the place when the calling object is found out and the list of already assigned {@link ExecutableContent} objects 
	 * or {@link CondEvent} object are collected and passed to the class {@link ExecutableContentChooserDialogue}.
	 *  
	 * @param context the custom context
	 */
	@Override
	public void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			PictogramElement pe = pes[0];
			ContainerShape cs =null;

			//IF the double click is on the holder, the parent is the object to which the holder belongs
			if(PropertyUtil.isConnectionHolder(pe)){
				cs = (ContainerShape) pe.eContainer();
			}else{
				//If the double click is on Messaging object the parent is the parent of the object
				cs = (ContainerShape) pe.eContainer().eContainer();
			}
			EObject bo = (EObject) getBusinessObjectForPictogramElement(cs);
			
			ContainerShape parent = null;
			if(pe.eContainer() instanceof ContainerShape){
				parent = (ContainerShape) pe.eContainer();
			}

			ContainerShape targetContainer = null;
			EList execList = new BasicEList();
			String entryExit = "";

			if(bo == null){ //If the bo is still null, then it is on transition. Get it directly!
				bo = (EObject) getBusinessObjectForPictogramElement(pe);
			}

			//If the object is of type state
			if(bo instanceof State) {
				State state = (State)bo;
				openDialogue(state, cs);
			}
		}
	}

	
	/**
	 * Method used to create the {@link Shell} and open the dialogue window.
	 * @param transitions 
	 * 
	 * @param execList list of {@link ExecutableContent} objects
	 * @param parent the parent shape
	 * @param eo the calling object
	 * @param entryExit entryExit text
	 * @param targetContainer the target container shape
	 * @param condEvent {@link CondEvent} if exists
	 * @return result code
	 */
	public void openDialogue(State state, ContainerShape cs) {
		String ret = null;
		Shell shell = getShell();
		TransitionChoiceDialog td = new TransitionChoiceDialog(shell, state.getTransitions());
		if (td.open() == Window.OK) {
			Transition transition = (Transition)td.getFirstResult();
			EList execList = transition.getOnTrigger();
			CondEvent condEvent = null;
			if(transition.getEvent() != null){//Add the event to the same list
				condEvent = transition.getEvent();
			}

			openDialogue(execList, cs, transition, null, null, condEvent);
		}
	}
	
	/**
	 * Method used to create the {@link Shell} and open the dialogue window.
	 * 
	 * @param execList list of {@link ExecutableContent} objects
	 * @param parent the parent shape
	 * @param eo the calling object
	 * @param entryExit entryExit text
	 * @param targetContainer the target container shape
	 * @param condEvent {@link CondEvent} if exists
	 * @return result code
	 */
	public String openDialogue(EList<EObject> execList, ContainerShape parent, EObject eo, String entryExit, ContainerShape targetContainer, CondEvent condEvent) {
		String ret = null;
		Shell shell = getShell();

		final ExecutableContentChooserDialogue retDialg = new ExecutableContentChooserDialogue(shell, execList, 
				getFeatureProvider(), targetContainer, openedDialogs, eo, condEvent);
		retDialg.create();

		int retDialog = retDialg.open();

		if (retDialog == Window.OK) {
			ret = "";

			if(entryExit != null){
				int count = 0;
				String moreValue = "";
				String moreEntryExit = "";
				if(entryExit.equals(PropertyUtil.ON_ENTRY_VALUE)){
					moreEntryExit = PropertyUtil.MORE_ENTRY_VALUE;
					if(eo instanceof State){
						State state = (State)eo;
						count = state.getOnEntry().size();
					}

				}else if(entryExit.equals(PropertyUtil.ON_EXIT_VALUE)){
					moreEntryExit = PropertyUtil.MORE_EXIT_VLUE;
					if(eo instanceof State){
						State state = (State)eo;
						count = state.getOnExit().size();
					}
				}else if(entryExit.equals(PropertyUtil.EXEC_CONTENT_HOLDER_VALUE)){
					//????moreEntryExit = PropertyUtil.MORE_EXIT_VLUE;
					if(eo instanceof ExecutableContentNode){
						ExecutableContentNode ecn = (ExecutableContentNode)eo;
						count = ecn.getContent().size();
					}
				}


				if(count > 1){
					moreValue = "+"+(count-1);
				}else if(count == 1){
					moreValue = "";
				}


				ExecutableContentHoldersUtil.setMoreShapeTextValue(parent, moreEntryExit, moreValue);
			}
			
			//Change the display of the transition
			if(eo instanceof Transition){
				Transition t = (Transition)eo;
				
				//System.out.println("tontriger "+t.getOnTrigger()+"tevent "+t.getEvent());
				
//				if(t.getEvent() != null || !t.getOnTrigger().isEmpty()){
//					
//					PictogramElement pe = getFeatureProvider().getPictogramElementForBusinessObject(t);
//					if(pe instanceof Connection){
//						Connection conn = (Connection)pe;
//						
//						GraphicsAlgorithm ga = conn.getGraphicsAlgorithm();
//						ga.setLineWidth(2);
//						ga.setForeground(manageColor(IColorConstant.BLUE));
//						
//						for(ConnectionDecorator cd : conn.getConnectionDecorators()){
//							GraphicsAlgorithm ga1 = cd.getGraphicsAlgorithm();
//							if(ga1 instanceof Polygon){
//								ga1.setForeground(manageColor(IColorConstant.BLUE));
//								//ga1.setBackground(manageColor(IColorConstant.LIGHT_BLUE));
//							}
//							
//							//
//						}
//					}
//					
//				}
			}
		}
		return ret;
	}

	/**
	 * Peturns the platform {@link Shell}
	 * @return the platform shell
	 */
	private static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
}
