package wrong;

public class ProjectManager {
	
	Developer developer;
	SeniorDeveloper seniorDeveloper;
	
	/**
	 * ayni turden nesnelere bagimli durumda ve somut sınıfların degisimlerinden etkilenmektedir.
	 */
	public void manage() {
		developer.writeCode();
		seniorDeveloper.writeCode();
	}
	
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public void setSeniorDeveloper(SeniorDeveloper seniorDeveloper) {
		this.seniorDeveloper = seniorDeveloper;
	}

}
