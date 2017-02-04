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
package de.dfki.iui.mmds.io.html.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.io.gui.ButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.CanvasUpdate;
import de.dfki.iui.mmds.core.model.io.gui.CheckBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ColorPickerUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ComboboxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.DialogUpdate;
import de.dfki.iui.mmds.core.model.io.gui.FormUpdate;
import de.dfki.iui.mmds.core.model.io.gui.GridContainerUpdate;
import de.dfki.iui.mmds.core.model.io.gui.HBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.HtmlViewUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ImageButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ImageUpdate;
import de.dfki.iui.mmds.core.model.io.gui.LabelUpdate;
import de.dfki.iui.mmds.core.model.io.gui.LabeledTextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ListItemUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ListUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBarUpdate;
import de.dfki.iui.mmds.core.model.io.gui.RadioButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.RichTextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.SubmitButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.TabItemUpdate;
import de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ToggleButtonUpdate;
import de.dfki.iui.mmds.core.model.io.gui.UIElementUpdate;
import de.dfki.iui.mmds.core.model.io.gui.VBoxUpdate;
import de.dfki.iui.mmds.core.model.io.gui.util.GuiSwitch;

public class HtmlUpdateUtil extends GuiSwitch<List<JSONObject>> {
	/**
	 * 
	 * @return
	 */
	private static Logger getLogger() {
		return Logger.getLogger(HtmlFactory.class);
	}

