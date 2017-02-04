package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;

public class DialoguePropertySource implements IPropertySource{

	private static final String ID = "dialogueID";
	
	
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Dialogue ID");
	private static IPropertyDescriptor[] DESCRIPTORS;
	
	private Dialogue dialogue;
	private Diagram diagram;
	
	public DialoguePropertySource(Dialogue dialogue, IFeatureProvider featureProvider){
		this.dialogue = dialogue;
		this.diagram = featureProvider.getDiagramTypeProvider().getDiagram();
	}
	
	@Override
	public Object getEditableValue() {
		return this;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		DESCRIPTORS = new IPropertyDescriptor[1];
		
		DESCRIPTORS[0] = ID_PROP_DESC;
		return DESCRIPTORS;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (ID.equals(id)) {
			if(dialogue.getId() != null){
				return dialogue.getId();
			}else{
				return "";
			}
		}
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		if (ID.equals(id)) {
			return true;
		}
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyValue(final Object id, final Object value) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(dialogue);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if (ID.equals(id)) {
					diagram.setName((String) value);
					dialogue.setId((String) value);
				}
			}
		});
		
	}

}
