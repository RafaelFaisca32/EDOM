package generates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class TaskMenu {
    	
public static void executeMenu(Project project) {
    	
	boolean exit = false;
    		Scanner input = new Scanner(System.in);
    	
    		while (!exit) {
    			System.out.println(" Please select one option:");
    		
    			System.out.println("0 - Return to main menu");

				List<String> type = new ArrayList<>();
				System.out.println("# Targets");
				int contador;
				int targets = project.getTargets().size();
    			for(contador=0;contador<targets;contador++){
    				System.out.println(contador+1 + " - " + project.getTargets().get(contador).getTask().getName());
					type.add("Target");
    			}
				System.out.println("# Tasks");
				for(int i=0;i<project.getTasks().size();i++){
					contador++;
					System.out.println(contador + " - " + project.getTasks().get(i).getName());
					type.add("Task");
				}
    			String line = input.nextLine();
    			int num = Integer.valueOf(line);
    								
    			switch (num) {
    				case 0:
    					MainMenu.executeMenu(project);
    					break;
    				default:
						String typeSelected = type.get(num-1);
    					if(typeSelected.equals("Task")) {
    						System.out.println("Task "+ project.getTasks().get(num-1-targets).getName());
							System.out.println("Task Description - " + project.getTasks().get(num-1-targets).getDescription());
        					System.out.println("Properties " + project.getTasks().get(num-1-targets).getProperties());
							for(Action a : project.getTasks().get(num-1-targets).getActions()){
								System.out.println("Action " + a.getName());
								System.out.println("Action Decisions " + a.getDecisions().toString());
							}
    					} else {
							System.out.println("#Target " +  project.getTargets().get(num-1).getName());
							System.out.println("#Input File " +  project.getTargets().get(num-1).getInput().getName());
							System.out.println("#Output File " +  project.getTargets().get(num-1).getOutput().getName());
        					System.out.println("#Task Name " + project.getTargets().get(num-1).getTask().getName());
        					System.out.println("#Task Property" + project.getTargets().get(num-1).getTask().getProperties());
    					}
    					break;
    			}
    		}
   		}
    }



