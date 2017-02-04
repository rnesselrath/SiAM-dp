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
package de.dfki.iui.mmds.sdk.wizards.device;

import java.util.TreeSet;
import java.util.regex.Pattern;

import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.pde.internal.core.util.VMUtil;
import org.eclipse.pde.internal.ui.PDEUIMessages;
import org.eclipse.pde.internal.ui.SWTFactory;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.AbstractFieldData;
import org.eclipse.pde.internal.ui.wizards.plugin.ContentPage;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PreferencesUtil;

@SuppressWarnings("restriction")
public class PluginContentPage extends ContentPage {
	private Label fEELabel;
	private Button fExeEnvButton;
	private Combo fEEChoice;
	private Text fApplicationName;

	protected String deviceName = "";

	public String getDeviceName() {
		return deviceName;
	}

	private final static String NO_EXECUTION_ENVIRONMENT = DeviceWizardMessages.PluginContentPage_noEE;

	/**
	 * Constructor
	 * 
	 * @param pageName
	 * @param provider
	 * @param page
	 * @param data
	 */
	public PluginContentPage(String pageName, IProjectProvider provider, NewProjectCreationPage page, AbstractFieldData data) {
		super(pageName, provider, page, data);
		setTitle(DeviceWizardMessages.ContentPage_title);
		setDescription(DeviceWizardMessages.ContentPage_desc);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.pde.internal.ui.wizards.plugin.ContentPage#createControl(
	 * org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());

		createPluginPropertiesGroup(container);

		Dialog.applyDialogFont(container);
		setControl(container);
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(),
		// IHelpContextIds.NEW_PROJECT_REQUIRED_DATA);
	}

	/**
	 * Creates all of the plugin properties widgets
	 * 
	 * @param container
	 */
	private void createPluginPropertiesGroup(Composite container) {
		Group propertiesGroup = SWTFactory.createGroup(container, DeviceWizardMessages.ContentPage_pGroup, 3, 1, GridData.FILL_HORIZONTAL);

		Label label = new Label(propertiesGroup, SWT.NONE);
		label.setText(DeviceWizardMessages.PluginContentPage_appName);
		fApplicationName = createText(propertiesGroup, new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				if (!deviceName.equals(fApplicationName.getText())) {
					deviceName = fApplicationName.getText();
				}
				validatePage();
			}
		}, 2);

		label = new Label(propertiesGroup, SWT.NONE);
		label.setText(DeviceWizardMessages.ContentPage_pid);
		fIdText = createText(propertiesGroup, propertiesListener, 2);

		label = new Label(propertiesGroup, SWT.NONE);
		label.setText(DeviceWizardMessages.ContentPage_pversion);
		fVersionText = createText(propertiesGroup, propertiesListener, 2);

		label = new Label(propertiesGroup, SWT.NONE);
		label.setText(DeviceWizardMessages.ContentPage_pname);
		fNameText = createText(propertiesGroup, propertiesListener, 2);

		label = new Label(propertiesGroup, SWT.NONE);
		label.setText(DeviceWizardMessages.ContentPage_pprovider);
		fProviderCombo = createProviderCombo(propertiesGroup, propertiesListener, 2);

		createExecutionEnvironmentControls(propertiesGroup);
	}

	/**
	 * Creates all of the EE widgets
	 * 
	 * @param container
	 */
	private void createExecutionEnvironmentControls(Composite container) {
		// Create label
		fEELabel = new Label(container, SWT.NONE);
		fEELabel.setText(DeviceWizardMessages.NewProjectCreationPage_executionEnvironments_label);

		// Create combo
		fEEChoice = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fEEChoice.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Gather EEs
		IExecutionEnvironment[] exeEnvs = VMUtil.getExecutionEnvironments();
		TreeSet<String> availableEEs = new TreeSet<String>();
		for (int i = 0; i < exeEnvs.length; i++) {
			availableEEs.add(exeEnvs[i].getId());
		}
		availableEEs.add(NO_EXECUTION_ENVIRONMENT);

		// Set data
		fEEChoice.setItems(availableEEs.toArray(new String[availableEEs.size() - 1]));
		fEEChoice.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				validatePage();
			}
		});

		// Set default EE based on strict match to default VM
		IVMInstall defaultVM = JavaRuntime.getDefaultVMInstall();
		String[] EEChoices = fEEChoice.getItems();
		for (int i = 0; i < EEChoices.length; i++) {
			if (!EEChoices[i].equals(NO_EXECUTION_ENVIRONMENT)) {
				if (VMUtil.getExecutionEnvironment(EEChoices[i]).isStrictlyCompatible(defaultVM)) {
					fEEChoice.select(i);
					break;
				}
			}
		}

		// Create button
		fExeEnvButton = new Button(container, SWT.PUSH);
		fExeEnvButton.setLayoutData(new GridData());
		fExeEnvButton.setText(PDEUIMessages.NewProjectCreationPage_environmentsButton);
		fExeEnvButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				PreferencesUtil.createPreferenceDialogOn(getShell(), "org.eclipse.jdt.debug.ui.jreProfiles", //$NON-NLS-1$
						new String[] { "org.eclipse.jdt.debug.ui.jreProfiles" }, null).open(); //$NON-NLS-1$ 
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.pde.internal.ui.wizards.plugin.ContentPage#updateData()
	 */
	@Override
	public void updateData() {
		super.updateData();
		PluginFieldData data = (PluginFieldData) fData;
		data.setClassname("");
		data.setUIPlugin(false);
		data.setDoGenerateClass(false);
		data.setRCPApplicationPlugin(false);
		data.setEnableAPITooling(false);
		if (fEEChoice.isEnabled() && !fEEChoice.getText().equals(NO_EXECUTION_ENVIRONMENT)) {
			fData.setExecutionEnvironment(fEEChoice.getText().trim());
		} else {
			fData.setExecutionEnvironment(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.pde.internal.ui.wizards.plugin.ContentPage#setVisible(boolean
	 * )
	 */
	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			fMainPage.updateData();

			boolean allowEESelection = !fData.isSimple() && fData.hasBundleStructure();
			fEELabel.setEnabled(allowEESelection);
			fEEChoice.setEnabled(allowEESelection);
			fExeEnvButton.setEnabled(allowEESelection);
			fApplicationName.setText(deviceName);
		}
		super.setVisible(visible);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.pde.internal.ui.wizards.plugin.ContentPage#validatePage()
	 */
	@Override
	protected void validatePage() {
		String errorMessage = validateProperties();

		if (errorMessage == null) {
			String eeid = fEEChoice.getText();
			if (fEEChoice.isEnabled()) {
				IExecutionEnvironment ee = VMUtil.getExecutionEnvironment(eeid);
				if (ee != null && ee.getCompatibleVMs().length == 0) {
					errorMessage = PDEUIMessages.NewProjectCreationPage_invalidEE;
				}
			}
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}

	@Override
	protected String validateProperties() {
		String result = super.validateProperties();
		if (result == null) {
			if (deviceName == null || deviceName.isEmpty()) {
				result = "Specify device name";
			} else if (!Pattern.matches("\\w*", deviceName)) {
				result = "Device name may only contain following characters [A-Za-z0-9_]";
			}
		}
		return result;
	}
}
