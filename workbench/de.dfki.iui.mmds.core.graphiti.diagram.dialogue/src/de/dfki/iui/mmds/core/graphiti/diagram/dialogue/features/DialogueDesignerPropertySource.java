package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;

/**
 * Property Source class for the dialogue object
 * 
 * @author Dragan Milchevski
 *
 */
public class DialogueDesignerPropertySource implements IPropertySource {

	private static final String NAME = "name";
	private static final String ID = "id";
	private static final PropertyDescriptor NAME_PROP_DESC = new TextPropertyDescriptor(NAME, "Name");
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Id");
	private static final IPropertyDescriptor[] DESCRIPTORS = { NAME_PROP_DESC, ID_PROP_DESC };

	private DialogueDesignerElement dde;

	/**
	 * Creates new {@link DialogueDesignerPropertySource}
	 * @param dde
	 */
	public DialogueDesignerPropertySource(DialogueDesignerElement dde){
		super();
		this.dde = dde;
	}

	/**
	 * Returns a value for this property source that can be edited in a property sheet. 
	 * 
	 * @return this object
	 */
	@Override
	public Object getEditableValue() {
		return this;
	}

	/**
	 * Returns the list of property descriptors for this property source. 
	 * The getPropertyValue and setPropertyValue methods are used to read and write the actual property values by specifying the property ids from these property descriptors.
	 * 
	 * @return list of property descriptors
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
		if (NAME.equals(id)) {
			if(dde.getDisplayName() != null){
				return dde.getDisplayName();
			}else{
				return "";
			}
		}else if(ID.equals(id)){
			if(dde.getId() != null){
				return dde.getId();
			}else{
				return "";
			}
		}

		return null;
	}

	/**
	 * Returns whether the value of the property with the given id has changed from its default value. Returns false if this source does not have the specified property. 
	 * If the notion of default value is not meaningful for the specified property then false is returned. 
	 * 
	 * @param id the id of the property
	 * @return true if the value of the specified property has changed from its original default value, false if the specified property does not have a meaningful default value, and false if this source does not have the specified property
	 */
	@Override
	public boolean isPropertySet(Object id) {
		if (NAME.equals(id)) {
			return true;
		}else if(ID.equals(id)){
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
	 * In general, a property source should not directly reference the value parameter unless it is an atomic object that can be shared, such as a string. 
	 * An important reason for this is that several property sources with compatible descriptors could be appearing in the property sheet at the same time. An editor produces a single edited value which is passed as the value parameter of this message to all the property sources. Thus to avoid a situation where all of the property sources reference the same value they should use the value parameter to create a new instance of the real value for the given property. 
	 * There is another reason why a level of indirection is useful. The real value of property may be a type that cannot be edited with a standard cell editor. However instead of returning the real value in getPropertyValue, the value could be converted to a String which could be edited with a standard cell editor. The edited value will be passed to this method which can then turn it back into the real property value. 
	 * Another variation on returning a value other than the real property value in getPropertyValue is to return a value which is an IPropertySource (or for which the property sheet can obtain an IPropertySource). In this case the value to edit is obtained from the child property source using getEditableValue. It is this editable value that will be passed back via this method when it has been editted 
	 * @param id the id of the property being set
	 * @return value the new value for the property; null is allowed
	 */
	@Override
	public void setPropertyValue(final Object id, final Object value) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(dde);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if (NAME.equals(id)) {
					dde.setDisplayName((String)value);
				}else if(ID.equals(id)){
					dde.setId((String)value);
				}
			}
		});
	}

}
