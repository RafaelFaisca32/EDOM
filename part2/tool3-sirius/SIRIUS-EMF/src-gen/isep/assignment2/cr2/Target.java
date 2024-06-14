/**
 */
package isep.assignment2.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isep.assignment2.cr2.Target#getHas <em>Has</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Target#getOutput <em>Output</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Target#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Target#getInput <em>Input</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Target#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see isep.assignment2.cr2.Cr2Package#getTarget()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameMustStartWithUppercase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameMustStartWithUppercase='self.name.substring(1,1).toUpper().compareTo(self.name.substring(1,1))=0'"
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference.
	 * @see #setHas(Task)
	 * @see isep.assignment2.cr2.Cr2Package#getTarget_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getHas();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Target#getHas <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has</em>' containment reference.
	 * @see #getHas()
	 * @generated
	 */
	void setHas(Task value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(File)
	 * @see isep.assignment2.cr2.Cr2Package#getTarget_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getOutput();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Target#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(File value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getTarget_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Target> getDependencies();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(File)
	 * @see isep.assignment2.cr2.Cr2Package#getTarget_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getInput();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Target#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(File value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see isep.assignment2.cr2.Cr2Package#getTarget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Target#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Target
