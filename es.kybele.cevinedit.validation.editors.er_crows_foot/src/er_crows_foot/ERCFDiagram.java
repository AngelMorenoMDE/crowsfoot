/**
 */
package er_crows_foot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERCF Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_crows_foot.ERCFDiagram#getEntities <em>Entities</em>}</li>
 *   <li>{@link er_crows_foot.ERCFDiagram#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_crows_foot.Er_crows_footPackage#getERCFDiagram()
 * @model
 * @generated
 */
public interface ERCFDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link er_crows_foot.ERCFEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see er_crows_foot.Er_crows_footPackage#getERCFDiagram_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERCFEntity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link er_crows_foot.ERCFRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see er_crows_foot.Er_crows_footPackage#getERCFDiagram_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERCFRelationship> getRelationships();

} // ERCFDiagram
