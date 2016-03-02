/**
 */
package er_crows_foot.impl;

import er_crows_foot.ERCFDiagram;
import er_crows_foot.ERCFEntity;
import er_crows_foot.ERCFRelationship;
import er_crows_foot.Er_crows_footPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERCF Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link er_crows_foot.impl.ERCFDiagramImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link er_crows_foot.impl.ERCFDiagramImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERCFDiagramImpl extends MinimalEObjectImpl.Container implements ERCFDiagram {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ERCFEntity> entities;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<ERCFRelationship> relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERCFDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Er_crows_footPackage.Literals.ERCF_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERCFEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<ERCFEntity>(ERCFEntity.class, this, Er_crows_footPackage.ERCF_DIAGRAM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERCFRelationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<ERCFRelationship>(ERCFRelationship.class, this, Er_crows_footPackage.ERCF_DIAGRAM__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_DIAGRAM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case Er_crows_footPackage.ERCF_DIAGRAM__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_DIAGRAM__ENTITIES:
				return getEntities();
			case Er_crows_footPackage.ERCF_DIAGRAM__RELATIONSHIPS:
				return getRelationships();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Er_crows_footPackage.ERCF_DIAGRAM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends ERCFEntity>)newValue);
				return;
			case Er_crows_footPackage.ERCF_DIAGRAM__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends ERCFRelationship>)newValue);
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
			case Er_crows_footPackage.ERCF_DIAGRAM__ENTITIES:
				getEntities().clear();
				return;
			case Er_crows_footPackage.ERCF_DIAGRAM__RELATIONSHIPS:
				getRelationships().clear();
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
			case Er_crows_footPackage.ERCF_DIAGRAM__ENTITIES:
				return entities != null && !entities.isEmpty();
			case Er_crows_footPackage.ERCF_DIAGRAM__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERCFDiagramImpl
