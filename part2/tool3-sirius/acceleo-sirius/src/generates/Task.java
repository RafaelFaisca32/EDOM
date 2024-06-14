package generates;

import java.util.List;

public class Task {
		
	private String name;
	private String description;
	private List<Property> properties;
	private List<Action> actions;
	private List<Task> tasks;
	
	public Task(String name,String description,List<Property> properties,List<Action> actions,List<Task> tasks){
		this.name = name;
		this.description = description;
		this.properties = properties;
		this.actions = actions;
		this.tasks = tasks;
	}
		
	public List<Action> getActions(){
		return actions;
	}
			
	public List<Property> getProperties(){
		return properties;
	}
			
	public List<Task> getTasks(){
		return tasks;
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
			
	public void setActions(List<Action> actions){
		this.actions = actions;
	}
			
	public void setProperties(List<Property> properties){
		this.properties = properties;
	}
			
	public void setTasks(List<Task> tasks){
		this.tasks = tasks;
	}
}

