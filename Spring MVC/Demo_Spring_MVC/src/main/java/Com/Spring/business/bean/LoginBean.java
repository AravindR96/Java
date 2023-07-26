package Com.Spring.business.bean;

public class LoginBean {
private String UserName;
private String Password;
@Override
public String toString() {
	return "LoginBean [UserName=" + UserName + ", Password=" + Password + "]";
}
public LoginBean(String userName, String password) {
	super();
	UserName = userName;
	Password = password;
}
public LoginBean() {
	super();

}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
}
