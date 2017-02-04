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
package de.dfki.iui.mmds.core.evaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.jexl2.MapContext;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.emf.utils.EmfUtils;
import de.dfki.iui.mmds.core.model.project.JavaPlugin;

public class EvaluationService {

	Map<String, Object> globalContext = new HashMap<String, Object>();

	public void registerPlugin(JavaPlugin plugin, ComponentContext context) {
		try {
			Class<?> loadClass = context.getBundleContext().getBundle().loadClass(plugin.getClassName());
			registerPlugin(plugin.getNamespace(), loadClass.newInstance());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void registerPlugin(String pluginName, Object pluginInstance) {
		globalContext.put(pluginName, pluginInstance);
	}

	public List<EObject> evaluateContents(EObject object, Map<String, Object> context) {
		MapContext mergedContext = new MapContext();
		for (String key : globalContext.keySet()) {
			mergedContext.set(key, globalContext.get(key));
		}
		for (String key : context.keySet()) {
			if (globalContext.containsKey(key)) {
				Logger.getLogger(this.getClass()).warn(String.format("Context variable %s has already be defined in the global context with content %s. The concrete version with content %s is used.",
						key, globalContext.get(key), context.get(key)));
			}
			mergedContext.set(key, context.get(key));
		}
		EObject clone = EmfUtils.clone(object);
		ContentEvaluator contentEvaluator = new ContentEvaluator();
		return contentEvaluator.evaluateContents(clone, mergedContext);
	}

	public Object eval(Map<String, Object> context, String expr) {
		MapContext mergedContext = new MapContext();
		for (String key : globalContext.keySet()) {
			mergedContext.set(key, globalContext.get(key));
		}
		for (String key : context.keySet()) {
			if (globalContext.containsKey(key)) {
				Logger.getLogger(this.getClass()).warn(String.format("Context variable %s has already be defined in the global context with content %s. The concrete version with content %s is used.",
						key, globalContext.get(key), context.get(key)));
			}
			mergedContext.set(key, context.get(key));
		}
		ContentEvaluator contentEvaluator = new ContentEvaluator();
		return contentEvaluator.eval(mergedContext, expr);

	}
}
