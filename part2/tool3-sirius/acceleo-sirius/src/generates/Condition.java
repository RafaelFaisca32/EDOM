package generates;

public class Condition{
	
	private String value;
	
	public Condition(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	@Override
	public String toString() {
		return "Condition{" +
				"value='" + value + '\'' +
				'}';
	}
}
