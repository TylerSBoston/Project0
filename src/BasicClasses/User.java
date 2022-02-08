package BasicClasses;

import java.util.*;

public class User {
	
	enum AccountType{
		Customer,
		Employee,
		Admin
	}
	// to keep track of state of user
	public enum State{
		login,
		create,
		normal,
		none
	}
	HashSet<Account> accounts = new HashSet<Account>();
	// password only used on creating accounts
	private String password = "";
	private String user = "";

	private int userID = 0;
	private String name = "";
	private AccountType accountType;
	private State state;
	
	// for no user logged in
	public User()
	{
		state = State.none;
	}
	
	// for new account if its an employee
	public User(String user, String pass,  String  name, AccountType type)
	{
		this.user = user;
		password = pass;
		accountType = type;
		this.name = name;
		state = State.create;
	}
	// for new account
	public User(String user, String pass,  String  name)
	{
		this.user = user;
		password = pass;
		accountType = AccountType.Customer;
		this.name = name;
		state = State.create;
	}
	
	// for login
	public User(String user, String pass)
	{
		this.user = user;
		this.password = pass;
		state = State.login;
	}
	
	//DB pulled Account
	public User(String name, int ID, AccountType type)
	{
		this.name = name;
		userID = ID;
		accountType = type;
		state = State.normal;
	}
	//for creating new accounts, this will be removed and done on the DB later
	public User(String user, String pass, String name, int ID, AccountType type)
	{
		this.user = user;
		password = pass;
		accountType = type;
		this.name = name;
		userID = ID;
	}

	public String getPassword() {
		return password;
	}
	// kept for recovery
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public State getState() {
		return state;
	}
	 
	

}
