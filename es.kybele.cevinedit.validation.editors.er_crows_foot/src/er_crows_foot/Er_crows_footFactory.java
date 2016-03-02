/**
 */
package er_crows_foot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see er_crows_foot.Er_crows_footPackage
 * @generated
 */
public interface Er_crows_footFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Er_crows_footFactory eINSTANCE = er_crows_foot.impl.Er_crows_footFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ERCF Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERCF Diagram</em>'.
	 * @generated
	 */
	ERCFDiagram createERCFDiagram();

	/**
	 * Returns a new object of class '<em>ERCF Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERCF Entity</em>'.
	 * @generated
	 */
	ERCFEntity createERCFEntity();

	/**
	 * Returns a new object of class '<em>ERCF Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERCF Attribute</em>'.
	 * @generated
	 */
	ERCFAttribute createERCFAttribute();

	/**
	 * Returns a new object of class '<em>ERCF Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERCF Relationship</em>'.
	 * @generated
	 */
	ERCFRelationship createERCFRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Er_crows_footPackage getEr_crows_footPackage();

} //Er_crows_footFactory
