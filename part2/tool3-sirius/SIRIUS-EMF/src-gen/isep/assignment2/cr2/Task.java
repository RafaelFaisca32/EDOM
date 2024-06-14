/**
 */
package isep.assignment2.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isep.assignment2.cr2.Task#getName <em>Name</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Task#getHas <em>Has</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Task#getActions <em>Actions</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Task#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @see isep.assignment2.cr2.Cr2Package#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName nameMustBeUnique nameMustStartWithUppercase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='not self.name.oclIsUndefined()' nameMustBeUnique='Task.allInstances()-&gt;isUnique(e | e.name)' nameMustStartWithUppercase='self.name.substring(1,1).toUpper().compareTo(self.name.substring(1,1))=0'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see isep.assignment2.cr2.Cr2Package#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see isep.assignment2.cr2.Cr2Package#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getTask_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHas();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getTask_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getTask_Depends()
	 * @model
	 * @generated
	 */
	EList<Task> getDepends();

} // Task
