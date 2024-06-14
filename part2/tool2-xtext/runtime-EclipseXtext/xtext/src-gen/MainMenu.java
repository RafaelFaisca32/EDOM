package prototype1;
	
public class MainMenu {
	
	public static Project createProject() {
		
		List<Target> targetList = new ArrayList<>();
		List<Task> taskList = new ArrayList<>();
		String name0 = "Classes";
		File input0 = new File("BuildClasses.c");
		File output0 = new File("BuildClasses.o");
		List<Property> propertyList0 = new ArrayList<>();
		List<Action> actionList0 = new ArrayList<>();
		Property propertyClasses0 = new Property("Build","Build");
		propertyList0.add(propertyClasses0);
		Task task0 = new Task("BuildClasses","this c class is responsible of building other classes",propertyList0,actionList0,null);
		Target target0 = new Target(name0,input0,output0,task0,null);
		targetList.add(target0);
		String name1 = "Dependencies";
		File input1 = new File("BuildDependencies.c");
		File output1 = new File("BuildDependencies.o");
		List<Property> propertyList1 = new ArrayList<>();
		List<Action> actionList1 = new ArrayList<>();
		Property propertyDependencies0 = new Property("BuildDep","BuildDep");
		propertyList1.add(propertyDependencies0);
		Task task1 = new Task("BuildDependencies","this class is responsible for connecting the dependecies",propertyList1,actionList1,null);
		Target target1 = new Target(name1,input1,output1,task1,null);
		targetList.add(target1);
		String name2 = "Information";
		File input2 = new File("InfoBuilder.lib");
		File output2 = new File("InfoBuilder.lib");
		List<Property> propertyList2 = new ArrayList<>();
		List<Action> actionList2 = new ArrayList<>();
		Property propertyInformation0 = new Property("Lib","Lib");
		propertyList2.add(propertyInformation0);
		Task task2 = new Task("InformationLibrary","File contains a library of information used by a specific program. It may store a variety of information.",propertyList2,actionList2,null);
		Target target2 = new Target(name2,input2,output2,task2,null);
		targetList.add(target2);
		String name3 = "Declarations";
		File input3 = new File("header.h");
		File output3 = new File("header.h");
		List<Property> propertyList3 = new ArrayList<>();
		List<Action> actionList3 = new ArrayList<>();
		Property propertyDeclarations0 = new Property("Dec","Dec");
		propertyList3.add(propertyDeclarations0);
		Task task3 = new Task("DeclarationsToShare","C function declarations and macro definitions to be shared between several source files.",propertyList3,actionList3,null);
		Target target3 = new Target(name3,input3,output3,task3,null);
		targetList.add(target3);
		List<Property> propertyTaskList0 = new ArrayList<>();
		List<Action> actionTaskList0 = new ArrayList<>();
		Property propertyDeleteFiles0 = new Property("Del","Del");
		propertyTaskList0.add(propertyDeleteFiles0);
		List<Decision> decisionTaskList0 = new ArrayList<>();
		List<Property> propertyTaskListDecision0 = new ArrayList<>();
		Property propertyTaskDecision0 = new Property("IsTempFile","boolean");
		propertyTaskListDecision0.add(propertyTaskDecision0);
		List<Condition> conditionTaskListDecision0 = new ArrayList<>();
		Condition conditionTaskDecision0 = new Condition("loop");
		conditionTaskListDecision0.add(conditionTaskDecision0);
		Decision decisionTask0 = new Decision(propertyTaskListDecision0,conditionTaskListDecision0);
		decisionTaskList0.add(decisionTask0);
		Action actionTask0 = new Action("DeleteCFiles",decisionTaskList0);
		actionTaskList0.add(actionTask0);
		Task taskTask0 = new Task("DeleteFiles","Task to delete the temporary files generated by the build.",propertyTaskList0,actionTaskList0,null);
		taskList.add(taskTask0);
		Project project = new Project("CBuilder","v22.30.2",targetList,taskList);
		return project;
	}
		
	public static void executeMenu(Project project) {
		
		boolean exit = false;
		Scanner input = new Scanner(System.in);
		
		while (!exit) {

			System.out.println(" # CBuilder ");
			System.out.println(" Please select one option:");
					
			System.out.println("0 - Exit");
			System.out.println("1 - Execute Tasks");
					
			String line = input.nextLine();
			int num = Integer.valueOf(line);
					
			switch (num) {
				case 0:
					exit = true;
					break;
				case 1:
					TaskMenu.executeMenu(project);
			}
		}
	}
}
