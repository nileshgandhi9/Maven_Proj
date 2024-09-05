package MyPackage1;

import org.junit.*;

public class MyJenkins {
	
	@Before
	public void login() 
	{
		System.out.println("This is login page");
		
	}
	
	@After
	public void logout() 
	{
		System.out.println("This is log out page");
		
	}
	
	@Test
	public void UserVerify() 
	{
		System.out.println("This is user verification  page");
		
	}
}
