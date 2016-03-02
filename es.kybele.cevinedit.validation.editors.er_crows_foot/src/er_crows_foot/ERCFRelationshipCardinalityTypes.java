/**
 */
package er_crows_foot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ERCF Relationship Cardinality Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see er_crows_foot.Er_crows_footPackage#getERCFRelationshipCardinalityTypes()
 * @model
 * @generated
 */
public enum ERCFRelationshipCardinalityTypes implements Enumerator {
	/**
	 * The '<em><b>ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE(0, "ONE", "ONE"),

	/**
	 * The '<em><b>ONLY ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_ONE(1, "ONLY_ONE", "ONLY_ONE"),

	/**
	 * The '<em><b>ZERO OR ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_OR_ONE(2, "ZERO_OR_ONE", "ZERO_OR_ONE"),

	/**
	 * The '<em><b>ZERO OR MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_OR_MANY(3, "ZERO_OR_MANY", "ZERO_OR_MANY"),

	/**
	 * The '<em><b>ONE OR MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_OR_MANY(4, "ONE_OR_MANY", "ONE_OR_MANY"),

	/**
	 * The '<em><b>MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY(5, "MANY", "MANY");

	/**
	 * The '<em><b>ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_VALUE = 0;

	/**
	 * The '<em><b>ONLY ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONLY ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONLY_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_ONE_VALUE = 1;

	/**
	 * The '<em><b>ZERO OR ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO OR ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_ONE_VALUE = 2;

	/**
	 * The '<em><b>ZERO OR MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO OR MANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_MANY_VALUE = 3;

	/**
	 * The '<em><b>ONE OR MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE OR MANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_OR_MANY_VALUE = 4;

	/**
	 * The '<em><b>MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY_VALUE = 5;

	/**
	 * An array of all the '<em><b>ERCF Relationship Cardinality Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERCFRelationshipCardinalityTypes[] VALUES_ARRAY =
		new ERCFRelationshipCardinalityTypes[] {
			ONE,
			ONLY_ONE,
			ZERO_OR_ONE,
			ZERO_OR_MANY,
			ONE_OR_MANY,
			MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>ERCF Relationship Cardinality Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ERCFRelationshipCardinalityTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERCF Relationship Cardinality Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERCFRelationshipCardinalityTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERCFRelationshipCardinalityTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERCF Relationship Cardinality Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERCFRelationshipCardinalityTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERCFRelationshipCardinalityTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERCF Relationship Cardinality Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERCFRelationshipCardinalityTypes get(int value) {
		switch (value) {
			case ONE_VALUE: return ONE;
			case ONLY_ONE_VALUE: return ONLY_ONE;
			case ZERO_OR_ONE_VALUE: return ZERO_OR_ONE;
			case ZERO_OR_MANY_VALUE: return ZERO_OR_MANY;
			case ONE_OR_MANY_VALUE: return ONE_OR_MANY;
			case MANY_VALUE: return MANY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ERCFRelationshipCardinalityTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ERCFRelationshipCardinalityTypes
