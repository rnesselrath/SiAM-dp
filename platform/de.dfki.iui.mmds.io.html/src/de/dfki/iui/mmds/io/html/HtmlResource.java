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
package de.dfki.iui.mmds.io.html;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import de.dfki.iui.mmds.core.interfaces.IDisplaxContextService;
import de.dfki.iui.mmds.core.model.io.Service;

@Path("/html/gui")
public class HtmlResource {

	static String html;
	private IDisplaxContextService displayContextService;
	private HttpService httpService;
	private ComponentContext context;
	private HtmlGeneratorComponent htmlGenerator;

	public void activate(ComponentContext context) {
		this.context = context;
		displayContextService = (IDisplaxContextService) context.locateService("DisplayContextService");
		httpService = (HttpService) context.locateService("HttpService");
		htmlGenerator = (HtmlGeneratorComponent) context.locateService("HtmlGeneratorComponent");
		try {
			httpService.registerResources("/html/platform", "/resources", null);
			httpService.registerResources("/html/app", "", new HttpContext() {

				@Override
				public boolean handleSecurity(HttpServletRequest request, HttpServletResponse response) throws IOException {
					return true;
				}

				@Override
				public URL getResource(String name) {
					String path = System.getProperty("mmds.resources.location");
					path += name;
					// TODO Auto-generated method stub

					try {
						return new File(path).toURI().toURL();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				}

				@Override
				public String getMimeType(String name) {
					// TODO Auto-generated method stub
					return null;
				}
			});
		} catch (NamespaceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void deactivate() {
		this.context = null;
		displayContextService = null;
	}

	@GET
	@Produces("text/html")
	public String getDevices(@Context UriInfo getUri) {
		List<String> entries = displayContextService.getDeviceList();

		StringBuilder builder = new StringBuilder();
		builder.append("<html><head></head><body>");
		builder.append("<h1>Available Html Devices</h1>");
		String path = getUri.getAbsolutePath().toString();
		if (!path.endsWith("/")) {
			path += "/";
		}

		for (Entry<String, Service> entry : htmlGenerator.uriFragmentToService.entrySet()) {
			builder.append(String.format("<a href=\"%s%s\">%s</a>", path, entry.getKey(), entry.getValue().getServiceName()) + "<br/>");
		}
		builder.append("<h1>Available Display Contexts</h1>");
		for (String key : entries) {
			builder.append(String.format("<a href=\"%s%s\">%s</a>", path, key, key) + "<br/>");
		}
		builder.append("</body></html>");
		return builder.toString();
	}

	@GET
	@Path("/{deviceId}")
	@Produces("text/html")
	public String getGuiForDisplayContext(@PathParam("deviceId") String deviceId) {
		Map<String, String> args = new HashMap<String, String>();
		args.put("DEVICE_ID", deviceId);
		html = new HtmlRenderer(context).render(null, true, args).getContents().toString();
		return html;
	};

	@GET
	@Path("/{fragment}/{serviceId}")
	@Produces("text/html")
	public String getGuiForDevice(@PathParam("fragment") String fragment, @PathParam("serviceId") String serviceId) {
		Map<String, String> args = new HashMap<String, String>();
		Service service = htmlGenerator.uriFragmentToService.get(fragment + '/' + serviceId);
		if (service == null)
			return "No device registered for this path";
		args.put("DEVICE_ID", htmlGenerator.serviceToSiamIdMapping.get(service.getUniqueId()));
		html = new HtmlRenderer(context).render(null, true, args).getContents().toString();
		return html;
	};

}
