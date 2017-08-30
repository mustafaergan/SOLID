package wrong;

public class User {
	
	private int id;
	private String userName;
	private String password;
	
	//*******Burada Olmaması gerekli Foksiyonlar*****//
	public boolean userLogin(){
		return true;
	}
	
	public void forgotPasswordMail(){
	
	}
	
	public User getUserById(int id){
		return new User();
	}
	
	//**********************//
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUserName() {
		return userName;
	}
}
