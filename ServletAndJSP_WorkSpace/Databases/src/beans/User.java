package beans;

public class User {
private String email = "";
private String password = "";
private String message = "";

public User()
{
	
}

public User(String email, String password) {

	this.email = email;
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMessage() {
	return message;
}

public boolean validate()
{
	if(!email.matches("\\w+@\\w+\\.\\w+"))
	{
		message="Invalid Email Address";
		return false;
	}
	else if(password.length()<8)
	{
		message="Password should contain atleast 8 characters.";
				return false;
	}
	else if(password.matches("\\w*\\s+\\w*"))
	{
		message="Password Should not contain spaces in between";
		return false;
	}
	else
	{
		message="Bean Validated";
		return true;
	}
}
	
	
}
