package prototype1.domain;

import java.util.List;

public class Task {
			
	private String name;
	private String description;
	private List<Property> property;
	private List<Action> action;
	private List<Task> task;
		
	public Task(String name,String description,List<Property> property,List<Action> action,List<Task> task){
		this.name = name;
		this.description = description;
		this.property = property;
		this.action = action;
		this.task = task;
	}
			
	public List<Action> getAction(){
		return action;
	}
				
	public List<Property> getProperty(){
		return property;
	}
				
	public List<Task> getTask(){
		return task;
	}
				
	public String getDescription(){
		return description;
	} 
				
	public String getName(){
		return name;
	}
				
	public void setName(String name) {
		this.name = name;
	}
				
	public void setDescription(String description){
		this.description = description;
	}
				
	public void setAction(List<Action> action){
		this.action = action;
	}
				
	public void setProperty(List<Property> property){
		this.property = property;
	}
				
	public void setTask(List<Task> task){
		this.task = task;
	}
}