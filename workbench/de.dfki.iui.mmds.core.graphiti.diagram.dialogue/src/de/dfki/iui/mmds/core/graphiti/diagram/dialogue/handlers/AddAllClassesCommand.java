package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram.DialogueDiagramTypeProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.ZestLayoutDiagramFeature;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;

public class AddAllClassesCommand extends RecordingCommand {

	private IEventBroker eventBroker_ = (IEventBroker) PlatformUI.getWorkbench().getService(IEventBroker.class);;
	
	private IProject project;
	private TransactionalEditingDomain editingDomain;
	private String diagramName;
	private Resource createdResource;
	private EObject root;
	private IFeatureProvider featureProvider;

	private int x;
	private int y;
	private boolean firstTime = true;
	private State initialState = null;

	public AddAllClassesCommand(IProject project, TransactionalEditingDomain editingDomain, String diagramName, EObject root) {
		super(editingDomain);
		this.project = project;
		this.editingDomain = editingDomain;
		this.diagramName = diagramName;
		this.root = root;
	}
	@Override
	protected void doExecute() {
		// Create the diagram and its file
		Diagram diagram = Graphiti.getPeCreateService().createDiagram("dialogue", diagramName, true); //$NON-NLS-1$
		IFolder diagramFolder = project.getFolder("resources/dialogue/diagrams/"); //$NON-NLS-1$
		IFile diagramFile = diagramFolder.getFile(diagramName + ".diagram"); //$NON-NLS-1$
		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);

		createdResource = editingDomain.getResourceSet().createResource(uri);
		createdResource.getContents().add(diagram);
		
		IDiagramTypeProvider dtp = GraphitiUi.getExtensionManager().createDiagramTypeProvider(diagram, DialogueDiagramTypeProvider.PROVIDER_ID); //$NON-NLS-1$
		featureProvider = dtp.getFeatureProvider();

		Dialogue dialogue = null;
		//The root is of type Dialogue
		if(root instanceof Dialogue){
			dialogue = (Dialogue)root;
		}
		
		//create a pictogram link and link the diagram with the EMF Dialogue model
		PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
		link.setPictogramElement(diagram);
		link.getBusinessObjects().add(dialogue);

		// Add all classes to diagram
		DialogTypeSwitch dSwitch = new DialogTypeSwitch(diagram, featureProvider);
		dSwitch.doSwitch(dialogue);
	
        
        if(dialogue.getContent() != null) {
        	Node cont = dialogue.getContent();
        	ZestLayoutDiagramFeature lFeature = new ZestLayoutDiagramFeature(featureProvider);
        	lFeature.setLayoutId(3);
        	ContainerShape pe = (ContainerShape)featureProvider.getPictogramElementForBusinessObject(cont);
        	CustomContext c = new CustomContext(new PictogramElement[]{pe});
        	lFeature.execute(c);
        }
        Collapser.setFeatureProvider(featureProvider);
        Collapser.collapse();
	}
	/**
	 * @return the createdResource
	 */
	public Resource getCreatedResource() {
		return createdResource;
	}
	
	public IFeatureProvider getFeatureProvider() {
		return featureProvider;
	}
}
