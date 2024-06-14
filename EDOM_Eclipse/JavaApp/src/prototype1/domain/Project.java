package prototype1.domain;

import java.util.List;

public class Project{
		
	private String name;
	private String version;
	private List<Target> target;
	private List<Task> task;
		
	public Project(String name,String version,List<Target> target,List<Task> task){
		this.name = name;
		this.version = version;
		this.target = target;
		this.task = task;
	}
		
	public String getName(){
		return name;
	}
		
	public String getVersion(){
		return version;
	}
		
	public List<Target> getTarget(){
		return target;
	}
		
	public List<Task> getTask(){
		return task;
	}
		
	public void setName(String name){
		this.name = name;
	}
		
	public void setVersion(String version){
		this.version = version;
	}
		
	public void setTarget(List<Target> target){
		this.target = target;
	}
		
	public void setTask(List<Task> task){
		this.task = task;
	}
}