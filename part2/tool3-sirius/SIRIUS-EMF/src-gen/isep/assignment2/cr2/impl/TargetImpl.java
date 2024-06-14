/**
 */
package isep.assignment2.cr2.impl;

import isep.assignment2.cr2.Cr2Package;
import isep.assignment2.cr2.File;
import isep.assignment2.cr2.Target;
import isep.assignment2.cr2.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isep.assignment2.cr2.impl.TargetImpl#getHas <em>Has</em>}</li>
 *   <li>{@link isep.assignment2.cr2.impl.TargetImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link isep.assignment2.cr2.impl.TargetImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link isep.assignment2.cr2.impl.TargetImpl#getInput <em>Input</em>}</li>
 *   <li>{@link isep.assignment2.cr2.impl.TargetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected Task has;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected File output;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Target> dependencies;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected File input;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas(Task newHas, NotificationChain msgs) {
		Task oldHas = has;
		has = newHas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__HAS,
					oldHas, newHas);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas(Task newHas) {
		if (newHas != has) {
			NotificationChain msgs = null;
			if (has != null)
				msgs = ((InternalEObject) has).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cr2Package.TARGET__HAS,
						null, msgs);
			if (newHas != null)
				msgs = ((InternalEObject) newHas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cr2Package.TARGET__HAS,
						null, msgs);
			msgs = basicSetHas(newHas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__HAS, newHas, newHas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(File newOutput, NotificationChain msgs) {
		File oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__OUTPUT,
					oldOutput, newOutput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(File newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Cr2Package.TARGET__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Cr2Package.TARGET__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Target> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Target>(Target.class, this, Cr2Package.TARGET__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(File newInput, NotificationChain msgs) {
		File oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__INPUT,
					oldInput, newInput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(File newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cr2Package.TARGET__INPUT,
						null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cr2Package.TARGET__INPUT,
						null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.TARGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.TARGET__HAS:
			return basicSetHas(null, msgs);
		case Cr2Package.TARGET__OUTPUT:
			return basicSetOutput(null, msgs);
		case Cr2Package.TARGET__INPUT:
			return basicSetInput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Cr2Package.TARGET__HAS:
			return getHas();
		case Cr2Package.TARGET__OUTPUT:
			return getOutput();
		case Cr2Package.TARGET__DEPENDENCIES:
			return getDependencies();
		case Cr2Package.TARGET__INPUT:
			return getInput();
		case Cr2Package.TARGET__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Cr2Package.TARGET__HAS:
			setHas((Task) newValue);
			return;
		case Cr2Package.TARGET__OUTPUT:
			setOutput((File) newValue);
			return;
		case Cr2Package.TARGET__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends Target>) newValue);
			return;
		case Cr2Package.TARGET__INPUT:
			setInput((File) newValue);
			return;
		case Cr2Package.TARGET__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Cr2Package.TARGET__HAS:
			setHas((Task) null);
			return;
		case Cr2Package.TARGET__OUTPUT:
			setOutput((File) null);
			return;
		case Cr2Package.TARGET__DEPENDENCIES:
			getDependencies().clear();
			return;
		case Cr2Package.TARGET__INPUT:
			setInput((File) null);
			return;
		case Cr2Package.TARGET__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Cr2Package.TARGET__HAS:
			return has != null;
		case Cr2Package.TARGET__OUTPUT:
			return output != null;
		case Cr2Package.TARGET__DEPENDENCIES:
			return dependencies != null && !dependencies.isEmpty();
		case Cr2Package.TARGET__INPUT:
			return input != null;
		case Cr2Package.TARGET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TargetImpl
