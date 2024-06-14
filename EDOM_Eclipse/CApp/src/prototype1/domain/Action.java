package prototype1.domain;

import java.util.List;

public class Action {
		
		private String name;
		private List<Decision> decision;
		
		public Action(String name,List<Decision> decision){
			this.name = name;
			this.decision = decision;
		}
				
		public String getName(){
			return name;
		}
				
		public void setName(String name){
			this.name = name;
		}
		
		public List<Decision> getDecision(){
			return decision;
		}
		
		public void setDecision(List<Decision> decision){
			this.decision = decision;
		}
}