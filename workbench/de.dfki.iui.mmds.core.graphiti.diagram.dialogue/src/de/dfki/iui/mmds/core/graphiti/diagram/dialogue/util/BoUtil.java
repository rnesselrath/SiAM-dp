package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Decision;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.Sequence;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;
import de.dfki.iui.mmds.core.model.dialogue.statechart.AbstractCompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.CompositeState;
import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

/**
 * Helper class
 * 
 * @author Dragan
 * 
 */
public class BoUtil {

	/**
	 * Check if can create certain objects of instance Node in a parent
	 * container
	 * 
	 * @param bo
	 * @return
	 */
	public static boolean canCreateNodeBusinessObject(EObject bo,
			ContainerShape targetContainer) {
		boolean canCreate = false;

		
		if (bo instanceof Node) {
			if (bo instanceof DoWhile) {
				DoWhile dw = (DoWhile) bo;
				if (dw.getBody() == null) {
					canCreate = true;
				}
			} else if (bo instanceof Sequence) {
				canCreate = true;
			} else if (bo instanceof While) {
				While w = (While) bo;
				
				if (w.getBody() == null) {
					
					canCreate = true;
				}
			} else if (bo instanceof Decision) {
				Decision i = (Decision) bo;
				if (PropertyUtil.isThen(targetContainer) && i.getThen() == null) {
					canCreate = true;
				}
				if (PropertyUtil.isElse(targetContainer) && i.getElse() == null) {
					canCreate = true;
				}
			} else if (bo instanceof StateChart) {
				canCreate = true;
			}
		}
	
		return canCreate;
	}

	/**
	 * This static function is used in all Create Features from the FlowChart
	 * package. Basically all objects of instance Node. In order not to repeat
	 * the whole code over and over again, everyting is in this function
	 * 
	 * @param context
	 *            CreateContext
	 * @return true if creation is allowed, false otherwise
	 */
	public static boolean canCreateNode(ICreateContext context) {
		boolean canCreate = false;
		
		// Creating object of instance Node are allowed as first nodes
		if (context.getTargetContainer() instanceof Diagram) {
			EList<EObject> bos = context.getTargetContainer().getLink().getBusinessObjects();

			for(EObject bo : bos){
				if (bo instanceof Dialogue) {
					Dialogue d = (Dialogue) bo;
					if (d.getContent() == null) {
						canCreate = true;
					}
				}
			}
			
//			if (context.getProperty("container") != null) {
//
//				canCreate = BoUtil.canCreateNodeBusinessObject(
//						(EObject) context.getProperty("container"),
//						context.getTargetContainer());
//			}
//			for (EObject bo : bos) {
//				if (bo instanceof Node) {
//					canCreate = BoUtil.canCreateNodeBusinessObject(bo,
//							context.getTargetContainer());
//
//					break;
//				} else {
//					canCreate = true;
//				}
//			}
			// System.out.println("can create "+canCreate);
		} else {
			
			// Added to handle extended Drag & Drop features
			if (context.getProperty("container") instanceof Node) {
				canCreate = BoUtil.canCreateNodeBusinessObject(
						(EObject) context.getProperty("container"),
						context.getTargetContainer());
			}

			if (context.getProperty("container") instanceof AbstractCompositeState) {
				canCreate = true;
			}
			
			if(context.getProperty("container") instanceof Diagram){
				Dialogue d = (Dialogue) context.getProperty("container") ;
				if(d.getContent()==null){
					canCreate = true;
				}
			}

			ContainerShape container = context.getTargetContainer();
			PictogramLink link = container.getLink();

			if (link != null && !link.getBusinessObjects().isEmpty()) {
				
				for (EObject bo : link.getBusinessObjects()) {
					
					
					if (bo instanceof Node) {
						canCreate = BoUtil.canCreateNodeBusinessObject(
								bo, context.getTargetContainer());
					}
					if (bo instanceof AbstractCompositeState) {
						canCreate = true;
					}


				}

			}
		}

		return canCreate;
	}
	
	public static boolean canAddNode(IAddContext context){
		boolean canAdd = false;
		
		if (context.getTargetContainer() instanceof Diagram) {
			canAdd = true;
		}else {
			
			// Added to handle extended Drag & Drop features
			if (context.getProperty("container") instanceof Node) {
				canAdd = BoUtil.canCreateNodeBusinessObject(
						(EObject) context.getProperty("container"),
						context.getTargetContainer());
			}

			if (context.getProperty("container") instanceof AbstractCompositeState) {
				canAdd = true;
			}
			
			if(context.getProperty("container") instanceof Diagram){
				
					canAdd = true;
				
			}

			ContainerShape container = context.getTargetContainer();
			PictogramLink link = container.getLink();

			if (link != null && !link.getBusinessObjects().isEmpty()) {
				
				for (EObject bo : link.getBusinessObjects()) {
					
					
					if (bo instanceof Node) {
						
						canAdd = true;
					}
					if (bo instanceof AbstractCompositeState) {
						canAdd = true;
					}

				}

			}
		}
		
		return canAdd;
	}

	/**
	 * Add a object of instance Node in the parent object
	 * 
	 * @param bo
	 * @param current
	 * @return
	 */
	public static boolean addEObjectToParent(EObject bo, Node current,
			ContainerShape targetContainer) {
		boolean added = false;
		if (bo instanceof AbstractCompositeState) {
			AbstractCompositeState parent = (AbstractCompositeState) bo;
			added = parent.getStates().add(current);
		} else if (bo instanceof Sequence) {
			Sequence parent = (Sequence) bo;
			added = parent.getContent().add(current);
		} else if (bo instanceof DoWhile) {
			DoWhile parent = (DoWhile) bo;
			parent.setBody(current);
			added = true;
		} else if (bo instanceof While) {
			While parent = (While) bo;
			parent.setBody(current);
			added = true;
		} else if (bo instanceof Decision) {
			Decision i = (Decision) bo;
			if (PropertyUtil.isThen(targetContainer) && i.getThen() == null) {
				i.setThen(current);
			}
			if (PropertyUtil.isElse(targetContainer) && i.getElse() == null) {
				i.setElse(current);
			}
			// TODO: After you create the shape for IF, you have to check
			// whether the add should be in THEN or ELSE part
		} else if (bo instanceof Dialogue) {
			Dialogue parrentStateChart = (Dialogue) bo;
			parrentStateChart.setContent(current);
			added = true;
		}

		return added;
	}
	
	/**
	 * Check whether the object can have more children
	 * @param bo
	 * @return if only more children are possible
	 */
	public static boolean canHaveMoreChildren(EObject bo){
		if(bo instanceof AbstractCompositeState){
			return true;
		}else if(bo instanceof Sequence){
			return true;
		}
		
		return false;
	}
}
