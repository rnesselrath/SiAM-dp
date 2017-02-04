package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.history;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.model.dialogue.statechart.HistoryState;

/**
 * {@link HistoryStatePropertySource} class capable of supplying properties for 
 * display by the standard property sheet page implementation (PropertySheetPage) for the objects of type {@link HistoryState}
 * 
 * @author Dragan Milcevski
 * @date Apr 12, 2013
 *
 */
public class HistoryStatePropertySource implements IPropertySource {

	private static final String ID = "id";
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Id");
	private static final IPropertyDescriptor[] DESCRIPTORS = { ID_PROP_DESC };

	private HistoryState state;

	/**
	 * Creates new {@link HistoryStatePropertySource}
	 * @param sc CompositeState
	 */
	public HistoryStatePropertySource(HistoryState state){
		super();
		this.state = state;
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
		if(ID.equals(id)){
			if(state.getId() != null){
				return state.getId();
			}else{
				return "";
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
		if(ID.equals(id)){
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
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(state);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if(ID.equals(id)){
					state.setId((String)value);
				}
			}
		});
	}

}

