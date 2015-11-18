package service;

public class LoginService {
	final private String INITIAL_PASSWORD = "password";
	
	public Boolean isAccountValid(final String username, final String password)
	{
		return password.equals(INITIAL_PASSWORD);
	}
	

}
