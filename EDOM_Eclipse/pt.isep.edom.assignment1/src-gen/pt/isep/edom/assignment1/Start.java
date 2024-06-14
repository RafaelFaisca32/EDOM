/**
 */
package pt.isep.edom.assignment1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.assignment1.Start#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.assignment1.Assignment1Package#getStart()
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
	 * @see pt.isep.edom.assignment1.Assignment1Package#getStart_Next()
	 * @model
	 * @generated
	 */
	Action getNext();

	/**
	 * Sets the value of the '{@link pt.isep.edom.assignment1.Start#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Action value);

} // Start
