/**
 */
package isep.assignment2.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isep.assignment2.cr2.Action#getName <em>Name</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Action#getDecisions <em>Decisions</em>}</li>
 * </ul>
 *
 * @see isep.assignment2.cr2.Cr2Package#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see isep.assignment2.cr2.Cr2Package#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getAction_Decisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecisions();

} // Action