	/**
	 * 
	 * @param update
	 * @return
	 */
	private JSONObject updateGeneric(UIElementUpdate update) {
		JSONObject updateInfo = new JSONObject();
		// check the element id
		if (update.getId() != null) {
			updateInfo.put("id", update.getId().getValue());
		} else {
			getLogger().error("No id property in UIElementUpdate object");
			return null;
		}
		// set stylenames
		if (update.getStyleNames() != null && update.getStyleNames().size() > 0) {
			String sClass = update.getStyleNames().get(0).getValue();
			for (int i = 1; i < update.getStyleNames().size(); ++i) {
				sClass += " " + update.getStyleNames().get(i).getValue();
			}
			updateInfo.put("class", sClass);
		}
		StringBuilder styles = new StringBuilder();
		if (update.getStyleProps() != null) {
			for (Map.Entry<String, BString> st : update.getStyleProps()) {
				styles.append(st.getKey() + ":" + st.getValue().toString() + ";");
			}
			updateInfo.put("style", styles.toString());
		}

		if (update.getEnabled() != null) {
			updateInfo.put("enabled", update.getEnabled().getValue().toString());
		}
		if (update.getTooltip() != null) {
			updateInfo.put("title", update.getTooltip().getValue());
		}
		return updateInfo;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseTextInputUpdate(TextInputUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getText() != null) {
			genUpdate.put("value", update.getText().getValue());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseColorPickerUpdate(ColorPickerUpdate object) {
		return caseTextInputUpdate(object);
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseRichTextInputUpdate(RichTextInputUpdate object) {
		return caseTextInputUpdate(object);
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseLabelUpdate(LabelUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getText() != null) {
			genUpdate.put("html", update.getText().getValue());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseListUpdate(ListUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		// TODO make multiple indices
		if (genUpdate != null) {
			if (update.getSelectedIndex() != null && update.getSelectedIndex().size() > 0) {
				genUpdate.put("selectedIndex", update.getSelectedIndex().get(0).getValue());
			}
			if (update.getAllowMultipleSelection() != null) {
				genUpdate.put("multiple", update.getAllowMultipleSelection().getValue().toString());
			}
			lUpdate.add(genUpdate);
		}
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseListItemUpdate(ListItemUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getLabel() != null) {
			genUpdate.put("html", update.getLabel().getValue());
		}
		if (update.getValue() != null) {
			genUpdate.put("value", update.getValue().getValue());
		}
		if (update.getSelected() != null) {
			genUpdate.put("selected", update.getSelected().getValue().toString());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseLabeledTextInputUpdate(LabeledTextInputUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = new JSONObject();
		genUpdate.put("id", update.getId().getValue() + "_label");
		if (update.getLabel() != null) {
			genUpdate.put("html", update.getLabel().getValue());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseButtonUpdate(ButtonUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getLabel() != null) {
			genUpdate.put("value", update.getLabel().getValue());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseSubmitButtonUpdate(SubmitButtonUpdate object) {
		return caseButtonUpdate(object);
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseCheckBoxUpdate(CheckBoxUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getChecked() != null) {
			genUpdate.put("checked", update.getChecked().getValue().toString());
		}
		if (update.getValue() != null) {
			genUpdate.put("value", update.getValue().getValue());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseRadioButtonUpdate(RadioButtonUpdate object) {
		return caseCheckBoxUpdate(object);
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseImageButtonUpdate(ImageButtonUpdate update) {
		List<JSONObject> genUpdate = caseButtonUpdate(update);
		if (update.getResource() != null && update.getResource().getLocation() != null) {
			JSONObject imgUpdate = new JSONObject();
			imgUpdate.put("id", update.getId().getValue() + "_img");

			String url = update.getResource().getLocation().getUrl();
			try {
				if (new URI(url).isAbsolute()) {
					imgUpdate.put("src", url);
				} else {
					imgUpdate.put("src", HtmlFactory.getResourceBaseURL() + url);
				}
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}

			genUpdate.add(imgUpdate);
		}
		return genUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseToggleButtonUpdate(ToggleButtonUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getIsSelected() != null) {
			genUpdate.put("checked", update.getIsSelected().getValue());
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseComboboxUpdate(ComboboxUpdate object) {
		return caseListUpdate(object);
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseGridContainerUpdate(GridContainerUpdate object) {
		JSONObject genUpdate = updateGeneric(object);
		List<JSONObject> lUpdate = new ArrayList<>();
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseCanvasUpdate(CanvasUpdate object) {
		JSONObject genUpdate = updateGeneric(object);
		List<JSONObject> lUpdate = new ArrayList<>();
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseFormUpdate(FormUpdate object) {
		JSONObject genUpdate = updateGeneric(object);
		List<JSONObject> lUpdate = new ArrayList<>();
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseHBoxUpdate(HBoxUpdate object) {
		JSONObject genUpdate = updateGeneric(object);
		List<JSONObject> lUpdate = new ArrayList<>();
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseVBoxUpdate(VBoxUpdate object) {
		JSONObject genUpdate = updateGeneric(object);
		List<JSONObject> lUpdate = new ArrayList<>();
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseHtmlViewUpdate(HtmlViewUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getContent() != null) {
			genUpdate.put("html", update.getContent().getValue());
		} else {
			if (update.getSource() != null) {
				genUpdate.put("src", update.getSource().getPath());
			}
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseTabItemUpdate(TabItemUpdate object) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(object);
		if (object.getTitle() != null) {
			JSONObject titleUpdate = new JSONObject();
			titleUpdate.put("id", object.getId().getValue() + "_title");
			titleUpdate.put("html", object.getTitle().getValue());
			lUpdate.add(titleUpdate);
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseImageUpdate(ImageUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getResource() != null && update.getResource().getLocation() != null) {
			String url = update.getResource().getLocation().getUrl();
			try {
				if (new URI(url).isAbsolute()) {
					genUpdate.put("src", url);
				} else {
					genUpdate.put("src", HtmlFactory.getResourceBaseURL() + url);
				}
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseDialogUpdate(DialogUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		if (update.getText() != null) {
			genUpdate.put("html", update.getText().getValue());
		}
		if (update.getVisible().getValue()) {
			JSONObject setVisible = new JSONObject();
			setVisible.put("script", "$('#" + update.getId() + "').dialog('open');");
			lUpdate.add(setVisible);
		} else {
			JSONObject setVisible = new JSONObject();
			setVisible.put("script", "$('#" + update.getId() + "').dialog('close');");
			lUpdate.add(setVisible);
		}
		lUpdate.add(genUpdate);
		return lUpdate;
	}

	/**
	 * 
	 */
	@Override
	public List<JSONObject> caseProgressBarUpdate(ProgressBarUpdate update) {
		List<JSONObject> lUpdate = new ArrayList<>();
		JSONObject genUpdate = updateGeneric(update);
		lUpdate.add(genUpdate);
		if (update.getPercentage() != null) {
			JSONObject changeVal = new JSONObject();
			changeVal.put("script", "$('#" + update.getId() + "').progressbar(\"option\", \"value\", " + update.getPercentage().getValue() + ");");
			lUpdate.add(changeVal);
		}
		if (update.getMax() != null) {
			JSONObject changeMax = new JSONObject();
			changeMax.put("script", "$('#" + update.getId() + "').progressbar(\"option\", \"max\", " + update.getMax().getValue() + ");");
			lUpdate.add(changeMax);
		}

		return lUpdate;
	}
}
