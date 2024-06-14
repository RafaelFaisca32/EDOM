/**
 */
package sirius.assignment.cr2.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import sirius.assignment.cr2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sirius.assignment.cr2.Cr2Package
 * @generated
 */
public class Cr2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Cr2Validator INSTANCE = new Cr2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sirius.assignment.cr2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Version' of 'Project'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROJECT__MUST_HAVE_VERSION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Project'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROJECT__MUST_HAVE_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TASK__MUST_HAVE_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Must Be Unique' of 'Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TASK__NAME_MUST_BE_UNIQUE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'File'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FILE__MUST_HAVE_NAME = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__MUST_HAVE_NAME = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Value' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__MUST_HAVE_VALUE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Must Be Unique' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__NAME_MUST_BE_UNIQUE = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Cr2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Cr2Package.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		case Cr2Package.TARGET:
			return validateTarget((Target) value, diagnostics, context);
		case Cr2Package.TASK:
			return validateTask((Task) value, diagnostics, context);
		case Cr2Package.FILE_TARGET:
			return validateFileTarget((FileTarget) value, diagnostics, context);
		case Cr2Package.FILE:
			return validateFile((File) value, diagnostics, context);
		case Cr2Package.PROPERTY:
			return validateProperty((Property) value, diagnostics, context);
		case Cr2Package.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case Cr2Package.CLOSURE_BACKED_ACTION:
			return validateClosureBackedAction((ClosureBackedAction) value, diagnostics, context);
		case Cr2Package.DEFAULT_ACTION:
			return validateDefaultAction((DefaultAction) value, diagnostics, context);
		case Cr2Package.CUSTOM_ACTION:
			return validateCustomAction((CustomAction) value, diagnostics, context);
		case Cr2Package.INSTRUCTION_BLOCK:
			return validateInstructionBlock((InstructionBlock) value, diagnostics, context);
		case Cr2Package.INSTRUCTION:
			return validateInstruction((Instruction) value, diagnostics, context);
		case Cr2Package.DECISION:
			return validateDecision((Decision) value, diagnostics, context);
		case Cr2Package.IF_DECISION:
			return validateIfDecision((IfDecision) value, diagnostics, context);
		case Cr2Package.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
		case Cr2Package.WHILE_DECISION:
			return validateWhileDecision((WhileDecision) value, diagnostics, context);
		case Cr2Package.LOOP_DECISION:
			return validateLoopDecision((LoopDecision) value, diagnostics, context);
		case Cr2Package.START:
			return validateStart((Start) value, diagnostics, context);
		case Cr2Package.END:
			return validateEnd((End) value, diagnostics, context);
		case Cr2Package.MODEL:
			return validateModel((Model) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(project, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProject_mustHaveName(project, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProject_mustHaveVersion(project, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject_mustHaveName(Project project, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return project.mustHaveName(diagnostics, context);
	}

	/**
	 * Validates the mustHaveVersion constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject_mustHaveVersion(Project project, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return project.mustHaveVersion(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(Target target, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(target, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_nameMustBeUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_mustHaveName(task, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_mustHaveName(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return task.mustHaveName(diagnostics, context);
	}

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_nameMustBeUnique(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return task.nameMustBeUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileTarget(FileTarget fileTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(file, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(file, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFile_mustHaveName(file, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile_mustHaveName(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return file.mustHaveName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProperty_nameMustBeUnique(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProperty_mustHaveName(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProperty_mustHaveValue(property, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_mustHaveName(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return property.mustHaveName(diagnostics, context);
	}

	/**
	 * Validates the mustHaveValue constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_mustHaveValue(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return property.mustHaveValue(diagnostics, context);
	}

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_nameMustBeUnique(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return property.nameMustBeUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosureBackedAction(ClosureBackedAction closureBackedAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closureBackedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultAction(DefaultAction defaultAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomAction(CustomAction customAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionBlock(InstructionBlock instructionBlock, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfDecision(IfDecision ifDecision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifDecision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhileDecision(WhileDecision whileDecision, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whileDecision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopDecision(LoopDecision loopDecision, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loopDecision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(start, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(end, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Cr2Validator
