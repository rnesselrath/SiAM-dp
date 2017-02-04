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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getLexicon <em>Lexicon</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getBase <em>Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getTagFormat <em>Tag Format</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrammarImpl extends MinimalEObjectImpl.Container implements Grammar {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeDatatype MODE_EDEFAULT = ModeDatatype.VOICE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ModeDatatype mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTagFormat() <em>Tag Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagFormat() <em>Tag Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagFormat()
	 * @generated
	 * @ordered
	 */
	protected String tagFormat = TAG_FORMAT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.GRAMMAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GrammarPackage.GRAMMAR__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lexicon> getLexicon() {
		return getGroup().list(GrammarPackage.Literals.GRAMMAR__LEXICON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		return getGroup().list(GrammarPackage.Literals.GRAMMAR__META);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		return getGroup().list(GrammarPackage.Literals.GRAMMAR__METADATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTag() {
		return getGroup().list(GrammarPackage.Literals.GRAMMAR__TAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, GrammarPackage.GRAMMAR__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		return getGroup1().list(GrammarPackage.Literals.GRAMMAR__RULE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDatatype getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ModeDatatype newMode) {
		ModeDatatype oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		ModeDatatype oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GrammarPackage.GRAMMAR__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagFormat() {
		return tagFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagFormat(String newTagFormat) {
		String oldTagFormat = tagFormat;
		tagFormat = newTagFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR__TAG_FORMAT, oldTagFormat, tagFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.GRAMMAR__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GrammarPackage.GRAMMAR__LEXICON:
				return ((InternalEList<?>)getLexicon()).basicRemove(otherEnd, msgs);
			case GrammarPackage.GRAMMAR__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case GrammarPackage.GRAMMAR__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case GrammarPackage.GRAMMAR__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case GrammarPackage.GRAMMAR__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case GrammarPackage.GRAMMAR__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GrammarPackage.GRAMMAR__LEXICON:
				return getLexicon();
			case GrammarPackage.GRAMMAR__META:
				return getMeta();
			case GrammarPackage.GRAMMAR__METADATA:
				return getMetadata();
			case GrammarPackage.GRAMMAR__TAG:
				return getTag();
			case GrammarPackage.GRAMMAR__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case GrammarPackage.GRAMMAR__RULE:
				return getRule();
			case GrammarPackage.GRAMMAR__BASE:
				return getBase();
			case GrammarPackage.GRAMMAR__LANG:
				return getLang();
			case GrammarPackage.GRAMMAR__MODE:
				return getMode();
			case GrammarPackage.GRAMMAR__ROOT:
				return getRoot();
			case GrammarPackage.GRAMMAR__TAG_FORMAT:
				return getTagFormat();
			case GrammarPackage.GRAMMAR__VERSION:
				return getVersion();
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
			case GrammarPackage.GRAMMAR__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GrammarPackage.GRAMMAR__LEXICON:
				getLexicon().clear();
				getLexicon().addAll((Collection<? extends Lexicon>)newValue);
				return;
			case GrammarPackage.GRAMMAR__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case GrammarPackage.GRAMMAR__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case GrammarPackage.GRAMMAR__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case GrammarPackage.GRAMMAR__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case GrammarPackage.GRAMMAR__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case GrammarPackage.GRAMMAR__BASE:
				setBase((String)newValue);
				return;
			case GrammarPackage.GRAMMAR__LANG:
				setLang((String)newValue);
				return;
			case GrammarPackage.GRAMMAR__MODE:
				setMode((ModeDatatype)newValue);
				return;
			case GrammarPackage.GRAMMAR__ROOT:
				setRoot((String)newValue);
				return;
			case GrammarPackage.GRAMMAR__TAG_FORMAT:
				setTagFormat((String)newValue);
				return;
			case GrammarPackage.GRAMMAR__VERSION:
				setVersion((String)newValue);
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
			case GrammarPackage.GRAMMAR__GROUP:
				getGroup().clear();
				return;
			case GrammarPackage.GRAMMAR__LEXICON:
				getLexicon().clear();
				return;
			case GrammarPackage.GRAMMAR__META:
				getMeta().clear();
				return;
			case GrammarPackage.GRAMMAR__METADATA:
				getMetadata().clear();
				return;
			case GrammarPackage.GRAMMAR__TAG:
				getTag().clear();
				return;
			case GrammarPackage.GRAMMAR__GROUP1:
				getGroup1().clear();
				return;
			case GrammarPackage.GRAMMAR__RULE:
				getRule().clear();
				return;
			case GrammarPackage.GRAMMAR__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case GrammarPackage.GRAMMAR__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case GrammarPackage.GRAMMAR__MODE:
				unsetMode();
				return;
			case GrammarPackage.GRAMMAR__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case GrammarPackage.GRAMMAR__TAG_FORMAT:
				setTagFormat(TAG_FORMAT_EDEFAULT);
				return;
			case GrammarPackage.GRAMMAR__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case GrammarPackage.GRAMMAR__GROUP:
				return group != null && !group.isEmpty();
			case GrammarPackage.GRAMMAR__LEXICON:
				return !getLexicon().isEmpty();
			case GrammarPackage.GRAMMAR__META:
				return !getMeta().isEmpty();
			case GrammarPackage.GRAMMAR__METADATA:
				return !getMetadata().isEmpty();
			case GrammarPackage.GRAMMAR__TAG:
				return !getTag().isEmpty();
			case GrammarPackage.GRAMMAR__GROUP1:
				return group1 != null && !group1.isEmpty();
			case GrammarPackage.GRAMMAR__RULE:
				return !getRule().isEmpty();
			case GrammarPackage.GRAMMAR__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case GrammarPackage.GRAMMAR__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case GrammarPackage.GRAMMAR__MODE:
				return isSetMode();
			case GrammarPackage.GRAMMAR__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
			case GrammarPackage.GRAMMAR__TAG_FORMAT:
				return TAG_FORMAT_EDEFAULT == null ? tagFormat != null : !TAG_FORMAT_EDEFAULT.equals(tagFormat);
			case GrammarPackage.GRAMMAR__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", group1: ");
		result.append(group1);
		result.append(", base: ");
		result.append(base);
		result.append(", lang: ");
		result.append(lang);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", root: ");
		result.append(root);
		result.append(", tagFormat: ");
		result.append(tagFormat);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //GrammarImpl
