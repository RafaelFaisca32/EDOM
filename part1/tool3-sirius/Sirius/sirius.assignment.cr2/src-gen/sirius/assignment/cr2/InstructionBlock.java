/**
 */
package sirius.assignment.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.InstructionBlock#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getInstructionBlock()
 * @model
 * @generated
 */
public interface InstructionBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.assignment.cr2.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see sirius.assignment.cr2.Cr2Package#getInstructionBlock_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getHas();

} // InstructionBlock
