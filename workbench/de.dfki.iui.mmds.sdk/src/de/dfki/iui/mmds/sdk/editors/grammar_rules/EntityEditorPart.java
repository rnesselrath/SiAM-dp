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
package de.dfki.iui.mmds.sdk.editors.grammar_rules;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Section;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.sdk.editors.grammar_rules.ContentListComposite.COLUMN_TYPE;
import de.dfki.iui.mmds.sdk.editors.grammar_rules.validators.ABNFValidator;

/**
 * this is the EditorPart where similar logic applies like for the Editor Part
 * for the EntityRules. For more detailed documentation please refer to the
 * UtteranceEditorPart.class
 * 
 * @author Evica Ilieva, Robert Neßelrath
 * 
 */
public class EntityEditorPart extends AbstractGrammarEditorPart {

	protected Rule selectedRule;
	protected List<PhraseValuePair> selectedPhrase;
	protected ContentListComposite entitiesComposite;
	protected ContentListComposite phraseMappingComposite;
	protected EObjectTreeViewerComposite treeViewerComposite;

	public EntityEditorPart(Ruleset ruleset, RulesEditor editor) {
		super(ruleset, editor, "Entity Editor");
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		cb = new Clipboard(Display.getDefault());
		setPartName("Entity Rules");
		// getSite().setSelectionProvider(entityTableViewer);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		// sash form is used to split the main form into two parts
		SashForm sashForm = new SashForm(frmNewForm.getBody(), SWT.NONE);
		formToolkit.adapt(sashForm);
		formToolkit.paintBordersFor(sashForm);

		Section sctnNewSection = formToolkit.createSection(sashForm, Section.DESCRIPTION | Section.TITLE_BAR);
		sctnNewSection.setText("Entity Rules");
		sctnNewSection.setExpanded(true);
		sctnNewSection.setDescription("Create or edit new Rules here");

		entitiesComposite = new ContentListComposite(sctnNewSection, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getRuleset_Rules(), Grammar_rulesPackage.eINSTANCE.getEntity(), editor, cb);
		formToolkit.adapt(entitiesComposite);
		sctnNewSection.setClient(entitiesComposite);
		final TableViewer entityTableViewer = entitiesComposite.getTableViewer();

		// the first column where the name of the Rule can be viewed and edited
		entitiesComposite.addColumn(getString("_UI_Rule_name_feature"), COLUMN_TYPE.RULENAME);

		// the second column where the user can enable or disable the rule
		entitiesComposite.addColumn(getString("_UI_Rule_enabled_feature"), COLUMN_TYPE.ENABLED);

		// the third column where the type is set
		entitiesComposite.addColumn(getString("_UI_EntityRule_type_feature"), COLUMN_TYPE.TYPE);

		entityTableViewer.setColumnProperties(new String[] { "0", "1", "2" });

		entityTableViewer.setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				Object result = null;
				Entity rule = (Entity) element;
				switch (property) {
				case "0":
					if (rule.getName() == null) {
						result = "";
					} else {
						result = rule.getName() + "";
					}
					break;
				case "1":
					result = new Boolean(rule.isEnabled());
					break;
				case "2":
					result = true;
					if (rule.getType().equals(EntityType.DYNAMIC)) {
						result = false;
					}
					break;
				}
				return result;
			}

