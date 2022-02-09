package Dao;

import BasicClasses.Account;

public class DBAccountHandler {
	private static String ConnectionString = "Temp Value";
	
	public static void add(Account newAccount)
	{
		
		// waiting for DB stuff
	}

	
	public static void update(Account updateAccount) {
		// TODO Auto-generated method stub
		
	}

	
	public static void deactivate(int ID) {
		// TODO Auto-generated method stub
		
	}

	
	public static Account getUser(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String errorText() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// get user for logging in
	public static Account[] GetAccounts(int userID)
	{
		// DB call info
		return null;
	}
	
}
