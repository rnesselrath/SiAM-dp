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
package de.dfki.iui.mmds.cm;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

public class PropertyFileHandler {
	private static final String EXTENSION = ".properties";
	private final File file;
	private ConfigurationAdmin admin;
	private long lastRead;

	PropertyFileHandler(File file) {
		this.file = file;
	}

	static FileFilter filter() {
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(EXTENSION) && pathname.canRead() && pathname.canWrite();
			}
		};
		return filter;
	}

	private String getPid() {
		String name = file.getName();
		int index = name.indexOf(EXTENSION);
		name = name.substring(0, index);
		return name;
	}

	private synchronized Dictionary<String, Object> loadProperties() {
		Dictionary<String, Object> dict = new Hashtable<String, Object>();
		if (!file.exists())
			return dict;
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			Thread.sleep(100);
			props.load(in);
			for (Map.Entry<Object, Object> entry : props.entrySet()) {
				String key = entry.getKey().toString();
				String value = entry.getValue().toString();
				dict.put(key, value);

			}
		} catch (Exception exc) {
			System.err.println();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception exc) {
				}
			}
		}
		return dict;
	}

	private synchronized void update(ConfigurationAdmin admin) throws IOException {
		if (admin == null)
			return;
		// Load the properties.
		Dictionary<String, Object> properties = loadProperties();
		Configuration config;
		String factory = (String) properties.get(ConfigurationAdmin.SERVICE_FACTORYPID);
		if (factory != null) {
			config = admin.createFactoryConfiguration(factory, null);
		} else {
			config = admin.getConfiguration(getPid(), null);
		}
		config.update(properties);

	}

	public void checkConfiguration(ConfigurationAdmin admin) throws IOException {
		if (this.admin == admin && lastRead >= file.lastModified())
			return;
		update(admin);
		this.admin = admin;
		this.lastRead = System.currentTimeMillis();
	}
}
