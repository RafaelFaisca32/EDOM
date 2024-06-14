package prototype1.domain;

import java.util.List;

public class Decision{
		
	private List<Property> property;
	private List<Condition> condition;
		
	public Decision(List<Property> property,List<Condition> condition){
		this.property = property;
		this.condition = condition;
	}
		
	public List<Property> getProperty(){
		return property;
	}
		
	public List<Condition> getCondition(){
		return condition;
	}
	
	public void setProperty(List<Property> property){
		this.property = property;
	}
		
	public void setCondition(List<Condition> condition){
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		return "Decision{" +
				"properties=" + property +
				", conditions=" + condition +
				'}';
	}
}