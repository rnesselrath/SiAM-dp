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
package de.dfki.iui.mmds.knowledge_server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.interfaces.IKnowledgeManagerListener;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.KnowledgeBaseEntry;

public class WorldContentAdapter extends EContentAdapter {

	Map<EClass, List<IKnowledgeManagerListener>> typeListener = new HashMap<EClass, List<IKnowledgeManagerListener>>();
	Map<EStructuralFeature, List<IKnowledgeManagerListener>> featureListener = new HashMap<EStructuralFeature, List<IKnowledgeManagerListener>>();
	private ExecutorService threadPools = Executors.newCachedThreadPool();

	@Override
	public void notifyChanged(Notification notification) {

		switch (notification.getEventType()) {
		case Notification.SET:
		case Notification.REMOVE:
		case Notification.ADD:
			// inform about removed entity
			if (notification.getFeature() != null && notification.getFeature() == BasePackage.eINSTANCE.getKnowledgeBase_Entries()) {
				if (notification.getOldValue() != null) {
					Entity oldObject = ((KnowledgeBaseEntry) notification.getOldValue()).getContent();
					for (EClass type : typeListener.keySet()) {
						if (type.isInstance(oldObject)) {
							for (IKnowledgeManagerListener l : typeListener.get(type)) {
								Entity clone = EmfUtils.clone(oldObject);
								threadPools.execute(new Runnable() {
									@Override
									public void run() {
										l.entityRemoved(clone);
									}
								});
							}
						}
					}
				}
				if (notification.getNewValue() != null) {
					// inform about new entity
					Entity newObject = ((KnowledgeBaseEntry) notification.getNewValue()).getContent();

					for (EClass type : typeListener.keySet()) {
						if (type.isInstance(newObject)) {
							for (IKnowledgeManagerListener l : typeListener.get(type)) {
								Entity clone = EmfUtils.clone(newObject);
								threadPools.execute(new Runnable() {
									@Override
									public void run() {
										l.entityAdded(clone);
									}
								});
							}
						}
					}

				}
			}

			if (featureListener.containsKey(notification.getFeature())) {
				List<IKnowledgeManagerListener> listeners = featureListener.get(notification.getFeature());
				if (notification.getEventType() == Notification.ADD) {
					for (IKnowledgeManagerListener listener : listeners)
						threadPools.execute(new Runnable() {
							@Override
							public void run() {
								listener.featureAdded((EObject) notification.getNotifier(), (EStructuralFeature) notification.getFeature(), notification.getNewValue());
							}
						});
				} else if (notification.getEventType() == Notification.REMOVE) {
					for (IKnowledgeManagerListener listener : listeners)
						threadPools.execute(new Runnable() {
							@Override
							public void run() {
								listener.featureRemoved((EObject) notification.getNotifier(), (EStructuralFeature) notification.getFeature(), notification.getOldValue());
							}
						});
				} else if (notification.getEventType() == Notification.SET) {
					if (notification.getOldValue() != notification.getNewValue())
						for (IKnowledgeManagerListener listener : listeners)
							threadPools.execute(new Runnable() {
								@Override
								public void run() {
									listener.featureModified((EObject) notification.getNotifier(), (EStructuralFeature) notification.getFeature(), notification.getOldValue(),
											notification.getNewValue());
								}
							});
				}

			}

			break;
		default:
		}
		super.notifyChanged(notification);
	}

	public void registerForType(EClass type, IKnowledgeManagerListener listener) {
		List<IKnowledgeManagerListener> listenerList;
		if (typeListener.containsKey(type))
			listenerList = typeListener.get(type);
		else {
			listenerList = new ArrayList<IKnowledgeManagerListener>();
			typeListener.put(type, listenerList);
		}
		listenerList.add(listener);
	}

	public void registerForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener) {
		List<IKnowledgeManagerListener> listenerList;
		if (featureListener.containsKey(feature))
			listenerList = featureListener.get(feature);
		else {
			listenerList = new ArrayList<IKnowledgeManagerListener>();
			featureListener.put(feature, listenerList);
		}
		listenerList.add(listener);
	}

	public void unregisterForType(EClass type, IKnowledgeManagerListener listener) {
		List<IKnowledgeManagerListener> listenerList = typeListener.get(type);
		if (listenerList != null) {
			listenerList.remove(listener);
			if (listenerList.isEmpty())
				featureListener.remove(type);
		}
	}

	public void unregisterForFeature(EStructuralFeature feature, IKnowledgeManagerListener listener) {
		List<IKnowledgeManagerListener> listenerList = featureListener.get(feature);
		if (listenerList != null) {
			listenerList.remove(listener);
			if (listenerList.isEmpty())
				featureListener.remove(feature);
		}
	}

}
