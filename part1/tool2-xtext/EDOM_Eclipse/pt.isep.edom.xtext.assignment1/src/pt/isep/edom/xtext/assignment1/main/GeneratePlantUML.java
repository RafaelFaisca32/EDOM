package pt.isep.edom.xtext.assignment1.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pt.isep.edom.assignment1.Action;
import pt.isep.edom.assignment1.Assignment1Factory;
import pt.isep.edom.assignment1.Assignment1Package;
import pt.isep.edom.assignment1.Decision;
import pt.isep.edom.assignment1.Instruction;
import pt.isep.edom.assignment1.InstructionBlock;
import pt.isep.edom.assignment1.Model;
import pt.isep.edom.assignment1.Project;
import pt.isep.edom.assignment1.Property;
import pt.isep.edom.assignment1.Target;
import pt.isep.edom.assignment1.Task;


public class GeneratePlantUML {

	public static void main(String[] args) {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("assignment1", new XMIResourceFactoryImpl());

		// Initialize the model
		Assignment1Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Assignment1Factory factory = Assignment1Factory.eINSTANCE;

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		//change this attribute to load a different xmi
		Resource resource = resSet.getResource(URI.createURI("instances/C.assignment1"), true);
		//Resource resource = resSet.getResource(URI.createURI("instances/Java.assignment1"), true);

		PrintWriter writer=null;
		try {
			// now load the content.
			resource.load(Collections.EMPTY_MAP);

			// Get the root element
			EObject root = resource.getContents().get(0);
			Model myModel=(Model)root;
			
			System.out.println(root.toString());
			
			//-----
			// Generate a plantuml file that represents the CR2 model in a UML diagram (other options/notations could be used)
			FileWriter w = new FileWriter("instances/uml.puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        writer.println("left to right direction");
	        
	        //generate model
			writer.println("class Model {");
			writer.println("name " + myModel.getName());
			writer.println("}");
	        
			//generate project
			Project myProject = myModel.getProject();
			writer.println("class Project {");
			writer.println("name " + myProject.getName());
			writer.println("version " + myProject.getVersion());
			writer.println("}");
			
			writer.println("Model -> Project");
			
			//generate target connected to project
			for(Target myTarget : myProject.getTarget()) {
				writer.println("class Target_" + myTarget.getOutput().getName().replaceAll(" ", "_").replace(".","_") + " {");
				writer.println("}");
				
				writer.println("Project ->" + "Target_" + myTarget.getOutput().getName().replaceAll(" ", "_").replace(".","_"));
				
				//generate file connected to target
				writer.println("class File_" + myTarget.getOutput().getName().replaceAll(" ", "_").replace(".","_") + " {");
				writer.println("name "+ myTarget.getOutput().getName());
				writer.println("}");
				
				writer.println("Target_" + myTarget.getOutput().getName().replaceAll(" ", "_").replace(".","_") + "-> " + "File_" + myTarget.getOutput().getName().replaceAll(" ", "_").replace(".","_"));
				
				//generate task connected to target
				writer.println("class Task_"+myTarget.getHas().getName().replaceAll(" ", "_").replace(".","_") + " {");
				writer.println("name "+ myTarget.getHas().getName());
				writer.println("description "+ myTarget.getHas().getDescription());
		        writer.println("}");
		        
		        writer.println("Target_" + myTarget.getOutput().getName().replaceAll(" ", "_").replace(".","_") + "->" + "Task_" + myTarget.getHas().getName().replaceAll(" ", "_").replace(".","_"));
		        
		        //generate property connected to task
		        for(Property myP : myTarget.getHas().getHas()) {
		        	writer.println("class Property_" + myP.getName().replaceAll(" ", "_").replace(".","_") + " {");
		        	writer.println("name "+ myP.getName());
		        	writer.println("value "+ myP.getValue());
		        	writer.println("}");
		        	
		        	writer.println("Task_" + myTarget.getHas().getName().replaceAll(" ", "_").replace(".","_") + "->" + "Property_" + myP.getName().replaceAll(" ", "_").replace(".","_"));
		        }
				
			}			
			
			//generate task connected to project
			for(Task myTaskProject : myProject.getTasks()) {
				writer.println("class Task_"+myTaskProject.getName().replaceAll(" ", "_").replace(".","_") + " {");
				writer.println("name "+ myTaskProject.getName());
				writer.println("description "+ myTaskProject.getDescription());
		        writer.println("}");
		        
		        writer.println("Project ->" + "Task_" + myTaskProject.getName().replaceAll(" ", "_").replace(".","_"));
		        
		        //generate action connected to task
		        for(Action action : myTaskProject.getActions()) {
		        	writer.println("class Action_" + action.getName().replaceAll(" ", "_").replace(".","_") + "{");
					writer.println("name "+ action.getName());
			        writer.println("}");
			        
			        writer.println("Task_" + myTaskProject.getName().replaceAll(" ", "_").replace(".","_") +  " -> Action_" + action.getName().replaceAll(" ", "_").replace(".","_"));
			        
			        //generate InstructionBlock connected to action
			        writer.println("class InstructionBlock_" + action.getName().replaceAll(" ", "_").replace(".","_") + " {");
			        writer.println("}");
			        
			        writer.println("Action_" + action.getName().replaceAll(" ", "_").replace(".","_") + " -> InstructionBlock_" + action.getName().replaceAll(" ", "_").replace(".","_"));
			        
			        //generate Start connected to action
			        writer.println("class Start_" + action.getName().replaceAll(" ", "_").replace(".","_") + " {");
			        writer.println("}");
			        
			        writer.println("Action_" + action.getName().replaceAll(" ", "_").replace(".","_") + " -> Start_" + action.getName().replaceAll(" ", "_").replace(".","_"));
			        
			        //generate End connected to action
			        writer.println("class End_" + action.getName().replaceAll(" ", "_").replace(".","_") + " {");
			        writer.println("}");
			        
			        writer.println("Action_" + action.getName().replaceAll(" ", "_").replace(".","_") + " -> End_" + action.getName().replaceAll(" ", "_").replace(".","_"));
			        
			        for(InstructionBlock ib: action.getHas()) {
			        	for(Instruction i : ib.getHas()) {      	
			        		//generate Instruction connected to InstructionBlock
			        		writer.println("class Instruction_" + i.getName().replaceAll(" ", "_").replace(".","_") + " {");
			        		writer.println("}");
				        
			        		writer.println("InstructionBlock_" + action.getName().replaceAll(" ", "_").replace(".","_") + " -> Instruction_" + i.getName().replaceAll(" ", "_").replace(".","_"));
			        	}	        
			        }
			        
			        for(Decision myDecision : action.getDecisions()) {
			        	
			        	//generate Decision connected to action
				        writer.println("class Decision_" + action.getName().replaceAll(" ", "_").replace(".","_") + " {");
				        writer.println("}");
				        
				        writer.println("Action_" + action.getName().replaceAll(" ", "_").replace(".","_") + " -> Decision_" + action.getName().replaceAll(" ", "_").replace(".","_"));
				        
				      //generate Property connected to Decision
			        	for(Property myProperty : myDecision.getHas()) {
			        		writer.println("class Property_" + myProperty.getName().replaceAll(" ", "_").replace(".","_") + " {");
							writer.println("name "+ myProperty.getName());
							writer.println("value "+ myProperty.getValue());
					        writer.println("}");
					        
					        writer.println("Decision_" + action.getName().replaceAll(" ", "_").replace(".","_") + " -> Property_" + myProperty.getName().replaceAll(" ", "_").replace(".","_"));
			        	}
			        }
		        }     
			}
			
	        writer.println("@enduml");		
	        writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
	}
}