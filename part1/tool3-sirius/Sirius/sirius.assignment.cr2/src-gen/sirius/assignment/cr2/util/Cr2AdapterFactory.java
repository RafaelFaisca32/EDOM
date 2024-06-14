/**
 */
package sirius.assignment.cr2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sirius.assignment.cr2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sirius.assignment.cr2.Cr2Package
 * @generated
 */
public class Cr2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cr2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Cr2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cr2Switch<Adapter> modelSwitch = new Cr2Switch<Adapter>() {
		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseTarget(Target object) {
			return createTargetAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseFileTarget(FileTarget object) {
			return createFileTargetAdapter();
		}

		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseClosureBackedAction(ClosureBackedAction object) {
			return createClosureBackedActionAdapter();
		}

		@Override
		public Adapter caseDefaultAction(DefaultAction object) {
			return createDefaultActionAdapter();
		}

		@Override
		public Adapter caseCustomAction(CustomAction object) {
			return createCustomActionAdapter();
		}

		@Override
		public Adapter caseInstructionBlock(InstructionBlock object) {
			return createInstructionBlockAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseDecision(Decision object) {
			return createDecisionAdapter();
		}

		@Override
		public Adapter caseIfDecision(IfDecision object) {
			return createIfDecisionAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseWhileDecision(WhileDecision object) {
			return createWhileDecisionAdapter();
		}

		@Override
		public Adapter caseLoopDecision(LoopDecision object) {
			return createLoopDecisionAdapter();
		}

		@Override
		public Adapter caseStart(Start object) {
			return createStartAdapter();
		}

		@Override
		public Adapter caseEnd(End object) {
			return createEndAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.FileTarget <em>File Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.FileTarget
	 * @generated
	 */
	public Adapter createFileTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.ClosureBackedAction <em>Closure Backed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.ClosureBackedAction
	 * @generated
	 */
	public Adapter createClosureBackedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.DefaultAction <em>Default Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.DefaultAction
	 * @generated
	 */
	public Adapter createDefaultActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.CustomAction
	 * @generated
	 */
	public Adapter createCustomActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.InstructionBlock
	 * @generated
	 */
	public Adapter createInstructionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.IfDecision <em>If Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.IfDecision
	 * @generated
	 */
	public Adapter createIfDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.WhileDecision <em>While Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.WhileDecision
	 * @generated
	 */
	public Adapter createWhileDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.LoopDecision <em>Loop Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.LoopDecision
	 * @generated
	 */
	public Adapter createLoopDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sirius.assignment.cr2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sirius.assignment.cr2.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Cr2AdapterFactory
