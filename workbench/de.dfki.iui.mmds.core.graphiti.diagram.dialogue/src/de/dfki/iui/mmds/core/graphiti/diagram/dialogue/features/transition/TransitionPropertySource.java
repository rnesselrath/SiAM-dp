package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.transition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.SourceState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.Transition;

/**
 * {@link TransitionPropertySource} class capable of supplying properties for 
 * display by the standard property sheet page implementation (PropertySheetPage) for the objects of type {@link Transition}

 * @author Dragan Milchevski
 *
 */
public class TransitionPropertySource implements IPropertySource {

	private static final String NAME = "name";
	private static final String ID = "id";
	private static final String SOURCE = "source";
	private static final String TARGET = "target";
	private static final PropertyDescriptor NAME_PROP_DESC = new TextPropertyDescriptor(NAME, "Name");
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Id");
	private static PropertyDescriptor SOURCE_PROP_DESC;
	private static PropertyDescriptor TARGET_PROP_DESC;
	private static IPropertyDescriptor[] DESCRIPTORS;
	
	private String[] allSource;
    private String[] allTarget;
    private EList<EObject> targetStates;
    private EList<EObject> sourceStates;
    private IFeatureProvider featureProvider;
    
	private Transition transition;

	/**
	 * Creates new {@link TransitionPropertySource}
	 * @param sc CompositeState
	 */
	public TransitionPropertySource(Transition transition, String[] allSource, String[] allTarget, 
			EList<EObject> sourceStates, EList<EObject> targetStates, IFeatureProvider featureProvider){
		super();
		this.transition = transition;
		this.allSource = allSource;
		this.allTarget = allTarget;
		this.sourceStates = sourceStates;
		this.targetStates = targetStates;
		this.featureProvider = featureProvider;
	}

	/**
	 * Returns a value for this property source that can be edited in a property sheet. 
	 * 
	 * @return a value that can be edited
	 */
	@Override
	public Object getEditableValue() {
		return this;
	}
	
	/**
	 * Returns the list of property descriptors for this property source. 
	 * The getPropertyValue and setPropertyValue methods are used to read and write 
	 * the actual property values by specifying the property ids from these property descriptors.
	 * 
	 *  @return the property descriptors
	 */
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		DESCRIPTORS = new IPropertyDescriptor[4];
		//Get all the states that are inside the state chart.
		//Only those states can be set as initial or history states, and no other states
		
		
		SOURCE_PROP_DESC = new ComboBoxPropertyDescriptor(SOURCE, "Source State", allSource);
		TARGET_PROP_DESC = new ComboBoxPropertyDescriptor(TARGET, "Target State", allTarget);
		
		DESCRIPTORS[0] = NAME_PROP_DESC;
		DESCRIPTORS[1] = ID_PROP_DESC;
		DESCRIPTORS[2] = SOURCE_PROP_DESC;
		DESCRIPTORS[3] = TARGET_PROP_DESC;
		
