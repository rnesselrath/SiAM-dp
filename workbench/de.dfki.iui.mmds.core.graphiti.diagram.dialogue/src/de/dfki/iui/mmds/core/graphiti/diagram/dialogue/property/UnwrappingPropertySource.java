package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
/**
 * A property source which unwraps values that are wrapped in an EMF
 * {@link PropertyValueWrapper}
 *
 * @author vainolo
 *
 */
public class UnwrappingPropertySource implements IPropertySource {
	protected Object object;
	protected IItemPropertySource itemPropertySource;
	 
	//private IPropertySource source;


//	public UnwrappingPropertySource(final IPropertySource source) {
//		this.source = source;
//	}

	public UnwrappingPropertySource(Object object, IItemPropertySource itemPropertySource){
		this.object = object;
		this.itemPropertySource = itemPropertySource;
	}


	@Override
	public Object getEditableValue() {
		Object value = itemPropertySource.getEditableValue(object);
		if(value instanceof PropertyValueWrapper) {
			PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
			return wrapper.getEditableValue(null);
		} else {
			return itemPropertySource.getEditableValue(object);
		}
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		Collection<IPropertyDescriptor> result = new ArrayList<IPropertyDescriptor>();
	    List<IItemPropertyDescriptor> itemPropertyDescriptors = itemPropertySource.getPropertyDescriptors(object);
	    if (itemPropertyDescriptors != null)
	    {
	      for (IItemPropertyDescriptor itemPropertyDescriptor : itemPropertyDescriptors)
	      {
	        result.add(createPropertyDescriptor(itemPropertyDescriptor));
	      }
	    }

	    return result.toArray(new IPropertyDescriptor [result.size()]);
	}

	 protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor)
	  {
	    return new PropertyDescriptor(object, itemPropertyDescriptor);
	  }

	 
	@Override
	public Object getPropertyValue(Object id) {
		Object value = itemPropertySource.getPropertyDescriptor(object, id).getPropertyValue(object);
		if(value instanceof PropertyValueWrapper) {
			PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
			return wrapper.getEditableValue(null);
		} else {
			return  itemPropertySource.getPropertyDescriptor(object, id).getPropertyValue(object);
		}
	}

	@Override
	public boolean isPropertySet(Object id) {
		return itemPropertySource.getPropertyDescriptor(object, id).isPropertySet(object);
	}

	@Override
	public void resetPropertyValue(Object id) {
		itemPropertySource.getPropertyDescriptor(object, id).resetPropertyValue(object);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		itemPropertySource.getPropertyDescriptor(object, id).setPropertyValue(object, value);
	}
}