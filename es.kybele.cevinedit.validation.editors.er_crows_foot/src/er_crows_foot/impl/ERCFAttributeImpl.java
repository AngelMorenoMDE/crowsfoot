/**
 */
package er_crows_foot.impl;

import er_crows_foot.ERCFAttribute;
import er_crows_foot.ERCFEntity;
import er_crows_foot.Er_crows_footPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERCF Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#isIsForeingKey <em>Is Foreing Key</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#isIsMultiValued <em>Is Multi Valued</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFAttributeImpl#getInEntity <em>In Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERCFAttributeImpl extends MinimalEObjectImpl.Container implements ERCFAttribute {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryKey = IS_PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForeingKey() <em>Is Foreing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForeingKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOREING_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForeingKey() <em>Is Foreing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForeingKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isForeingKey = IS_FOREING_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNull = IS_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultiValued() <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiValued()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTI_VALUED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiValued() <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiValued()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiValued = IS_MULTI_VALUED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERCFAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_crows_footPackage.Literals.ERCF_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimaryKey(boolean newIsPrimaryKey) {
		boolean oldIsPrimaryKey = isPrimaryKey;
		isPrimaryKey = newIsPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IS_PRIMARY_KEY, oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForeingKey() {
		return isForeingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForeingKey(boolean newIsForeingKey) {
		boolean oldIsForeingKey = isForeingKey;
		isForeingKey = newIsForeingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IS_FOREING_KEY, oldIsForeingKey, isForeingKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNull() {
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNull(boolean newIsNull) {
		boolean oldIsNull = isNull;
		isNull = newIsNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IS_NULL, oldIsNull, isNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiValued() {
		return isMultiValued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiValued(boolean newIsMultiValued) {
		boolean oldIsMultiValued = isMultiValued;
		isMultiValued = newIsMultiValued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IS_MULTI_VALUED, oldIsMultiValued, isMultiValued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntity getInEntity() {
		if (eContainerFeatureID() != Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY) return null;
		return (ERCFEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntity(ERCFEntity newInEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntity, Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntity(ERCFEntity newInEntity) {
		if (newInEntity != eInternalContainer() || (eContainerFeatureID() != Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY && newInEntity != null)) {
			if (EcoreUtil.isAncestor(this, newInEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntity != null)
				msgs = ((InternalEObject)newInEntity).eInverseAdd(this, Er_crows_footPackage.ERCF_ENTITY__ATTRIBUTES, ERCFEntity.class, msgs);
			msgs = basicSetInEntity(newInEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY, newInEntity, newInEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInEntity((ERCFEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				return basicSetInEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				return eInternalContainer().eInverseRemove(this, Er_crows_footPackage.ERCF_ENTITY__ATTRIBUTES, ERCFEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_ATTRIBUTE__NAME:
				return getName();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__TYPE:
				return getType();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_PRIMARY_KEY:
				return isIsPrimaryKey();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_FOREING_KEY:
				return isIsForeingKey();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_UNIQUE:
				return isIsUnique();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_NULL:
				return isIsNull();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_MULTI_VALUED:
				return isIsMultiValued();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_DERIVED:
				return isIsDerived();
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				return getInEntity();
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
			case Er_crows_footPackage.ERCF_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_PRIMARY_KEY:
				setIsPrimaryKey((Boolean)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_FOREING_KEY:
				setIsForeingKey((Boolean)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_NULL:
				setIsNull((Boolean)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_MULTI_VALUED:
				setIsMultiValued((Boolean)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				setInEntity((ERCFEntity)newValue);
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
			case Er_crows_footPackage.ERCF_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_PRIMARY_KEY:
				setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_FOREING_KEY:
				setIsForeingKey(IS_FOREING_KEY_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_NULL:
				setIsNull(IS_NULL_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_MULTI_VALUED:
				setIsMultiValued(IS_MULTI_VALUED_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				setInEntity((ERCFEntity)null);
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
			case Er_crows_footPackage.ERCF_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Er_crows_footPackage.ERCF_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_PRIMARY_KEY:
				return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_FOREING_KEY:
				return isForeingKey != IS_FOREING_KEY_EDEFAULT;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_NULL:
				return isNull != IS_NULL_EDEFAULT;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_MULTI_VALUED:
				return isMultiValued != IS_MULTI_VALUED_EDEFAULT;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case Er_crows_footPackage.ERCF_ATTRIBUTE__IN_ENTITY:
				return getInEntity() != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(", isForeingKey: ");
		result.append(isForeingKey);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isNull: ");
		result.append(isNull);
		result.append(", isMultiValued: ");
		result.append(isMultiValued);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //ERCFAttributeImpl
