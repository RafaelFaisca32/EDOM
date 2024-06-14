/**
 */
package isep.assignment2.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isep.assignment2.cr2.Decision#getHas <em>Has</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Decision#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see isep.assignment2.cr2.Cr2Package#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getDecision_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHas();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getDecision_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Decision
