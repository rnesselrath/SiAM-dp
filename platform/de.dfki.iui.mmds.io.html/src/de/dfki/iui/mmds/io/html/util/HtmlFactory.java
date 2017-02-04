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

import java.net.Inet4Address;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.base.Picture;
import de.dfki.iui.mmds.core.model.io.gui.AbsoluteLayout;
import de.dfki.iui.mmds.core.model.io.gui.Alignment;
import de.dfki.iui.mmds.core.model.io.gui.Button;
import de.dfki.iui.mmds.core.model.io.gui.ButtonBar;
import de.dfki.iui.mmds.core.model.io.gui.CalendarView;
import de.dfki.iui.mmds.core.model.io.gui.Canvas;
import de.dfki.iui.mmds.core.model.io.gui.CheckBox;
import de.dfki.iui.mmds.core.model.io.gui.ColorPicker;
import de.dfki.iui.mmds.core.model.io.gui.ComboBox;
import de.dfki.iui.mmds.core.model.io.gui.Container;
import de.dfki.iui.mmds.core.model.io.gui.CustomDialog;
import de.dfki.iui.mmds.core.model.io.gui.DialogBox;
import de.dfki.iui.mmds.core.model.io.gui.DisplayContextView;
import de.dfki.iui.mmds.core.model.io.gui.FileChooser;
import de.dfki.iui.mmds.core.model.io.gui.Form;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GridContainer;
import de.dfki.iui.mmds.core.model.io.gui.GridHeaderItem;
import de.dfki.iui.mmds.core.model.io.gui.GridItem;
import de.dfki.iui.mmds.core.model.io.gui.GridRow;
import de.dfki.iui.mmds.core.model.io.gui.HBox;
import de.dfki.iui.mmds.core.model.io.gui.HTMLView;
import de.dfki.iui.mmds.core.model.io.gui.Image;
import de.dfki.iui.mmds.core.model.io.gui.ImageButton;
import de.dfki.iui.mmds.core.model.io.gui.ImageGallery;
import de.dfki.iui.mmds.core.model.io.gui.Label;
import de.dfki.iui.mmds.core.model.io.gui.LabelUpdate;
import de.dfki.iui.mmds.core.model.io.gui.LabeledTextInput;
import de.dfki.iui.mmds.core.model.io.gui.Layout;
import de.dfki.iui.mmds.core.model.io.gui.List;
import de.dfki.iui.mmds.core.model.io.gui.ListItem;
import de.dfki.iui.mmds.core.model.io.gui.MediaPlayer;
import de.dfki.iui.mmds.core.model.io.gui.NumericStepper;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBar;
import de.dfki.iui.mmds.core.model.io.gui.RadioButton;
import de.dfki.iui.mmds.core.model.io.gui.RichTextInput;
import de.dfki.iui.mmds.core.model.io.gui.SoftKeyboard;
import de.dfki.iui.mmds.core.model.io.gui.SubmitButton;
import de.dfki.iui.mmds.core.model.io.gui.SupportedEvent;
import de.dfki.iui.mmds.core.model.io.gui.TabItem;
import de.dfki.iui.mmds.core.model.io.gui.TabView;
import de.dfki.iui.mmds.core.model.io.gui.TextInput;
import de.dfki.iui.mmds.core.model.io.gui.TextInputUpdate;
import de.dfki.iui.mmds.core.model.io.gui.ToggleButton;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.io.gui.VAlignment;
import de.dfki.iui.mmds.core.model.io.gui.VBox;
import de.dfki.iui.mmds.core.model.io.gui.util.GuiSwitch;
import de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent;
import de.dfki.iui.mmds.io.html.containers.ButtonBarHelper;
import de.dfki.iui.mmds.io.html.containers.DivContainerHelper;
import de.dfki.iui.mmds.io.html.containers.FormContainerHelper;
import de.dfki.iui.mmds.io.html.containers.GridContainerHelper;
import de.dfki.iui.mmds.io.html.containers.HBoxContainerHelper;
import de.dfki.iui.mmds.io.html.containers.TabViewHelper;
import de.dfki.iui.mmds.io.html.containers.VBoxContainerHelper;
import uk.co.wireweb.web.html.Tag;
import uk.co.wireweb.web.html.html5.FormEventsTag;
import uk.co.wireweb.web.html.html5.StandardAttributesTag;
import uk.co.wireweb.web.html.html5.tag.Audio;
import uk.co.wireweb.web.html.html5.tag.Body;
import uk.co.wireweb.web.html.html5.tag.Div;
import uk.co.wireweb.web.html.html5.tag.Head;
import uk.co.wireweb.web.html.html5.tag.Html;
import uk.co.wireweb.web.html.html5.tag.Iframe;
import uk.co.wireweb.web.html.html5.tag.Img;
import uk.co.wireweb.web.html.html5.tag.Input;
import uk.co.wireweb.web.html.html5.tag.Link;
import uk.co.wireweb.web.html.html5.tag.Option;
import uk.co.wireweb.web.html.html5.tag.Script;
import uk.co.wireweb.web.html.html5.tag.Select;
import uk.co.wireweb.web.html.html5.tag.Source;
import uk.co.wireweb.web.html.html5.tag.Span;
import uk.co.wireweb.web.html.html5.tag.Table;
import uk.co.wireweb.web.html.html5.tag.Td;
import uk.co.wireweb.web.html.html5.tag.Textarea;
import uk.co.wireweb.web.html.html5.tag.Th;
import uk.co.wireweb.web.html.html5.tag.Tr;
import uk.co.wireweb.web.html.html5.tag.Video;

