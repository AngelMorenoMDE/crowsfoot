/**
 */
package er_crows_foot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERCF Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link er_crows_foot.ERCFRelationship#getName <em>Name</em>}</li>
 *   <li>{@link er_crows_foot.ERCFRelationship#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link er_crows_foot.ERCFRelationship#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link er_crows_foot.ERCFRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link er_crows_foot.ERCFRelationship#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationship()
 * @model
 * @generated
 */
public interface ERCFRelationship extends EObject {
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
	 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link er_crows_foot.ERCFRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link er_crows_foot.ERCFRelationshipCardinalityTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cardinality</em>' attribute.
	 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
	 * @see #setSourceCardinality(ERCFRelationshipCardinalityTypes)
	 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationship_SourceCardinality()
	 * @model
	 * @generated
	 */
	ERCFRelationshipCardinalityTypes getSourceCardinality();

	/**
	 * Sets the value of the '{@link er_crows_foot.ERCFRelationship#getSourceCardinality <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cardinality</em>' attribute.
	 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
	 * @see #getSourceCardinality()
	 * @generated
	 */
	void setSourceCardinality(ERCFRelationshipCardinalityTypes value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link er_crows_foot.ERCFRelationshipCardinalityTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
	 * @see #setTargetCardinality(ERCFRelationshipCardinalityTypes)
	 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationship_TargetCardinality()
	 * @model
	 * @generated
	 */
	ERCFRelationshipCardinalityTypes getTargetCardinality();

	/**
	 * Sets the value of the '{@link er_crows_foot.ERCFRelationship#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(ERCFRelationshipCardinalityTypes value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ERCFEntity)
	 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	ERCFEntity getTarget();

	/**
	 * Sets the value of the '{@link er_crows_foot.ERCFRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ERCFEntity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ERCFEntity)
	 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	ERCFEntity getSource();

	/**
	 * Sets the value of the '{@link er_crows_foot.ERCFRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ERCFEntity value);

} // ERCFRelationship
