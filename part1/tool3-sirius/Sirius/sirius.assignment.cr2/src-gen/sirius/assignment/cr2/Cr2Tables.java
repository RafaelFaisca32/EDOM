/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /sirius.assignment.cr2/model/cr2.ecore
 * using:
 *   /sirius.assignment.cr2/model/cr2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package sirius.assignment.cr2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import sirius.assignment.cr2.Cr2Package;
// import sirius.assignment.cr2.Cr2Tables;

/**
 * Cr2Tables provides the dispatch tables for the cr2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Cr2Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Cr2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_cr2 = IdManager.getNsURIPackageId("http://www.example.org/cr2", null, Cr2Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Cr2Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Condition = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Condition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Decision = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Decision", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_File = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("File", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FileTarget = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("FileTarget", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IfDecision = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("IfDecision", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Instruction = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Instruction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InstructionBlock = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("InstructionBlock", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Model = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Model", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Project = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Project", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Property = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Property", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Start = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Start", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Target = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Target", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Task = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("Task", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WhileDecision = Cr2Tables.PACKid_http_c_s_s_www_example_org_s_cr2.getClassId("WhileDecision", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_FileTarget = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_FileTarget);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_IfDecision = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_IfDecision);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Property = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_Property);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Start = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_Start);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Target = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_Target);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Task = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_Task);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Action);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Condition = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Condition);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Decision = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Decision);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_IfDecision = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_IfDecision);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Instruction = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Instruction);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_InstructionBlock = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_InstructionBlock);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Property = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Property);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Target = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Target);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Task = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Task);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WhileDecision = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_WhileDecision);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Property = TypeId.SET.getSpecializedId(Cr2Tables.CLSSid_Property);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Task = TypeId.SET.getSpecializedId(Cr2Tables.CLSSid_Task);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Cr2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(Cr2Package.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _ClosureBackedAction = new EcoreExecutorType(Cr2Package.Literals.CLOSURE_BACKED_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Condition = new EcoreExecutorType(Cr2Package.Literals.CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _CustomAction = new EcoreExecutorType(Cr2Package.Literals.CUSTOM_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Decision = new EcoreExecutorType(Cr2Package.Literals.DECISION, PACKAGE, 0);
		public static final EcoreExecutorType _DefaultAction = new EcoreExecutorType(Cr2Package.Literals.DEFAULT_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _End = new EcoreExecutorType(Cr2Package.Literals.END, PACKAGE, 0);
		public static final EcoreExecutorType _File = new EcoreExecutorType(Cr2Package.Literals.FILE, PACKAGE, 0);
		public static final EcoreExecutorType _FileTarget = new EcoreExecutorType(Cr2Package.Literals.FILE_TARGET, PACKAGE, 0);
		public static final EcoreExecutorType _IfDecision = new EcoreExecutorType(Cr2Package.Literals.IF_DECISION, PACKAGE, 0);
		public static final EcoreExecutorType _Instruction = new EcoreExecutorType(Cr2Package.Literals.INSTRUCTION, PACKAGE, 0);
		public static final EcoreExecutorType _InstructionBlock = new EcoreExecutorType(Cr2Package.Literals.INSTRUCTION_BLOCK, PACKAGE, 0);
		public static final EcoreExecutorType _LoopDecision = new EcoreExecutorType(Cr2Package.Literals.LOOP_DECISION, PACKAGE, 0);
		public static final EcoreExecutorType _Model = new EcoreExecutorType(Cr2Package.Literals.MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Project = new EcoreExecutorType(Cr2Package.Literals.PROJECT, PACKAGE, 0);
		public static final EcoreExecutorType _Property = new EcoreExecutorType(Cr2Package.Literals.PROPERTY, PACKAGE, 0);
		public static final EcoreExecutorType _Start = new EcoreExecutorType(Cr2Package.Literals.START, PACKAGE, 0);
		public static final EcoreExecutorType _Target = new EcoreExecutorType(Cr2Package.Literals.TARGET, PACKAGE, 0);
		public static final EcoreExecutorType _Task = new EcoreExecutorType(Cr2Package.Literals.TASK, PACKAGE, 0);
		public static final EcoreExecutorType _WhileDecision = new EcoreExecutorType(Cr2Package.Literals.WHILE_DECISION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_ClosureBackedAction,
			_Condition,
			_CustomAction,
			_Decision,
			_DefaultAction,
			_End,
			_File,
			_FileTarget,
			_IfDecision,
			_Instruction,
			_InstructionBlock,
			_LoopDecision,
			_Model,
			_Project,
			_Property,
			_Start,
			_Target,
			_Task,
			_WhileDecision
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, Cr2Tables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ClosureBackedAction__Action = new ExecutorFragment(Types._ClosureBackedAction, Cr2Tables.Types._Action);
		private static final ExecutorFragment _ClosureBackedAction__ClosureBackedAction = new ExecutorFragment(Types._ClosureBackedAction, Cr2Tables.Types._ClosureBackedAction);
		private static final ExecutorFragment _ClosureBackedAction__OclAny = new ExecutorFragment(Types._ClosureBackedAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ClosureBackedAction__OclElement = new ExecutorFragment(Types._ClosureBackedAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Condition__Condition = new ExecutorFragment(Types._Condition, Cr2Tables.Types._Condition);
		private static final ExecutorFragment _Condition__OclAny = new ExecutorFragment(Types._Condition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Condition__OclElement = new ExecutorFragment(Types._Condition, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CustomAction__Action = new ExecutorFragment(Types._CustomAction, Cr2Tables.Types._Action);
		private static final ExecutorFragment _CustomAction__CustomAction = new ExecutorFragment(Types._CustomAction, Cr2Tables.Types._CustomAction);
		private static final ExecutorFragment _CustomAction__OclAny = new ExecutorFragment(Types._CustomAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CustomAction__OclElement = new ExecutorFragment(Types._CustomAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Decision__Decision = new ExecutorFragment(Types._Decision, Cr2Tables.Types._Decision);
		private static final ExecutorFragment _Decision__OclAny = new ExecutorFragment(Types._Decision, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Decision__OclElement = new ExecutorFragment(Types._Decision, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DefaultAction__Action = new ExecutorFragment(Types._DefaultAction, Cr2Tables.Types._Action);
		private static final ExecutorFragment _DefaultAction__DefaultAction = new ExecutorFragment(Types._DefaultAction, Cr2Tables.Types._DefaultAction);
		private static final ExecutorFragment _DefaultAction__OclAny = new ExecutorFragment(Types._DefaultAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DefaultAction__OclElement = new ExecutorFragment(Types._DefaultAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _End__Action = new ExecutorFragment(Types._End, Cr2Tables.Types._Action);
		private static final ExecutorFragment _End__End = new ExecutorFragment(Types._End, Cr2Tables.Types._End);
		private static final ExecutorFragment _End__OclAny = new ExecutorFragment(Types._End, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _End__OclElement = new ExecutorFragment(Types._End, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _File__File = new ExecutorFragment(Types._File, Cr2Tables.Types._File);
		private static final ExecutorFragment _File__OclAny = new ExecutorFragment(Types._File, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _File__OclElement = new ExecutorFragment(Types._File, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FileTarget__FileTarget = new ExecutorFragment(Types._FileTarget, Cr2Tables.Types._FileTarget);
		private static final ExecutorFragment _FileTarget__OclAny = new ExecutorFragment(Types._FileTarget, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FileTarget__OclElement = new ExecutorFragment(Types._FileTarget, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IfDecision__Decision = new ExecutorFragment(Types._IfDecision, Cr2Tables.Types._Decision);
		private static final ExecutorFragment _IfDecision__IfDecision = new ExecutorFragment(Types._IfDecision, Cr2Tables.Types._IfDecision);
		private static final ExecutorFragment _IfDecision__OclAny = new ExecutorFragment(Types._IfDecision, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IfDecision__OclElement = new ExecutorFragment(Types._IfDecision, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Instruction__Instruction = new ExecutorFragment(Types._Instruction, Cr2Tables.Types._Instruction);
		private static final ExecutorFragment _Instruction__OclAny = new ExecutorFragment(Types._Instruction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Instruction__OclElement = new ExecutorFragment(Types._Instruction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InstructionBlock__InstructionBlock = new ExecutorFragment(Types._InstructionBlock, Cr2Tables.Types._InstructionBlock);
		private static final ExecutorFragment _InstructionBlock__OclAny = new ExecutorFragment(Types._InstructionBlock, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InstructionBlock__OclElement = new ExecutorFragment(Types._InstructionBlock, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LoopDecision__Decision = new ExecutorFragment(Types._LoopDecision, Cr2Tables.Types._Decision);
		private static final ExecutorFragment _LoopDecision__LoopDecision = new ExecutorFragment(Types._LoopDecision, Cr2Tables.Types._LoopDecision);
		private static final ExecutorFragment _LoopDecision__OclAny = new ExecutorFragment(Types._LoopDecision, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LoopDecision__OclElement = new ExecutorFragment(Types._LoopDecision, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, Cr2Tables.Types._Model);
		private static final ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Project__OclAny = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Project__OclElement = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Project__Project = new ExecutorFragment(Types._Project, Cr2Tables.Types._Project);

		private static final ExecutorFragment _Property__OclAny = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Property__OclElement = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Property__Property = new ExecutorFragment(Types._Property, Cr2Tables.Types._Property);

		private static final ExecutorFragment _Start__Action = new ExecutorFragment(Types._Start, Cr2Tables.Types._Action);
		private static final ExecutorFragment _Start__OclAny = new ExecutorFragment(Types._Start, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Start__OclElement = new ExecutorFragment(Types._Start, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Start__Start = new ExecutorFragment(Types._Start, Cr2Tables.Types._Start);

		private static final ExecutorFragment _Target__OclAny = new ExecutorFragment(Types._Target, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Target__OclElement = new ExecutorFragment(Types._Target, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Target__Target = new ExecutorFragment(Types._Target, Cr2Tables.Types._Target);

		private static final ExecutorFragment _Task__OclAny = new ExecutorFragment(Types._Task, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Task__OclElement = new ExecutorFragment(Types._Task, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Task__Task = new ExecutorFragment(Types._Task, Cr2Tables.Types._Task);

		private static final ExecutorFragment _WhileDecision__Decision = new ExecutorFragment(Types._WhileDecision, Cr2Tables.Types._Decision);
		private static final ExecutorFragment _WhileDecision__LoopDecision = new ExecutorFragment(Types._WhileDecision, Cr2Tables.Types._LoopDecision);
		private static final ExecutorFragment _WhileDecision__OclAny = new ExecutorFragment(Types._WhileDecision, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WhileDecision__OclElement = new ExecutorFragment(Types._WhileDecision, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WhileDecision__WhileDecision = new ExecutorFragment(Types._WhileDecision, Cr2Tables.Types._WhileDecision);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__decisions = new EcoreExecutorProperty(Cr2Package.Literals.ACTION__DECISIONS, Types._Action, 0);
		public static final ExecutorProperty _Action__has = new EcoreExecutorProperty(Cr2Package.Literals.ACTION__HAS, Types._Action, 1);
		public static final ExecutorProperty _Action__name = new EcoreExecutorProperty(Cr2Package.Literals.ACTION__NAME, Types._Action, 2);
		public static final ExecutorProperty _Action__Start__next = new ExecutorPropertyWithImplementation("Start", Types._Action, 3, new EcoreLibraryOppositeProperty(Cr2Package.Literals.START__NEXT));
		public static final ExecutorProperty _Action__Task__actions = new ExecutorPropertyWithImplementation("Task", Types._Action, 4, new EcoreLibraryOppositeProperty(Cr2Package.Literals.TASK__ACTIONS));

		public static final ExecutorProperty _Condition__stop_condition = new EcoreExecutorProperty(Cr2Package.Literals.CONDITION__STOP_CONDITION, Types._Condition, 0);
		public static final ExecutorProperty _Condition__IfDecision__contains = new ExecutorPropertyWithImplementation("IfDecision", Types._Condition, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.IF_DECISION__CONTAINS));

		public static final ExecutorProperty _Decision__has = new EcoreExecutorProperty(Cr2Package.Literals.DECISION__HAS, Types._Decision, 0);
		public static final ExecutorProperty _Decision__Action__decisions = new ExecutorPropertyWithImplementation("Action", Types._Decision, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.ACTION__DECISIONS));

		public static final ExecutorProperty _File__name = new EcoreExecutorProperty(Cr2Package.Literals.FILE__NAME, Types._File, 0);
		public static final ExecutorProperty _File__FileTarget__created_towards_a_file = new ExecutorPropertyWithImplementation("FileTarget", Types._File, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.FILE_TARGET__CREATED_TOWARDS_AFILE));
		public static final ExecutorProperty _File__Target__output = new ExecutorPropertyWithImplementation("Target", Types._File, 2, new EcoreLibraryOppositeProperty(Cr2Package.Literals.TARGET__OUTPUT));

		public static final ExecutorProperty _FileTarget__created_towards_a_file = new EcoreExecutorProperty(Cr2Package.Literals.FILE_TARGET__CREATED_TOWARDS_AFILE, Types._FileTarget, 0);
		public static final ExecutorProperty _FileTarget__target = new EcoreExecutorProperty(Cr2Package.Literals.FILE_TARGET__TARGET, Types._FileTarget, 1);

		public static final ExecutorProperty _IfDecision__contains = new EcoreExecutorProperty(Cr2Package.Literals.IF_DECISION__CONTAINS, Types._IfDecision, 0);
		public static final ExecutorProperty _IfDecision__elseif = new EcoreExecutorProperty(Cr2Package.Literals.IF_DECISION__ELSEIF, Types._IfDecision, 1);
		public static final ExecutorProperty _IfDecision__IfDecision__elseif = new ExecutorPropertyWithImplementation("IfDecision", Types._IfDecision, 2, new EcoreLibraryOppositeProperty(Cr2Package.Literals.IF_DECISION__ELSEIF));

		public static final ExecutorProperty _Instruction__name = new EcoreExecutorProperty(Cr2Package.Literals.INSTRUCTION__NAME, Types._Instruction, 0);
		public static final ExecutorProperty _Instruction__InstructionBlock__has = new ExecutorPropertyWithImplementation("InstructionBlock", Types._Instruction, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.INSTRUCTION_BLOCK__HAS));

		public static final ExecutorProperty _InstructionBlock__has = new EcoreExecutorProperty(Cr2Package.Literals.INSTRUCTION_BLOCK__HAS, Types._InstructionBlock, 0);
		public static final ExecutorProperty _InstructionBlock__Action__has = new ExecutorPropertyWithImplementation("Action", Types._InstructionBlock, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.ACTION__HAS));

		public static final ExecutorProperty _Model__name = new EcoreExecutorProperty(Cr2Package.Literals.MODEL__NAME, Types._Model, 0);
		public static final ExecutorProperty _Model__project = new EcoreExecutorProperty(Cr2Package.Literals.MODEL__PROJECT, Types._Model, 1);

		public static final ExecutorProperty _Project__name = new EcoreExecutorProperty(Cr2Package.Literals.PROJECT__NAME, Types._Project, 0);
		public static final ExecutorProperty _Project__target = new EcoreExecutorProperty(Cr2Package.Literals.PROJECT__TARGET, Types._Project, 1);
		public static final ExecutorProperty _Project__tasks = new EcoreExecutorProperty(Cr2Package.Literals.PROJECT__TASKS, Types._Project, 2);
		public static final ExecutorProperty _Project__version = new EcoreExecutorProperty(Cr2Package.Literals.PROJECT__VERSION, Types._Project, 3);
		public static final ExecutorProperty _Project__Model__project = new ExecutorPropertyWithImplementation("Model", Types._Project, 4, new EcoreLibraryOppositeProperty(Cr2Package.Literals.MODEL__PROJECT));

		public static final ExecutorProperty _Property__has = new EcoreExecutorProperty(Cr2Package.Literals.PROPERTY__HAS, Types._Property, 0);
		public static final ExecutorProperty _Property__name = new EcoreExecutorProperty(Cr2Package.Literals.PROPERTY__NAME, Types._Property, 1);
		public static final ExecutorProperty _Property__value = new EcoreExecutorProperty(Cr2Package.Literals.PROPERTY__VALUE, Types._Property, 2);
		public static final ExecutorProperty _Property__Decision__has = new ExecutorPropertyWithImplementation("Decision", Types._Property, 3, new EcoreLibraryOppositeProperty(Cr2Package.Literals.DECISION__HAS));
		public static final ExecutorProperty _Property__Property__has = new ExecutorPropertyWithImplementation("Property", Types._Property, 4, new EcoreLibraryOppositeProperty(Cr2Package.Literals.PROPERTY__HAS));
		public static final ExecutorProperty _Property__Task__has = new ExecutorPropertyWithImplementation("Task", Types._Property, 5, new EcoreLibraryOppositeProperty(Cr2Package.Literals.TASK__HAS));

		public static final ExecutorProperty _Start__next = new EcoreExecutorProperty(Cr2Package.Literals.START__NEXT, Types._Start, 0);

		public static final ExecutorProperty _Target__dependencies = new EcoreExecutorProperty(Cr2Package.Literals.TARGET__DEPENDENCIES, Types._Target, 0);
		public static final ExecutorProperty _Target__has = new EcoreExecutorProperty(Cr2Package.Literals.TARGET__HAS, Types._Target, 1);
		public static final ExecutorProperty _Target__output = new EcoreExecutorProperty(Cr2Package.Literals.TARGET__OUTPUT, Types._Target, 2);
		public static final ExecutorProperty _Target__FileTarget__target = new ExecutorPropertyWithImplementation("FileTarget", Types._Target, 3, new EcoreLibraryOppositeProperty(Cr2Package.Literals.FILE_TARGET__TARGET));
		public static final ExecutorProperty _Target__Project__target = new ExecutorPropertyWithImplementation("Project", Types._Target, 4, new EcoreLibraryOppositeProperty(Cr2Package.Literals.PROJECT__TARGET));
		public static final ExecutorProperty _Target__Target__dependencies = new ExecutorPropertyWithImplementation("Target", Types._Target, 5, new EcoreLibraryOppositeProperty(Cr2Package.Literals.TARGET__DEPENDENCIES));

		public static final ExecutorProperty _Task__actions = new EcoreExecutorProperty(Cr2Package.Literals.TASK__ACTIONS, Types._Task, 0);
		public static final ExecutorProperty _Task__depends = new EcoreExecutorProperty(Cr2Package.Literals.TASK__DEPENDS, Types._Task, 1);
		public static final ExecutorProperty _Task__description = new EcoreExecutorProperty(Cr2Package.Literals.TASK__DESCRIPTION, Types._Task, 2);
		public static final ExecutorProperty _Task__has = new EcoreExecutorProperty(Cr2Package.Literals.TASK__HAS, Types._Task, 3);
		public static final ExecutorProperty _Task__name = new EcoreExecutorProperty(Cr2Package.Literals.TASK__NAME, Types._Task, 4);
		public static final ExecutorProperty _Task__Project__tasks = new ExecutorPropertyWithImplementation("Project", Types._Task, 5, new EcoreLibraryOppositeProperty(Cr2Package.Literals.PROJECT__TASKS));
		public static final ExecutorProperty _Task__Target__has = new ExecutorPropertyWithImplementation("Target", Types._Task, 6, new EcoreLibraryOppositeProperty(Cr2Package.Literals.TARGET__HAS));
		public static final ExecutorProperty _Task__Task__depends = new ExecutorPropertyWithImplementation("Task", Types._Task, 7, new EcoreLibraryOppositeProperty(Cr2Package.Literals.TASK__DEPENDS));

		public static final ExecutorProperty _WhileDecision__Condition__stop_condition = new ExecutorPropertyWithImplementation("Condition", Types._WhileDecision, 0, new EcoreLibraryOppositeProperty(Cr2Package.Literals.CONDITION__STOP_CONDITION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__Action /* 2 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ClosureBackedAction =
			{
				Fragments._ClosureBackedAction__OclAny /* 0 */,
				Fragments._ClosureBackedAction__OclElement /* 1 */,
				Fragments._ClosureBackedAction__Action /* 2 */,
				Fragments._ClosureBackedAction__ClosureBackedAction /* 3 */
			};
		private static final int /*@NonNull*/ [] __ClosureBackedAction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Condition =
			{
				Fragments._Condition__OclAny /* 0 */,
				Fragments._Condition__OclElement /* 1 */,
				Fragments._Condition__Condition /* 2 */
			};
		private static final int /*@NonNull*/ [] __Condition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CustomAction =
			{
				Fragments._CustomAction__OclAny /* 0 */,
				Fragments._CustomAction__OclElement /* 1 */,
				Fragments._CustomAction__Action /* 2 */,
				Fragments._CustomAction__CustomAction /* 3 */
			};
		private static final int /*@NonNull*/ [] __CustomAction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Decision =
			{
				Fragments._Decision__OclAny /* 0 */,
				Fragments._Decision__OclElement /* 1 */,
				Fragments._Decision__Decision /* 2 */
			};
		private static final int /*@NonNull*/ [] __Decision = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DefaultAction =
			{
				Fragments._DefaultAction__OclAny /* 0 */,
				Fragments._DefaultAction__OclElement /* 1 */,
				Fragments._DefaultAction__Action /* 2 */,
				Fragments._DefaultAction__DefaultAction /* 3 */
			};
		private static final int /*@NonNull*/ [] __DefaultAction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _End =
			{
				Fragments._End__OclAny /* 0 */,
				Fragments._End__OclElement /* 1 */,
				Fragments._End__Action /* 2 */,
				Fragments._End__End /* 3 */
			};
		private static final int /*@NonNull*/ [] __End = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _File =
			{
				Fragments._File__OclAny /* 0 */,
				Fragments._File__OclElement /* 1 */,
				Fragments._File__File /* 2 */
			};
		private static final int /*@NonNull*/ [] __File = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FileTarget =
			{
				Fragments._FileTarget__OclAny /* 0 */,
				Fragments._FileTarget__OclElement /* 1 */,
				Fragments._FileTarget__FileTarget /* 2 */
			};
		private static final int /*@NonNull*/ [] __FileTarget = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IfDecision =
			{
				Fragments._IfDecision__OclAny /* 0 */,
				Fragments._IfDecision__OclElement /* 1 */,
				Fragments._IfDecision__Decision /* 2 */,
				Fragments._IfDecision__IfDecision /* 3 */
			};
		private static final int /*@NonNull*/ [] __IfDecision = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Instruction =
			{
				Fragments._Instruction__OclAny /* 0 */,
				Fragments._Instruction__OclElement /* 1 */,
				Fragments._Instruction__Instruction /* 2 */
			};
		private static final int /*@NonNull*/ [] __Instruction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InstructionBlock =
			{
				Fragments._InstructionBlock__OclAny /* 0 */,
				Fragments._InstructionBlock__OclElement /* 1 */,
				Fragments._InstructionBlock__InstructionBlock /* 2 */
			};
		private static final int /*@NonNull*/ [] __InstructionBlock = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LoopDecision =
			{
				Fragments._LoopDecision__OclAny /* 0 */,
				Fragments._LoopDecision__OclElement /* 1 */,
				Fragments._LoopDecision__Decision /* 2 */,
				Fragments._LoopDecision__LoopDecision /* 3 */
			};
		private static final int /*@NonNull*/ [] __LoopDecision = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Model /* 2 */
			};
		private static final int /*@NonNull*/ [] __Model = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Project =
			{
				Fragments._Project__OclAny /* 0 */,
				Fragments._Project__OclElement /* 1 */,
				Fragments._Project__Project /* 2 */
			};
		private static final int /*@NonNull*/ [] __Project = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Property =
			{
				Fragments._Property__OclAny /* 0 */,
				Fragments._Property__OclElement /* 1 */,
				Fragments._Property__Property /* 2 */
			};
		private static final int /*@NonNull*/ [] __Property = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Start =
			{
				Fragments._Start__OclAny /* 0 */,
				Fragments._Start__OclElement /* 1 */,
				Fragments._Start__Action /* 2 */,
				Fragments._Start__Start /* 3 */
			};
		private static final int /*@NonNull*/ [] __Start = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Target =
			{
				Fragments._Target__OclAny /* 0 */,
				Fragments._Target__OclElement /* 1 */,
				Fragments._Target__Target /* 2 */
			};
		private static final int /*@NonNull*/ [] __Target = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Task =
			{
				Fragments._Task__OclAny /* 0 */,
				Fragments._Task__OclElement /* 1 */,
				Fragments._Task__Task /* 2 */
			};
		private static final int /*@NonNull*/ [] __Task = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WhileDecision =
			{
				Fragments._WhileDecision__OclAny /* 0 */,
				Fragments._WhileDecision__OclElement /* 1 */,
				Fragments._WhileDecision__Decision /* 2 */,
				Fragments._WhileDecision__LoopDecision /* 3 */,
				Fragments._WhileDecision__WhileDecision /* 4 */
			};
		private static final int /*@NonNull*/ [] __WhileDecision = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._ClosureBackedAction.initFragments(_ClosureBackedAction, __ClosureBackedAction);
			Types._Condition.initFragments(_Condition, __Condition);
			Types._CustomAction.initFragments(_CustomAction, __CustomAction);
			Types._Decision.initFragments(_Decision, __Decision);
			Types._DefaultAction.initFragments(_DefaultAction, __DefaultAction);
			Types._End.initFragments(_End, __End);
			Types._File.initFragments(_File, __File);
			Types._FileTarget.initFragments(_FileTarget, __FileTarget);
			Types._IfDecision.initFragments(_IfDecision, __IfDecision);
			Types._Instruction.initFragments(_Instruction, __Instruction);
			Types._InstructionBlock.initFragments(_InstructionBlock, __InstructionBlock);
			Types._LoopDecision.initFragments(_LoopDecision, __LoopDecision);
			Types._Model.initFragments(_Model, __Model);
			Types._Project.initFragments(_Project, __Project);
			Types._Property.initFragments(_Property, __Property);
			Types._Start.initFragments(_Start, __Start);
			Types._Target.initFragments(_Target, __Target);
			Types._Task.initFragments(_Task, __Task);
			Types._WhileDecision.initFragments(_WhileDecision, __WhileDecision);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ClosureBackedAction__ClosureBackedAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClosureBackedAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ClosureBackedAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ClosureBackedAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Condition__Condition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Condition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Condition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CustomAction__CustomAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CustomAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CustomAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CustomAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Decision__Decision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Decision__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Decision__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DefaultAction__DefaultAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DefaultAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DefaultAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DefaultAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _End__End = {};
		private static final ExecutorOperation /*@NonNull*/ [] _End__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _End__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _End__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _File__File = {};
		private static final ExecutorOperation /*@NonNull*/ [] _File__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _File__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FileTarget__FileTarget = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FileTarget__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FileTarget__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IfDecision__IfDecision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IfDecision__Decision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IfDecision__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IfDecision__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Instruction__Instruction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Instruction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Instruction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InstructionBlock__InstructionBlock = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InstructionBlock__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InstructionBlock__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LoopDecision__LoopDecision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LoopDecision__Decision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LoopDecision__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LoopDecision__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Model__Model = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Project__Project = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Property__Property = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Property__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Property__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Start__Start = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Start__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Start__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Start__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Target__Target = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Target__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Target__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Task__Task = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WhileDecision__WhileDecision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WhileDecision__Decision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WhileDecision__LoopDecision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WhileDecision__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WhileDecision__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._ClosureBackedAction__Action.initOperations(_ClosureBackedAction__Action);
			Fragments._ClosureBackedAction__ClosureBackedAction.initOperations(_ClosureBackedAction__ClosureBackedAction);
			Fragments._ClosureBackedAction__OclAny.initOperations(_ClosureBackedAction__OclAny);
			Fragments._ClosureBackedAction__OclElement.initOperations(_ClosureBackedAction__OclElement);

			Fragments._Condition__Condition.initOperations(_Condition__Condition);
			Fragments._Condition__OclAny.initOperations(_Condition__OclAny);
			Fragments._Condition__OclElement.initOperations(_Condition__OclElement);

			Fragments._CustomAction__Action.initOperations(_CustomAction__Action);
			Fragments._CustomAction__CustomAction.initOperations(_CustomAction__CustomAction);
			Fragments._CustomAction__OclAny.initOperations(_CustomAction__OclAny);
			Fragments._CustomAction__OclElement.initOperations(_CustomAction__OclElement);

			Fragments._Decision__Decision.initOperations(_Decision__Decision);
			Fragments._Decision__OclAny.initOperations(_Decision__OclAny);
			Fragments._Decision__OclElement.initOperations(_Decision__OclElement);

			Fragments._DefaultAction__Action.initOperations(_DefaultAction__Action);
			Fragments._DefaultAction__DefaultAction.initOperations(_DefaultAction__DefaultAction);
			Fragments._DefaultAction__OclAny.initOperations(_DefaultAction__OclAny);
			Fragments._DefaultAction__OclElement.initOperations(_DefaultAction__OclElement);

			Fragments._End__Action.initOperations(_End__Action);
			Fragments._End__End.initOperations(_End__End);
			Fragments._End__OclAny.initOperations(_End__OclAny);
			Fragments._End__OclElement.initOperations(_End__OclElement);

			Fragments._File__File.initOperations(_File__File);
			Fragments._File__OclAny.initOperations(_File__OclAny);
			Fragments._File__OclElement.initOperations(_File__OclElement);

			Fragments._FileTarget__FileTarget.initOperations(_FileTarget__FileTarget);
			Fragments._FileTarget__OclAny.initOperations(_FileTarget__OclAny);
			Fragments._FileTarget__OclElement.initOperations(_FileTarget__OclElement);

			Fragments._IfDecision__Decision.initOperations(_IfDecision__Decision);
			Fragments._IfDecision__IfDecision.initOperations(_IfDecision__IfDecision);
			Fragments._IfDecision__OclAny.initOperations(_IfDecision__OclAny);
			Fragments._IfDecision__OclElement.initOperations(_IfDecision__OclElement);

			Fragments._Instruction__Instruction.initOperations(_Instruction__Instruction);
			Fragments._Instruction__OclAny.initOperations(_Instruction__OclAny);
			Fragments._Instruction__OclElement.initOperations(_Instruction__OclElement);

			Fragments._InstructionBlock__InstructionBlock.initOperations(_InstructionBlock__InstructionBlock);
			Fragments._InstructionBlock__OclAny.initOperations(_InstructionBlock__OclAny);
			Fragments._InstructionBlock__OclElement.initOperations(_InstructionBlock__OclElement);

			Fragments._LoopDecision__Decision.initOperations(_LoopDecision__Decision);
			Fragments._LoopDecision__LoopDecision.initOperations(_LoopDecision__LoopDecision);
			Fragments._LoopDecision__OclAny.initOperations(_LoopDecision__OclAny);
			Fragments._LoopDecision__OclElement.initOperations(_LoopDecision__OclElement);

			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._Project__OclAny.initOperations(_Project__OclAny);
			Fragments._Project__OclElement.initOperations(_Project__OclElement);
			Fragments._Project__Project.initOperations(_Project__Project);

			Fragments._Property__OclAny.initOperations(_Property__OclAny);
			Fragments._Property__OclElement.initOperations(_Property__OclElement);
			Fragments._Property__Property.initOperations(_Property__Property);

			Fragments._Start__Action.initOperations(_Start__Action);
			Fragments._Start__OclAny.initOperations(_Start__OclAny);
			Fragments._Start__OclElement.initOperations(_Start__OclElement);
			Fragments._Start__Start.initOperations(_Start__Start);

			Fragments._Target__OclAny.initOperations(_Target__OclAny);
			Fragments._Target__OclElement.initOperations(_Target__OclElement);
			Fragments._Target__Target.initOperations(_Target__Target);

			Fragments._Task__OclAny.initOperations(_Task__OclAny);
			Fragments._Task__OclElement.initOperations(_Task__OclElement);
			Fragments._Task__Task.initOperations(_Task__Task);

			Fragments._WhileDecision__Decision.initOperations(_WhileDecision__Decision);
			Fragments._WhileDecision__LoopDecision.initOperations(_WhileDecision__LoopDecision);
			Fragments._WhileDecision__OclAny.initOperations(_WhileDecision__OclAny);
			Fragments._WhileDecision__OclElement.initOperations(_WhileDecision__OclElement);
			Fragments._WhileDecision__WhileDecision.initOperations(_WhileDecision__WhileDecision);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			Cr2Tables.Properties._Action__decisions,
			Cr2Tables.Properties._Action__has,
			Cr2Tables.Properties._Action__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ClosureBackedAction = {
			Cr2Tables.Properties._Action__decisions,
			Cr2Tables.Properties._Action__has,
			Cr2Tables.Properties._Action__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Condition = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Condition__stop_condition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CustomAction = {
			Cr2Tables.Properties._Action__decisions,
			Cr2Tables.Properties._Action__has,
			Cr2Tables.Properties._Action__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Decision = {
			Cr2Tables.Properties._Decision__has,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DefaultAction = {
			Cr2Tables.Properties._Action__decisions,
			Cr2Tables.Properties._Action__has,
			Cr2Tables.Properties._Action__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _End = {
			Cr2Tables.Properties._Action__decisions,
			Cr2Tables.Properties._Action__has,
			Cr2Tables.Properties._Action__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _File = {
			Cr2Tables.Properties._File__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FileTarget = {
			Cr2Tables.Properties._FileTarget__created_towards_a_file,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._FileTarget__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IfDecision = {
			Cr2Tables.Properties._IfDecision__contains,
			Cr2Tables.Properties._IfDecision__elseif,
			Cr2Tables.Properties._Decision__has,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Instruction = {
			Cr2Tables.Properties._Instruction__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InstructionBlock = {
			Cr2Tables.Properties._InstructionBlock__has,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LoopDecision = {
			Cr2Tables.Properties._Decision__has,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Model = {
			Cr2Tables.Properties._Model__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Model__project
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Project = {
			Cr2Tables.Properties._Project__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Project__target,
			Cr2Tables.Properties._Project__tasks,
			Cr2Tables.Properties._Project__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Property = {
			Cr2Tables.Properties._Property__has,
			Cr2Tables.Properties._Property__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Property__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Start = {
			Cr2Tables.Properties._Action__decisions,
			Cr2Tables.Properties._Action__has,
			Cr2Tables.Properties._Action__name,
			Cr2Tables.Properties._Start__next,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Target = {
			Cr2Tables.Properties._Target__dependencies,
			Cr2Tables.Properties._Target__has,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Target__output
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Task = {
			Cr2Tables.Properties._Task__actions,
			Cr2Tables.Properties._Task__depends,
			Cr2Tables.Properties._Task__description,
			Cr2Tables.Properties._Task__has,
			Cr2Tables.Properties._Task__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WhileDecision = {
			Cr2Tables.Properties._Decision__has,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._ClosureBackedAction__ClosureBackedAction.initProperties(_ClosureBackedAction);
			Fragments._Condition__Condition.initProperties(_Condition);
			Fragments._CustomAction__CustomAction.initProperties(_CustomAction);
			Fragments._Decision__Decision.initProperties(_Decision);
			Fragments._DefaultAction__DefaultAction.initProperties(_DefaultAction);
			Fragments._End__End.initProperties(_End);
			Fragments._File__File.initProperties(_File);
			Fragments._FileTarget__FileTarget.initProperties(_FileTarget);
			Fragments._IfDecision__IfDecision.initProperties(_IfDecision);
			Fragments._Instruction__Instruction.initProperties(_Instruction);
			Fragments._InstructionBlock__InstructionBlock.initProperties(_InstructionBlock);
			Fragments._LoopDecision__LoopDecision.initProperties(_LoopDecision);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._Project__Project.initProperties(_Project);
			Fragments._Property__Property.initProperties(_Property);
			Fragments._Start__Start.initProperties(_Start);
			Fragments._Target__Target.initProperties(_Target);
			Fragments._Task__Task.initProperties(_Task);
			Fragments._WhileDecision__WhileDecision.initProperties(_WhileDecision);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Cr2Tables();
	}

	private Cr2Tables() {
		super(Cr2Package.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Cr2Package.Literals.PROPERTY,
		Cr2Package.Literals.TASK
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
