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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Speak;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speak</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getLexicon <em>Lexicon</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getStructGroup <em>Struct Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAwsGroup1 <em>Aws Group1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAws1 <em>Aws1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getStructGroup1 <em>Struct Group1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getLookup1 <em>Lookup1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getBase <em>Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getEndmark <em>Endmark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getOnlangfailure <em>Onlangfailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getStartmark <em>Startmark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeakImpl extends MinimalEObjectImpl.Container implements Speak {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndmark() <em>Endmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndmark()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndmark() <em>Endmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndmark()
	 * @generated
	 * @ordered
	 */
	protected String endmark = ENDMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = "en";

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlangfailure() <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlangfailure()
	 * @generated
	 * @ordered
	 */
	protected static final String ONLANGFAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlangfailure() <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlangfailure()
	 * @generated
	 * @ordered
	 */
	protected String onlangfailure = ONLANGFAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartmark() <em>Startmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartmark()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartmark() <em>Startmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartmark()
	 * @generated
	 * @ordered
	 */
	protected String startmark = STARTMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeakImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.SPEAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.SPEAK__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsmlMeta> getMeta() {
		return getGroup().list(SpeechSynthesisPackage.Literals.SPEAK__META);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsmlMetadata> getMetadata() {
		return getGroup().list(SpeechSynthesisPackage.Literals.SPEAK__METADATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsmlLexicon> getLexicon() {
		return getGroup().list(SpeechSynthesisPackage.Literals.SPEAK__LEXICON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAwsGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__AWS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAws() {
		return (EObject)getAwsGroup().get(SpeechSynthesisPackage.Literals.SPEAK__AWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAws(EObject newAws, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAwsGroup()).basicAdd(SpeechSynthesisPackage.Literals.SPEAK__AWS, newAws, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStructGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__STRUCT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStruct() {
		return (EObject)getStructGroup().get(SpeechSynthesisPackage.Literals.SPEAK__STRUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(EObject newStruct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getStructGroup()).basicAdd(SpeechSynthesisPackage.Literals.SPEAK__STRUCT, newStruct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupType getLookup() {
		return (LookupType)getMixed().get(SpeechSynthesisPackage.Literals.SPEAK__LOOKUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookup(LookupType newLookup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpeechSynthesisPackage.Literals.SPEAK__LOOKUP, newLookup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookup(LookupType newLookup) {
		((FeatureMap.Internal)getMixed()).set(SpeechSynthesisPackage.Literals.SPEAK__LOOKUP, newLookup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__GROUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAwsGroup1() {
		return (FeatureMap)getGroup1().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__AWS_GROUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAws1() {
		return getAwsGroup().list(SpeechSynthesisPackage.Literals.SPEAK__AWS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStructGroup1() {
		return (FeatureMap)getGroup1().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__STRUCT_GROUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStruct1() {
		return getStructGroup().list(SpeechSynthesisPackage.Literals.SPEAK__STRUCT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LookupType> getLookup1() {
		return getGroup1().list(SpeechSynthesisPackage.Literals.SPEAK__LOOKUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup1().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.SPEAK__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SPEAK__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndmark() {
		return endmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndmark(String newEndmark) {
		String oldEndmark = endmark;
		endmark = newEndmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SPEAK__ENDMARK, oldEndmark, endmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SPEAK__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnlangfailure() {
		return onlangfailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlangfailure(String newOnlangfailure) {
		String oldOnlangfailure = onlangfailure;
		onlangfailure = newOnlangfailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SPEAK__ONLANGFAILURE, oldOnlangfailure, onlangfailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartmark() {
		return startmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartmark(String newStartmark) {
		String oldStartmark = startmark;
		startmark = newStartmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SPEAK__STARTMARK, oldStartmark, startmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.SPEAK__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.SPEAK__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpeechSynthesisPackage.SPEAK__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__LEXICON:
				return ((InternalEList<?>)getLexicon()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP:
				return ((InternalEList<?>)getAwsGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__AWS:
				return basicSetAws(null, msgs);
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP:
				return ((InternalEList<?>)getStructGroup()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__STRUCT:
				return basicSetStruct(null, msgs);
			case SpeechSynthesisPackage.SPEAK__LOOKUP:
				return basicSetLookup(null, msgs);
			case SpeechSynthesisPackage.SPEAK__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP1:
				return ((InternalEList<?>)getAwsGroup1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__AWS1:
				return ((InternalEList<?>)getAws1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP1:
				return ((InternalEList<?>)getStructGroup1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__STRUCT1:
				return ((InternalEList<?>)getStruct1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__LOOKUP1:
				return ((InternalEList<?>)getLookup1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.SPEAK__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpeechSynthesisPackage.SPEAK__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__META:
				return getMeta();
			case SpeechSynthesisPackage.SPEAK__METADATA:
				return getMetadata();
			case SpeechSynthesisPackage.SPEAK__LEXICON:
				return getLexicon();
			case SpeechSynthesisPackage.SPEAK__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP:
				if (coreType) return getAwsGroup();
				return ((FeatureMap.Internal)getAwsGroup()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__AWS:
				return getAws();
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP:
				if (coreType) return getStructGroup();
				return ((FeatureMap.Internal)getStructGroup()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__STRUCT:
				return getStruct();
			case SpeechSynthesisPackage.SPEAK__LOOKUP:
				return getLookup();
			case SpeechSynthesisPackage.SPEAK__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP1:
				if (coreType) return getAwsGroup1();
				return ((FeatureMap.Internal)getAwsGroup1()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__AWS1:
				return getAws1();
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP1:
				if (coreType) return getStructGroup1();
				return ((FeatureMap.Internal)getStructGroup1()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__STRUCT1:
				return getStruct1();
			case SpeechSynthesisPackage.SPEAK__LOOKUP1:
				return getLookup1();
			case SpeechSynthesisPackage.SPEAK__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SpeechSynthesisPackage.SPEAK__BASE:
				return getBase();
			case SpeechSynthesisPackage.SPEAK__ENDMARK:
				return getEndmark();
			case SpeechSynthesisPackage.SPEAK__LANG:
				return getLang();
			case SpeechSynthesisPackage.SPEAK__ONLANGFAILURE:
				return getOnlangfailure();
			case SpeechSynthesisPackage.SPEAK__STARTMARK:
				return getStartmark();
			case SpeechSynthesisPackage.SPEAK__VERSION:
				return getVersion();
			case SpeechSynthesisPackage.SPEAK__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpeechSynthesisPackage.SPEAK__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends SsmlMeta>)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends SsmlMetadata>)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__LEXICON:
				getLexicon().clear();
				getLexicon().addAll((Collection<? extends SsmlLexicon>)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP:
				((FeatureMap.Internal)getAwsGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP:
				((FeatureMap.Internal)getStructGroup()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__LOOKUP:
				setLookup((LookupType)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP1:
				((FeatureMap.Internal)getAwsGroup1()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP1:
				((FeatureMap.Internal)getStructGroup1()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__LOOKUP1:
				getLookup1().clear();
				getLookup1().addAll((Collection<? extends LookupType>)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__BASE:
				setBase((String)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__ENDMARK:
				setEndmark((String)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__LANG:
				setLang((String)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__ONLANGFAILURE:
				setOnlangfailure((String)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__STARTMARK:
				setStartmark((String)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__VERSION:
				setVersion((String)newValue);
				return;
			case SpeechSynthesisPackage.SPEAK__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpeechSynthesisPackage.SPEAK__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__GROUP:
				getGroup().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__META:
				getMeta().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__METADATA:
				getMetadata().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__LEXICON:
				getLexicon().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP:
				getAwsGroup().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP:
				getStructGroup().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__LOOKUP:
				setLookup((LookupType)null);
				return;
			case SpeechSynthesisPackage.SPEAK__GROUP1:
				getGroup1().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP1:
				getAwsGroup1().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP1:
				getStructGroup1().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__LOOKUP1:
				getLookup1().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__ANY1:
				getAny1().clear();
				return;
			case SpeechSynthesisPackage.SPEAK__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SPEAK__ENDMARK:
				setEndmark(ENDMARK_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SPEAK__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SPEAK__ONLANGFAILURE:
				setOnlangfailure(ONLANGFAILURE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SPEAK__STARTMARK:
				setStartmark(STARTMARK_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SPEAK__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SpeechSynthesisPackage.SPEAK__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpeechSynthesisPackage.SPEAK__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.SPEAK__GROUP:
				return !getGroup().isEmpty();
			case SpeechSynthesisPackage.SPEAK__META:
				return !getMeta().isEmpty();
			case SpeechSynthesisPackage.SPEAK__METADATA:
				return !getMetadata().isEmpty();
			case SpeechSynthesisPackage.SPEAK__LEXICON:
				return !getLexicon().isEmpty();
			case SpeechSynthesisPackage.SPEAK__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP:
				return !getAwsGroup().isEmpty();
			case SpeechSynthesisPackage.SPEAK__AWS:
				return getAws() != null;
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP:
				return !getStructGroup().isEmpty();
			case SpeechSynthesisPackage.SPEAK__STRUCT:
				return getStruct() != null;
			case SpeechSynthesisPackage.SPEAK__LOOKUP:
				return getLookup() != null;
			case SpeechSynthesisPackage.SPEAK__GROUP1:
				return !getGroup1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__AWS_GROUP1:
				return !getAwsGroup1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__AWS1:
				return !getAws1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__STRUCT_GROUP1:
				return !getStructGroup1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__STRUCT1:
				return !getStruct1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__LOOKUP1:
				return !getLookup1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__ANY1:
				return !getAny1().isEmpty();
			case SpeechSynthesisPackage.SPEAK__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case SpeechSynthesisPackage.SPEAK__ENDMARK:
				return ENDMARK_EDEFAULT == null ? endmark != null : !ENDMARK_EDEFAULT.equals(endmark);
			case SpeechSynthesisPackage.SPEAK__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SpeechSynthesisPackage.SPEAK__ONLANGFAILURE:
				return ONLANGFAILURE_EDEFAULT == null ? onlangfailure != null : !ONLANGFAILURE_EDEFAULT.equals(onlangfailure);
			case SpeechSynthesisPackage.SPEAK__STARTMARK:
				return STARTMARK_EDEFAULT == null ? startmark != null : !STARTMARK_EDEFAULT.equals(startmark);
			case SpeechSynthesisPackage.SPEAK__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SpeechSynthesisPackage.SPEAK__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", base: ");
		result.append(base);
		result.append(", endmark: ");
		result.append(endmark);
		result.append(", lang: ");
		result.append(lang);
		result.append(", onlangfailure: ");
		result.append(onlangfailure);
		result.append(", startmark: ");
		result.append(startmark);
		result.append(", version: ");
		result.append(version);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SpeakImpl
