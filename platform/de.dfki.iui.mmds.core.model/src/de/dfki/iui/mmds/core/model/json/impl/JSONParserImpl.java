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
/**
 */
package de.dfki.iui.mmds.core.model.json.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map.Entry;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.json.simple.parser.ParseException;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.model.json.JSONAbstractObject;
import de.dfki.iui.mmds.core.model.json.JSONAttribute;
import de.dfki.iui.mmds.core.model.json.JSONObject;
import de.dfki.iui.mmds.core.model.json.JSONParser;
import de.dfki.iui.mmds.core.model.json.JSONValue;
import de.dfki.iui.mmds.core.model.json.JsonFactory;
import de.dfki.iui.mmds.core.model.json.JsonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JSONParserImpl extends MinimalEObjectImpl.Container implements JSONParser {
	
	public static void main(String[] args) {
		System.out.println(EmfPersistence.writeToString(new JSONParserImpl().parse(args[0])));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonPackage.Literals.JSON_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONAbstractObject parse(final String jsonStr) {
		org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
		Object obj = null;
		JSONAbstractObject result = null;
		Stack<Object> toMap = new Stack<Object>();
		Stack<JSONAttribute> parsedParentAttrs = new Stack<JSONAttribute>();
		
		try {
			obj = parser.parse(jsonStr);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
		toMap.add(obj);
		parsedParentAttrs.add(null);
		
		while (!toMap.isEmpty()) {
			JSONAttribute parentAttr = parsedParentAttrs.pop();
			obj = toMap.pop();
			
			if (obj instanceof org.json.simple.JSONObject) {
				org.json.simple.JSONObject jsonObjSmpl = (org.json.simple.JSONObject) obj;
				JSONObject jsonObj = JsonFactory.eINSTANCE.createJSONObject();
				if (parentAttr != null) {
					parentAttr.getRange().add(jsonObj);
				}
				if (result == null) {
					result = jsonObj;
				}
				
				for (Object ent : jsonObjSmpl.entrySet()) {
					Entry<?, ?> entry = (Entry<?, ?>) ent;
					JSONAttribute jsonAttr = JsonFactory.eINSTANCE.createJSONAttribute();
					jsonAttr.setName(BString.valueOf(entry.getKey().toString()));
					jsonObj.getAttribute().add(jsonAttr);
					parsedParentAttrs.add(jsonAttr);
					
					toMap.add(entry.getValue());
				}
				
			} else if (obj instanceof org.json.simple.JSONArray) {
				org.json.simple.JSONArray arr = (org.json.simple.JSONArray) obj;
				
				// it is a stack -> add from the end
				for (int i = arr.size() - 1; i >= 0 ; i--) {
					parsedParentAttrs.add(parentAttr);
					toMap.add(arr.get(i));
				}
			} else {
				JSONValue jsonVal = JsonFactory.eINSTANCE.createJSONValue();
				jsonVal.setValue(BString.valueOf(obj + ""));
				if (parentAttr != null) {
					parentAttr.getRange().add(jsonVal);
				}
				if (result == null) {
					result = jsonVal;
				}
			}
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JsonPackage.JSON_PARSER___PARSE__STRING:
				return parse((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //JSONParserImpl
