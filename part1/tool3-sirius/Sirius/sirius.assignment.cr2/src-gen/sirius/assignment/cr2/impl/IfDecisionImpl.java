/**
 */
package sirius.assignment.cr2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sirius.assignment.cr2.Condition;
import sirius.assignment.cr2.Cr2Package;
import sirius.assignment.cr2.IfDecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius.assignment.cr2.impl.IfDecisionImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link sirius.assignment.cr2.impl.IfDecisionImpl#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfDecisionImpl extends DecisionImpl implements IfDecision {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> contains;

	/**
	 * The cached value of the '{@link #getElseif() <em>Elseif</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseif()
	 * @generated
	 * @ordered
	 */
	protected EList<IfDecision> elseif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.IF_DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Condition>(Condition.class, this, Cr2Package.IF_DECISION__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfDecision> getElseif() {
		if (elseif == null) {
			elseif = new EObjectResolvingEList<IfDecision>(IfDecision.class, this, Cr2Package.IF_DECISION__ELSEIF);
		}
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.IF_DECISION__CONTAINS:
			return ((InternalEList<?>) getContains()).basicRemove(otherEnd, msgs);
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
		case Cr2Package.IF_DECISION__CONTAINS:
			return getContains();
		case Cr2Package.IF_DECISION__ELSEIF:
			return getElseif();
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
		case Cr2Package.IF_DECISION__CONTAINS:
			getContains().clear();
			getContains().addAll((Collection<? extends Condition>) newValue);
			return;
		case Cr2Package.IF_DECISION__ELSEIF:
			getElseif().clear();
			getElseif().addAll((Collection<? extends IfDecision>) newValue);
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
		case Cr2Package.IF_DECISION__CONTAINS:
			getContains().clear();
			return;
		case Cr2Package.IF_DECISION__ELSEIF:
			getElseif().clear();
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
		case Cr2Package.IF_DECISION__CONTAINS:
			return contains != null && !contains.isEmpty();
		case Cr2Package.IF_DECISION__ELSEIF:
			return elseif != null && !elseif.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfDecisionImpl
