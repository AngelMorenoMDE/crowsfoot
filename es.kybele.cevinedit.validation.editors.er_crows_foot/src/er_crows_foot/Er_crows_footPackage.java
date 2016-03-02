/**
 */
package er_crows_foot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see er_crows_foot.Er_crows_footFactory
 * @model kind="package"
 * @generated
 */
public interface Er_crows_footPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "er_crows_foot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/gmf/er_crows_foot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "er_crows_foot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Er_crows_footPackage eINSTANCE = er_crows_foot.impl.Er_crows_footPackageImpl.init();

	/**
	 * The meta object id for the '{@link er_crows_foot.impl.ERCFDiagramImpl <em>ERCF Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_crows_foot.impl.ERCFDiagramImpl
	 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFDiagram()
	 * @generated
	 */
	int ERCF_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_DIAGRAM__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_DIAGRAM__RELATIONSHIPS = 1;

	/**
	 * The number of structural features of the '<em>ERCF Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ERCF Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_crows_foot.impl.ERCFEntityImpl <em>ERCF Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_crows_foot.impl.ERCFEntityImpl
	 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFEntity()
	 * @generated
	 */
	int ERCF_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ENTITY__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>ERCF Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ERCF Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_crows_foot.impl.ERCFAttributeImpl <em>ERCF Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_crows_foot.impl.ERCFAttributeImpl
	 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFAttribute()
	 * @generated
	 */
	int ERCF_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IS_PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Is Foreing Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IS_FOREING_KEY = 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IS_UNIQUE = 4;

	/**
	 * The feature id for the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IS_NULL = 5;

	/**
	 * The feature id for the '<em><b>Is Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IS_MULTI_VALUED = 6;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IS_DERIVED = 7;

	/**
	 * The feature id for the '<em><b>In Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE__IN_ENTITY = 8;

	/**
	 * The number of structural features of the '<em>ERCF Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>ERCF Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_crows_foot.impl.ERCFRelationshipImpl <em>ERCF Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_crows_foot.impl.ERCFRelationshipImpl
	 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFRelationship()
	 * @generated
	 */
	int ERCF_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP__SOURCE_CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP__TARGET_CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>ERCF Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>ERCF Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERCF_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link er_crows_foot.ERCFRelationshipCardinalityTypes <em>ERCF Relationship Cardinality Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
	 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFRelationshipCardinalityTypes()
	 * @generated
	 */
	int ERCF_RELATIONSHIP_CARDINALITY_TYPES = 4;


	/**
	 * Returns the meta object for class '{@link er_crows_foot.ERCFDiagram <em>ERCF Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERCF Diagram</em>'.
	 * @see er_crows_foot.ERCFDiagram
	 * @generated
	 */
	EClass getERCFDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link er_crows_foot.ERCFDiagram#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see er_crows_foot.ERCFDiagram#getEntities()
	 * @see #getERCFDiagram()
	 * @generated
	 */
	EReference getERCFDiagram_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link er_crows_foot.ERCFDiagram#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see er_crows_foot.ERCFDiagram#getRelationships()
	 * @see #getERCFDiagram()
	 * @generated
	 */
	EReference getERCFDiagram_Relationships();

	/**
	 * Returns the meta object for class '{@link er_crows_foot.ERCFEntity <em>ERCF Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERCF Entity</em>'.
	 * @see er_crows_foot.ERCFEntity
	 * @generated
	 */
	EClass getERCFEntity();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er_crows_foot.ERCFEntity#getName()
	 * @see #getERCFEntity()
	 * @generated
	 */
	EAttribute getERCFEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link er_crows_foot.ERCFEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see er_crows_foot.ERCFEntity#getAttributes()
	 * @see #getERCFEntity()
	 * @generated
	 */
	EReference getERCFEntity_Attributes();

	/**
	 * Returns the meta object for class '{@link er_crows_foot.ERCFAttribute <em>ERCF Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERCF Attribute</em>'.
	 * @see er_crows_foot.ERCFAttribute
	 * @generated
	 */
	EClass getERCFAttribute();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er_crows_foot.ERCFAttribute#getName()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see er_crows_foot.ERCFAttribute#getType()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#isIsPrimaryKey <em>Is Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Key</em>'.
	 * @see er_crows_foot.ERCFAttribute#isIsPrimaryKey()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_IsPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#isIsForeingKey <em>Is Foreing Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Foreing Key</em>'.
	 * @see er_crows_foot.ERCFAttribute#isIsForeingKey()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_IsForeingKey();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see er_crows_foot.ERCFAttribute#isIsUnique()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#isIsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Null</em>'.
	 * @see er_crows_foot.ERCFAttribute#isIsNull()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_IsNull();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#isIsMultiValued <em>Is Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Valued</em>'.
	 * @see er_crows_foot.ERCFAttribute#isIsMultiValued()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_IsMultiValued();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFAttribute#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see er_crows_foot.ERCFAttribute#isIsDerived()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EAttribute getERCFAttribute_IsDerived();

	/**
	 * Returns the meta object for the container reference '{@link er_crows_foot.ERCFAttribute#getInEntity <em>In Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity</em>'.
	 * @see er_crows_foot.ERCFAttribute#getInEntity()
	 * @see #getERCFAttribute()
	 * @generated
	 */
	EReference getERCFAttribute_InEntity();

	/**
	 * Returns the meta object for class '{@link er_crows_foot.ERCFRelationship <em>ERCF Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERCF Relationship</em>'.
	 * @see er_crows_foot.ERCFRelationship
	 * @generated
	 */
	EClass getERCFRelationship();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see er_crows_foot.ERCFRelationship#getName()
	 * @see #getERCFRelationship()
	 * @generated
	 */
	EAttribute getERCFRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFRelationship#getSourceCardinality <em>Source Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cardinality</em>'.
	 * @see er_crows_foot.ERCFRelationship#getSourceCardinality()
	 * @see #getERCFRelationship()
	 * @generated
	 */
	EAttribute getERCFRelationship_SourceCardinality();

	/**
	 * Returns the meta object for the attribute '{@link er_crows_foot.ERCFRelationship#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see er_crows_foot.ERCFRelationship#getTargetCardinality()
	 * @see #getERCFRelationship()
	 * @generated
	 */
	EAttribute getERCFRelationship_TargetCardinality();

	/**
	 * Returns the meta object for the reference '{@link er_crows_foot.ERCFRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see er_crows_foot.ERCFRelationship#getTarget()
	 * @see #getERCFRelationship()
	 * @generated
	 */
	EReference getERCFRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link er_crows_foot.ERCFRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see er_crows_foot.ERCFRelationship#getSource()
	 * @see #getERCFRelationship()
	 * @generated
	 */
	EReference getERCFRelationship_Source();

	/**
	 * Returns the meta object for enum '{@link er_crows_foot.ERCFRelationshipCardinalityTypes <em>ERCF Relationship Cardinality Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERCF Relationship Cardinality Types</em>'.
	 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
	 * @generated
	 */
	EEnum getERCFRelationshipCardinalityTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Er_crows_footFactory getEr_crows_footFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link er_crows_foot.impl.ERCFDiagramImpl <em>ERCF Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_crows_foot.impl.ERCFDiagramImpl
		 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFDiagram()
		 * @generated
		 */
		EClass ERCF_DIAGRAM = eINSTANCE.getERCFDiagram();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERCF_DIAGRAM__ENTITIES = eINSTANCE.getERCFDiagram_Entities();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERCF_DIAGRAM__RELATIONSHIPS = eINSTANCE.getERCFDiagram_Relationships();

		/**
		 * The meta object literal for the '{@link er_crows_foot.impl.ERCFEntityImpl <em>ERCF Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_crows_foot.impl.ERCFEntityImpl
		 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFEntity()
		 * @generated
		 */
		EClass ERCF_ENTITY = eINSTANCE.getERCFEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ENTITY__NAME = eINSTANCE.getERCFEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERCF_ENTITY__ATTRIBUTES = eINSTANCE.getERCFEntity_Attributes();

		/**
		 * The meta object literal for the '{@link er_crows_foot.impl.ERCFAttributeImpl <em>ERCF Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_crows_foot.impl.ERCFAttributeImpl
		 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFAttribute()
		 * @generated
		 */
		EClass ERCF_ATTRIBUTE = eINSTANCE.getERCFAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__NAME = eINSTANCE.getERCFAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__TYPE = eINSTANCE.getERCFAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Is Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__IS_PRIMARY_KEY = eINSTANCE.getERCFAttribute_IsPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Is Foreing Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__IS_FOREING_KEY = eINSTANCE.getERCFAttribute_IsForeingKey();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__IS_UNIQUE = eINSTANCE.getERCFAttribute_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__IS_NULL = eINSTANCE.getERCFAttribute_IsNull();

		/**
		 * The meta object literal for the '<em><b>Is Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__IS_MULTI_VALUED = eINSTANCE.getERCFAttribute_IsMultiValued();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_ATTRIBUTE__IS_DERIVED = eINSTANCE.getERCFAttribute_IsDerived();

		/**
		 * The meta object literal for the '<em><b>In Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERCF_ATTRIBUTE__IN_ENTITY = eINSTANCE.getERCFAttribute_InEntity();

		/**
		 * The meta object literal for the '{@link er_crows_foot.impl.ERCFRelationshipImpl <em>ERCF Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_crows_foot.impl.ERCFRelationshipImpl
		 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFRelationship()
		 * @generated
		 */
		EClass ERCF_RELATIONSHIP = eINSTANCE.getERCFRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_RELATIONSHIP__NAME = eINSTANCE.getERCFRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Source Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_RELATIONSHIP__SOURCE_CARDINALITY = eINSTANCE.getERCFRelationship_SourceCardinality();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERCF_RELATIONSHIP__TARGET_CARDINALITY = eINSTANCE.getERCFRelationship_TargetCardinality();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERCF_RELATIONSHIP__TARGET = eINSTANCE.getERCFRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERCF_RELATIONSHIP__SOURCE = eINSTANCE.getERCFRelationship_Source();

		/**
		 * The meta object literal for the '{@link er_crows_foot.ERCFRelationshipCardinalityTypes <em>ERCF Relationship Cardinality Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see er_crows_foot.ERCFRelationshipCardinalityTypes
		 * @see er_crows_foot.impl.Er_crows_footPackageImpl#getERCFRelationshipCardinalityTypes()
		 * @generated
		 */
		EEnum ERCF_RELATIONSHIP_CARDINALITY_TYPES = eINSTANCE.getERCFRelationshipCardinalityTypes();

	}

} //Er_crows_footPackage
