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
package de.dfki.iui.mmds.io.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.interfaces.IResourceManager;

@Path("/resources")
public class ResourceService {

	IResourceManager resourceManager;

	protected void activate(ComponentContext context) {
		resourceManager = ((IResourceManager) context.locateService("IResourceManager"));
	}

	@Override
	@GET
	@Produces("text/plain")
	public String toString() {
		StringBuilder builder = new StringBuilder();
		List<String> entries = new ArrayList<String>(resourceManager.getCategories());
		Collections.sort(entries);
		for (String key : entries) {
			builder.append(key + '\n');
		}
		return builder.toString();
	};

	@GET
	@Produces("text/html")
	public String getCategories() {
		StringBuilder builder = new StringBuilder();
		List<String> entries = new ArrayList<String>(resourceManager.getCategories());
		Collections.sort(entries);

		builder.append("<html><head></head><body>");
		for (String key : entries) {
			builder.append(String.format("<a href=\"%s/%s\">%s</a>", "resources", key, key) + "<br/>");
		}
		builder.append("</body></html>");
		return builder.toString();
	};

	@GET
	@Path("/{category}")
	@Produces("text/html")
	public String getResourcesForCategory(@PathParam("category") String category) {

		StringBuilder builder = new StringBuilder();
		List<String> entries = new ArrayList<String>();
		HashMap<String, EObject> collection = resourceManager.getResources(category);
		if (collection != null) {
			entries.addAll(collection.keySet());
		}
		Collections.sort(entries);

		builder.append("<html><head></head><body>");
		for (String key : entries) {
			builder.append(String.format("<a href=\"%s/%s\">%s</a>", category, key, key) + "<br/>");
		}
		builder.append("</body></html>");
		return builder.toString();
	};

	@GET
	@Path("grammars/{resource}")
	@Produces("application/srgs+xml")
	public String getResource(@PathParam("resource") String resource) {
		if (resourceManager.getCategories().contains("grammars") && resourceManager.getResources("grammars").containsKey(resource)) {
			try {
				return EmfPersistence.writeToString(resourceManager.getResources("grammars").get(resource));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	};

	@GET
	@Path("/{category}/{resource}")
	@Produces("application/xml")
	public String getResource(@PathParam("category") String category, @PathParam("resource") String resource) {
		if (resourceManager.getCategories().contains(category) && resourceManager.getResources(category).containsKey(resource)) {
			try {
				return EmfPersistence.writeToString(resourceManager.getResources(category).get(resource));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	};
}
