package Presentation;
import java.util.*;

import BasicClasses.*;


public class TextPresenter {
	private static Scanner scanner = new Scanner(System.in);
	private User loggedInUser;
	
	public User createOrLogin()
	{
		int returnValue = 0;
		while(true)
		{
			System.out.println("Enter 1 to log in, Enter 2 to create account");
			returnValue = InputVerifier.verifyInt(scanner);
			if(returnValue == 1)
			{
				return login();
			}
			else if(returnValue == 2)
			{
				return Create();
			}
			else
			{
				System.out.println("enter a valid option");
			}
		}
	}
	private User login()
	{
		
		System.out.print("Enter user name: ");
		String user = scanner.nextLine().trim();
		System.out.print("Enter password: ");
		String password = scanner.nextLine().trim();
		
		return new User(user,password); 
		
	}
	private User Create()
	{
		System.out.println("Enter a user Name: ");
		String userName = scanner.nextLine().trim();
		String pass1 = "";
		String pass2 = "";
		do {
			if(pass1 != pass2)
			{
				System.out.println("Different passwords entered");
			}
			System.out.println("Enter a password");
			pass1 = scanner.nextLine();
			System.out.println("Reenter your password");
			pass2 = scanner.nextLine();
		}while(!pass1.equals(pass2));
		// this would normally have extra user info but just name for now
		System.out.println("Enter your Name");
		String name = scanner.nextLine();
		return new User(userName,pass1,name);
	}
	
	public User getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	

}
