package Service;

import BasicClasses.*;
import Dao.*;

public class AccountHandler implements MultiLayorInteractable<Account>{

	
	
	// adds to be enabled
	@Override
	public Account add(Account item) {
		// TODO Auto-generated method stub
		
		DBAccountHandler.add(item);
		return null;
	}
	
	// enables account
	public void Enable(Account item) {
		
		
	}

	@Override
	public void update(Account item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivate(int ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account get(int ID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Account getAccounts(int UserID)
	{
		return null;
	}

	@Override
	public String errorText() {
		// TODO Auto-generated method stub
		return null;
	}

}