		return DESCRIPTORS;
	}
	
	/**
	 * Returns the value of the property with the given id if it has one. 
	 * Returns null if the property's value is null value or if this source does not have the specified property.
	 * 
	 * @param id the id of the property being set
	 * @return the value of the property, or null
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (NAME.equals(id)) {
			if(transition.getDisplayName() != null){
				return transition.getDisplayName();
			}else{
				return "";
			}
		}else if(ID.equals(id)){
			if(transition.getId() != null){
				return transition.getId();
			}else{
				return "";
			}
		}else if(SOURCE.equals(id)){
			if(transition.getSource() != null){
				for(int i=0; i<allSource.length; i++){
					
					if(((DialogueDesignerElement)transition.getSource()).getDisplayName() == null){
						
						return -1;
					}
					if(allSource[i] == null){
						return -1;
					}
					String name = ((DialogueDesignerElement)transition.getSource()).getDisplayName();
					if(allSource[i].equals(name)){
						return i;
					}
				}
			}else{
				return allSource.length;
			}
		}else if(TARGET.equals(id)){
			if(transition.getTarget() != null){
				
				for(int i=0; i<allTarget.length; i++){
					String name = "";
					if(transition.getTarget() instanceof HistoryState){
						name = ((HistoryState)transition.getTarget()).getId();
					}else{
						name = ((DialogueDesignerElement)transition.getTarget()).getDisplayName();
					}
					
					if(allTarget[i].equals(name)){
						return i;
					}
				}
			}else{
				return allTarget.length;
			}
		}

		return null;
	}
	
	/**
	 * Returns whether the value of the property with the given id has changed from its default value. 
	 * Returns false if this source does not have the specified property. 
	 * If the notion of default value is not meaningful for the specified property then false is returned.
	 * 
	 * @param id the id of the property
	 * @return true if the value of the specified property has changed from its original default value, 
	 * false if the specified property does not have a meaningful default value, and false if this source does not have the specified property
	 */
	@Override
	public boolean isPropertySet(Object id) {
		if (NAME.equals(id)) {
			return true;
		}else if(ID.equals(id)){
			return true;
		}else if(SOURCE.equals(id)){
			return true;
		}else if(TARGET.equals(id)){
			return true;
		}
		
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Sets the property with the given id if possible. Does nothing if the property's value cannot be changed or if this source does not have the specified property. 
	 * 
	 * @param id the id of the property being set
	 * @param value the new value for the property; null is allowed
	 */
	@Override
	public void setPropertyValue(final Object id, final Object value) {
		
		final TransactionalEditingDomain domain =  featureProvider.getDiagramTypeProvider().getDiagramBehavior().getEditingDomain(); 
		//featureProvider.getDiagramTypeProvider().getDiagramEditor().getEditingDomain();//TransactionUtil.getEditingDomain(transition);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if (NAME.equals(id)) {
					transition.setDisplayName((String)value);
				}else if(ID.equals(id)){
					transition.setId((String)value);
				}else if(SOURCE.equals(id)){
					int pos = (Integer)value;
					
					Connection conn = (Connection)featureProvider.getPictogramElementForBusinessObject(transition);
				
					if(pos != allSource.length){
						EObject bo = sourceStates.get(pos); 
						
						ContainerShape cs = (ContainerShape) featureProvider.getPictogramElementForBusinessObject(bo);
						if(cs != null && !cs.getAnchors().isEmpty()){
							Anchor sourceAnchor = cs.getAnchors().get(0);
							conn.setStart(sourceAnchor);
							transition.setSource((SourceState)bo);
						}
						
					}/*else if(pos == allSource.length-1){ //This means delete the source of the transition
						//transition.setSource(null);
						System.out.println("PEEES "+conn.getLink().getPictogramElement());
						DeleteContext ctx = new DeleteContext(conn.getLink().getPictogramElement());
						IDeleteFeature deleteFeature = featureProvider.getDeleteFeature(ctx);
						if (deleteFeature!=null){
							System.out.println("CTX "+ctx);
							deleteFeature.delete(ctx);							
						}
						
						
					}*/
				}else if(TARGET.equals(id)){
					int pos = (Integer)value;
					
					Connection conn = (Connection)featureProvider.getPictogramElementForBusinessObject(transition);
				
					if(pos != allTarget.length){
						EObject bo = targetStates.get(pos); 
						
						ContainerShape cs = (ContainerShape) featureProvider.getPictogramElementForBusinessObject(bo);
						if(cs != null && !cs.getAnchors().isEmpty()){
							Anchor targetAnchor = cs.getAnchors().get(0);
							conn.setEnd(targetAnchor);
							transition.setTarget((TargetState)bo);
						}
						
					}/*else if(pos == allTarget.length-1){ //This means delete the source of the transition
						//transition.setSource(null);
						
						DeleteContext ctx = new DeleteContext(conn.getLink().getPictogramElement());
						IDeleteFeature deleteFeature = featureProvider.getDeleteFeature(ctx);
						if (deleteFeature!=null){
							
							deleteFeature.delete(ctx);							
						}
						
						
					}*/
				}
				
			}
			
		});
		
		
	}
}
