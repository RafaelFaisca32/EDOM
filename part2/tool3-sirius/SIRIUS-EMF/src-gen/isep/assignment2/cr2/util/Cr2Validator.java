/**
 */
package isep.assignment2.cr2.util;

import isep.assignment2.cr2.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see isep.assignment2.cr2.Cr2Package
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
	public static final String DIAGNOSTIC_SOURCE = "isep.assignment2.cr2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
		case Cr2Package.FILE:
			return validateFile((File) value, diagnostics, context);
		case Cr2Package.PROPERTY:
			return validateProperty((Property) value, diagnostics, context);
		case Cr2Package.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case Cr2Package.INSTRUCTION_BLOCK:
			return validateInstructionBlock((InstructionBlock) value, diagnostics, context);
		case Cr2Package.INSTRUCTION:
			return validateInstruction((Instruction) value, diagnostics, context);
		case Cr2Package.DECISION:
			return validateDecision((Decision) value, diagnostics, context);
		case Cr2Package.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
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
	 * The cached validation expression for the mustHaveName constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECT__MUST_HAVE_NAME__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject_mustHaveName(Project project, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.PROJECT, project, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName", PROJECT__MUST_HAVE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveVersion constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECT__MUST_HAVE_VERSION__EEXPRESSION = "not self.version.oclIsUndefined()";

	/**
	 * Validates the mustHaveVersion constraint of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject_mustHaveVersion(Project project, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.PROJECT, project, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveVersion",
				PROJECT__MUST_HAVE_VERSION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(Target target, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(target, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(target, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTarget_nameMustStartWithUppercase(target, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameMustStartWithUppercase constraint of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TARGET__NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.substring(1,1).toUpper().compareTo(self.name.substring(1,1))=0";

	/**
	 * Validates the nameMustStartWithUppercase constraint of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget_nameMustStartWithUppercase(Target target, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.TARGET, target, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustStartWithUppercase",
				TARGET__NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateTask_mustHaveName(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_nameMustBeUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_nameMustStartWithUppercase(task, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__MUST_HAVE_NAME__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_mustHaveName(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Cr2Package.Literals.TASK, task, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName", TASK__MUST_HAVE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustBeUnique constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__NAME_MUST_BE_UNIQUE__EEXPRESSION = "Task.allInstances()->isUnique(e | e.name)";

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_nameMustBeUnique(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Cr2Package.Literals.TASK, task, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustBeUnique",
				TASK__NAME_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustStartWithUppercase constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.substring(1,1).toUpper().compareTo(self.name.substring(1,1))=0";

	/**
	 * Validates the nameMustStartWithUppercase constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_nameMustStartWithUppercase(Task task, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.TASK, task, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustStartWithUppercase",
				TASK__NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
	 * The cached validation expression for the mustHaveName constraint of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILE__MUST_HAVE_NAME__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile_mustHaveName(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Cr2Package.Literals.FILE, file, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName", FILE__MUST_HAVE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateProperty_mustHaveName(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProperty_mustHaveValue(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProperty_nameMustBeUnique(property, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProperty_nameMustStartWithUppercase(property, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__MUST_HAVE_NAME__EEXPRESSION = "not self.name.oclIsUndefined()";

	/**
	 * Validates the mustHaveName constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_mustHaveName(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.PROPERTY, property, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveName",
				PROPERTY__MUST_HAVE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveValue constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__MUST_HAVE_VALUE__EEXPRESSION = "not self.value.oclIsUndefined()";

	/**
	 * Validates the mustHaveValue constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_mustHaveValue(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.PROPERTY, property, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveValue",
				PROPERTY__MUST_HAVE_VALUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustBeUnique constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__NAME_MUST_BE_UNIQUE__EEXPRESSION = "Property.allInstances()->isUnique(e | e.name)";

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_nameMustBeUnique(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.PROPERTY, property, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustBeUnique",
				PROPERTY__NAME_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameMustStartWithUppercase constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION = "self.name.substring(1,1).toUpper().compareTo(self.name.substring(1,1))=0";

	/**
	 * Validates the nameMustStartWithUppercase constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_nameMustStartWithUppercase(Property property, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Cr2Package.Literals.PROPERTY, property, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameMustStartWithUppercase",
				PROPERTY__NAME_MUST_START_WITH_UPPERCASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
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
