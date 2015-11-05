
public class User {
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private AuthLevel auth;
	private String pword;
	private String pwConfirm;
	
	public User(){
		this.userName = "Guest";
		this.firstName = "Null";
		this.lastName = "Null";
		this.email = "not given";
		this.auth = AuthLevel.Guest;
		this.pword = "password";
	}
	public User(String userName, String firstName, String lastName, String pword, String email){
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pword = pword;
		this.auth = AuthLevel.Guest;
		this.email = email;
	}
	public User(String userName, String firstName, String lastName, String pword, String email, AuthLevel authlevel){
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pword = pword;
		this.auth = authlevel;
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public AuthLevel getAuth() {
		return auth;
	}
	public String getPword() {
		return pword;
	}
	public String getPwConfirm() {
		return pwConfirm;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAuth(String auth) {
		AuthLevel authauth = AuthLevel.Guest;
		switch (auth){
		case "Administrator": authauth = AuthLevel.Administrator;
		break;
		case "Staff": authauth = AuthLevel.Staff;
		break;
		case "Faculty": authauth = AuthLevel.Faculty;
		break;
		case "Student": authauth = AuthLevel.Student;
		break;
		case "Guest": authauth = AuthLevel.Guest;
		break;
		default: authauth = AuthLevel.Guest;
		break;
		}
		this.auth = authauth;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public void setPwConfirm(String pwConfirm) {
		this.pwConfirm = pwConfirm;
	}
	
	public String toString(){
		return this.firstName+" "+this.lastName+"'s username is "+this.userName+" and their email is "+this.email+". Their Authentication Level is "+this.auth+".";
	}
}
