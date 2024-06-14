package my.project.design.sirius;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.emf.ecore.EObject;

import isep.assignment2.cr2.Action;
import isep.assignment2.cr2.Decision;
import isep.assignment2.cr2.Instruction;
import isep.assignment2.cr2.InstructionBlock;
import isep.assignment2.cr2.Model;
import isep.assignment2.cr2.Project;
import isep.assignment2.cr2.Property;
import isep.assignment2.cr2.Target;
import isep.assignment2.cr2.Task;


/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public void generatePlantuml(Model model) {
    PrintWriter writer=null;
	try {
		
		Model myModel=model;
		
		
		//-----
		// Generate a plantuml file that represents the CR2 model in a UML diagram (other options/notations could be used)
		FileWriter w;
		String homeDir = System.getProperty("user.home");
		w = new FileWriter(homeDir + "/avaliacao.puml");
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
    
    public void taskNameToUppercase(Project s) {
    	for (Task f: s.getTasks()) {
    		f.setName(f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1, f.getName().length()));
    	}
    }
    
    public void taskNameToUppercase1(Target s) {
    	Task f= s.getHas() ;
    		f.setName(f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1, f.getName().length()));
    	
    }
    
    public void targetNameToUppercase(Project s) {
    	for (Target f: s.getTarget()) {
    		f.setName(f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1, f.getName().length()));
    	}
    }
    
    public void propertyNameToUppercase(Task s) {
    	for (Property f: s.getHas()) {
    		f.setName(f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1, f.getName().length()));
    	}
    }
    
    public void propertyNameToUppercase1(Decision s) {
    	for (Property f: s.getHas()) {
    		f.setName(f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1, f.getName().length()));
    	}
    }
    
}
