package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.statechart;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.state.ConvertToInitialFeature;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * {@link StateChartPropertySource} class capable of supplying properties for 
 * display by the standard property sheet page implementation (PropertySheetPage) for the objects of type {@link StateChart}

 * @author Dragan Milchevski
 *
 */
public class StateChartPropertySource implements IPropertySource{

	private static final String ID = "id";
	private static final String NAME = "displayName";
	private static final String HISTORY = "historyState";
	private static final String INITIAL = "initialState";
	private static final PropertyDescriptor NAME_PROP_DESC = new TextPropertyDescriptor(NAME, "Name");
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Id");
	private static PropertyDescriptor INITIAL_PROP_DESC;
	private static IPropertyDescriptor[] DESCRIPTORS;
	private String[] allStates;
	private HashMap<Integer, Integer> statePosMapping;


	private StateChart stateChart;
	private PictogramElement scPe;
	private IFeatureProvider featureProvider;
	private Diagram diagram;

	/**
	 * Creates new {@link StateChartPropertySource}
	 * @param sc CompositeState
	 */
	public StateChartPropertySource(StateChart sc, PictogramElement scPe, IFeatureProvider featureProvider){
		super();
		this.stateChart = sc;
		this.scPe = scPe;
		this.featureProvider = featureProvider;
		this.diagram = featureProvider.getDiagramTypeProvider().getDiagram();
		statePosMapping = new HashMap<Integer, Integer>();
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
		EList<AbstractState> states = stateChart.getStates();
		
		ArrayList<String> tmpStates = new ArrayList<>();
		String displayName = "";
		for(int i=0; i<states.size(); i++){
			if(states.get(i).getDisplayName()!=null ){
				displayName = states.get(i).getDisplayName();
			}
			if(states.get(i) instanceof State){
				//allStates[i] = displayName;
				tmpStates.add(displayName);
				statePosMapping.put(tmpStates.size()-1, i);
			}
		}
		allStates = new String[tmpStates.size()+1];
		for(int i=0; i<tmpStates.size(); i++){
			allStates[i] = tmpStates.get(i);
		}
		
		allStates[tmpStates.size()]="";

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
			if(stateChart.getDisplayName() != null){
				return stateChart.getDisplayName();
			}else{
				return "";
			}
		}else if(ID.equals(id)){
			if(stateChart.getId() != null){
				return stateChart.getId();
			}else{
				return "";
			}
		}else if(INITIAL.equals(id)){
			if(stateChart.getInitialState() != null){
				String displayName = "";
				for(int i=0; i<allStates.length; i++){
					
					if(stateChart.getInitialState().getDisplayName()!=null){
						displayName = stateChart.getInitialState().getDisplayName();
					}
					if(allStates[i].equals(displayName)){
						return i;
					}
				}
				if(displayName == ""){
					return stateChart.getStates().size();
				}
			}else{
				return stateChart.getStates().size();
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
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(stateChart);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if (NAME.equals(id)) {
					stateChart.setDisplayName((String)value);
					ContainerShape cs = (ContainerShape) scPe;

					if(cs instanceof Diagram){
						diagram.setName((String) value);
					}
				}else if(ID.equals(id)){
					stateChart.setId((String)value);
				}else if(INITIAL.equals(id)){
					ContainerShape cs = (ContainerShape) scPe;
					//Check if there is already an initial state, and delete it
					if(stateChart.getInitialState() != null){

						for(Shape shape : cs.getChildren()){	
							if(shape instanceof ContainerShape){
								ContainerShape cs1 = (ContainerShape) shape;
								EObject bo = cs1.getLink().getBusinessObjects().get(0);
								
								if(bo instanceof State){
									State initState = (State)bo;
									if(stateChart.getInitialState().equals(initState)){
										ConvertToInitialFeature.disableInitial(cs1);
									}
								}
							}

						}
					}

					int count = (int)value;
					if(!statePosMapping.containsKey(count)){
						stateChart.setInitialState(null);
					}else{
						
						int pos = statePosMapping.get(count);
						State state = (State) stateChart.getStates().get(pos);
						stateChart.setInitialState(state);

						//Add the shape for the initial state to the State
						//First the right state has to be find in all the shapes from the StateChart, since the ContainerShape is for the StateChart
						for(Shape shape : cs.getChildren()){	
							if(shape instanceof ContainerShape){
								ContainerShape cs1 = (ContainerShape) shape;
								EObject bo = cs1.getLink().getBusinessObjects().get(0);
								if(bo instanceof State){
									State initState = (State)bo;
									//Because the initial state figure for composite state is placed on a different spot than on the State
									//we need to move the composite state invisible rectangle shape down for 50 pixels, in order to draw the figure.
									if(bo instanceof State){
										if(initState.equals(state)){
											ConvertToInitialFeature.enableInitial(cs1);
	
										}
									}
								}
							}

						}
					}
				}
			}
		});
	}

}
