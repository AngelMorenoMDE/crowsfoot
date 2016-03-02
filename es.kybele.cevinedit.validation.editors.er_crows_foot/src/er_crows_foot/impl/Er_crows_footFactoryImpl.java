/**
 */
package er_crows_foot.impl;

import er_crows_foot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Er_crows_footFactoryImpl extends EFactoryImpl implements Er_crows_footFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Er_crows_footFactory init() {
		try {
			Er_crows_footFactory theEr_crows_footFactory = (Er_crows_footFactory)EPackage.Registry.INSTANCE.getEFactory(Er_crows_footPackage.eNS_URI);
			if (theEr_crows_footFactory != null) {
				return theEr_crows_footFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Er_crows_footFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_crows_footFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Er_crows_footPackage.ERCF_DIAGRAM: return createERCFDiagram();
			case Er_crows_footPackage.ERCF_ENTITY: return createERCFEntity();
			case Er_crows_footPackage.ERCF_ATTRIBUTE: return createERCFAttribute();
			case Er_crows_footPackage.ERCF_RELATIONSHIP: return createERCFRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Er_crows_footPackage.ERCF_RELATIONSHIP_CARDINALITY_TYPES:
				return createERCFRelationshipCardinalityTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Er_crows_footPackage.ERCF_RELATIONSHIP_CARDINALITY_TYPES:
				return convertERCFRelationshipCardinalityTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFDiagram createERCFDiagram() {
		ERCFDiagramImpl ercfDiagram = new ERCFDiagramImpl();
		return ercfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntity createERCFEntity() {
		ERCFEntityImpl ercfEntity = new ERCFEntityImpl();
		return ercfEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFAttribute createERCFAttribute() {
		ERCFAttributeImpl ercfAttribute = new ERCFAttributeImpl();
		return ercfAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFRelationship createERCFRelationship() {
		ERCFRelationshipImpl ercfRelationship = new ERCFRelationshipImpl();
		return ercfRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFRelationshipCardinalityTypes createERCFRelationshipCardinalityTypesFromString(EDataType eDataType, String initialValue) {
		ERCFRelationshipCardinalityTypes result = ERCFRelationshipCardinalityTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERCFRelationshipCardinalityTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_crows_footPackage getEr_crows_footPackage() {
		return (Er_crows_footPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Er_crows_footPackage getPackage() {
		return Er_crows_footPackage.eINSTANCE;
	}

} //Er_crows_footFactoryImpl
