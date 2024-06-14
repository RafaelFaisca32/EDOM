	package prototype1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prototype1.domain.Action;
import prototype1.domain.Condition;
import prototype1.domain.Decision;
import prototype1.domain.File;
import prototype1.domain.Project;
import prototype1.domain.Property;
import prototype1.domain.Target;
import prototype1.domain.Task;

public class MainMenu {
		
		public static Project createProject() {
			
			List<Target> targetList = new ArrayList<>();
			List<Task> taskList = new ArrayList<>();
				String name1 = "Build Classes ";
				File input1 = new File("BuildClasses.java");
				File output1 = new File("BuildClasses.class");
				List<Property> propertyList1 = new ArrayList<>();
				List<Action> actionList1 = new ArrayList<>();
						Property propertyBuildClasses1 = new Property("Build","build");
						propertyList1.add(propertyBuildClasses1);
				Task task1 = new Task("Build classes","this java class is responsible of building other classes",propertyList1,null,null);
				Target target1 = new Target(name1,input1,output1,task1,null);
				targetList.add(target1);
				String name2 = "Create";
				File input2 = new File("CreateAJar.class");
				File output2 = new File("CreateAJar.jar");
				List<Property> propertyList2 = new ArrayList<>();
				List<Action> actionList2 = new ArrayList<>();
						Property propertyCreate1 = new Property("Dist","dist");
						propertyList2.add(propertyCreate1);
				Task task2 = new Task("Create Jars","This java class is responsible for the creation of jar files.",propertyList2,null,null);
				Target target2 = new Target(name2,input2,output2,task2,null);
				targetList.add(target2);
				String name3 = "NExplicit";
				File input3 = new File("build.class");
				File output3 = new File("buildDep.class");
				List<Property> propertyList3 = new ArrayList<>();
				List<Action> actionList3 = new ArrayList<>();
						Property propertyNExplicit1 = new Property("Lib","lib");
						propertyList3.add(propertyNExplicit1);
				Task task3 = new Task("NonExplicit","2 java classes on this builder depend on this jar file.",propertyList3,null,null);
				Target target3 = new Target(name3,input3,output3,task3,null);
				targetList.add(target3);
				List<Property> propertyTaskList1 = new ArrayList<>();
				List<Action> actionTaskList1 = new ArrayList<>();
					Property propertyDeleteFiles1 = new Property("Del","del");
					propertyTaskList1.add(propertyDeleteFiles1);
					List<Decision> decisionTaskList1 = new ArrayList<>();
						List<Property> propertyTaskListDecision1 = new ArrayList<>();
							Property propertyTaskDecision1 = new Property("DeleteAllJar","boolean");
							propertyTaskListDecision1.add(propertyTaskDecision1);
						List<Condition> conditionTaskListDecision1 = new ArrayList<>();
							Condition conditionTaskDecision1 = new Condition("CleanBuild");
							conditionTaskListDecision1.add(conditionTaskDecision1);
						Decision decisionTask1 = new Decision(propertyTaskListDecision1,conditionTaskListDecision1);
						decisionTaskList1.add(decisionTask1);
					Action actionTask1 = new Action("Delete jar files",decisionTaskList1);
					actionTaskList1.add(actionTask1);
				Task taskTask1 = new Task("DeleteFiles","task to delete the temporary files generated by the build",propertyTaskList1,actionTaskList1,null);
				taskList.add(taskTask1);
			Project project = new Project("JavaBuilder","v.1.30.2",targetList,taskList);
			return project;
		}
			
		public static void executeMenu(Project project) {
			
			boolean exit = false;
			Scanner input = new Scanner(System.in);
			
			while (!exit) {

				System.out.println(" # JavaBuilder ");
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
						break;
				}
			}
		}
	}