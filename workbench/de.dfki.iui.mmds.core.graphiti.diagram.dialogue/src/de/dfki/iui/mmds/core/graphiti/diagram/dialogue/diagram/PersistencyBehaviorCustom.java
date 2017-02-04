package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.internal.T;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.swt.widgets.Display;

public class PersistencyBehaviorCustom extends DefaultPersistencyBehavior{

	public PersistencyBehaviorCustom(DiagramBehavior diagramBehavior) {
		super(diagramBehavior);
	}
	protected Map<Resource, Map<?, ?>> createSaveOptions() {
		// Save only resources that have actually changed.
		final Map<Object, Object> saveOption = new HashMap<Object, Object>();
		saveOption.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOption.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		EList<Resource> resources = diagramBehavior.getEditingDomain().getResourceSet().getResources();
		final Map<Resource, Map<?, ?>> saveOptions = new HashMap<Resource, Map<?, ?>>();
		for (Resource resource : resources) {
			saveOptions.put(resource, saveOption);
		}
		return saveOptions;
	}
}
