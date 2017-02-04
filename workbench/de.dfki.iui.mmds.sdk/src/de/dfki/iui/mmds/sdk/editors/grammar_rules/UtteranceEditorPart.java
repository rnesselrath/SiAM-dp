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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.ReplaceCommand;
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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Section;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance;
import de.dfki.iui.mmds.sdk.editors.grammar_rules.ContentListComposite.COLUMN_TYPE;
import de.dfki.iui.mmds.sdk.editors.grammar_rules.validators.ABNFValidator;

/**
 * 
 * @author Evica Ilieva & Robert Neßelrath
 * 
 *         This class is the Editor Part which enables user friendly editing of
 *         the Rules of type Utterance
 * 
 */

public class UtteranceEditorPart extends AbstractGrammarEditorPart {

	protected Utterance selectedUtterance;
	protected List<String> selectedPhrase;
	private ContentListComposite phraseMappingComposite;
	private ContentListComposite utteranceListComposite;
	private EObjectTreeViewerComposite treeViewerComposite;

	/**
	 * In the constructor a reference to the editor is set and to the root
	 * Ruleset object
	 * 
	 * @param ruleset
	 * @param editor
	 */
	public UtteranceEditorPart(Ruleset ruleset, RulesEditor editor) {
		super(ruleset, editor, "Utterance Editor");
	}

