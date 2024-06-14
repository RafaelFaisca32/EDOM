/**
 */
package pt.isep.edom.assignment1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.assignment1.Project#getTarget <em>Target</em>}</li>
 *   <li>{@link pt.isep.edom.assignment1.Project#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.assignment1.Project#getVersion <em>Version</em>}</li>
 *   <li>{@link pt.isep.edom.assignment1.Project#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.assignment1.Assignment1Package#getProject()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName mustHaveVersion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='not self.name.oclIsUndefined()' mustHaveVersion='not self.version.oclIsUndefined()'"
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.assignment1.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see pt.isep.edom.assignment1.Assignment1Package#getProject_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Target> getTarget();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.assignment1.Assignment1Package#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.assignment1.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see pt.isep.edom.assignment1.Assignment1Package#getProject_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link pt.isep.edom.assignment1.Project#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.assignment1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see pt.isep.edom.assignment1.Assignment1Package#getProject_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Project
