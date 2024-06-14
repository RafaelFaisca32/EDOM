/**
 */
package sirius.assignment.cr2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sirius.assignment.cr2.Cr2Package;
import sirius.assignment.cr2.File;
import sirius.assignment.cr2.FileTarget;
import sirius.assignment.cr2.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.impl.FileTargetImpl#getCreated_towards_a_file <em>Created towards afile</em>}</li>
 *   <li>{@link sirius.assignment.cr2.impl.FileTargetImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileTargetImpl extends MinimalEObjectImpl.Container implements FileTarget {
	/**
	 * The cached value of the '{@link #getCreated_towards_a_file() <em>Created towards afile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_towards_a_file()
	 * @generated
	 * @ordered
	 */
	protected File created_towards_a_file;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Target target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.FILE_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getCreated_towards_a_file() {
		return created_towards_a_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated_towards_a_file(File newCreated_towards_a_file, NotificationChain msgs) {
		File oldCreated_towards_a_file = created_towards_a_file;
		created_towards_a_file = newCreated_towards_a_file;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE, oldCreated_towards_a_file,
					newCreated_towards_a_file);
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
	public void setCreated_towards_a_file(File newCreated_towards_a_file) {
		if (newCreated_towards_a_file != created_towards_a_file) {
			NotificationChain msgs = null;
			if (created_towards_a_file != null)
				msgs = ((InternalEObject) created_towards_a_file).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE, null, msgs);
			if (newCreated_towards_a_file != null)
				msgs = ((InternalEObject) newCreated_towards_a_file).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE, null, msgs);
			msgs = basicSetCreated_towards_a_file(newCreated_towards_a_file, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE,
					newCreated_towards_a_file, newCreated_towards_a_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Target) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cr2Package.FILE_TARGET__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Target newTarget) {
		Target oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.FILE_TARGET__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE:
			return basicSetCreated_towards_a_file(null, msgs);
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
		case Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE:
			return getCreated_towards_a_file();
		case Cr2Package.FILE_TARGET__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE:
			setCreated_towards_a_file((File) newValue);
			return;
		case Cr2Package.FILE_TARGET__TARGET:
			setTarget((Target) newValue);
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
		case Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE:
			setCreated_towards_a_file((File) null);
			return;
		case Cr2Package.FILE_TARGET__TARGET:
			setTarget((Target) null);
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
		case Cr2Package.FILE_TARGET__CREATED_TOWARDS_AFILE:
			return created_towards_a_file != null;
		case Cr2Package.FILE_TARGET__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //FileTargetImpl
