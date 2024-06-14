/**
 */
package sirius.assignment.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.Condition#getStop_condition <em>Stop condition</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop condition</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.assignment.cr2.WhileDecision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop condition</em>' containment reference list.
	 * @see sirius.assignment.cr2.Cr2Package#getCondition_Stop_condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<WhileDecision> getStop_condition();

} // Condition
