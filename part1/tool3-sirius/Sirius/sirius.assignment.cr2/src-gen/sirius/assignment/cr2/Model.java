/**
 */
package sirius.assignment.cr2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.Model#getName <em>Name</em>}</li>
 *   <li>{@link sirius.assignment.cr2.Model#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius.assignment.cr2.Cr2Package#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(Project)
	 * @see sirius.assignment.cr2.Cr2Package#getModel_Project()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Model#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // Model
