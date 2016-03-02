/**
 */
package er_crows_foot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERCF Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_crows_foot.ERCFEntity#getName <em>Name</em>}</li>
 *   <li>{@link er_crows_foot.ERCFEntity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_crows_foot.Er_crows_footPackage#getERCFEntity()
 * @model
 * @generated
 */
public interface ERCFEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see er_crows_foot.Er_crows_footPackage#getERCFEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link er_crows_foot.ERCFEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link er_crows_foot.ERCFAttribute}.
	 * It is bidirectional and its opposite is '{@link er_crows_foot.ERCFAttribute#getInEntity <em>In Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see er_crows_foot.Er_crows_footPackage#getERCFEntity_Attributes()
	 * @see er_crows_foot.ERCFAttribute#getInEntity
	 * @model opposite="inEntity" containment="true"
	 * @generated
	 */
	EList<ERCFAttribute> getAttributes();

} // ERCFEntity
