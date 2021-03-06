package Presentation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import BasicClasses.*;


public class TextPresenter {
	private static Scanner scanner = new Scanner(System.in);
	private User loggedInUser;
	private Command output = new Command();
	
	public Command createOrLogin(User user)
	{
		int returnValue = 0;
		if(!user.getErrorText().equals(""))
		{
			System.out.println("invalid User and/or Password");
		}
		while(true)
		{
			System.out.println("Enter 1 to log in, Enter 2 to create account");
			returnValue = InputVerifier.verifyInt(scanner);
			if(returnValue == 1)
			{
				output.setUser(login());
				output.setOutput(Command.command.login);
				return output;
			}
			else if(returnValue == 2)
			{
				output.setUser(create());
				output.setOutput(Command.command.createUserAccount);
				return output;
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
	private User create()
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
	public Command customerInterface()
	{
		int input = -1;
		
		//exits by return
		while(true)
		{
			System.out.println("Select Option: \n"
							+ "1.) Create Account \n"
							+ "2.) View Account(s) \n"
							+ "3.) Deposit \n"
							+ "4.) Withdraw \n"
							+ "5.) Transfer \n"
							+ "0.) Log out");
			input = InputVerifier.verifyInt(scanner);
	        switch (input) {
            case 1: 
            	output.setOutput(Command.command.createBankAccount);
            	output.setReturnObject(createBankAccount());
            	if(output.getReturnObject() != null)
            	{
            		return output;
            	}
                     break;
            case 2: 
            	output.setOutput(Command.command.getBankAccounts);
            	return output;
            case 3:  
            	output.setOutput(Command.command.deposit);
            	output.setReturnObject(deposit());
            	return output;
            case 4:  
            	output.setOutput(Command.command.withdraw);
            	output.setReturnObject(withdraw());
            	return output;
            case 5:  
            	output.setOutput(Command.command.transfer);
            	output.setReturnObject(transfer());
            	return output;
            case 0: 
            	
                     break;
            default:
            	System.out.println("Enter a valid Input");
            	break;
        }
			
			
		}
	}
	
	private Account createBankAccount()
	{
		int input;
		String name = "";
		boolean pass = false;
		Account.Type accountType = Account.Type.checkings;
		BigDecimal depositAmount = new BigDecimal(0);
		Account newAccount;
		depositAmount.setScale(2,RoundingMode.CEILING);
		while(pass == false)
		{
			System.out.println("You are creating a new account");
			System.out.println("Select Account Type: \n"
							 + "1.) checkings\n"
							 + "2.) savings\n"
							 + "3.) student\n"
							 + "4.) investment\n"
							 + "0.) cancle");
			input = InputVerifier.verifyInt(scanner);
	        switch (input) {
	        case 1: 
	        	accountType = Account.Type.checkings;
	        	pass = true;
	            break;
	        case 2: 
	        	accountType = Account.Type.savings;
	        	pass = true;
	            break;
	        case 3:  
	        	accountType = Account.Type.student;
	        	pass = true;
	            break;
	        case 4:  
	        	accountType = Account.Type.investment;
	        	pass = true;
	        	break;
	        case 0: 
	        	
	        	return null;
	        default:
	        	System.out.println("Enter a valid Input");
	        	break;
	        }
		}
			
		// just assumes no on an incorrect Input
		System.out.println("Are you making an initial Deposit: Y/N");
		String makeDeposit = scanner.nextLine();
		if(makeDeposit.toUpperCase().trim().equals("Y"))
		{
			System.out.println("Enter deposit amount");
			depositAmount = BigDecimal.valueOf(scanner.nextDouble());
			scanner.nextLine();
		}
		
		System.out.println("Make an Account Name: Y/N");
		String makeName = scanner.nextLine();
		
		if(makeName.toUpperCase().trim().equals("Y"))
		{
			System.out.println("Enter Name");
			name = scanner.nextLine();
		}
		if(name != "") 
		{
			newAccount = new Account(loggedInUser.getUserID(),accountType,depositAmount, name);
		}
		else
		{
			newAccount = new Account(loggedInUser.getUserID(),accountType,depositAmount);
		}
		return newAccount;
		
		
		
	}
	
	private BigDecimal deposit()
	{
		System.out.println("Deposit Amount: ");
		double input = scanner.nextDouble();
		BigDecimal deposit = new BigDecimal(input);
		deposit.setScale(2,RoundingMode.CEILING);
		return deposit;
	}
	
	private BigDecimal withdraw()
	{
		System.out.println("Withdraw Amount: ");
		double input = scanner.nextDouble();
		BigDecimal withdraw = new BigDecimal(input);
		withdraw.setScale(2,RoundingMode.CEILING);
		return withdraw;
	}
	
	//********************************incomplete Method **************************************************************
	private Transfer transfer()
	{
		System.out.println("transfer Amount: ");
		double input = scanner.nextDouble();
		BigDecimal withdraw = new BigDecimal(input);
		withdraw.setScale(2,RoundingMode.CEILING);
		return null;
	}
	
	public User getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
		output.setUser(loggedInUser);
	}
	

}
