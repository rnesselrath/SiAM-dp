package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.node;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.exec_content.assign.CreateAssignFeature;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.ExecutableContentNode;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.FlowchartFactory;

/**
 *  Class for creating model content of type {@link ExecutableContentNode}. The appropriate pictogram content is added by the add feature.
 * 
 * @author Dragan Milchevski
 *
 */
public class CreateExecutableContentNodeFeature extends AbstractCreateFeature implements ICreateFeature {

	/**
	 * Creates new {@link CreateAssignFeature}
	 * @param fp the feature provider.
	 */
	public CreateExecutableContentNodeFeature(IFeatureProvider fp) {
		super(fp, "Executable Contentn Node", "Create new Executable Content Node");
	}
	

	/**
	 * Check if the object can be created.
	 * 
	 * @param context the creating context
	 * @return true if the context can be created
	 */
	@Override
	public boolean canCreate(ICreateContext context) {
		return BoUtil.canCreateNode(context);
	}

	/**
	 * Create new {@link ExecutableContentNode}. First get the container shape of the target object
	 * and check if is of the allowed instances create the {@link ExecutableContentNode} inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Object[] create(ICreateContext context) {
		final ExecutableContentNode newExecContentNode = FlowchartFactory.eINSTANCE.createExecutableContentNode();

		ContainerShape container = context.getTargetContainer();
		PictogramLink link = container.getLink();

		EList<EObject> bos = link.getBusinessObjects();
		if (!bos.isEmpty()) {
			for (EObject bo : bos) {
				if (BoUtil.addEObjectToParent(bo, newExecContentNode, container)) {
					break;
				}
			}
		}
		// do the add

		addGraphicalRepresentation(context, newExecContentNode);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { newExecContentNode };
	}

	/**
	 * Get the icon for the Log from the Image provider class.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_EXEC_CONTENT_NODE;
	}

	/**
	 * This method is overridden for the purpose of classifying the create features in the palate.
	 * 
	 * @param context this is the general input for this method
	 * @return true if it is available, false if not
	 */
	@Override
	public boolean isAvailable(IContext context){
		if(context.getProperty(PropertyUtil.PACKAGE_KEY).equals(PropertyUtil.FLOW_CHART_PACKAGE_VALUE)){
			return true;
		}
		return false;
	}
}
