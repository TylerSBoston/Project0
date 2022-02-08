package Service;

import BasicClasses.*;
import Presentation.*;

// main in service as presentation is assumed to be the webpage/website in a normal application
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextPresenter presenter = new TextPresenter();
		User loggedInUser = new User();
		
		while(true)
		{
			
			if(loggedInUser.getState() == User.State.none)
			{
				loggedInUser = presenter.createOrLogin();
			}
		}
		
		
		
	}

}
