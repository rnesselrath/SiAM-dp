package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.composite_state;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

/**
 * {@link CompositeStatePropertySource} class capable of supplying properties for 
 * display by the standard property sheet page implementation (PropertySheetPage) for the objects of type {@link CompositeState}

 * @author Dragan Milchevski
 *
 */
public class CompositeStatePropertySource implements IPropertySource{

	private static final String ID = "id";
	private static final String NAME = "displayName";
	private static final String HISTORY = "historyState";
	private static final String INITIAL = "initialState";
	private static final PropertyDescriptor NAME_PROP_DESC = new TextPropertyDescriptor(NAME, "Name");
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Id");
	private static PropertyDescriptor INITIAL_PROP_DESC;
	private static IPropertyDescriptor[] DESCRIPTORS;
	private String[] allStates;
	
	
	private CompositeState compositeState;
	
	/**
	 * Creates new {@link CompositeStatePropertySource}
	 * @param sc CompositeState
	 */
	public CompositeStatePropertySource(CompositeState sc){
		super();
		this.compositeState = sc;
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
		DESCRIPTORS = new IPropertyDescriptor[3];
		
		//Get all the states that are inside the state chart.
		//Only those states can be set as initial or history states, and no other states
		EList<AbstractState> states = compositeState.getStates();
		allStates = new String[states.size()+1];
		for(int i=0; i<states.size(); i++){
			allStates[i] = states.get(i).getDisplayName();
		}
		allStates[states.size()]="";
		
		INITIAL_PROP_DESC = new ComboBoxPropertyDescriptor(INITIAL, "Initial State", allStates);
		
		DESCRIPTORS[0] = NAME_PROP_DESC;
		DESCRIPTORS[1] = ID_PROP_DESC;
		DESCRIPTORS[2] = INITIAL_PROP_DESC;
		
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
			if(compositeState.getDisplayName() != null){
				return compositeState.getDisplayName();
			}else{
				return "";
			}
		}else if(ID.equals(id)){
			if(compositeState.getId() != null){
				return compositeState.getId();
			}else{
				return "";
			}
		}else if(INITIAL.equals(id)){
			if(compositeState.getInitialState() != null){
				for(int i=0; i<allStates.length; i++){
					if(allStates[i].equals(compositeState.getInitialState().getDisplayName())){
						return i;
					}
				}
			}else{
				return compositeState.getStates().size();
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
		}else if(HISTORY.equals(id)){
			return true;
		}
		return true;
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
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(compositeState);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if (NAME.equals(id)) {
					compositeState.setDisplayName((String)value);
				}else if(ID.equals(id)){
					compositeState.setId((String)value);
				}else if(INITIAL.equals(id)){
					int count = (int)value;
					if(count == compositeState.getStates().size()){
						compositeState.setInitialState(null);
					}else{
						compositeState.setInitialState((State) compositeState.getStates().get(count));
					}
				}
			}
		});
	}

}