	/**
	 * this is the method called when the EditorPart initializes
	 * 
	 * @param site
	 * @param input
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setPartName("Utterance Rules");
	}

	/**
	 * @param parent
	 *            This class is called from the init() method. Here all the SWT
	 *            and JFace components in the form are drawn.
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		// sash form is used to split the main form into two parts
		SashForm sashForm = new SashForm(frmNewForm.getBody(), SWT.NONE);
		formToolkit.adapt(sashForm);
		formToolkit.paintBordersFor(sashForm);

		Section sctnNewSection = formToolkit.createSection(sashForm, Section.DESCRIPTION | Section.TITLE_BAR);

		formToolkit.paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Utterance Rules");
		sctnNewSection.setExpanded(true);
		sctnNewSection.setDescription("Create or edit new Rules here");

		utteranceListComposite = new ContentListComposite(sctnNewSection, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getRuleset_Rules(), Grammar_rulesPackage.eINSTANCE.getUtterance(), editor, cb);
		formToolkit.adapt(utteranceListComposite);
		sctnNewSection.setClient(utteranceListComposite);
		final TableViewer utterancesTableViewer = utteranceListComposite.getTableViewer();

		// the first column where the name of the Rule can be viewed and edited
		utteranceListComposite.addColumn(getString("_UI_Rule_name_feature"), COLUMN_TYPE.RULENAME);

		// the second column where the user can enable or disable the rule
		utteranceListComposite.addColumn(getString("_UI_Rule_enabled_feature"), COLUMN_TYPE.ENABLED);

		utterancesTableViewer.setColumnProperties(new String[] { "0", "1" });

		// setting a cell modifier so the rules can be edited in the TableViewer
		// directly
		utterancesTableViewer.setCellModifier(new ICellModifier() {

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}

			@Override
			public Object getValue(Object element, String property) {
				Object result = null;
				Rule rule = (Rule) element;
				// checking to see which property should be shown, name or
				// isEnabled and what is going to be shown in the table
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
				// getting the selected element
				TableItem item = (TableItem) element;
				// getting the selected rule
				Rule oldValue = (Rule) item.getData();
				EAttribute feature = null;
				// depending on which property should be edited a different
				// feature is set for the setCommand
				switch (property) {
				case "0":
					feature = Grammar_rulesPackage.eINSTANCE.getRule_Name();
					break;
				case "1":
					feature = Grammar_rulesPackage.eINSTANCE.getRule_Enabled();
					break;
				}
				if (oldValue.getName() != null) {
					// if the name has not changed do nothing
					if ((property.equals("0") && !oldValue.getName().equals(value)) || property.equals("1")) {
						editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));

					}
				} else {
					editor.getEditingDomain().getCommandStack().execute(SetCommand.create(editor.getEditingDomain(), item.getData(), feature, value));
				}
			}

		});

		// setting a cell editor for both properties of the Utterance Rules that
		// need to be edited
		utterancesTableViewer.setCellEditors(new CellEditor[] { new TextCellEditor(utterancesTableViewer.getTable()), new CheckboxCellEditor(utterancesTableViewer.getTable()) });
		utterancesTableViewer.setInput(ruleset);

		// on selection changed update the details view (the PhraseMapping Table
		// Viewer and the Interpretation TreeViewer
		utterancesTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			// This ensures that we handle selections correctly.
			//
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) utterancesTableViewer.getSelection();
				if (selection != null && selection.size() == 1) {
					setSelectedUtterance((Utterance) selection.getFirstElement());
					editor.setCurrentViewer(utterancesTableViewer);
				} else {
					setSelectedUtterance(null);
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
		sctnNewSection_1.setText("Phrases");
		sctnNewSection_1.setExpanded(true);

		phraseMappingComposite = new ContentListComposite(sctnNewSection_1, SWT.NONE, Grammar_rulesPackage.eINSTANCE.getUtterance_Phrases(), EcorePackage.eINSTANCE.getEString(), editor, cb);
		formToolkit.adapt(phraseMappingComposite);
		sctnNewSection_1.setClient(phraseMappingComposite);

		// phrase Column
		phraseMappingComposite.addColumn(getString("_UI_PhraseMapping_name_feature"), COLUMN_TYPE.RULENAME);

		phraseMappingComposite.getTableViewer().setColumnProperties(new String[] { "0" });

		// cell modifier for changing the phrases in the table
		phraseMappingComposite.getTableViewer().setCellModifier(new ICellModifier() {

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
				EAttribute feature = Grammar_rulesPackage.eINSTANCE.getUtterance_Phrases();
				String newString = (String) value;
				if (oldValue == null || !oldValue.equals(newString)) {
					// execute a replace comand where the oldPhrase is
					// updated with a new Phrase
					for (String phrase : selectedUtterance.getPhrases()) {
						if (phrase.equals(newString)) {
							errorLabel.setText("Phrases must be unique");
							sctnNewSection_1.layout();
							return;
						}
					}
					ReplaceCommand cmd = new ReplaceCommand(editor.getEditingDomain(), selectedUtterance, feature, oldValue, newString);

					editor.getEditingDomain().getCommandStack().execute(cmd);
				}

			}

		});

		phraseMappingComposite.getTableViewer().setCellEditors(new CellEditor[] { new TextCellEditor(phraseMappingComposite.getTableViewer().getTable()) });

		// this label is used to show the error that is given with a wrong
		// Phrase input
		errorLabel = formToolkit.createLabel(sctnNewSection_1, "", SWT.NONE);
		sctnNewSection_1.setTextClient(errorLabel);
		errorLabel.setForeground(getEditorSite().getWorkbenchWindow().getWorkbench().getDisplay().getSystemColor(SWT.COLOR_RED));

		// to set a validation of the phrases a listener is added to the cell
		// editor of the phrase mapping table.
		CellEditor[] test = phraseMappingComposite.getTableViewer().getCellEditors();
		for (final CellEditor e : test) {
			if (e instanceof TextCellEditor) {
				// the validator is set to a class designed previously, called
				// ABNF validator
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

					// here the error message is set
					@Override
					public void editorValueChanged(boolean oldValidState, boolean newValidState) {
						setErrorMessage(e.getErrorMessage());
					}

					// here the error message is set to the a label
					private void setErrorMessage(String errorMessage) {
						if (errorMessage != null) {
							errorLabel.setText(errorMessage);
							sctnNewSection_1.layout();
						} else {
							errorLabel.setText("");
							sctnNewSection_1.layout();
						}
					}
				});
			}
		}

		Section sctnNewSection_2 = formToolkit.createSection(sashForm_1, Section.TWISTIE | Section.TITLE_BAR);
		formToolkit.paintBordersFor(sctnNewSection_2);
		sctnNewSection_2.setText("Interpretation");
		sctnNewSection_2.setExpanded(true);

		treeViewerComposite = new EObjectTreeViewerComposite(sctnNewSection_2, SWT.NONE, editor, utteranceListComposite);
		formToolkit.adapt(treeViewerComposite);
		formToolkit.paintBordersFor(treeViewerComposite);
		sctnNewSection_2.setClient(treeViewerComposite);

		sashForm_1.setWeights(new int[] { 1, 1 });
		sashForm.setWeights(new int[] { 1, 1 });
		setSelectedUtterance(null);
	}

	@Override
	public void setFocus() {
		editor.setCurrentViewer(utteranceListComposite.getTableViewer());
	}

	protected void setSelectedUtterance(Utterance utterance) {
		selectedUtterance = utterance;
		phraseMappingComposite.getTableViewer().setInput(utterance);
		treeViewerComposite.getTreeViewer().setInput(utterance);
		boolean enabled = utterance != null;
		phraseMappingComposite.setEnabled(enabled);
		treeViewerComposite.getTreeViewer().getTree().setEnabled(enabled);
		treeViewerComposite.getTreeViewer().expandAll();
	}
}
