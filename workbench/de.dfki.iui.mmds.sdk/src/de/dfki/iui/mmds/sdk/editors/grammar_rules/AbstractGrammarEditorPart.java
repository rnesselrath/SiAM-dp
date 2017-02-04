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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.EditorPart;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;

/**
 * 
 * @author Robert Neßelrath
 * 
 *         Abstract parent class for all Editor subpages
 * 
 * 
 */

public abstract class AbstractGrammarEditorPart extends EditorPart {

	// the head ruleset object
	protected Ruleset ruleset;

	// keeping an instance of the editor
	protected RulesEditor editor;

	protected Clipboard cb;
	protected EditingDomain editingDomain;
	protected Label errorLabel;
	protected Section headerSection;
	protected Text txtIdentifier;
	protected Text txtLanguage;
	protected String title;
	protected Composite mainComposite;

	protected final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * In the constructor a reference to the editor is set and to the root
	 * Ruleset object
	 * 
	 * @param ruleset
	 * @param editor
	 */
	public AbstractGrammarEditorPart(Ruleset ruleset, RulesEditor editor, String title) {
		super();
		this.ruleset = ruleset;
		this.editor = editor;
		if (editor != null) {
			this.editingDomain = editor.getEditingDomain();
		}
		this.title = title;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void dispose() {
		super.dispose();
		cb.dispose();
	}

	protected Form frmNewForm;

	/**
	 * @param parent
	 *            This class is called from the init() method. Here all the SWT
	 *            and JFace components in the form are drawn.
	 */
	@Override
	public void createPartControl(Composite parent) {

		mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		DataBindingContext ctx = new DataBindingContext();

		frmNewForm = formToolkit.createForm(mainComposite);
		formToolkit.paintBordersFor(frmNewForm);
		frmNewForm.setText(title);
		formToolkit.decorateFormHeading(frmNewForm);
		frmNewForm.getBody().setLayout(new FillLayout());

		Composite composite_head = new Composite(frmNewForm.getHead(), SWT.NONE);
		frmNewForm.setHeadClient(composite_head);
		formToolkit.adapt(composite_head);
		formToolkit.paintBordersFor(composite_head);
		composite_head.setLayout(new GridLayout(4, false));

		// build the id textfield
		Label lblMainProp = formToolkit.createLabel(composite_head, "Identifier", SWT.NONE);
		lblMainProp.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtIdentifier = formToolkit.createText(composite_head, "", SWT.NONE);
		GridData gd_txtIdentifier = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_txtIdentifier.widthHint = 121;
		txtIdentifier.setLayoutData(gd_txtIdentifier);

		IObservableValue target = WidgetProperties.text(SWT.Modify).observe(txtIdentifier);
		IObservableValue model = EMFEditProperties.value(editor.getEditingDomain(), Grammar_rulesPackage.Literals.RULESET__IDENTIFIER).observe(ruleset);

		ctx.bindValue(target, model);

		// build the language textfield
		Label lblLanguage = formToolkit.createLabel(composite_head, "Language", SWT.NONE);
		lblLanguage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtLanguage = formToolkit.createText(composite_head, "", SWT.NONE);
		GridData gd_txtLanguage = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_txtLanguage.widthHint = 121;
		txtLanguage.setLayoutData(gd_txtLanguage);

		target = WidgetProperties.text(SWT.Modify).observe(txtLanguage);
		model = EMFEditProperties.value(editor.getEditingDomain(), Grammar_rulesPackage.Literals.RULESET__LANGUAGE).observe(ruleset);

		ctx.bindValue(target, model);

	}

	void refreshContent() {
		txtIdentifier.setText(ruleset.getIdentifier());
		txtLanguage.setText(ruleset.getLanguage() == null ? "" : ruleset.getLanguage());
	}

	/**
	 * this is the method called when the EditorPart initializes
	 * 
	 * @param site
	 * @param input
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// Initialize the editor part
		setSite(site);
		setInput(input);
		cb = new Clipboard(Display.getDefault());
	}

	protected static String getString(String key) {
		return Speech_recognitionEditorPlugin.INSTANCE.getString(key);
	}

}
