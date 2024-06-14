package generates;

import java.util.List;

public class Target {
	
	private String name;
	private Task task;
	private File input;
	private File output;
	private List<Target> targets;
	
	public Target(String name,File input,File output,Task task,List<Target> targets){
		this.name = name;
		this.input = input;
		this.output = output;
		this.task = task;
		this.targets = targets;
	}
		
	public String getName(){
		return name;
	}
	
	public File getInput(){
		return input;
	} 
		
	public File getOutput(){
		return output;
	}
	
	public Task getTask(){
		return task;
	}
	
	public List<Target> getTargets(){
		return targets;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public void setInput(File input){
		this.input = input;
	}
	
	public void setOutput(File output){
		this.output = output;
	}
	
	public void setTask(Task task){
		this.task = task;
	}
	
	public void setTargets(List<Target> targets){
		this.targets = targets;
	}
}

