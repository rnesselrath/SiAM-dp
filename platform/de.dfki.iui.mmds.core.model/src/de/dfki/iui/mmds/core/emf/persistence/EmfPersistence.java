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
package de.dfki.iui.mmds.core.emf.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.io.output.WriterOutputStream;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emfjson.EMFJs;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import de.dfki.iui.mmds.core.emf.utils.EmfUtils;

public class EmfPersistence {

	static final Logger logger = Logger.getLogger(EmfPersistence.class);
	static final ExtendedMetaData modelMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
	public static int MAX_STRING_SIZE = -1;

	// how to handle non-containment references?
	public enum NonContainmentReferenceHandling {
		INLINE, // references are integrated inline into as child node
		KEEP_ORIGINAL_LOCATION, // keeps original references to external resources
		ADD_TO_RESOURCE, // adds all external resources to this resource (XML representation then)
	}

	public static Resource readFromFile(String file) throws IOException {
		URI uri = URI.createURI(file);
		return readFromUri(uri);
	}

	public static Resource readFromUri(URI uri) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		read(resource, null);
		return resource;
	}

	public static Resource readFromString(String input) throws IOException {
		StringReader stringReader = new StringReader(input);
		ReaderInputStream is = new ReaderInputStream(stringReader, Charset.forName("UTF-8"));
		Resource resource = readFromStream(is);
		is.close();
		return resource;
	}

	public static Resource readFromJsonString(String input, EClass root) throws IOException {
		StringReader stringReader = new StringReader(input);
		ReaderInputStream is = new ReaderInputStream(stringReader, Charset.forName("UTF-8"));

		Map<String, Object> options = new HashMap<String, Object>();
		options.put(EMFJs.OPTION_ROOT_ELEMENT, root);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());

		Resource resource = resourceSet.createResource(URI.createURI("in.json"));
		resource.load(is, options);

		return resource;
	}

	public static Resource readFromStream(InputStream is) throws IOException {
		XMLResourceFactoryImpl factory = new XMLResourceFactoryImpl();

		Resource resource = factory.createResource(URI.createURI(""));
		read(resource, is);
		return resource;
	}

	public static void read(Resource resource, InputStream is) throws IOException {
		Map<Object, Object> loadOptions;
		if (resource.getResourceSet() != null) {
			loadOptions = resource.getResourceSet().getLoadOptions();
		} else {
			loadOptions = new HashMap<Object, Object>();
		}
		loadOptions.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
		loadOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		loadOptions.put(XMIResource.OPTION_EXTENDED_META_DATA, modelMetaData);
		loadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);
		if (is != null) {
			resource.load(is, loadOptions);
		} else {
			resource.load(loadOptions);
		}
	}

	public static Resource writeToFile(EObject instance, String file, NonContainmentReferenceHandling refOption, HashMap<String, Object> saveOptions) throws IOException {
		URI uri = URI.createFileURI(file);
		return writeToUri(instance, uri, refOption, saveOptions);
	}

	public static Resource writeToUri(EObject instance, URI uri, NonContainmentReferenceHandling refOption, HashMap<String, Object> saveOptions) throws IOException {

		Resource resource = new XMLResourceFactoryImpl().createResource(uri);
		write(instance, resource, null, refOption, saveOptions);
		return resource;
	}

	public static String writeToString(EObject instance)  {
		try {
			String str = writeToString(instance, NonContainmentReferenceHandling.INLINE, null);
			if (MAX_STRING_SIZE > 0 && str.length() > MAX_STRING_SIZE) {
				return str.substring(0, MAX_STRING_SIZE) + " ... ... ... string is too long (length: " + str.length() + " > allowed: " + MAX_STRING_SIZE + ", see MAX_STRING_SIZE)\n";
			}
			return str;
		} catch (IOException e) {
			logger.error(e.getLocalizedMessage());
			e.printStackTrace();
			return "";
		}
	}

	public static String writeToString(EObject instance, NonContainmentReferenceHandling refOption, HashMap<String, Object> saveOptions) throws IOException {
		StringWriter stringWriter = new StringWriter();
		WriterOutputStream os = new WriterOutputStream(stringWriter, Charset.forName("UTF-8"));
		writeToStream(instance, os, refOption, saveOptions);
		os.close();
		return stringWriter.toString().trim();
	}

	public static String writeToJsonString(EObject instance) throws IOException {
		return writeToJsonString(instance, NonContainmentReferenceHandling.INLINE, null);
	}

	public static String writeToJsonString(EObject instance, NonContainmentReferenceHandling refOption, HashMap<String, Object> saveOptions) throws IOException {
		StringWriter stringWriter = new StringWriter();
		WriterOutputStream os = new WriterOutputStream(stringWriter, Charset.forName("UTF-8"));
		JsonResourceFactory factory = new JsonResourceFactory();
		Resource resource = factory.createResource(URI.createURI(""));
		write(instance, resource, os, refOption, saveOptions);
		os.close();
		return stringWriter.toString().trim();
	}

	public static void writeToStream(EObject instance, OutputStream os, NonContainmentReferenceHandling refOption, HashMap<String, Object> saveOptions) throws IOException {
		XMLResourceFactoryImpl factory = new XMLResourceFactoryImpl();
		Resource resource = factory.createResource(URI.createURI(""));
		write(instance, resource, os, refOption, saveOptions);
	}

	public static void writeToStream(EObject instance, OutputStream os) throws IOException {
		writeToStream(instance, os, NonContainmentReferenceHandling.INLINE, null);
	}

	public static void write(Resource resource, OutputStream os, Map<String, Object> saveOptions) throws IOException {
		ExtendedMetaData modelMetaData;
		if (resource.getResourceSet() != null) {
			modelMetaData = new BasicExtendedMetaData(resource.getResourceSet().getPackageRegistry());
		} else {
			modelMetaData = new BasicExtendedMetaData(Registry.INSTANCE);
		}
		HashMap<String, Object> options = new HashMap<String, Object>();

		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		if (!options.containsKey(XMIResource.OPTION_KEEP_DEFAULT_CONTENT)) {
			options.put(XMIResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		}
		options.put(XMIResource.OPTION_EXTENDED_META_DATA, modelMetaData);
		options.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
		options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);
		if (saveOptions != null) {
			options.putAll(saveOptions);
		}
		if (os != null) {
			resource.save(os, options);
		} else {
			resource.save(options);
		}
	}

	private static void write(EObject instance, Resource resource, OutputStream os, NonContainmentReferenceHandling refOption, Map<String, Object> saveOptions) throws IOException {
		if (refOption == null) {
			refOption = NonContainmentReferenceHandling.KEEP_ORIGINAL_LOCATION;
		}
		HashSet<EObject> alreadyVisited = new HashSet<EObject>();
		List<EObject> rootList = new ArrayList<EObject>();

		if (refOption == NonContainmentReferenceHandling.ADD_TO_RESOURCE) {
			instance = EmfUtils.clone(instance);
			resource.getContents().add(instance);
			collectObjectsWithoutResource(instance, alreadyVisited, rootList, refOption);
			resource.getContents().addAll(rootList);
			write(resource, os, saveOptions);
		} else if (refOption == NonContainmentReferenceHandling.KEEP_ORIGINAL_LOCATION) {
			instance = EcoreUtil.copy(instance);
			resource.getContents().add(instance);
			collectObjectsWithoutResource(instance, alreadyVisited, rootList, refOption);

			Resource resourceTemp = new XMLResourceFactoryImpl().createResource(URI.createURI(""));
			resourceTemp.getContents().addAll(rootList);
			write(resource, os, saveOptions);
		} else if (refOption == NonContainmentReferenceHandling.INLINE) {
			instance = EmfUtils.clone(instance);

			resource.getContents().add(instance);
			// Reads to DOM and injects dependencies(replaces href nodes)

			Document d;
			Map<String, Namespace> namespaces = new HashMap<String, Namespace>();
			try {
				d = createDocFromEObject(instance, namespaces);
				Set<EObject> alreadyHandled = new HashSet<EObject>();
				dfs(instance, d.getRootElement(), alreadyHandled, namespaces);
				for (String prefix : namespaces.keySet()) {
					Namespace namespace = d.getRootElement().getNamespace(prefix);
					if (namespace == null)
						d.getRootElement().addNamespaceDeclaration(namespaces.get(prefix));
				}
				XMLOutputter out = new XMLOutputter();
				out.setFormat(Format.getPrettyFormat());
				out.output(d, os);
			} catch (Exception e) {
				logger.error("An error occured while serializing an object:\n" + e.getLocalizedMessage());
				e.printStackTrace();
			}
		}
	}

	/**
	 * Run DFS on EObject reference tree
	 * 
	 * @param object
	 * @param node
	 * @param alreadyHandled
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	protected static void dfs(EObject object, Element node, Set<EObject> alreadyHandled, Map<String, Namespace> namespaces) throws Exception {

		if (alreadyHandled.contains(object))
			return;
		else {
			alreadyHandled.add(object);
		}

		// traverse references and append them to the document
		for (EReference ref : object.eClass().getEAllReferences()) {
			if (ref.isTransient())
				continue;

			if (ref.isMany()) {
				int id = 0;

				for (EObject content : ((List<EObject>) object.eGet(ref))) {
					if (!(content.eClass().getEPackage() instanceof EcorePackage)) {
						Document n = createDocFromEObject(content, namespaces);
						dfs(content, n.getRootElement(), alreadyHandled, namespaces);
						if (!ref.isContainment()) {
							updateMember(node, ref, id, content, n);
							id++;
						}
					}
				}
			} else {
				EObject content = ((EObject) object.eGet(ref));
				if (content != null && !(content.eClass().getEPackage() instanceof EcorePackage)) {
					Document n = createDocFromEObject(content, namespaces);
					dfs(content, n.getRootElement(), alreadyHandled, namespaces);
					if (!ref.isContainment())
						updateMember(node, ref, 0, content, n);
				}
			}
		}
	}

	/**
	 * Serialize an object to XML using standard EMF
	 * 
	 * @param object
	 * @return
	 * @throws Exception
	 */
	private static Document createDocFromEObject(EObject object, Map<String, Namespace> namespaces) throws Exception {
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMIResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);
		options.put(XMIResource.OPTION_DECLARE_XML, Boolean.FALSE);
		options.put(XMLResource.OPTION_FORMATTED, Boolean.FALSE);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);

		String result = writeToString(object, NonContainmentReferenceHandling.KEEP_ORIGINAL_LOCATION, options);
		Document doc = null;
		try {
			doc = new SAXBuilder().build(new StringReader(result));
			Namespace namespace = doc.getRootElement().getNamespace();
			if (!namespaces.containsKey(namespace.getPrefix()))
				namespaces.put(namespace.getPrefix(), namespace);
			for (Namespace additionalNamespace : doc.getRootElement().getAdditionalNamespaces()) {
				if (!namespaces.containsKey(additionalNamespace.getPrefix()))
					namespaces.put(additionalNamespace.getPrefix(), additionalNamespace);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			assert (false);
		}
		return doc;
	}

	private static void collectObjectsWithoutResource(EObject eObject, HashSet<EObject> alreadyVisited, List<EObject> rootList, NonContainmentReferenceHandling refOption) {

		if (alreadyVisited.contains(eObject))
			return;
		alreadyVisited.add(eObject);
		if ((eObject.eClass().getEPackage() instanceof EcorePackage))
			return;
		if (eObject.eResource() == null) {
			if (eObject.eContainer() == null) {
				rootList.add(eObject);
			} else {
				collectObjectsWithoutResource(eObject.eContainer(), alreadyVisited, rootList, refOption);
			}
		}
		for (EReference eref : eObject.eClass().getEAllReferences()) {
			if (eref.isTransient()) {
				EAnnotation annotation = eref.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
				if (annotation == null || !annotation.getDetails().containsKey("group")) {
					continue;
				}
			}
			final Object value = eObject.eGet(eref);
			if (value == null) {
				continue;
			}
			if (value instanceof List) {
				for (Object obj : (List<?>) value) {
					if (obj == null) {
						logger.error("There seems to be a unresolved reference. Please check the console output!");
					}
					collectObjectsWithoutResource((EObject) obj, alreadyVisited, rootList, refOption);
				}
			} else {
				collectObjectsWithoutResource((EObject) value, alreadyVisited, rootList, refOption);
			}
		}
	}

	/**
	 * Update member contents with resolved data
	 * 
	 * @param node
	 * @param memberReference
	 * @param memberDocument
	 * @return
	 * @throws Exception
	 */
	private static Element updateMember(Element node, EReference memberReference, int id, EObject memberObject, Document memberDocument) throws Exception {
		Namespace namespace = node.getNamespace(modelMetaData.getNamespace(memberReference));

		List<Element> children = null;
		if (namespace == null) {
			children = node.getChildren(modelMetaData.getName(memberReference));
		} else
			throw new IllegalArgumentException();
		if (id < children.size()) {
			// Inserting resolved contents to the member
			Element element = children.get(id);
			Element clone = memberDocument.getRootElement().clone();
			clone.setName(memberReference.getName());
			node.setContent(node.indexOf(element), clone);
			// Setting xsi:type
			clone.setAttribute("type", memberObject.eClass().getEPackage().getName() + ":" + memberObject.eClass().getName(), node.getNamespace("xsi"));
		}

		return node;
	}
}
