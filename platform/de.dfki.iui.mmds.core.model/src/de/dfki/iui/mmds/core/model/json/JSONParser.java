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
package de.dfki.iui.mmds.core.model.json;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.iui.mmds.core.model.json.JsonPackage#getJSONParser()
 * @model
 * @generated
 */
public interface JSONParser extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();\r\nObject obj = null;\r\nJSONAbstractObject result = null;\r\nStack<Object> toMap = new Stack<Object>();\r\nStack<JSONAttribute> parsedParentAttrs = new Stack<JSONAttribute>();\r\n\r\ntry {\r\n\tobj = parser.parse(jsonStr);\r\n} catch (ParseException e) {\r\n\te.printStackTrace();\r\n\treturn null;\r\n}\r\n\r\ntoMap.add(obj);\r\nparsedParentAttrs.add(null);\r\n\r\nwhile (!toMap.isEmpty()) {\r\n\tJSONAttribute parentAttr = parsedParentAttrs.pop();\r\n\tobj = toMap.pop();\r\n\t\r\n\tif (obj instanceof org.json.simple.JSONObject) {\r\n\t\torg.json.simple.JSONObject jsonObjSmpl = (org.json.simple.JSONObject) obj;\r\n\t\tJSONObject jsonObj = JsonFactory.eINSTANCE.createJSONObject();\r\n\t\tif (parentAttr != null) {\r\n\t\t\tparentAttr.getRange().add(jsonObj);\r\n\t\t}\r\n\t\tif (result == null) {\r\n\t\t\tresult = jsonObj;\r\n\t\t}\r\n\t\t\r\n\t\tfor (Object ent : jsonObjSmpl.entrySet()) {\r\n\t\t\tEntry<?, ?> entry = (Entry<?, ?>) ent;\r\n\t\t\tJSONAttribute jsonAttr = JsonFactory.eINSTANCE.createJSONAttribute();\r\n\t\t\tjsonAttr.setName(BString.valueOf(entry.getKey().toString()));\r\n\t\t\tjsonObj.getAttribute().add(jsonAttr);\r\n\t\t\tparsedParentAttrs.add(jsonAttr);\r\n\t\t\t\r\n\t\t\ttoMap.add(entry.getValue());\r\n\t\t}\r\n\t\t\r\n\t} else if (obj instanceof org.json.simple.JSONArray) {\r\n\t\torg.json.simple.JSONArray arr = (org.json.simple.JSONArray) obj;\r\n\t\t\r\n\t\t// it is a stack -> add from the end\r\n\t\tfor (int i = arr.size() - 1; i >= 0 ; i--) {\r\n\t\t\tparsedParentAttrs.add(parentAttr);\r\n\t\t\ttoMap.add(arr.get(i));\r\n\t\t}\r\n\t} else {\r\n\t\tJSONValue jsonVal = JsonFactory.eINSTANCE.createJSONValue();\r\n\t\tjsonVal.setValue(BString.valueOf(obj + \"\"));\r\n\t\tif (parentAttr != null) {\r\n\t\t\tparentAttr.getRange().add(jsonVal);\r\n\t\t}\r\n\t\tif (result == null) {\r\n\t\t\tresult = jsonVal;\r\n\t\t}\r\n\t}\r\n}\r\n\r\nreturn result;'"
	 * @generated
	 */
	JSONAbstractObject parse(String jsonStr);

} // JSONParser
