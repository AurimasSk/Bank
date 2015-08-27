package lt.aurimas.model;

import javax.validation.constraints.Size;


public class StudentLogin {

	@Size(min=4, max=20)
	private String userName;
		
	@Size(min=4, max=8)
	private String password;

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	
}
