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
package de.dfki.iui.mmds.core.model.io_interfaces;

import de.dfki.iui.mmds.core.model.base.BObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eye Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eyegaze detail data for a single eye.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosX <em>Gaze Pos X</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosY <em>Gaze Pos Y</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosX <em>Camera Pos X</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosY <em>Camera Pos Y</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getPupilDiameter <em>Pupil Diameter</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getConfusionConfidence <em>Confusion Confidence</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData()
 * @model
 * @generated
 */
public interface EyeData extends BObject {
	/**
	 * Returns the value of the '<em><b>Gaze Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the horizontal position where the subjects’ gaze is at. Each eye has its own data, independent of the other eye. From the subjects’ perspective, it normally increases to the right and downwards. However, the range and resolution is dependent of the current calibration set. For the calibration software made by some manufacturers (e.g. Tobii) to track gaze on a computer screen for instance, the upper left corner of the screen is point (0,0) and lower right corner is (1,1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gaze Pos X</em>' attribute.
	 * @see #setGazePosX(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_GazePosX()
	 * @model
	 * @generated
	 */
	float getGazePosX();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosX <em>Gaze Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gaze Pos X</em>' attribute.
	 * @see #getGazePosX()
	 * @generated
	 */
	void setGazePosX(float value);

	/**
	 * Returns the value of the '<em><b>Gaze Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the vertical position where the subjects’ gaze is at. Each eye has its own data, independent of the other eye. From the subjects’ perspective, it normally increases to the right and downwards. However, the range and resolution is dependent of the current calibration set. For the calibration software made by some manufacturers (e.g. Tobii) to track gaze on a computer screen for instance, the upper left corner of the screen is point (0,0) and lower right corner is (1,1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gaze Pos Y</em>' attribute.
	 * @see #setGazePosY(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_GazePosY()
	 * @model
	 * @generated
	 */
	float getGazePosY();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getGazePosY <em>Gaze Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gaze Pos Y</em>' attribute.
	 * @see #getGazePosY()
	 * @generated
	 */
	void setGazePosY(float value);

	/**
	 * Returns the value of the '<em><b>Camera Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the horizontal position of the eye as seen by the eye tracker. This position has nothing to do with the gaze target position. Each eye has its own data, independent of the other eye. The upper left corner of the eye tracker sensor is (0, 0) and lower right sensor is (1, 1). Note that the values are from the eye tracker point of view. If subject is moving to the right, the values are decreasing. The purpose of this data is mainly to give a good idea of how to place the subject to make the tracking conditions at best.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera Pos X</em>' attribute.
	 * @see #setCameraPosX(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_CameraPosX()
	 * @model
	 * @generated
	 */
	float getCameraPosX();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosX <em>Camera Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Pos X</em>' attribute.
	 * @see #getCameraPosX()
	 * @generated
	 */
	void setCameraPosX(float value);

	/**
	 * Returns the value of the '<em><b>Camera Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the vertical position of the eye as seen by the eye tracker. This position has nothing to do with the gaze target position. Each eye has its own data, independent of the other eye. The upper left corner of the eye tracker sensor is (0, 0) and lower right sensor is (1, 1). Note that the values are from the eye tracker point of view. If subject is moving to the right, the values are decreasing. The purpose of this data is mainly to give a good idea of how to place the subject to make the tracking conditions at best.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera Pos Y</em>' attribute.
	 * @see #setCameraPosY(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_CameraPosY()
	 * @model
	 * @generated
	 */
	float getCameraPosY();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getCameraPosY <em>Camera Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Pos Y</em>' attribute.
	 * @see #getCameraPosY()
	 * @generated
	 */
	void setCameraPosY(float value);

	/**
	 * Returns the value of the '<em><b>Pupil Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the longest possible chord of the ellipse fitted to the pupil of the eye, measured in millimeter. Each eye has its own data, independent of the other eye. The values given are dependent of the distance measure, so there are the same accuracy uncertainties. Therefore, the values given are best used as a set of relative values, not absolute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pupil Diameter</em>' attribute.
	 * @see #setPupilDiameter(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_PupilDiameter()
	 * @model
	 * @generated
	 */
	float getPupilDiameter();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getPupilDiameter <em>Pupil Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pupil Diameter</em>' attribute.
	 * @see #getPupilDiameter()
	 * @generated
	 */
	void setPupilDiameter(float value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the shortest distance between the eye tracker sensor and the eye, measured in millimeter. Each eye has its own data, independent of the other eye. The values given are best used as a set of relative values, not absolute. If absolute values are required by the application being built, have in mind that following parameters will highly affect the accuracy: (1) Glasses. (2) How much the cornea of the subjects’ eye is diverting from the assumed average human being eye cornea.
	 * It is normal that a person wearing glasses and have a cornea that diverts by a few percent will have an error of 100 mm when distance measure is 600 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Confusion Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an estimate of how certain the eye tracker is that the data given for an eye really belongs to that eye.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confusion Confidence</em>' attribute.
	 * @see #setConfusionConfidence(float)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getEyeData_ConfusionConfidence()
	 * @model
	 * @generated
	 */
	float getConfusionConfidence();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.EyeData#getConfusionConfidence <em>Confusion Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confusion Confidence</em>' attribute.
	 * @see #getConfusionConfidence()
	 * @generated
	 */
	void setConfusionConfidence(float value);

} // EyeData
