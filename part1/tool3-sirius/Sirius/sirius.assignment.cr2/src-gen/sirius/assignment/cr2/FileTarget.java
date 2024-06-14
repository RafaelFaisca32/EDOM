/**
 */
package sirius.assignment.cr2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.FileTarget#getCreated_towards_a_file <em>Created towards afile</em>}</li>
 *   <li>{@link sirius.assignment.cr2.FileTarget#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getFileTarget()
 * @model
 * @generated
 */
public interface FileTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Created towards afile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created towards afile</em>' containment reference.
	 * @see #setCreated_towards_a_file(File)
	 * @see sirius.assignment.cr2.Cr2Package#getFileTarget_Created_towards_a_file()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getCreated_towards_a_file();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.FileTarget#getCreated_towards_a_file <em>Created towards afile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created towards afile</em>' containment reference.
	 * @see #getCreated_towards_a_file()
	 * @generated
	 */
	void setCreated_towards_a_file(File value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Target)
	 * @see sirius.assignment.cr2.Cr2Package#getFileTarget_Target()
	 * @model required="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.FileTarget#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

} // FileTarget
