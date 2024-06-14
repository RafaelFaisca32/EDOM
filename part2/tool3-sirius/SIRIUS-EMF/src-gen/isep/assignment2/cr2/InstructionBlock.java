/**
 */
package isep.assignment2.cr2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isep.assignment2.cr2.InstructionBlock#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @see isep.assignment2.cr2.Cr2Package#getInstructionBlock()
 * @model
 * @generated
 */
public interface InstructionBlock extends Action {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link isep.assignment2.cr2.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see isep.assignment2.cr2.Cr2Package#getInstructionBlock_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getHas();

} // InstructionBlock
