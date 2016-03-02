/**
 */
package er_crows_foot.util;

import er_crows_foot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see er_crows_foot.Er_crows_footPackage
 * @generated
 */
public class Er_crows_footAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Er_crows_footPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Er_crows_footAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Er_crows_footPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Er_crows_footSwitch<Adapter> modelSwitch =
		new Er_crows_footSwitch<Adapter>() {
			@Override
			public Adapter caseERCFDiagram(ERCFDiagram object) {
				return createERCFDiagramAdapter();
			}
			@Override
			public Adapter caseERCFEntity(ERCFEntity object) {
				return createERCFEntityAdapter();
			}
			@Override
			public Adapter caseERCFAttribute(ERCFAttribute object) {
				return createERCFAttributeAdapter();
			}
			@Override
			public Adapter caseERCFRelationship(ERCFRelationship object) {
				return createERCFRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link er_crows_foot.ERCFDiagram <em>ERCF Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_crows_foot.ERCFDiagram
	 * @generated
	 */
	public Adapter createERCFDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_crows_foot.ERCFEntity <em>ERCF Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_crows_foot.ERCFEntity
	 * @generated
	 */
	public Adapter createERCFEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_crows_foot.ERCFAttribute <em>ERCF Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_crows_foot.ERCFAttribute
	 * @generated
	 */
	public Adapter createERCFAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link er_crows_foot.ERCFRelationship <em>ERCF Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see er_crows_foot.ERCFRelationship
	 * @generated
	 */
	public Adapter createERCFRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Er_crows_footAdapterFactory
