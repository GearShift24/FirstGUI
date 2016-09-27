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
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
			display.displayMessage("Hi there :D");
			
			answer = display.collectResponse("What is going on?");
			display.displayMessage(answer + " is what you said.");
			
		}
	}
}
