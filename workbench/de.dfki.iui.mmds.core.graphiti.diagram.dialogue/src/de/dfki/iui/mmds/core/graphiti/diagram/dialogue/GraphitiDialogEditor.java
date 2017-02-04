package de.dfki.iui.mmds.core.graphiti.diagram.dialogue;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.IDiagramEditorInput;
import org.eclipse.graphiti.ui.internal.parts.ContainerShapeEditPart;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.mihalis.opal.breadcrumb.Breadcrumb;
import org.mihalis.opal.breadcrumb.BreadcrumbItem;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.diagram.DiagramBehaviorDialogue;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers.treemodel.TreeContentProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.handlers.treemodel.TreeLabelProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.DialogueDesignerElement;
import de.dfki.iui.mmds.core.model.dialogue.Node;
import de.dfki.iui.mmds.core.model.dialogue.statechart.State;
import de.dfki.iui.mmds.core.model.dialogue.util.DialogueResourceImpl;

public class GraphitiDialogEditor extends DiagramEditor {
	public static final String EDITOR_ID = "de.dfki.iui.mmds.core.graphiti.diagram.dialogue.GraphitiDialogEditor";
	protected IContentOutlinePage contentOutlinePage;
	protected TreeViewer contentOutlineViewer;
	protected Dialogue currentDialogue_;
	private Composite cBreadCrumbParent_;
	private Composite cBreadCrumbCont_;
	private Composite composite_;
	private DiagramBehaviorDialogue diagramBehavior;
	
	private static Logger getLogger() {
		return Logger.getLogger(GraphitiDialogEditor.class);
	}
	
	
	
	public GraphitiDialogEditor() {
		super();
	}



	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {
			return showOutlineView() ? getContentOutlinePage() : null;
		}
		return super.getAdapter(required);
	}


	private boolean showOutlineView() {
		return true;	
	}
	
	private void readDialogue() {
		ResourceSet rs = getEditingDomain().getResourceSet();
		if(rs != null && rs.getResources()!=null && rs.getResources().size() > 0) {
			if(rs.getResources().get(1) instanceof DialogueResourceImpl) {
				DialogueResourceImpl dr = (DialogueResourceImpl) rs.getResources().get(1);
				currentDialogue_ = (Dialogue) dr.getContents().get(0);		
			} else {
				getLogger().error("Resource is not of type Dialogue");
			}
		} else {
			getLogger().error("Failed to read Dialogue object from resource set");
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		composite_ = new Composite(parent, SWT.None);
		composite_.setLayout(new GridLayout());
		composite_.setLayout(new GridLayout(1, false));

		cBreadCrumbParent_ = new Composite(composite_, SWT.NONE);
		cBreadCrumbParent_.setLayout(new GridLayout(1, false));
		cBreadCrumbParent_.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
		cBreadCrumbParent_.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
		
		cBreadCrumbCont_ = new Composite(cBreadCrumbParent_, SWT.NONE);
		cBreadCrumbCont_.setLayout(new GridLayout(1, false));
		cBreadCrumbCont_.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
		

		Composite c2 = new Composite(composite_, SWT.NONE);
		c2.setLayoutData(new GridData(GridData.FILL_BOTH));
		c2.setLayout(new FillLayout());
		super.createPartControl(c2);
		readDialogue();
	}

	private static void createBreadcrumb(final Composite parent, final int breadCrumbArgument, final int itemArgument, List<String> list) {
		final Breadcrumb bc = new Breadcrumb(parent, breadCrumbArgument);
		bc.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false));

		for (int i = list.size()-1; i >=0; i--) {
			final BreadcrumbItem item = new BreadcrumbItem(bc, itemArgument);
			item.setText(list.get(i));
			item.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(final SelectionEvent e) {
					System.out.println("Click !");
				}

			});
		}
	}

	private static void createButtonsBreadCrumb(final Composite parent, List<String> list) {
		createBreadcrumb(parent, SWT.BORDER, SWT.CENTER | SWT.TOGGLE, list);
	}
	
	protected DiagramBehavior createDiagramBehavior(IWorkbenchPart parentPart) {
		DiagramBehaviorDialogue diagramBehavior = new DiagramBehaviorDialogue(this);
		diagramBehavior.setParentPart(parentPart);
		diagramBehavior.initDefaultBehaviors();
			
		return diagramBehavior;
	}

	/**
	 * 
	 * @return
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			//this.getEditingDomain().getResourceSet().getAllContents().next()
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);
					contentOutlineViewer.setContentProvider(new TreeContentProvider());
					contentOutlineViewer.setLabelProvider(new TreeLabelProvider());
					contentOutlineViewer.setInput(currentDialogue_);				
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager, statusLineManager);
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage.addSelectionChangedListener(new ISelectionChangedListener() {
				// This ensures that we handle selections correctly.
				//
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					//handleContentOutlineSelection(event.getSelection());
				}
			});
		}
		return contentOutlinePage;
	}


	@Override
	public void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
		super.initializeGraphicalViewer();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		super.selectionChanged(part, selection);
		
		StructuredSelection structuredSelection = (StructuredSelection) selection;	
		Object firstElement = structuredSelection.getFirstElement();
		if(firstElement instanceof ContainerShapeEditPart) {
			PictogramElement pe = ((ContainerShapeEditPart)firstElement).getPictogramElement();
			if(!PropertyUtil.isServiceShape(pe))
				updateBreadcrumbs(pe);
		}	
	}

	private void updateBreadcrumbs(PictogramElement selElement) {
		List<String> bc = new ArrayList<String>();
		traceParent(selElement, bc);
		cBreadCrumbCont_.dispose();
		cBreadCrumbCont_ = new Composite(cBreadCrumbParent_, SWT.NONE);
		cBreadCrumbCont_.setLayout(new GridLayout(1, false));
		cBreadCrumbCont_.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
		createButtonsBreadCrumb(cBreadCrumbCont_, bc);
		cBreadCrumbParent_.layout();
		composite_.layout();
	}
	
	private void traceParent(PictogramElement selElement, List<String> list) {
		if(selElement.getLink().getBusinessObjects().get(0) instanceof DialogueDesignerElement) {
			DialogueDesignerElement n = (DialogueDesignerElement)selElement.getLink().getBusinessObjects().get(0);
			String name = n.getDisplayName();
			list.add(name);
			if(selElement.eContainer()!=null) {
				traceParent((PictogramElement)selElement.eContainer(), list);
			}
		}
	}
	
	/**
	 * Creates the behavior object that cares about the common (behavioral)
	 * coding shared between editors, views and other composites. See
	 * {@link DiagramBehavior} for details and the default implementation.
	 * Override to change the behavior.
	 * 
	 * @return a new instance of {@link DiagramBehavior}
	 * @since 0.10
	 */
	protected DiagramBehaviorDialogue createDiagramBehavior() {
		return new DiagramBehaviorDialogue(this);
	}
}
