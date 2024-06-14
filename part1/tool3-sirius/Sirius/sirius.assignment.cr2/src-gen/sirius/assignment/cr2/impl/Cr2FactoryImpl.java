/**
 */
package sirius.assignment.cr2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sirius.assignment.cr2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cr2FactoryImpl extends EFactoryImpl implements Cr2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cr2Factory init() {
		try {
			Cr2Factory theCr2Factory = (Cr2Factory) EPackage.Registry.INSTANCE.getEFactory(Cr2Package.eNS_URI);
			if (theCr2Factory != null) {
				return theCr2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cr2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Cr2Package.PROJECT:
			return createProject();
		case Cr2Package.TARGET:
			return createTarget();
		case Cr2Package.TASK:
			return createTask();
		case Cr2Package.FILE_TARGET:
			return createFileTarget();
		case Cr2Package.FILE:
			return createFile();
		case Cr2Package.PROPERTY:
			return createProperty();
		case Cr2Package.ACTION:
			return createAction();
		case Cr2Package.CLOSURE_BACKED_ACTION:
			return createClosureBackedAction();
		case Cr2Package.DEFAULT_ACTION:
			return createDefaultAction();
		case Cr2Package.CUSTOM_ACTION:
			return createCustomAction();
		case Cr2Package.INSTRUCTION_BLOCK:
			return createInstructionBlock();
		case Cr2Package.INSTRUCTION:
			return createInstruction();
		case Cr2Package.DECISION:
			return createDecision();
		case Cr2Package.IF_DECISION:
			return createIfDecision();
		case Cr2Package.CONDITION:
			return createCondition();
		case Cr2Package.WHILE_DECISION:
			return createWhileDecision();
		case Cr2Package.LOOP_DECISION:
			return createLoopDecision();
		case Cr2Package.START:
			return createStart();
		case Cr2Package.END:
			return createEnd();
		case Cr2Package.MODEL:
			return createModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTarget createFileTarget() {
		FileTargetImpl fileTarget = new FileTargetImpl();
		return fileTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureBackedAction createClosureBackedAction() {
		ClosureBackedActionImpl closureBackedAction = new ClosureBackedActionImpl();
		return closureBackedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAction createDefaultAction() {
		DefaultActionImpl defaultAction = new DefaultActionImpl();
		return defaultAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAction createCustomAction() {
		CustomActionImpl customAction = new CustomActionImpl();
		return customAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionBlock createInstructionBlock() {
		InstructionBlockImpl instructionBlock = new InstructionBlockImpl();
		return instructionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfDecision createIfDecision() {
		IfDecisionImpl ifDecision = new IfDecisionImpl();
		return ifDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileDecision createWhileDecision() {
		WhileDecisionImpl whileDecision = new WhileDecisionImpl();
		return whileDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopDecision createLoopDecision() {
		LoopDecisionImpl loopDecision = new LoopDecisionImpl();
		return loopDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr2Package getCr2Package() {
		return (Cr2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cr2Package getPackage() {
		return Cr2Package.eINSTANCE;
	}

} //Cr2FactoryImpl