/**
 * Factory class to create HTML5 tags
 * 
 * @author kirill
 * 
 */
public class HtmlFactory extends GuiSwitch<Tag> {
	/**
	 * 
	 * @return
	 */
	private static Logger getLogger() {
		return Logger.getLogger(HtmlFactory.class);
	}

	/**
	 * 
	 * @param tag
	 * @param element
	 */
	public static void setUpTag(StandardAttributesTag<?> tag, UIElement element) {
		if (element.getId() != null && !element.getId().isEmpty()) {
			tag.id(element.getId().getValue());
			tag.attribute("name", element.getId().getValue());
		}
		if (element.getStyleNames().size() > 0) {
			setUpStyle(tag, element.getStyleNames());
		}
		if (element.getTooltip() != null) {
			makeTooltip(element, tag);
		}
		if (element.getLayout() != null) {
			setUpLayout(tag, element.getLayout());
		}
		if (element.getX() != null && element.getY() != null) {
			StyleBuilder.addPaddings(tag, element);
		}
	}

	/**
	 * 
	 * @param element
	 * @param tag
	 */
	private static void makeTooltip(UIElement element, StandardAttributesTag<?> tag) {
		if (element.getTooltip() != null) {
			tag.attribute("title", element.getTooltip().getValue());
		}
	}

	/**
	 * 
	 * @param element
	 * @param style
	 */
	private static void setUpStyle(StandardAttributesTag<?> tag, EList<BString> styles) {
		StyleBuilder bldr = new StyleBuilder();
		for (BString style : styles) {
			bldr.addStyleName(style.getValue());
		}
		bldr.fillTagClasses(tag);
	}

	/**
	 * 
	 * @param tag
	 * @param layout
	 */
	private static void setUpLayout(StandardAttributesTag<?> tag, Layout layout) {
		StyleBuilder bldr = new StyleBuilder();
		if (layout instanceof AbsoluteLayout) {
			bldr.addStyle(CSS.DISPLAY, "block");
			bldr.addStyle(CSS.HEIGHT, Integer.toString(layout.getHeight()));
			bldr.addStyle(CSS.WIDTH, Integer.toString(layout.getWidth()));
			bldr.addStyle(CSS.PADDING_LEFT, Integer.toString(((AbsoluteLayout) layout).getY()));
			bldr.addStyle(CSS.PADDING_TOP, Integer.toString(((AbsoluteLayout) layout).getX()));
		}
		bldr.fillTag(tag);
	}

	/**
	 * 
	 * @param element
	 */
	@Override
	public Tag caseForm(Form element) {
		FormContainerHelper helper = new FormContainerHelper(element);
		return helper.createFormContainer();
	}

	/**
	 * 
	 * @param element
	 */
	@Override
	public Tag caseTabView(TabView element) {
		TabViewHelper h = new TabViewHelper(element);
		return h.createTabView();
	}

	@Override
	public Tag caseTabItem(TabItem object) {
		Div item = new Div();
		setUpTag(item, object);
		if (object.getElement() != null) {
			item.appendToBody(doSwitch(object.getElement()));
		}
		return item;
	}

	/**
	 * 
	 * @param element
	 */
	@Override
	public Tag caseCanvas(Canvas element) {
		StandardAttributesTag<?> canvas = makeCanvas(element);
		setUpTag(canvas, element);
		EList<UIElement> items = element.getElements();
		for (UIElement item : items) {
			if (item != null) {
				canvas.appendToBody(doSwitch(item));
			}
		}
		return canvas;
	}

	/**
	 * 
	 * @param element
	 */
	@Override
	public Tag caseGridContainer(GridContainer element) {
		GridContainerHelper helper = new GridContainerHelper(element);
		return helper.createContainer();
	}

	/**
	 * 
	 * @param element
	 */
	@Override
	public Tag caseVBox(VBox element) {
		VBoxContainerHelper helper = new VBoxContainerHelper(element);
		return helper.createVBoxContainer();
	}

