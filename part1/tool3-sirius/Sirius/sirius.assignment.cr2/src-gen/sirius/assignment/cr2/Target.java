/**
 */
package sirius.assignment.cr2;

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
 *   <li>{@link sirius.assignment.cr2.Target#getHas <em>Has</em>}</li>
 *   <li>{@link sirius.assignment.cr2.Target#getOutput <em>Output</em>}</li>
 *   <li>{@link sirius.assignment.cr2.Target#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getTarget()
 * @model
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference.
	 * @see #setHas(Task)
	 * @see sirius.assignment.cr2.Cr2Package#getTarget_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getHas();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Target#getHas <em>Has</em>}' containment reference.
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
	 * @see sirius.assignment.cr2.Cr2Package#getTarget_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getOutput();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Target#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(File value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link sirius.assignment.cr2.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see sirius.assignment.cr2.Cr2Package#getTarget_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Target> getDependencies();

} // Target
