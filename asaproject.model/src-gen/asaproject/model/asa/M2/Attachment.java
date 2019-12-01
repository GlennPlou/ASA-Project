/**
 */
package asaproject.model.asa.M2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.Attachment#getPorts <em>Ports</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.Attachment#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.M2.M2Package#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends Link {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link asaproject.model.asa.M2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see asaproject.model.asa.M2.M2Package#getAttachment_Ports()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link asaproject.model.asa.M2.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see asaproject.model.asa.M2.M2Package#getAttachment_Roles()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Role> getRoles();

} // Attachment
