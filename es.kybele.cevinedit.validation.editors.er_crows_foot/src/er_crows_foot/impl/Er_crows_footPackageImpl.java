/**
 */
package er_crows_foot.impl;

import er_crows_foot.ERCFAttribute;
import er_crows_foot.ERCFDiagram;
import er_crows_foot.ERCFEntity;
import er_crows_foot.ERCFRelationship;
import er_crows_foot.ERCFRelationshipCardinalityTypes;
import er_crows_foot.Er_crows_footFactory;
import er_crows_foot.Er_crows_footPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Er_crows_footPackageImpl extends EPackageImpl implements Er_crows_footPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ercfDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ercfEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ercfAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ercfRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ercfRelationshipCardinalityTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see er_crows_foot.Er_crows_footPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Er_crows_footPackageImpl() {
		super(eNS_URI, Er_crows_footFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Er_crows_footPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Er_crows_footPackage init() {
		if (isInited) return (Er_crows_footPackage)EPackage.Registry.INSTANCE.getEPackage(Er_crows_footPackage.eNS_URI);

		// Obtain or create and register package
		Er_crows_footPackageImpl theEr_crows_footPackage = (Er_crows_footPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Er_crows_footPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Er_crows_footPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEr_crows_footPackage.createPackageContents();

		// Initialize created meta-data
		theEr_crows_footPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEr_crows_footPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Er_crows_footPackage.eNS_URI, theEr_crows_footPackage);
		return theEr_crows_footPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERCFDiagram() {
		return ercfDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERCFDiagram_Entities() {
		return (EReference)ercfDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERCFDiagram_Relationships() {
		return (EReference)ercfDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERCFEntity() {
		return ercfEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFEntity_Name() {
		return (EAttribute)ercfEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERCFEntity_Attributes() {
		return (EReference)ercfEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERCFAttribute() {
		return ercfAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_Name() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_Type() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_IsPrimaryKey() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_IsForeingKey() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_IsUnique() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_IsNull() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_IsMultiValued() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFAttribute_IsDerived() {
		return (EAttribute)ercfAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERCFAttribute_InEntity() {
		return (EReference)ercfAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERCFRelationship() {
		return ercfRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFRelationship_Name() {
		return (EAttribute)ercfRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFRelationship_SourceCardinality() {
		return (EAttribute)ercfRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERCFRelationship_TargetCardinality() {
		return (EAttribute)ercfRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERCFRelationship_Target() {
		return (EReference)ercfRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getERCFRelationship_Source() {
		return (EReference)ercfRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERCFRelationshipCardinalityTypes() {
		return ercfRelationshipCardinalityTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_crows_footFactory getEr_crows_footFactory() {
		return (Er_crows_footFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ercfDiagramEClass = createEClass(ERCF_DIAGRAM);
		createEReference(ercfDiagramEClass, ERCF_DIAGRAM__ENTITIES);
		createEReference(ercfDiagramEClass, ERCF_DIAGRAM__RELATIONSHIPS);

		ercfEntityEClass = createEClass(ERCF_ENTITY);
		createEAttribute(ercfEntityEClass, ERCF_ENTITY__NAME);
		createEReference(ercfEntityEClass, ERCF_ENTITY__ATTRIBUTES);

		ercfAttributeEClass = createEClass(ERCF_ATTRIBUTE);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__NAME);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__TYPE);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__IS_PRIMARY_KEY);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__IS_FOREING_KEY);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__IS_UNIQUE);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__IS_NULL);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__IS_MULTI_VALUED);
		createEAttribute(ercfAttributeEClass, ERCF_ATTRIBUTE__IS_DERIVED);
		createEReference(ercfAttributeEClass, ERCF_ATTRIBUTE__IN_ENTITY);

		ercfRelationshipEClass = createEClass(ERCF_RELATIONSHIP);
		createEAttribute(ercfRelationshipEClass, ERCF_RELATIONSHIP__NAME);
		createEAttribute(ercfRelationshipEClass, ERCF_RELATIONSHIP__SOURCE_CARDINALITY);
		createEAttribute(ercfRelationshipEClass, ERCF_RELATIONSHIP__TARGET_CARDINALITY);
		createEReference(ercfRelationshipEClass, ERCF_RELATIONSHIP__TARGET);
		createEReference(ercfRelationshipEClass, ERCF_RELATIONSHIP__SOURCE);

		// Create enums
		ercfRelationshipCardinalityTypesEEnum = createEEnum(ERCF_RELATIONSHIP_CARDINALITY_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ercfDiagramEClass, ERCFDiagram.class, "ERCFDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERCFDiagram_Entities(), this.getERCFEntity(), null, "entities", null, 0, -1, ERCFDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERCFDiagram_Relationships(), this.getERCFRelationship(), null, "relationships", null, 0, -1, ERCFDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ercfEntityEClass, ERCFEntity.class, "ERCFEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERCFEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ERCFEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERCFEntity_Attributes(), this.getERCFAttribute(), this.getERCFAttribute_InEntity(), "attributes", null, 0, -1, ERCFEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ercfAttributeEClass, ERCFAttribute.class, "ERCFAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERCFAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_IsPrimaryKey(), ecorePackage.getEBoolean(), "isPrimaryKey", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_IsForeingKey(), ecorePackage.getEBoolean(), "isForeingKey", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_IsNull(), ecorePackage.getEBoolean(), "isNull", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_IsMultiValued(), ecorePackage.getEBoolean(), "isMultiValued", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFAttribute_IsDerived(), ecorePackage.getEBoolean(), "isDerived", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERCFAttribute_InEntity(), this.getERCFEntity(), this.getERCFEntity_Attributes(), "inEntity", null, 0, 1, ERCFAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ercfRelationshipEClass, ERCFRelationship.class, "ERCFRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERCFRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, ERCFRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFRelationship_SourceCardinality(), this.getERCFRelationshipCardinalityTypes(), "sourceCardinality", null, 0, 1, ERCFRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERCFRelationship_TargetCardinality(), this.getERCFRelationshipCardinalityTypes(), "targetCardinality", null, 0, 1, ERCFRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERCFRelationship_Target(), this.getERCFEntity(), null, "target", null, 1, 1, ERCFRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERCFRelationship_Source(), this.getERCFEntity(), null, "source", null, 1, 1, ERCFRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.class, "ERCFRelationshipCardinalityTypes");
		addEEnumLiteral(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.ONE);
		addEEnumLiteral(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.ONLY_ONE);
		addEEnumLiteral(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.ZERO_OR_ONE);
		addEEnumLiteral(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.ZERO_OR_MANY);
		addEEnumLiteral(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.ONE_OR_MANY);
		addEEnumLiteral(ercfRelationshipCardinalityTypesEEnum, ERCFRelationshipCardinalityTypes.MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //Er_crows_footPackageImpl
