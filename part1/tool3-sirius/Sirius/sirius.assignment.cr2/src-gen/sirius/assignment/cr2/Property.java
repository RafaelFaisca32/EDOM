/**
 */
package sirius.assignment.cr2;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.Property#getName <em>Name</em>}</li>
 *   <li>{@link sirius.assignment.cr2.Property#getValue <em>Value</em>}</li>
 *   <li>{@link sirius.assignment.cr2.Property#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @see sirius.assignment.cr2.Cr2Package#getProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameMustBeUnique'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sirius.assignment.cr2.Cr2Package#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see sirius.assignment.cr2.Cr2Package#getProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link sirius.assignment.cr2.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link sirius.assignment.cr2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see sirius.assignment.cr2.Cr2Package#getProperty_Has()
	 * @model
	 * @generated
	 */
	EList<Property> getHas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.name.oclIsUndefined()'"
	 * @generated
	 */
	boolean mustHaveName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.value.oclIsUndefined()'"
	 * @generated
	 */
	boolean mustHaveValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Property.allInstances()-&gt;isUnique(e | e.name)'"
	 * @generated
	 */
	boolean nameMustBeUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Property
