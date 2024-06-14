package prototype1.domain;

import java.util.List;

public class Project{
	
	private String name;
	private String version;
	private List<Target> targets;
	private List<Task> tasks;
	
	public Project(String name,String version,List<Target> targets,List<Task> tasks){
		this.name = name;
		this.version = version;
		this.targets = targets;
		this.tasks = tasks;
	}
	
	public String getName(){
		return name;
	}
	
	public String getVersion(){
		return version;
	}
	
	public List<Target> getTargets(){
		return targets;
	}
	
	public List<Task> getTasks(){
		return tasks;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setVersion(String version){
		this.version = version;
	}
	
	public void setTargets(List<Target> targets){
		this.targets = targets;
	}
	
	public void setTask(List<Task> tasks){
		this.tasks = tasks;
	}
}
