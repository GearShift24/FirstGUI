package popup.controller;

import popups.view.PopupViewer;

public class PopupController


{
	
	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	
	public void start()
	{
		int count = 0;
		while(count < 10)
		{
			display.displayMessage("Hi there :D");
			
			String answer = display.collectResponse("What is going on?");
			display.displayMessage(answer + " is what you said.");
			
			count++;
		}
	}
}
