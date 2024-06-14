package generates;

public class Model {

private String name;

private Project Project;

public Model(String name, Project Project){
this.name = name;
this.Project = Project;
}

public String getName() {
       return this.name;
     }

public Project getProject() {
       return this.Project;
     }

}
