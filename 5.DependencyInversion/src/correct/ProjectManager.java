package correct;

public class ProjectManager {
	
	IDeveloper developer;
	
	public void manage() {
		developer.writeCode();
	}
	
	public void setDeveloper(IDeveloper developer) {
		this.developer = developer;
	}

}
