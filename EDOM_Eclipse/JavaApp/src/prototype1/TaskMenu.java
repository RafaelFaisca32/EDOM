package prototype1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prototype1.domain.Action;
import prototype1.domain.Project;

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
				int targets = project.getTarget().size();
    			for(contador=0;contador<targets;contador++){
    				System.out.println(contador+1 + " - " + project.getTarget().get(contador).getTask().getName());
					type.add("Target");
    			}
				System.out.println("# Tasks");
				for(int i=0;i<project.getTask().size();i++){
					contador++;
					System.out.println(contador + " - " + project.getTask().get(i).getName());
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
    						System.out.println("Task "+ project.getTask().get(num-1-targets).getName());
							System.out.println("Task Description - " + project.getTask().get(num-1-targets).getDescription());
        					System.out.println("Properties " + project.getTask().get(num-1-targets).getProperty());
							for(Action a : project.getTask().get(num-1-targets).getAction()){
								System.out.println("Action " + a.getName());
								System.out.println("Action Decisions " + a.getDecision().toString());
							}
    					} else {
							System.out.println("#Target " +  project.getTarget().get(num-1).getName());
							System.out.println("#Input File " +  project.getTarget().get(num-1).getInput().getName());
							System.out.println("#Output File " +  project.getTarget().get(num-1).getOutput().getName());
        					System.out.println("#Task Name " + project.getTarget().get(num-1).getTask().getName());
        					System.out.println("#Task Property" + project.getTarget().get(num-1).getTask().getProperty());
    					}
    					break;
    			}
    		}
   		}
    }