package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.IFilter;


public class OutputRequestFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		if(toTest instanceof UnwrappingPropertySource){
			return true;
		}
		return false;
	}

}
