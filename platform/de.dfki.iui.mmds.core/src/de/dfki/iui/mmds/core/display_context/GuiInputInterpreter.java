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
package de.dfki.iui.mmds.core.display_context;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.events.InputEventHandler;
import de.dfki.iui.mmds.core.interfaces.IDisplaxContextService;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GUIEvent;
import de.dfki.iui.mmds.core.model.io.gui.List;
import de.dfki.iui.mmds.core.model.io.gui.SupportedEvent;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent;
import de.dfki.iui.mmds.core.model.io.gui_events.GUIEventData;
import de.dfki.iui.mmds.core.model.pattern.PObject;
import de.dfki.iui.mmds.core.model.references.GuiContentReference;

public class GuiInputInterpreter extends InputEventHandler {

	IDisplaxContextService dp;

	public GuiInputInterpreter(IDisplaxContextService dp) {
		setPreprocessor(true);
		this.dp = dp;
	}

	@Override
	protected void activate(ComponentContext context) {
		super.activate(context);
		subscribe("/SIAM-INF/gui_input_interpreter.pattern");
	}

	@Override
	protected void handleEvent(InputMessage input, Event event, MatchReport report) {
		GUIEvent guiEvent = ((GUIEvent) ((InputAct) input).getRepresentation().get(0));
		GUIEventData eventData = guiEvent.getEventData();
		if (BString.isNullOrEmpty(guiEvent.getDevice())) {
			logger.warn("No device id defined for GUIEvent " + event.getProperty("id"));
			return;
		}
		GUIApplication application = dp.getCurrentDisplayContext(guiEvent.getDevice().toString());
		TreeIterator<EObject> iterator = application.getWindow().eAllContents();
		while (iterator.hasNext()) {
			EObject content = iterator.next();
			if (content instanceof UIElement && ((UIElement) content).getId() != null && ((UIElement) content).getId().equals(eventData.getTargetId())) {
				for (SupportedEvent supEvent : ((UIElement) content).getSupportedEvents()) {
					if (supEvent.getEventType() == eventData.eClass() && supEvent.getInterpretation() != null) {
						CommunicativeFunction interpretation = EmfUtils.clone(supEvent.getInterpretation());
						if (supEvent.getEventType().getInstanceClass() == ChangeEvent.class) {
							interpretation = handleChangeEvent(content, interpretation, (ChangeEvent) eventData);
						} else if (supEvent.getEventType().getInstanceClass() == ClickEvent.class) {
							interpretation = handleClickEvent(content, interpretation, (ClickEvent) eventData);
						} else
							throw new UnsupportedOperationException("Not implemented yet!");
						Hypothesis hypothesis = IoFactory.eINSTANCE.createHypothesis();
						hypothesis.setConfidence(1.0f);
						hypothesis.setCommunicativeFunction(interpretation);
						((InputAct) input).getHypotheses().add(hypothesis);
						break;
					}
				}
			}
		}
	}

	private CommunicativeFunction handleClickEvent(EObject content, CommunicativeFunction interpretation, ClickEvent inputEvent) {
		for (SemanticContent sc : interpretation.getSemanticContent())
			if (sc.getResolved() == ResolveState.UNRESOLVED && sc.getReference() instanceof GuiContentReference) {
				PObject pattern = sc.getReference().getReferencePattern();
				for (Entity entity : ((UIElement) content).getSemanticContent()) {
					if (pattern.matches(entity)) {
						sc.setResolved(ResolveState.RESOLVED);
						sc.setContent(EmfUtils.clone(entity));
						break;
					}
				}
			}
		return interpretation;
	}

	private CommunicativeFunction handleChangeEvent(EObject content, CommunicativeFunction interpretation, ChangeEvent inputEvent) {
		for (SemanticContent sc : interpretation.getSemanticContent())
			if (sc.getResolved() == ResolveState.UNRESOLVED && sc.getReference() instanceof GuiContentReference) {
				if (content instanceof List) {
					int index = inputEvent.getIndex().getValue();
					Entity entity = ((List) content).getItem().get(index).getSemanticContent().get(0);
					PObject pattern = sc.getReference().getReferencePattern();
					if (pattern.matches(entity)) {
						sc.setResolved(ResolveState.RESOLVED);
						sc.setContent(EmfUtils.clone(entity));
						break;
					}
				}
			}
		return interpretation;
	}
}
