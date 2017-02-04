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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Section;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping;
import de.dfki.iui.mmds.sdk.editors.grammar_rules.ContentListComposite.COLUMN_TYPE;

/**
 * This is the EditorPart where the SemanticMApping rules can be edited. Similar
 * logic applies like for the Editor Part for the UtteranceRules. For more
 * detailed documentation please refer to the UtteranceEditorPart.class
 * 
 * @author Evica Ilieva & Robert Neßelrath
 * 
 */
public class SemanticMappingEditorPart extends AbstractGrammarEditorPart {

	protected SemanticMapping selectedSemanticMapping;
	protected PhraseMapping selectedPhraseMapping;
	protected ContentListComposite rulesComposite;
	protected ContentListComposite phraseMappingComposite;
	protected ContentListComposite phraseComposite;
	protected EObjectTreeViewerComposite ruleTreeViewerComposite;
	protected EObjectTreeViewerComposite pmTreeViewerComposite;

	public SemanticMappingEditorPart(Ruleset ruleset, RulesEditor editor) {
		super(ruleset, editor, "Semanting Mappings Editor");
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setPartName("Semantic Mapping Rules");
	}

	@Override
	public void createPartControl(Composite parent) {

		super.createPartControl(parent);

		// sash form is used to split the main form into two parts
		SashForm sashForm = new SashForm(frmNewForm.getBody(), SWT.NONE);
		formToolkit.adapt(sashForm);
		formToolkit.paintBordersFor(sashForm);

		SashForm sashForm_2 = new SashForm(sashForm, SWT.VERTICAL);
		formToolkit.adapt(sashForm_2);
		formToolkit.paintBordersFor(sashForm_2);

		Section sctnNewSection = formToolkit.createSection(sashForm_2, Section.DESCRIPTION | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Semantic Mappings Rules");
		sctnNewSection.setExpanded(true);
		sctnNewSection.setDescription("Create or edit new Rules here");

		rulesComposite = new ContentListComposite(sctnNewSection, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getRuleset_Rules(), Grammar_rulesPackage.eINSTANCE.getSemanticMapping(), editor, cb);
		formToolkit.adapt(rulesComposite);
		sctnNewSection.setClient(rulesComposite);
		final TableViewer rulesTableViewer = rulesComposite.getTableViewer();

		// the first column where the name of the Rule can be viewed and edited
		rulesComposite.addColumn(getString("_UI_Rule_name_feature"), COLUMN_TYPE.RULENAME);

		// the second column where the user can enable or disable the rule
		rulesComposite.addColumn(getString("_UI_Rule_enabled_feature"), COLUMN_TYPE.ENABLED);

		rulesTableViewer.setColumnProperties(new String[] { "0", "1" });

		rulesTableViewer.setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				Object result = null;
				Rule rule = (Rule) element;
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
				}
				return result;
			}

