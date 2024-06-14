/**
 */
package sirius.assignment.cr2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.Start#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getStart()
 * @model
 * @generated
 */
public interface Start extends Action {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Action)
	 * @see sirius.assignment.cr2.Cr2Package#getStart_Next()
	 * @model
	 * @generated
	 */
	Action getNext();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Start#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Action value);

} // Start
