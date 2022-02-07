package BasicClasses;

import java.util.*;

public class User {
	
	enum AccountType{
		Customer,
		Employee,
		Admin
	}
	HashSet<Account> accounts = new HashSet<Account>();
	// password only used on creating accounts
	private String password = "";
	private String user = "";
	private int userID = 0;
	private String name = "";
	private AccountType accountType;
	
	// for new account
	public User(String user, String pass, AccountType type, String  name)
	{
		this.user = user;
		password = pass;
		accountType = type;
		this.name = name;
	}
	
	//DB pulled Account
	public User(String name, int ID, AccountType type)
	{
		this.name = name;
		userID = ID;
		accountType = type;
	}
	
	 
	

}
