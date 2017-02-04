/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
/**
 */
package de.dfki.iui.mmds.sdk.editors.model;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.Transition;
import de.dfki.iui.mmds.core.model.pattern.PatternPackage;

/**
 * This is the action bar contributor for the Project model editor. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProjectActionBarContributor extends EditingDomainActionBarContributor implements ISelectionChangedListener {
	/**
	 * This keeps track of the active editor. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IAction showPropertiesViewAction = new Action(ProjectEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
		@Override
		public void run() {
			try {
				getPage().showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException exception) {
				ProjectEditorPlugin.INSTANCE.log(exception);
			}
		}
	};

	@Override
	protected CopyAction createCopyAction() {
		return new CustomCopyAction();
	}

	@Override
	protected PasteAction createPasteAction() {
		return new CustomPasteAction();
	}

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IAction refreshViewerAction = new Action(ProjectEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
		@Override
		public boolean isEnabled() {
			return activeEditorPart instanceof IViewerProvider;
		}

		@Override
		public void run() {
			if (activeEditorPart instanceof IViewerProvider) {
				Viewer viewer = ((IViewerProvider) activeEditorPart).getViewer();
				if (viewer != null) {
					viewer.refresh();
				}
			}
		}
	};

	/**
	 * This will contain one
	 * {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to
	 * each descriptor generated for the current selection by the item provider.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	protected Map<String, Map<String, IAction>> createChildActions;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateChild actions. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one
	 * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding
	 * to each descriptor generated for the current selection by the item
	 * provider. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	protected Map<String, Map<String, IAction>> createSiblingActions;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateSibling actions. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	protected IMenuManager createSiblingMenuManager;

	private ISelection selection;

	private EditingDomain domain;

	/**
	 * This creates an instance of the contributor. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 */
	public ProjectActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new ExtendedLoadResourceAction();
		validateAction = new ValidateAction();
		controlAction = new ControlAction();
	}

	/**
	 * This adds Separators for editor additions to the tool bar. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("project-settings"));
		toolBarManager.add(new Separator("project-additions"));
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor
	 * additions, as well as the sub-menus for object creation items. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(ProjectEditorPlugin.INSTANCE.getString("_UI_ProjectEditor_menu"), "de.dfki.iui.mmds.core.model.projectMenuID");
		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(ProjectEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		submenuManager.insertBefore("additions", createChildMenuManager);

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(ProjectEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		submenuManager.insertBefore("additions", createSiblingMenuManager);

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager menuManager) {
				menuManager.updateAll(true);
			}
		});

		addGlobalActions(submenuManager);
	}

	/**
	 * When the active editor changes, this remembers the change and registers
	 * with it as a selection provider. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
			domain = null;
		} else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);
			domain = ((IEditingDomainProvider) activeEditorPart).getEditingDomain();

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
			}
		}
	}

	/**
	 * This implements
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}, handling
	 * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for
	 * the children and siblings that can be added to the selected object and
	 * updating the menus accordingly. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 */
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			createChildMenuManager.removeAll();
			// depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			createSiblingMenuManager.removeAll();
			// depopulateManager(createSiblingMenuManager,
			// createSiblingActions);
		}

		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			Object selectedElement;
			selectedElement = ((IStructuredSelection) selection).getFirstElement();

			newChildDescriptors = domain.getNewChildDescriptors(selectedElement, null);
			newSiblingDescriptors = domain.getNewChildDescriptors(null, selectedElement);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(newChildDescriptors, selection);
		createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingActions, null);
			createSiblingMenuManager.update(true);
		}
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
	 * for each object in <code>descriptors</code>, and returns the collection
	 * of these actions. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	protected Map<String, Map<String, IAction>> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Map<String, Map<String, IAction>> actions = new TreeMap<String, Map<String, IAction>>();
		actions.put("", new TreeMap<String, IAction>());
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				CommandParameter cp = (CommandParameter) descriptor;
				Map<String, IAction> actualList;
				if (cp.getEReference() == PatternPackage.eINSTANCE.getPObject_Slot() || cp.getEReference() == PatternPackage.eINSTANCE.getPSlot_Range()) {
					actualList = actions.get("");
				} else if (cp.getEReference() != null) {
					actualList = actions.get(cp.getEReference().getName());
					if (actualList == null) {
						actualList = new TreeMap<String, IAction>();
						actions.put(cp.getEReference().getName(), actualList);
					}
				} else {
					actualList = actions.get("");
				}
				CreateChildAction createChildAction = new CreateChildAction(activeEditorPart, selection, descriptor);
				if (createChildAction.isEnabled()) {
					actualList.put(createChildAction.getText(), createChildAction);
				}
			}
		}
		return actions;
	}

	/**
	 * This generates a
	 * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each
	 * object in <code>descriptors</code>, and returns the collection of these
	 * actions. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	protected Map<String, Map<String, IAction>> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		Map<String, Map<String, IAction>> actions = new TreeMap<String, Map<String, IAction>>();
		actions.put("", new TreeMap<String, IAction>());
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				CommandParameter cp = (CommandParameter) descriptor;
				Map<String, IAction> actualList;
				if (cp.getEReference() == PatternPackage.eINSTANCE.getPObject_Slot() || cp.getEReference() == PatternPackage.eINSTANCE.getPSlot_Range()) {
					actualList = actions.get("");
				} else if (cp.getEReference() != null) {
					actualList = actions.get(cp.getEReference().getName());
					if (actualList == null) {
						actualList = new TreeMap<String, IAction>();
						actions.put(cp.getEReference().getName(), actualList);
					}
				} else {
					actualList = actions.get("");
				}
				CreateSiblingAction createSiblingAction = new CreateSiblingAction(activeEditorPart, selection, descriptor);
				if (createSiblingAction.isEnabled()) {
					actualList.put(createSiblingAction.getText(), createSiblingAction);
				}
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection, by inserting them before the specified
	 * contribution item <code>contributionID</code>. If
	 * <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	protected void populateManager(IMenuManager manager, Map<String, Map<String, IAction>> createChildActions, String contributionID) {
		if (createChildActions != null) {
			for (String key : createChildActions.keySet()) {
				IMenuManager mm;
				if (key.equals("")) {
					mm = manager;
				} else {
					mm = new MenuManager(key, ProjectEditorPlugin.getImageDescriptor("icons/Slot.gif"), key);
					if (contributionID != null) {
						manager.insertBefore(contributionID, mm);
					} else {
						manager.add(mm);
					}
				}

				for (IAction item : createChildActions.get(key).values())
					if (contributionID != null) {
						mm.insertBefore(contributionID, item);
					} else {
						mm.add(item);
					}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = new MenuManager(ProjectEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"), ProjectEditorPlugin.getImageDescriptor("icons/Child.png"), "addChild");
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("edit", submenuManager);

		submenuManager = new MenuManager(ProjectEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"), ProjectEditorPlugin.getImageDescriptor("icons/Sibling.png"), "addSibling");
		populateManager(submenuManager, createSiblingActions, null);
		menuManager.insertBefore("edit", submenuManager);

		Object firstElement = ((IStructuredSelection) selection).getFirstElement();
		// allow to toggle between onEntry and onExit
		if (DialoguePackage.eINSTANCE.getExecutableContent().isInstance(firstElement)) {
			menuManager.insertAfter("addSibling", new ToggleOnEntryExitAction(activeEditorPart, selection));
		}

		// allow to follow a transition
		if (DialoguePackage.eINSTANCE.getTransition().isInstance(firstElement)) {
			menuManager.insertAfter("addSibling", new FollowTransitionAction((Transition) firstElement, (ProjectEditor) activeEditor));
		}

		// menuManager.insertAfter("addSibling", new
		// CollapseAllAction((ProjectEditor) activeEditor));
		// menuManager.insertAfter("addSibling", new
		// ExpandAllAction((ProjectEditor) activeEditor));
		// menuManager.insertAfter("addSibling", new Separator());
	}

	/**
	 * This inserts global actions before the "additions-end" separator. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());
		menuManager.insertAfter("ui-actions", refreshViewerAction);

		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted
	 * objects. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

}
