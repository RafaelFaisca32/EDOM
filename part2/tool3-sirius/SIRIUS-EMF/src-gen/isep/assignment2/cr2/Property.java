/**
 */
package isep.assignment2.cr2;

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
 *   <li>{@link isep.assignment2.cr2.Property#getName <em>Name</em>}</li>
 *   <li>{@link isep.assignment2.cr2.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see isep.assignment2.cr2.Cr2Package#getProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName mustHaveValue nameMustBeUnique nameMustStartWithUppercase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='not self.name.oclIsUndefined()' mustHaveValue='not self.value.oclIsUndefined()' nameMustBeUnique='Property.allInstances()-&gt;isUnique(e | e.name)' nameMustStartWithUppercase='self.name.substring(1,1).toUpper().compareTo(self.name.substring(1,1))=0'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see isep.assignment2.cr2.Cr2Package#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Property#getName <em>Name</em>}' attribute.
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
	 * @see isep.assignment2.cr2.Cr2Package#getProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link isep.assignment2.cr2.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Property