			@Override
			public void modify(Object element, String property, Object value) {
				TableItem item = (TableItem) element;
				Rule oldValue = (Rule) item.getData();
				EAttribute feature = null;
				switch (property) {
				case "0":
					feature = Grammar_rulesPackage.eINSTANCE.getRule_Name();
					break;
				case "1":
					feature = Grammar_rulesPackage.eINSTANCE.getRule_Enabled();
					break;
				}
				if (oldValue.getName() != null) {
					if ((property.equals("0") && !oldValue.getName().equals(value)) || property.equals("1")) {
						editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));

					}
				} else {
					editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));
				}
			}
		});

		rulesTableViewer.setCellEditors(new CellEditor[] { new TextCellEditor(rulesTableViewer.getTable()), new CheckboxCellEditor(rulesTableViewer.getTable()) });

		rulesTableViewer.setInput(ruleset);

		rulesTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) rulesTableViewer.getSelection();
				if (selection != null && selection.size() == 1) {
					setSelectedSemanticMapping((SemanticMapping) selection.getFirstElement());
					editor.setCurrentViewer(rulesTableViewer);
				} else {
					setSelectedSemanticMapping(null);
				}
			}
		});

		Section sctnSemanticMappingInterpretation = formToolkit.createSection(sashForm_2, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnSemanticMappingInterpretation);
		sctnSemanticMappingInterpretation.setText("Semantic Mapping Interpretation");
		sctnSemanticMappingInterpretation.setExpanded(true);

		ruleTreeViewerComposite = new EObjectTreeViewerComposite(sctnSemanticMappingInterpretation, SWT.NONE, editor, rulesComposite);
		formToolkit.adapt(ruleTreeViewerComposite);
		formToolkit.paintBordersFor(ruleTreeViewerComposite);
		sctnSemanticMappingInterpretation.setClient(ruleTreeViewerComposite);

		SashForm sashForm_1 = new SashForm(sashForm, SWT.VERTICAL);
		formToolkit.adapt(sashForm_1);
		formToolkit.paintBordersFor(sashForm_1);

		SashForm sashForm_3 = new SashForm(sashForm_1, SWT.NONE);
		formToolkit.adapt(sashForm_3);
		formToolkit.paintBordersFor(sashForm_3);

		Section sctnPhraseMappings = formToolkit.createSection(sashForm_3, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnPhraseMappings);
		sctnPhraseMappings.setText("Phrase Mappings");
		sctnPhraseMappings.setExpanded(true);

		phraseMappingComposite = new ContentListComposite(sctnPhraseMappings, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getSemanticMapping_PhraseMappings(),
				Grammar_rulesPackage.eINSTANCE.getPhraseMapping(), editor, cb);

		final TableViewer phraseMappingTableViewer = phraseMappingComposite.getTableViewer();

		formToolkit.adapt(phraseMappingComposite);
		sctnPhraseMappings.setClient(phraseMappingComposite);

		// name Column
		phraseMappingComposite.addColumn("Description", COLUMN_TYPE.RULENAME);

		phraseMappingTableViewer.setColumnProperties(new String[] { "0" });

		phraseMappingTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			// This ensures that we handle selections correctly.
			//
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) phraseMappingTableViewer.getSelection();
				if (selection != null && selection.size() == 1) {
					setSelectedPhraseMapping((PhraseMapping) selection.getFirstElement());
					editor.setCurrentViewer(phraseMappingTableViewer);
				} else {
					setSelectedPhraseMapping(null);
				}
			}
		});

		// cell modifier for changing the phrases in the table
		phraseMappingTableViewer.setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				Object result = null;
				PhraseMapping selectedPhraseM = (PhraseMapping) element;
				if (selectedPhraseM != null) {
					if (selectedPhraseM.getDescription() == null) {
						result = "";
					} else {
						result = selectedPhraseM.getDescription() + "";
					}
				}
				return result;
			}

			@Override
			public void modify(Object element, String property, Object value) {
				TableItem item = (TableItem) element;
				PhraseMapping oldPhraseM = (PhraseMapping) item.getData();
				EAttribute feature = Grammar_rulesPackage.eINSTANCE.getPhraseMapping_Description();
				if (oldPhraseM.getDescription() == null || !oldPhraseM.getDescription().equals(value)) {
					editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), oldPhraseM, feature, value));
				}
			}
		});

		phraseMappingTableViewer.setCellEditors(new CellEditor[] { new TextCellEditor(phraseMappingTableViewer.getTable()) });

		final Section sctnNewSection_1 = formToolkit.createSection(sashForm_3, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnNewSection_1);
		sctnNewSection_1.setText("Phrases");
		sctnNewSection_1.setExpanded(true);

		phraseComposite = new ContentListComposite(sctnNewSection_1, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getPhraseMapping_Phrases(), EcorePackage.eINSTANCE.getEString(), editor, cb);
		formToolkit.adapt(phraseComposite);
		sctnNewSection_1.setClient(phraseComposite);
		TableViewer phraseTableViewer = phraseComposite.getTableViewer();

		// phrase Column
		phraseComposite.addColumn(getString("_UI_PhraseMapping_name_feature"), COLUMN_TYPE.RULENAME);

		phraseTableViewer.setColumnProperties(new String[] { "0" });

		phraseTableViewer.setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				return element;
			}

			@Override
			public void modify(Object element, String property, Object value) {
				TableItem item = (TableItem) element;
				String oldValue = (String) item.getData();
				EAttribute feature = Grammar_rulesPackage.eINSTANCE.getPhraseMapping_Phrases();
				String newString = (String) value;
				if (oldValue == null || !oldValue.equals(newString)) {
					// execute a replace command where the oldPhrase is
					// updated with a new Phrase
					for (String phrase : selectedPhraseMapping.getPhrases()) {
						if (phrase.equals(newString)) {
							errorLabel.setText("Phrases must be unique");
							sctnNewSection_1.layout();
							return;
						}
					}
					ReplaceCommand cmd = new ReplaceCommand(editor.getEditingDomain(), selectedPhraseMapping, feature, oldValue, newString);

					editor.getEditingDomain().getCommandStack().execute(cmd);
				}
			}
		});

		phraseTableViewer.setCellEditors(new CellEditor[] { new TextCellEditor(phraseTableViewer.getTable()) });
		errorLabel = formToolkit.createLabel(sctnNewSection_1, "", SWT.NONE);
		sctnNewSection_1.setTextClient(errorLabel);
		errorLabel.setForeground(getEditorSite().getWorkbenchWindow().getWorkbench().getDisplay().getSystemColor(SWT.COLOR_RED));

		sashForm_3.setWeights(new int[] { 124, 159 });

		Section sctnNewSection_2 = formToolkit.createSection(sashForm_1, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnNewSection_2);
		sctnNewSection_2.setText("Phrase Mapping Interpretation");
		sctnNewSection_2.setExpanded(true);

		pmTreeViewerComposite = new EObjectTreeViewerComposite(sctnNewSection_2, SWT.NONE, editor, phraseMappingComposite);
		formToolkit.adapt(pmTreeViewerComposite);
		formToolkit.paintBordersFor(pmTreeViewerComposite);
		sctnNewSection_2.setClient(pmTreeViewerComposite);

		sashForm_1.setWeights(new int[] { 1, 1 });
		sashForm.setWeights(new int[] { 1, 1 });

		setSelectedSemanticMapping(null);
	}

	@Override
	public void setFocus() {
		editor.setCurrentViewer(rulesComposite.getTableViewer());
	}

	protected void setSelectedSemanticMapping(SemanticMapping sm) {
		selectedSemanticMapping = sm;
		phraseMappingComposite.getTableViewer().setInput(sm);
		setSelectedPhraseMapping(null);
		ruleTreeViewerComposite.getTreeViewer().setInput(sm);
		boolean enabled = sm != null;
		phraseMappingComposite.setEnabled(enabled);
		ruleTreeViewerComposite.getTreeViewer().getTree().setEnabled(enabled);
	}

	protected void setSelectedPhraseMapping(PhraseMapping pm) {
		selectedPhraseMapping = pm;
		phraseComposite.getTableViewer().setInput(pm);
		pmTreeViewerComposite.getTreeViewer().setInput(pm);
		boolean enabled = pm != null;
		phraseComposite.setEnabled(enabled);
		pmTreeViewerComposite.getTreeViewer().getTree().setEnabled(enabled);
	}
}
