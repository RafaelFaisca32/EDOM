package prototype1.domain;

import java.util.List;

public class Target {
			
	private String name;
	private Task task;
	private File input;
	private File output;
	private List<Target> target;
			
	public Target(String name,File input,File output,Task task,List<Target> target){
		this.name = name;
		this.input = input;
		this.output = output;
		this.task = task;
		this.target = target;
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
			
	public List<Target> getTarget(){
		return target;
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
			
	public void setTarget(List<Target> target){
		this.target = target;
	}
}