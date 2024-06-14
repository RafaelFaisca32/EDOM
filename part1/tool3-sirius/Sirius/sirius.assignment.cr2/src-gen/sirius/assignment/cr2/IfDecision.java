/**
 */
package sirius.assignment.cr2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.IfDecision#getContains <em>Contains</em>}</li>
 *   <li>{@link sirius.assignment.cr2.IfDecision#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getIfDecision()
 * @model
 * @generated
 */
public interface IfDecision extends Decision {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.assignment.cr2.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see sirius.assignment.cr2.Cr2Package#getIfDecision_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getContains();

	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' reference list.
	 * The list contents are of type {@link sirius.assignment.cr2.IfDecision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' reference list.
	 * @see sirius.assignment.cr2.Cr2Package#getIfDecision_Elseif()
	 * @model required="true"
	 * @generated
	 */
	EList<IfDecision> getElseif();

} // IfDecision
