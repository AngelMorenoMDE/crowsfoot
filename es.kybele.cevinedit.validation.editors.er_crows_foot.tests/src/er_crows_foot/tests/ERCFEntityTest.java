/**
 */
package er_crows_foot.tests;

import er_crows_foot.ERCFEntity;
import er_crows_foot.Er_crows_footFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERCF Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERCFEntityTest extends TestCase {

	/**
	 * The fixture for this ERCF Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERCFEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERCFEntityTest.class);
	}

	/**
	 * Constructs a new ERCF Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERCFEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ERCF Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ERCFEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ERCF Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERCFEntity getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Er_crows_footFactory.eINSTANCE.createERCFEntity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ERCFEntityTest
