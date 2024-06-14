package prototype1.domain;

import java.util.List;

public class Action{
	
	private String name;
	private List<Decision> decisions;
	
	public Action(String name,List<Decision> decisions){
		this.name = name;
		this.decisions = decisions;
	}
			
	public String getName(){
		return name;
	}
			
	public void setName(String name){
		this.name = name;
	}
	
	public List<Decision> getDecisions(){
		return decisions;
	}
	
	public void setDecisions(List<Decision> decisions){
		this.decisions = decisions;
	}
}