	/**
	 * Create container element depending on type
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseHBox(HBox element) {
		HBoxContainerHelper helper = new HBoxContainerHelper(element);
		return helper.createHBoxContainer();
	}

	/**
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseDiv(de.dfki.iui.mmds.core.model.io.gui.Div element) {
		Tag<?> result = new DivContainerHelper(element).createDivContainer();
		if (element.getContent() != null) {
			result.appendToBody(element.getContent().getValue());
		}
		return result;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseButton(Button element) {
		FormEventsTag<?> button = makeButton(element);
		setUpTag(button, element);
		return button;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseSubmitButton(SubmitButton element) {
		FormEventsTag<?> button = makeButton(element);
		setUpTag(button, element);
		return button;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseRadioButton(RadioButton element) {
		return makeRadioButton(element);
	}

	/**
	 * 
	 */
	@Override
	public Tag caseToggleButton(ToggleButton object) {
		return makeToggleButton(object);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseImageButton(ImageButton element) {
		if (element == null)
			return null;
		uk.co.wireweb.web.html.html5.tag.Button button = new uk.co.wireweb.web.html.html5.tag.Button();
		setUpTag(button, element);
		if (element.getLabel() != null) {
			button.value(element.getLabel().getValue());
		}
		button.attribute("class", DomEvents.ONCLICK);
		addDomEventListeners(button, element);
		if (element.getResource() != null) {
			Img image = new Img();
			image.id(element.getId().getValue() + "_img");
			setUpTag(image, element);
			if (element.getResource().getLocation() == null) {
				getLogger().warn(String.format("No digital resource location defined for Image %s in Container %s with id %s.", element.getId(), element.eContainer().eClass().getName(),
						((UIElement) element.eContainer()).getId()));
			} else {
				String url = element.getResource().getLocation().getUrl();
				try {
					if (new URI(url).isAbsolute()) {
						image.src(url);
					} else {
						image.src(getResourceBaseURL() + url);
					}
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			button.appendToBody(image);
		}
		return button;
	}

	/**
	 * 
	 */
	@Override
	public Tag caseButtonBar(ButtonBar object) {
		ButtonBarHelper h = new ButtonBarHelper(object);
		return h.createButtonBar();
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseTextInput(TextInput element) {
		FormEventsTag<?> text;
		if (element.getMultiLine().getValue()) {
			text = makeTextArea(element);
		} else {
			text = makeTextInput(element);
		}
		setUpTag(text, element);
		return text;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseLabeledTextInput(LabeledTextInput element) {
		StandardAttributesTag<?> text = makeLabelTextInput(element);
		return text;
	}

	/**
	 * 
	 * @param object
	 * @return
	 */
	@Override
	public Tag caseRichTextInput(RichTextInput object) {
		Textarea text = new Textarea();
		setUpTag(text, object);
		if (object.getText() != null) {
			text.appendToBody(object.getText().getValue());
		}
		Div vWrapper = new Div();
		Script rScript = new Script();
		rScript.src(getJSBaseURL() + "rich_text/jquery-te-1.4.0.min.js");
		vWrapper.appendToBody(rScript);
		uk.co.wireweb.web.html.html5.tag.Style vStyle = new uk.co.wireweb.web.html.html5.tag.Style();
		vStyle.appendToBody("@import url('" + getJSBaseURL() + "rich_text/jquery-te-1.4.0.css')");
		vWrapper.appendToBody(vStyle);
		vWrapper.appendToBody(text);
		Script rInit = new Script();
		rInit.appendToBody("$(function() {$(\"#" + object.getId().getValue() + "\").jqte();});");
		vWrapper.appendToBody(rInit);
		return vWrapper;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseList(List element) {
		StandardAttributesTag<?> list = makeList(element, false);
		if (element instanceof ComboBox) {
			list = makeList(element, true);
		}
		EList<ListItem> items = element.getItem();
		for (ListItem item : items) {
			if (item != null) {
				list.appendToBody(doSwitch(item));
			}
		}
		setUpTag(list, element);
		return list;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseComboBox(ComboBox element) {
		StandardAttributesTag<?> list = makeList(element, false);
		if (element instanceof ComboBox) {
			list = makeList(element, true);
		}
		EList<ListItem> items = element.getItem();
		for (ListItem item : items) {
			if (item != null) {
				list.appendToBody(doSwitch(item));
			}
		}
		setUpTag(list, element);
		return list;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseListItem(ListItem element) {
		StandardAttributesTag<?> listOpt = makeListOption(element);
		setUpTag(listOpt, element);
		return listOpt;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseCheckBox(CheckBox element) {
		FormEventsTag<?> chkbox = makeCheckbox(element);
		setUpTag(chkbox, element);
		return chkbox;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseLabel(Label element) {
		StandardAttributesTag<?> lbl = makeLabel(element);
		setUpTag(lbl, element);
		return lbl;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseGridRow(GridRow element) {
		return makeTableRow(element);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseGridItem(GridItem element) {
		StandardAttributesTag<?> res = makeTableCell(element, false);
		if (!element.getElements().isEmpty()) {
			Tag<?> contents = doSwitch(element.getElements().get(0));	// only 1 element allowed in the GridItem
			if (contents != null) {
				res.appendToBody(contents);
			}
		}
		setUpTag(res, element);
		return res;
	}

	@Override
	public Tag caseGridHeaderItem(GridHeaderItem element) {
		return makeTableCell(element, true);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseImage(Image element) {
		StandardAttributesTag<?> img = makeImage(element);
		return img;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseCalendarView(CalendarView element) {
		Tag<?> tag = null;
		StandardAttributesTag<?> calendar = makeCalendarView(element);
		setUpTag(calendar, element);
		return calendar;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseNumericStepper(NumericStepper element) {
		FormEventsTag<?> stepper = makeNumericStepper(element);
		return stepper;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseHTMLView(HTMLView element) {
		StandardAttributesTag<?> frame = makeHtmlView(element);
		return frame;
	}



	@Override
	public Tag caseDisplayContextView(DisplayContextView element) {
		StandardAttributesTag<?> frame = makeDisplayContextView(element);
		return frame;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseDialogBox(DialogBox element) {
		return makeDialogBox(element);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseCustomDialog(CustomDialog element) {
		return makeCustomDialogBox(element);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseFileChooser(FileChooser element) {
		Input in = new Input();
		setUpTag(in, element);
		in.type("file");
		return in;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseMediaPlayer(MediaPlayer element) {
		Tag<?> tag = null;
		if (element.getMedia() instanceof de.dfki.iui.mmds.core.model.base.Video) {
			tag = makeVideoPlayer(element);
		}
		if (element.getMedia() instanceof de.dfki.iui.mmds.core.model.base.Audio) {
			tag = makeAudioPlayer(element);
		}
		return tag;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseImageGallery(ImageGallery element) {
		return makeImageGallery(element);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Tag caseColorPicker(ColorPicker element) {
		Input in = new Input();
		Span wrapper = new Span();
		String inputId = element.getId().getValue() + "_color";
		in.id(inputId);
		in.type("color");
		Input hiddenValue = new Input();
		hiddenValue.type("hidden");
		setUpTag(hiddenValue, element);
		in.onchange("javascript:$('#" + element.getId().getValue() + "').val($('#" + inputId + "').val());");
		wrapper.appendToBody(in);
		wrapper.appendToBody(hiddenValue);
		return wrapper;
	}

	@Override
	public Tag caseProgressBar(ProgressBar object) {
		Div pDiv = new Div();
		if (object.getId() == null || object.getId().getValue().isEmpty()) {
			getLogger().error("No element id provided for a ProgressBar");
			return pDiv;
		}

		setUpTag(pDiv, object);
		Script pInit = new Script();
		JSONObject props = new JSONObject();

		if (object.getDeterminate().getValue()) {
			int value = 0;
			if (object.getPercentage().getValue() != null) {
				value = object.getPercentage().getValue();
			}
			props.put("value", value);
			int max = 100;
			if (object.getMax() != null) {
				max = object.getMax().getValue();
			}
			props.put("max", max);
		} else {
			props.put("value", false);
		}

		pInit.appendToBody("$(\"#" + object.getId().getValue() + "\" ).progressbar(" + props.toString() + ");");

		pDiv.appendToBody(pInit);
		return pDiv;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static Tag<?> makeImageGallery(ImageGallery element) {
		Div wrapper = new Div();
		Script galScript = new Script();
		galScript.src(getJSBaseURL() + "galleria/galleria.js");
		Div galleriaWrapper = new Div();
		String id = "galleria";
		if (element.getId() != null && !element.getId().isEmpty()) {
			id = id + "_" + element.getId();
		}
		galleriaWrapper.id(id);
		galleriaWrapper.attribute("class", "galleria");
		Script initGal = new Script();
		initGal.appendToBody("$(function() {Galleria.loadTheme('" + getJSBaseURL() + "galleria/themes/classic/galleria.classic.js" + "');Galleria.run('#" + id + "');});");
		for (Picture img : element.getImage()) {
			Link a = new Link();
			a.href(img.getLocation().getUrl());
			Img image = new Img();
			image.src(img.getLocation().getUrl());
			a.appendToBody(image);
			galleriaWrapper.appendToBody(a);
		}
		wrapper.appendToBody(galScript);
		wrapper.appendToBody(initGal);
		wrapper.appendToBody(galleriaWrapper);
		return wrapper;
	}

	private static Tag<?> makeAudioPlayer(MediaPlayer player) {
		Div vWrapper = new Div();
		if (!player.getVisible().getValue()) {
			vWrapper.style("display:none");
		}
		Audio audio = new Audio();
		audio.id(player.getId().getValue());
		audio.attribute("class", "video-js vjs-default-skin");
		audio.preload("auto");
		if (player.getShowControls().getValue()) {
			audio.controls("");
		}
		if (player.getAutoPlay().getValue()) {
			audio.autoplay("");
		}
		Source src = new Source();
		src.src(player.getMedia().getLocation().getUrl());
		src.type(player.getMedia().getMimeType());
		audio.appendToBody(src);
		Script videoJs = new Script();
		videoJs.src(getJSBaseURL() + "video-js/video.js");
		vWrapper.appendToBody(videoJs);
		uk.co.wireweb.web.html.html5.tag.Style vStyle = new uk.co.wireweb.web.html.html5.tag.Style();
		vStyle.appendToBody("@import url('" + StringConsts.getMmdsPlatformPath() + "js/video-js/video-js.css')");
		vWrapper.appendToBody(vStyle);
		Script videoConf = new Script();
		videoConf.appendToBody("$(function() {videojs(\"" + player.getId().getValue() + "\", {}, function(){});});");
		vWrapper.appendToBody(videoConf);
		vWrapper.appendToBody(audio);
		return vWrapper;
	}

	private static StandardAttributesTag<?> makeVideoPlayer(MediaPlayer player) {
		Div vWrapper = new Div();
		if (!player.getVisible().getValue()) {
			vWrapper.style("display:none");
		}
		Video video = new Video();
		video.id(player.getId().getValue());
		video.attribute("class", "video-js vjs-default-skin");
		video.attribute("width", player.getWidth().toString());
		video.attribute("height", player.getHeight().toString());
		video.preload("auto");
		if (player.getShowControls().getValue()) {
			video.controls("");
		}
		if (player.getAutoPlay().getValue()) {
			video.autoplay("");
		}
		Source src = new Source();
		src.src(player.getMedia().getLocation().getUrl());
		src.type(player.getMedia().getMimeType());
		video.appendToBody(src);
		Script videoJs = new Script();
		videoJs.src(getJSBaseURL() + "video-js/video.js");
		vWrapper.appendToBody(videoJs);
		uk.co.wireweb.web.html.html5.tag.Style vStyle = new uk.co.wireweb.web.html.html5.tag.Style();
		vStyle.appendToBody("@import url('" + StringConsts.getMmdsPlatformPath() + "js/video-js/video-js.css')");
		vWrapper.appendToBody(vStyle);
		Script videoConf = new Script();
		videoConf.appendToBody("$(function() {videojs(\"" + player.getId().getValue() + "\", {}, function(){});});");
		vWrapper.appendToBody(videoConf);
		vWrapper.appendToBody(video);
		return vWrapper;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeCustomDialogBox(CustomDialog element) {
		Div div = new Div();
		setUpTag(div, element);
		Script sc = new Script();
		String id = element.getId().getValue();
		JSONObject props = new JSONObject();
		String modal = "true";
		props.put("modal", modal);
		props.put("autoOpen", element.getVisible().getValue());
		sc.appendToBody("$(function() {$( '#" + id + "' ).dialog(" + props.toString() + ");});");
		div.appendToBody(sc);
		if (element.getElement() != null) {
			div.appendToBody(new HtmlFactory().doSwitch(element.getElement()));
		}
		if (element.getTitle() != null) {
			div.attribute("title", element.getTitle().getValue());
		}
		return div;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeDialogBox(DialogBox element) {
		Div div = new Div();
		setUpTag(div, element);
		Script sc = new Script();
		String id = element.getId().getValue();
		JSONObject props = new JSONObject();
		String modal = element.getModal().getValue() ? "true" : "false";
		props.put("modal", modal);
		props.put("autoOpen", element.getVisible().getValue());
		org.json.JSONObject buttons = new org.json.JSONObject();
		switch (element.getButtons()) {
		case OK_ONLY:
			buttons.put("OK", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"ok\");}"));
			break;
		case OK_CANCEL:
			buttons.put("OK", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"ok\");}"));
			buttons.put("Cancel", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"cancel\");}"));
			break;
		case ABORT_RETRY_IGNORE:
			buttons.put("Abort", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"abort\");}"));
			buttons.put("Retry", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"retry\");}"));
			buttons.put("Ignore", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"ignore\");}"));
			break;
		case YES_NO_CANCEL:
			buttons.put("Yes", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"yes\");}"));
			buttons.put("No", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"no\");}"));
			buttons.put("Cancel", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"cancel\");}"));
			break;
		case YES_NO:
			buttons.put("Yes", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"yes\");}"));
			buttons.put("No", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"no\");}"));
			break;
		case RETRY_CANCEL:
			buttons.put("Retry", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"retry\");}"));
			buttons.put("Cancel", new JSONFunction("function() {userInterface.handleDialogEvent(this, \"cancel\");}"));
			break;
		default:
			break;
		}
		props.put("buttons", buttons);

		sc.appendToBody("$(function() {$( '#" + id + "' ).dialog(" + props.toString() + ");});");
		div.appendToBody(sc);
		if (element.getText() != null) {
			div.appendToBody(element.getText().getValue());
		}
		if (element.getTitle() != null) {
			div.attribute("title", element.getTitle().getValue());
		}
		return div;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeFileInput(DialogBox element) {
		Input file = new Input();
		file.type("file");
		file.attribute("name", element.getId().getValue());
		return file;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeHtmlView(HTMLView element) {
		if (element.getSource() != null) {
			Iframe frame = new Iframe();
			setUpTag(frame, element);
			frame.src(element.getSource().toExternalForm());
			return frame;
		}
		Div d = new Div();
		setUpTag(d, element);
		if (element.getContent() != null) {
			d.appendToBody(element.getContent().getValue());
		}
		return d;
	}

	private StandardAttributesTag<?> makeDisplayContextView(DisplayContextView element) {
		String displayContextName = element.getDisplayContextName();
		String port = System.getProperty("org.osgi.service.http.port");
		try {
			String ip = Inet4Address.getLocalHost().getHostAddress();
			// TODO fixe uri durch zentrale configuration registry vermeiden
			String uri = String.format("http://%s:%s/mmds/html/gui/%s", ip, port, displayContextName);
			Iframe frame = new Iframe();
			setUpTag(frame, element);
			frame.src(uri);
			return frame;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return new Div();
	}


	/**
	 * 
	 * @param element
	 * @return
	 */
	public static Tag<?> makeForm(Form element) {
		uk.co.wireweb.web.html.html5.tag.Form f = new uk.co.wireweb.web.html.html5.tag.Form();
		setUpTag(f, element);
		return f;
	}

	/**
	 * 
	 * @param tag
	 * @param element
	 */
	public static void addDomEventListeners(Tag<?> tag, UIElement element) {
		StyleBuilder builder = new StyleBuilder();
		for (SupportedEvent event : element.getSupportedEvents()) {
			Class<?> instanceClass = event.getEventType().getInstanceClass();
			if (instanceClass == ClickEvent.class) {
				builder.addStyleName(DomEvents.ONCLICK);
			}
			if (instanceClass == DblClickEvent.class) {
				builder.addStyleName(DomEvents.ONDBLCLICK);
			}
			if (instanceClass == MouseDownEvent.class) {
				builder.addStyleName(DomEvents.ONMOUSEDOWN);
			}
			if (instanceClass == MouseMoveEvent.class) {
				builder.addStyleName(DomEvents.ONMOUSEMOVE);
			}
			if (instanceClass == MouseOverEvent.class) {
				builder.addStyleName(DomEvents.ONMOUSEOVER);
			}
			if (instanceClass == MouseOutEvent.class) {
				builder.addStyleName(DomEvents.ONMOUSEOUT);
			}
			if (instanceClass == MouseUpEvent.class) {
				builder.addStyleName(DomEvents.ONMOUSEUP);
			}
			if (instanceClass == KeyPressEvent.class) {
				builder.addStyleName(DomEvents.ONKEYPRESS);
			}
			if (instanceClass == KeyDownEvent.class) {
				builder.addStyleName(DomEvents.ONKEYDOWN);
			}
			if (instanceClass == KeyUpEvent.class) {
				builder.addStyleName(DomEvents.ONKEYUP);
			}
			if (instanceClass == ChangeEvent.class) {
				builder.addStyleName(DomEvents.ONCHANGE);
			}
			if (instanceClass == BlurEvent.class) {
				builder.addStyleName(DomEvents.ONBLUR);
			}
			if (instanceClass == FocusEvent.class) {
				builder.addStyleName(DomEvents.ONBLUR);
			}
			if (instanceClass == SelectTextEvent.class) {
				builder.addStyleName(DomEvents.ONSELECT);
			}
		}
		builder.fillTagClasses(tag);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeRadioButton(RadioButton element) {
		Input radio = new Input();
		radio.value(element.getValue().getValue());
		radio.type("radio");
		radio.name(element.getId().getValue());
		addDomEventListeners(radio, element);
		if (element.getLabel() != null && !element.getLabel().isEmpty()) {
			uk.co.wireweb.web.html.html5.tag.Label wrapper = new uk.co.wireweb.web.html.html5.tag.Label();
			wrapper.attribute("class", element.getId().getValue());
			wrapper.appendToBody(radio);
			wrapper.appendToBody(element.getLabel().getValue() == null ? "" : element.getLabel().getValue());
			return wrapper;
		}
		return radio;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static FormEventsTag<?> makeNumericStepper(NumericStepper element) {
		Input text = new Input();
		text.type("text");
		setUpTag(text, element);
		Script script = new Script();
		script.appendToBody("$('#" + element.getId() + "').spinner({ min: " + element.getMinValue() + ", max: " + element.getMaxValue() + " });");
		text.appendToBody(script);
		return text;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeCalendarView(CalendarView element) {
		Div cv = new Div();
		Script script = new Script();
		if (element.getSupportedEvents().size() > 0) {
			script.appendToBody("$(\"div#" + element.getId() + "\").datepicker();");
		} else {
			script.appendToBody("$(\"div#" + element.getId() + "\").datepicker(" + "{ onSelect: function(dateText, inst) { $('input#" + element.getId() + "').val(dateText);}});");
		}
		Input hidden = new Input();
		hidden.type("hidden");
		hidden.id(element.getId().getValue());
		hidden.name(element.getId().getValue());
		cv.appendToBody(hidden);
		cv.appendToBody(script);
		return cv;
	}

	/**
	 * 
	 * @param element
	 */
	private static Input makeTextInput(TextInput element) {
		Input text = new Input();
		if (element.getSoftKeyboard() != null) {
			String ks = makeKeyBoard(element.getSoftKeyboard(), element);
			text.appendToBody(ks);
		}
		addDomEventListeners(text, element);
		text.type("text");
		return text;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static FormEventsTag<?> makeTextArea(TextInput element) {
		Textarea txt = new Textarea();
		if (element.getSoftKeyboard() != null) {
			String ks = makeKeyBoard(element.getSoftKeyboard(), element);
			txt.appendToBody(ks);
		}
		addDomEventListeners(txt, element);
		return txt;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeLabelTextInput(LabeledTextInput element) {
		Input text = new Input();
		if (element.getSoftKeyboard() != null) {
			String ks = makeKeyBoard(element.getSoftKeyboard(), element);
			text.appendToBody(ks);
		}
		addDomEventListeners(text, element);
		text.type("text");
		setUpTag(text, element);

		uk.co.wireweb.web.html.html5.tag.Label lbl = new uk.co.wireweb.web.html.html5.tag.Label();
		lbl.id(element.getId().toString() + "_label");
		lbl.body(element.getText().getValue());

		Span sp = new Span();
		sp.appendToBody(lbl);
		sp.appendToBody(text);

		return sp;
	}

	/**
	 * 
	 * @param keyBoard
	 * @return
	 */
	private static String makeKeyBoard(SoftKeyboard keyBoard, TextInput parent) {
		Script script = new Script();
		uk.co.wireweb.web.html.html5.tag.Style kStyle = new uk.co.wireweb.web.html.html5.tag.Style();
		kStyle.appendToBody("@import url('" + StringConsts.getMmdsPlatformPath() + "css/keyboard.css')");
		Script jsKeyboard = new Script();
		jsKeyboard.src(getJSBaseURL() + "keyboard.js");
		script.appendToBody("var availableTags = [];$('#" + parent.getId() + "').keyboard({ layout: 'qwerty' }).autocomplete({" + "source: availableTags});");
		return kStyle.toString() + jsKeyboard.toString() + script.toString();
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeListOption(ListItem element) {
		Option opt = new Option();
		if (element.getLabel() != null) {
			opt.appendToBody(element.getLabel().getValue());
		}
		if (element.getValue() != null && !element.getValue().isEmpty()) {
			opt.value(element.getValue().getValue());
		} else {
			opt.value(element.getLabel().getValue());
		}
		if (element.getSelected() != null && element.getSelected().getValue()) {
			opt.selected("true");
		}
		addDomEventListeners(opt, element);
		return opt;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeList(List element, boolean isCombo) {
		Select select = new Select();
		select.attribute("size", "6");
		if (isCombo) {
			select.attribute("size", "1");
		}
		if (element.getAllowMultipleSelection() != null && element.getAllowMultipleSelection().getValue()) {
			select.attribute("multiple", "true");
		}
		if (element.getSelectedIndex().size() > 0) {
			select.attribute("selectedIndex", element.getSelectedIndex().get(0).getValue().toString());
		}

		addDomEventListeners(select, element);
		return select;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static StandardAttributesTag<?> makeImage(Image element) {
		Img image = new Img();
		setUpTag(image, element);
		if (element.getResource() == null || element.getResource().getLocation() == null) {
			EObject container = element.eContainer();
			while (container != null && !(container instanceof UIElement)) {
				container = container.eContainer();
			}
			if (container != null) {
				Logger.getLogger(HtmlFactory.class).warn(String.format("No digital resource location defined for Image %s in Container %s with id %s.", element.getId(),
						element.eContainer().eClass().getName(), ((UIElement) element).getId()));
			} else {
				Logger.getLogger(HtmlFactory.class).warn(String.format("No digital resource location defined for Image %s ", element.getId()));
			}
		} else {
			String url = element.getResource().getLocation().getUrl();
			try {
				if (new URI(url).isAbsolute()) {
					image.src(url);
				} else {
					image.src(getResourceBaseURL() + url);
				}
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		addDomEventListeners(image, element);
		return image;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static StandardAttributesTag<?> makeTableCell(GridItem element, boolean header) {
		StandardAttributesTag<?> cell;
		if (header) {
			cell = new Th();
		} else {
			cell = new Td();
		}
		if (element != null) {
			if (element.getId() != null) {
				cell.id(element.getId().getValue());
			}
			cell.attribute(CSS.ALIGN, getAlignment(element.getAlignment()));
			cell.attribute(CSS.VALIGN, getVAlignment(element.getValignment()));
			if (element.getColumnSpan() != null && element.getColumnSpan().getValue() > 0) {
				cell.attribute("colspan", String.valueOf(element.getColumnSpan()));
			}
			if (element.getRowSpan() != null && element.getRowSpan().getValue() > 0) {
				cell.attribute("rowspan", String.valueOf(element.getRowSpan()));
			}
			if (element.getWidth() != null && element.getWidth().getValue() > 0) {
				cell.attribute("width", String.valueOf(element.getWidth()));
			}
		}
		if (element.getStyleNames().size() > 0) {
			setUpStyle(cell, element.getStyleNames());
		}
		return cell;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static StandardAttributesTag<?> makeTableRow(GridRow element) {
		StandardAttributesTag<?> tr = new Tr();
		if (element != null) {
			if (element.getId() != null) {
				tr.id(element.getId().getValue());
			}
			if (element.getHeight() != null && element.getHeight().getValue() > 0) {
				if (element.getIsPercentage() != null && element.getIsPercentage().getValue()) {
					tr.attribute("height", String.valueOf(Math.ceil(element.getHeight().getValue())) + "%");
				} else {
					tr.attribute("height", String.valueOf(Math.ceil(element.getHeight().getValue())) + "px");
				}
			}
		}
		setUpTag(tr, element);
		return tr;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static FormEventsTag<?> makeButton(Button element) {
		Input button = new Input();
		if (element.getLabel() != null) {
			button.value(element.getLabel().getValue());
		}
		if (element instanceof SubmitButton) {
			button.type("submit");
		} else {
			button.type("button");
			button.attribute("class", DomEvents.ONCLICK);
		}
		return button;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static Tag<?> makeToggleButton(ToggleButton element) {
		Input button = new Input();
		setUpTag(button, element);
		if (element.getLabel() != null) {
			button.value(element.getLabel().getValue());
		}
		button.type("checkbox");

		uk.co.wireweb.web.html.html5.tag.Label l = new uk.co.wireweb.web.html.html5.tag.Label();
		l.id(element.getId().getValue() + "_label");
		l.forField(element.getId().getValue());
		l.appendToBody(element.getLabel().getValue());

		Script init = new Script();
		init.appendToBody("$(function() {$('#" + element.getId().getValue() + "').button();});");
		Span w = new Span();
		w.appendToBody(button);
		w.appendToBody(l);
		w.appendToBody(init);
		return w;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static StandardAttributesTag<?> makeLabel(Label element) {
		uk.co.wireweb.web.html.html5.tag.Div lbl = new uk.co.wireweb.web.html.html5.tag.Div();
		lbl.body(element.getText().getValue());
		addDomEventListeners(lbl, element);
		return lbl;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static FormEventsTag<?> makeCheckbox(CheckBox element) {
		Input chkbox = new Input();
		if (element.getLabel() != null) {
			chkbox.value(element.getLabel().getValue());
		}
		chkbox.type("checkbox");
		if (element.getChecked() != null && element.getChecked().getValue()) {
			chkbox.attribute("checked", "true");
		}
		addDomEventListeners(chkbox, element);
		return chkbox;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static StandardAttributesTag<?> makeCanvas(Container element) {
		return new Div();
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static StandardAttributesTag<?> makeGridContainer(GridContainer element) {
		Table t = new Table();
		return t;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static StandardAttributesTag<?> makeDivContainer(GridContainer element) {
		return new Div();
	}

	/**
	 * 
	 * @return
	 */
	public static String getResourceBaseURL() {
		return StringConsts.getMmdsAppPath();
	}

	/**
	 * TODO change it
	 * 
	 * @return
	 */
	public static String getJSBaseURL() {
		return StringConsts.getMmdsPlatformPath() + "js/";
	}

	public static String getMMDSCore() {
		return getJSBaseURL() + StringConsts.MMDS_JS_CORE;
	}

	/**
	 * 
	 * @param align
	 * @return
	 */
	public static String getAlignment(Alignment align) {
		if (align == null)
			return CSS.ALIGN_CENTER;
		if (align.getValue() == Alignment.LEFT_VALUE)
			return CSS.ALIGN_LEFT;
		if (align.getValue() == Alignment.CENTER_VALUE)
			return CSS.ALIGN_CENTER;
		return CSS.ALIGN_RIGHT;
	}

	/**
	 * 
	 * @param alignment
	 * @return
	 */
	private static String getVAlignment(VAlignment align) {
		if (align == null)
			return CSS.VALIGN_MIDDLE;
		if (align.getValue() == VAlignment.TOP_VALUE)
			return CSS.VALIGN_TOP;
		if (align.getValue() == VAlignment.MIDDLE_VALUE)
			return CSS.VALIGN_MIDDLE;
		return CSS.VALIGN_BOTTOM;
	}

	/**
	 * 
	 * @param app
	 * @return
	 */
	public static Html makeHtml(GUIApplication app) {
		return new Html();
	}

	/**
	 * 
	 * @param app
	 * @return
	 */
	public static Body makeBody(GUIApplication app) {
		Body b = new Body();
		return b;
	}

	/**
	 * 
	 * @param app
	 * @return
	 */
	public static Head makeHead(GUIApplication app) {
		Head h = new Head();
		h.appendToBody("<META HTTP-EQUIV=\"PRAGMA\" CONTENT=\"NO-CACHE\">");
		return h;
	}

	/**
	 * 
	 * @param app
	 * @return
	 */
	public static Link makeAppStyleImport(GUIApplication app) {
		// TODO use information from configuration for resource-path
		Link style = new Link();
		if (app.getStyleResource() != null) {
			style.href(StringConsts.getMmdsAppPath() + app.getStyleResource().getLocation().getUrl());
			style.rel("stylesheet");
		}
		return style;
	}

	/**
	 * 
	 * @param head
	 */
	public static void addJqueryRef(Head head) {
		head.appendToBody("<link href=\"" + StringConsts.getMmdsPlatformPath() + StringConsts.JQUERY_CSS_URL + "\" rel=\"stylesheet\" type=\"text/css\"/>");
		head.appendToBody("<script src=\"" + getJSBaseURL() + StringConsts.JQUERY_URL + "\"></script>");
		head.appendToBody("<script src=\"" + getJSBaseURL() + StringConsts.JQUERY_UI_URL + "\"></script>");
		head.appendToBody("<script src=\"" + getJSBaseURL() + StringConsts.JQUERY_BLOCKUI + "\"></script>");
		head.appendToBody("<script src=\"" + getMMDSCore() + "\"></script>");
	}

	/**
	 * 
	 * @return
	 */
	public static Div makeMainContainer() {
		Div mainDiv = new Div();
		mainDiv.attribute("id", "mainContainer");
		return mainDiv;
	}

	@Override
	public Tag caseTextInputUpdate(TextInputUpdate object) {

		return super.caseTextInputUpdate(object);
	}

	@Override
	public Tag caseLabelUpdate(LabelUpdate object) {
		// TODO Auto-generated method stub
		return super.caseLabelUpdate(object);
	}

	public static Link makeAppStyleImportFromURL(String url) {
		Link style = new Link();
		if (url != null) {
			style.href(StringConsts.getMmdsAppPath() + url);
			style.rel("stylesheet");
		}
		return style;
	}

	// update events

}
