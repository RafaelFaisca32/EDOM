package generates;

import java.util.List;

public class Decision {

	private List<Property> properties;
	private List<Condition> conditions;

	public Decision(List<Property> properties, List<Condition> conditions) {
		this.properties = properties;
		this.conditions = conditions;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	@Override
	public String toString() {
		return "Decision{" +
				"properties=" + properties +
				", conditions=" + conditions +
				'}';
	}
}

