/**
 */
package er_crows_foot.impl;

import er_crows_foot.ERCFEntity;
import er_crows_foot.ERCFRelationship;
import er_crows_foot.ERCFRelationshipCardinalityTypes;
import er_crows_foot.Er_crows_footPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERCF Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_crows_foot.impl.ERCFRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFRelationshipImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFRelationshipImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFRelationshipImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERCFRelationshipImpl extends MinimalEObjectImpl.Container implements ERCFRelationship {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ERCFRelationshipCardinalityTypes SOURCE_CARDINALITY_EDEFAULT = ERCFRelationshipCardinalityTypes.ONE;

	/**
	 * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected ERCFRelationshipCardinalityTypes sourceCardinality = SOURCE_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ERCFRelationshipCardinalityTypes TARGET_CARDINALITY_EDEFAULT = ERCFRelationshipCardinalityTypes.ONE;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected ERCFRelationshipCardinalityTypes targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ERCFEntity target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ERCFEntity source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERCFRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_crows_footPackage.Literals.ERCF_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFRelationshipCardinalityTypes getSourceCardinality() {
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCardinality(ERCFRelationshipCardinalityTypes newSourceCardinality) {
		ERCFRelationshipCardinalityTypes oldSourceCardinality = sourceCardinality;
		sourceCardinality = newSourceCardinality == null ? SOURCE_CARDINALITY_EDEFAULT : newSourceCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE_CARDINALITY, oldSourceCardinality, sourceCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFRelationshipCardinalityTypes getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCardinality(ERCFRelationshipCardinalityTypes newTargetCardinality) {
		ERCFRelationshipCardinalityTypes oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ERCFEntity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ERCFEntity newTarget) {
		ERCFEntity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntity getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ERCFEntity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ERCFEntity newSource) {
		ERCFEntity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_RELATIONSHIP__NAME:
				return getName();
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE_CARDINALITY:
				return getSourceCardinality();
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET_CARDINALITY:
				return getTargetCardinality();
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE_CARDINALITY:
				setSourceCardinality((ERCFRelationshipCardinalityTypes)newValue);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET_CARDINALITY:
				setTargetCardinality((ERCFRelationshipCardinalityTypes)newValue);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET:
				setTarget((ERCFEntity)newValue);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE:
				setSource((ERCFEntity)newValue);
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
			case Er_crows_footPackage.ERCF_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE_CARDINALITY:
				setSourceCardinality(SOURCE_CARDINALITY_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET:
				setTarget((ERCFEntity)null);
				return;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE:
				setSource((ERCFEntity)null);
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
			case Er_crows_footPackage.ERCF_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE_CARDINALITY:
				return sourceCardinality != SOURCE_CARDINALITY_EDEFAULT;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__TARGET:
				return target != null;
			case Er_crows_footPackage.ERCF_RELATIONSHIP__SOURCE:
				return source != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", sourceCardinality: ");
		result.append(sourceCardinality);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(')');
		return result.toString();
	}

} //ERCFRelationshipImpl
