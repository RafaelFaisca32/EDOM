/**
 */
package pt.isep.edom.assignment1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.edom.assignment1.Assignment1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Assignment1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/assignment1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment1Package eINSTANCE = pt.isep.edom.assignment1.impl.Assignment1PackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.ProjectImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TASKS = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Must Have Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___MUST_HAVE_VERSION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.TargetImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__HAS = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DEPENDENCIES = 2;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.TaskImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDS = 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Name Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___NAME_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.FileTargetImpl <em>File Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.FileTargetImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getFileTarget()
	 * @generated
	 */
	int FILE_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Created towards afile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TARGET__CREATED_TOWARDS_AFILE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TARGET__TARGET = 1;

	/**
	 * The number of structural features of the '<em>File Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TARGET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.FileImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getFile()
	 * @generated
	 */
	int FILE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.PropertyImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HAS = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Must Have Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___MUST_HAVE_VALUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Name Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___NAME_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.ActionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS = 1;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DECISIONS = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.ClosureBackedActionImpl <em>Closure Backed Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.ClosureBackedActionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getClosureBackedAction()
	 * @generated
	 */
	int CLOSURE_BACKED_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_BACKED_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_BACKED_ACTION__HAS = ACTION__HAS;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_BACKED_ACTION__DECISIONS = ACTION__DECISIONS;

	/**
	 * The number of structural features of the '<em>Closure Backed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_BACKED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Closure Backed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_BACKED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.DefaultActionImpl <em>Default Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.DefaultActionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getDefaultAction()
	 * @generated
	 */
	int DEFAULT_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ACTION__HAS = ACTION__HAS;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ACTION__DECISIONS = ACTION__DECISIONS;

	/**
	 * The number of structural features of the '<em>Default Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.CustomActionImpl <em>Custom Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.CustomActionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getCustomAction()
	 * @generated
	 */
	int CUSTOM_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__HAS = ACTION__HAS;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION__DECISIONS = ACTION__DECISIONS;

	/**
	 * The number of structural features of the '<em>Custom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.InstructionBlockImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getInstructionBlock()
	 * @generated
	 */
	int INSTRUCTION_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__HAS = 0;

	/**
	 * The number of structural features of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.InstructionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.DecisionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 12;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS = 0;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.IfDecisionImpl <em>If Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.IfDecisionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getIfDecision()
	 * @generated
	 */
	int IF_DECISION = 13;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DECISION__HAS = DECISION__HAS;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DECISION__CONTAINS = DECISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DECISION__ELSEIF = DECISION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DECISION_FEATURE_COUNT = DECISION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DECISION_OPERATION_COUNT = DECISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.ConditionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Stop condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STOP_CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.LoopDecisionImpl <em>Loop Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.LoopDecisionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getLoopDecision()
	 * @generated
	 */
	int LOOP_DECISION = 16;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_DECISION__HAS = DECISION__HAS;

	/**
	 * The number of structural features of the '<em>Loop Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_DECISION_FEATURE_COUNT = DECISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_DECISION_OPERATION_COUNT = DECISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.WhileDecisionImpl <em>While Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.WhileDecisionImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getWhileDecision()
	 * @generated
	 */
	int WHILE_DECISION = 15;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DECISION__HAS = LOOP_DECISION__HAS;

	/**
	 * The number of structural features of the '<em>While Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DECISION_FEATURE_COUNT = LOOP_DECISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DECISION_OPERATION_COUNT = LOOP_DECISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.StartImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getStart()
	 * @generated
	 */
	int START = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__HAS = ACTION__HAS;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DECISIONS = ACTION__DECISIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NEXT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.EndImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getEnd()
	 * @generated
	 */
	int END = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__HAS = ACTION__HAS;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DECISIONS = ACTION__DECISIONS;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.assignment1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.assignment1.impl.ModelImpl
	 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 19;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see pt.isep.edom.assignment1.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Project#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see pt.isep.edom.assignment1.Project#getTarget()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Target();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Project#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see pt.isep.edom.assignment1.Project#getVersion()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see pt.isep.edom.assignment1.Project#getTasks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Tasks();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Project#mustHaveVersion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Version</em>' operation.
	 * @see pt.isep.edom.assignment1.Project#mustHaveVersion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProject__MustHaveVersion__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Project#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Name</em>' operation.
	 * @see pt.isep.edom.assignment1.Project#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProject__MustHaveName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see pt.isep.edom.assignment1.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.edom.assignment1.Target#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see pt.isep.edom.assignment1.Target#getHas()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Has();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.edom.assignment1.Target#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see pt.isep.edom.assignment1.Target#getOutput()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Output();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.edom.assignment1.Target#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see pt.isep.edom.assignment1.Target#getDependencies()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Dependencies();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pt.isep.edom.assignment1.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pt.isep.edom.assignment1.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Task#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see pt.isep.edom.assignment1.Task#getHas()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Task#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see pt.isep.edom.assignment1.Task#getActions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Actions();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.edom.assignment1.Task#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see pt.isep.edom.assignment1.Task#getDepends()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Depends();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Task#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Name</em>' operation.
	 * @see pt.isep.edom.assignment1.Task#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTask__MustHaveName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Task#nameMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Must Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Must Be Unique</em>' operation.
	 * @see pt.isep.edom.assignment1.Task#nameMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTask__NameMustBeUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.FileTarget <em>File Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Target</em>'.
	 * @see pt.isep.edom.assignment1.FileTarget
	 * @generated
	 */
	EClass getFileTarget();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.edom.assignment1.FileTarget#getCreated_towards_a_file <em>Created towards afile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created towards afile</em>'.
	 * @see pt.isep.edom.assignment1.FileTarget#getCreated_towards_a_file()
	 * @see #getFileTarget()
	 * @generated
	 */
	EReference getFileTarget_Created_towards_a_file();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.edom.assignment1.FileTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pt.isep.edom.assignment1.FileTarget#getTarget()
	 * @see #getFileTarget()
	 * @generated
	 */
	EReference getFileTarget_Target();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see pt.isep.edom.assignment1.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.File#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Name</em>' operation.
	 * @see pt.isep.edom.assignment1.File#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFile__MustHaveName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see pt.isep.edom.assignment1.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pt.isep.edom.assignment1.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.edom.assignment1.Property#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see pt.isep.edom.assignment1.Property#getHas()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Has();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Property#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Name</em>' operation.
	 * @see pt.isep.edom.assignment1.Property#mustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__MustHaveName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Property#mustHaveValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Value</em>' operation.
	 * @see pt.isep.edom.assignment1.Property#mustHaveValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__MustHaveValue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link pt.isep.edom.assignment1.Property#nameMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Must Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Must Be Unique</em>' operation.
	 * @see pt.isep.edom.assignment1.Property#nameMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__NameMustBeUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see pt.isep.edom.assignment1.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Action#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see pt.isep.edom.assignment1.Action#getHas()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Action#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see pt.isep.edom.assignment1.Action#getDecisions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Decisions();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.ClosureBackedAction <em>Closure Backed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closure Backed Action</em>'.
	 * @see pt.isep.edom.assignment1.ClosureBackedAction
	 * @generated
	 */
	EClass getClosureBackedAction();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.DefaultAction <em>Default Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Action</em>'.
	 * @see pt.isep.edom.assignment1.DefaultAction
	 * @generated
	 */
	EClass getDefaultAction();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.CustomAction <em>Custom Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Action</em>'.
	 * @see pt.isep.edom.assignment1.CustomAction
	 * @generated
	 */
	EClass getCustomAction();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Block</em>'.
	 * @see pt.isep.edom.assignment1.InstructionBlock
	 * @generated
	 */
	EClass getInstructionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.InstructionBlock#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see pt.isep.edom.assignment1.InstructionBlock#getHas()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Has();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see pt.isep.edom.assignment1.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Instruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.Instruction#getName()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Name();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see pt.isep.edom.assignment1.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Decision#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see pt.isep.edom.assignment1.Decision#getHas()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Has();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.IfDecision <em>If Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Decision</em>'.
	 * @see pt.isep.edom.assignment1.IfDecision
	 * @generated
	 */
	EClass getIfDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.IfDecision#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see pt.isep.edom.assignment1.IfDecision#getContains()
	 * @see #getIfDecision()
	 * @generated
	 */
	EReference getIfDecision_Contains();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.edom.assignment1.IfDecision#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elseif</em>'.
	 * @see pt.isep.edom.assignment1.IfDecision#getElseif()
	 * @see #getIfDecision()
	 * @generated
	 */
	EReference getIfDecision_Elseif();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see pt.isep.edom.assignment1.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.assignment1.Condition#getStop_condition <em>Stop condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop condition</em>'.
	 * @see pt.isep.edom.assignment1.Condition#getStop_condition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Stop_condition();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.WhileDecision <em>While Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Decision</em>'.
	 * @see pt.isep.edom.assignment1.WhileDecision
	 * @generated
	 */
	EClass getWhileDecision();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.LoopDecision <em>Loop Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Decision</em>'.
	 * @see pt.isep.edom.assignment1.LoopDecision
	 * @generated
	 */
	EClass getLoopDecision();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see pt.isep.edom.assignment1.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.edom.assignment1.Start#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see pt.isep.edom.assignment1.Start#getNext()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Next();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see pt.isep.edom.assignment1.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.assignment1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pt.isep.edom.assignment1.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.edom.assignment1.Model#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see pt.isep.edom.assignment1.Model#getProject()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Project();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.assignment1.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.assignment1.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assignment1Factory getAssignment1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.ProjectImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TARGET = eINSTANCE.getProject_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VERSION = eINSTANCE.getProject_Version();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TASKS = eINSTANCE.getProject_Tasks();

		/**
		 * The meta object literal for the '<em><b>Must Have Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___MUST_HAVE_VERSION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProject__MustHaveVersion__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Must Have Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProject__MustHaveName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.TargetImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__HAS = eINSTANCE.getTarget_Has();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__OUTPUT = eINSTANCE.getTarget_Output();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__DEPENDENCIES = eINSTANCE.getTarget_Dependencies();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.TaskImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS = eINSTANCE.getTask_Has();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ACTIONS = eINSTANCE.getTask_Actions();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEPENDS = eINSTANCE.getTask_Depends();

		/**
		 * The meta object literal for the '<em><b>Must Have Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTask__MustHaveName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name Must Be Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___NAME_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTask__NameMustBeUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.FileTargetImpl <em>File Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.FileTargetImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getFileTarget()
		 * @generated
		 */
		EClass FILE_TARGET = eINSTANCE.getFileTarget();

		/**
		 * The meta object literal for the '<em><b>Created towards afile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_TARGET__CREATED_TOWARDS_AFILE = eINSTANCE.getFileTarget_Created_towards_a_file();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_TARGET__TARGET = eINSTANCE.getFileTarget_Target();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.FileImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Must Have Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFile__MustHaveName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.PropertyImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__HAS = eINSTANCE.getProperty_Has();

		/**
		 * The meta object literal for the '<em><b>Must Have Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProperty__MustHaveName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Must Have Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___MUST_HAVE_VALUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProperty__MustHaveValue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name Must Be Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___NAME_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProperty__NameMustBeUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.ActionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__HAS = eINSTANCE.getAction_Has();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__DECISIONS = eINSTANCE.getAction_Decisions();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.ClosureBackedActionImpl <em>Closure Backed Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.ClosureBackedActionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getClosureBackedAction()
		 * @generated
		 */
		EClass CLOSURE_BACKED_ACTION = eINSTANCE.getClosureBackedAction();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.DefaultActionImpl <em>Default Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.DefaultActionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getDefaultAction()
		 * @generated
		 */
		EClass DEFAULT_ACTION = eINSTANCE.getDefaultAction();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.CustomActionImpl <em>Custom Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.CustomActionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getCustomAction()
		 * @generated
		 */
		EClass CUSTOM_ACTION = eINSTANCE.getCustomAction();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.InstructionBlockImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getInstructionBlock()
		 * @generated
		 */
		EClass INSTRUCTION_BLOCK = eINSTANCE.getInstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__HAS = eINSTANCE.getInstructionBlock_Has();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.InstructionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NAME = eINSTANCE.getInstruction_Name();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.DecisionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__HAS = eINSTANCE.getDecision_Has();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.IfDecisionImpl <em>If Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.IfDecisionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getIfDecision()
		 * @generated
		 */
		EClass IF_DECISION = eINSTANCE.getIfDecision();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_DECISION__CONTAINS = eINSTANCE.getIfDecision_Contains();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_DECISION__ELSEIF = eINSTANCE.getIfDecision_Elseif();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.ConditionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Stop condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__STOP_CONDITION = eINSTANCE.getCondition_Stop_condition();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.WhileDecisionImpl <em>While Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.WhileDecisionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getWhileDecision()
		 * @generated
		 */
		EClass WHILE_DECISION = eINSTANCE.getWhileDecision();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.LoopDecisionImpl <em>Loop Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.LoopDecisionImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getLoopDecision()
		 * @generated
		 */
		EClass LOOP_DECISION = eINSTANCE.getLoopDecision();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.StartImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__NEXT = eINSTANCE.getStart_Next();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.EndImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.assignment1.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.assignment1.impl.ModelImpl
		 * @see pt.isep.edom.assignment1.impl.Assignment1PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROJECT = eINSTANCE.getModel_Project();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

	}

} //Assignment1Package