			@Override
			public void modify(Object element, String property, Object value) {
				TableItem item = (TableItem) element;
				Entity oldValue = (Entity) item.getData();
				EAttribute feature = null;
				switch (property) {
				case "0":
					feature = Grammar_rulesPackage.eINSTANCE.getRule_Name();
					break;
				case "1":
					feature = Grammar_rulesPackage.eINSTANCE.getRule_Enabled();
					break;
				case "2":
					feature = Grammar_rulesPackage.eINSTANCE.getEntity_Type();

					if ((Boolean) value) {
						value = "static";
					} else {
						value = "dynamic";
					}
					break;
				}
				if (oldValue.getName() != null) {
					if ((property.equals("0") && !oldValue.getName().equals(value)) || property.equals("1") || property.equals("2")) {
						if (value.equals("static")) {
							editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, EntityType.STATIC));
						} else if (value.equals("dynamic")) {
							editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, EntityType.DYNAMIC));
						} else {
							editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));
						}
					}
				} else {
					editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));
				}
			}

		});

		entityTableViewer.setCellEditors(new CellEditor[] { new TextCellEditor(entityTableViewer.getTable()), new CheckboxCellEditor(entityTableViewer.getTable()),
				new CheckboxCellEditor(entityTableViewer.getTable()) });

		entityTableViewer.setInput(ruleset);

		entityTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			// This ensures that we handle selections correctly, i.e. for each
			// selected entity rule a corresponding PhraseValue Pair is
			// shown in the detail view

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) entityTableViewer.getSelection();
				if (selection != null && selection.size() == 1) {
					setSelectedRule((Rule) selection.getFirstElement());
					if (selectedRule != null) {
						editor.setCurrentViewer(entityTableViewer);
					}
				} else {
					setSelectedRule(null);
				}

			}
		});

		Composite rightSide = new Composite(sashForm, SWT.NONE);
		formToolkit.adapt(rightSide);
		formToolkit.paintBordersFor(rightSide);
		rightSide.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm sashForm_1 = new SashForm(rightSide, SWT.VERTICAL);
		formToolkit.adapt(sashForm_1);
		formToolkit.paintBordersFor(sashForm_1);

		final Section sctnNewSection_1 = formToolkit.createSection(sashForm_1, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnNewSection_1);
		sctnNewSection_1.setText("Phrase Value Pairs");
		sctnNewSection_1.setExpanded(true);

		phraseMappingComposite = new ContentListComposite(sctnNewSection_1, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getEntity_Entries(), Grammar_rulesPackage.eINSTANCE.getPhraseValuePair(), editor,
				cb);
		formToolkit.adapt(phraseMappingComposite);
		sctnNewSection_1.setClient(phraseMappingComposite);

		// phrase Column
		phraseMappingComposite.addColumn(getString("_UI_PhraseMapping_name_feature"), COLUMN_TYPE.RULENAME);

		// value Column
		phraseMappingComposite.addColumn(getString("_UI_PhraseValue_name_feature"), COLUMN_TYPE.RULENAME);

		phraseMappingComposite.getTableViewer().setColumnProperties(new String[] { "0", "1" });

		phraseMappingComposite.getTableViewer().setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				String result = "";
				PhraseValuePair pv = (PhraseValuePair) element;
				switch (property) {
				case "0":
					if (pv.getPhrase() == null) {
						result = "";
					} else {
						result = pv.getPhrase();
					}
					break;
				case "1":
					if (pv.getValue() == null) {
						result = "";
					} else {
						result = pv.getValue();
					}
					break;
				}
				return result;
			}

			@Override
			public void modify(Object element, String property, Object value) {
				TableItem item = (TableItem) element;
				PhraseValuePair pvOld = (PhraseValuePair) item.getData();
				EAttribute feature = null;
				String newString = (String) value;
				switch (property) {
				case "0":
					feature = Grammar_rulesPackage.eINSTANCE.getPhraseValuePair_Phrase();
					break;
				case "1":
					feature = Grammar_rulesPackage.eINSTANCE.getPhraseValuePair_Value();
					break;
				}
				if (!newString.equals(pvOld)) {
					editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));
				}
			}
		});

		phraseMappingComposite.getTableViewer().setCellEditors(
				new CellEditor[] { new TextCellEditor(phraseMappingComposite.getTableViewer().getTable()), new TextCellEditor(phraseMappingComposite.getTableViewer().getTable()) });

		phraseMappingComposite.getTableViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			// This ensures that we handle selections correctly, i.e.
			// for each
			// selected entity rule a corresponding PhraseValue Pair is
			// shown in
			// the detail view
			//
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) entityTableViewer.getSelection();
				if (selection != null) {
					editor.setCurrentViewer(phraseMappingComposite.getTableViewer());
				}

			}
		});

		final Label errorLabel = formToolkit.createLabel(sctnNewSection_1, "", SWT.NONE);
		sctnNewSection_1.setTextClient(errorLabel);
		errorLabel.setForeground(getEditorSite().getWorkbenchWindow().getWorkbench().getDisplay().getSystemColor(SWT.COLOR_RED));

		CellEditor[] test = phraseMappingComposite.getTableViewer().getCellEditors();
		final CellEditor e = test[0];
		if (e instanceof TextCellEditor) {
			e.setValidator(new ABNFValidator());
			e.addListener(new ICellEditorListener() {
				@Override
				public void applyEditorValue() {
					setErrorMessage(null);
				}

				@Override
				public void cancelEditor() {
					setErrorMessage(null);
				}

				@Override
				public void editorValueChanged(boolean oldValidState, boolean newValidState) {
					setErrorMessage(e.getErrorMessage());
				}

				private void setErrorMessage(String errorMessage) {
					if (errorMessage != null) {
						System.out.println(errorMessage);
						errorLabel.setText(errorMessage);
						sctnNewSection_1.layout();
					} else {
						errorLabel.setText("");
						sctnNewSection_1.layout();
					}
				}
			});
		}

		Section sctnNewSection_2 = formToolkit.createSection(sashForm_1, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnNewSection_2);
		sctnNewSection_2.setText("Interpretation");
		sctnNewSection_2.setExpanded(true);

		treeViewerComposite = new EObjectTreeViewerComposite(sctnNewSection_2, SWT.NONE, editor, entitiesComposite);
		formToolkit.adapt(treeViewerComposite);
		formToolkit.paintBordersFor(treeViewerComposite);
		sctnNewSection_2.setClient(treeViewerComposite);

		sashForm_1.setWeights(new int[] { 1, 1 });
		sashForm.setWeights(new int[] { 1, 1 });
		setSelectedRule(null);

	}

	@Override
	public void setFocus() {
		editor.setCurrentViewer(entitiesComposite.getTableViewer());
	}

	protected void setSelectedRule(Rule rule) {
		selectedRule = rule;
		phraseMappingComposite.getTableViewer().setInput(rule);
		treeViewerComposite.getTreeViewer().setInput(rule);
		boolean enabled = rule != null;
		phraseMappingComposite.setEnabled(enabled);
		treeViewerComposite.getTreeViewer().getTree().setEnabled(enabled);
		treeViewerComposite.getTreeViewer().expandAll();
	}
}
