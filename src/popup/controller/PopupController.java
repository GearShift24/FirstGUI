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
	
	/**
	 * checks if the supplied user String can be parsed to a double value	
	 * @param potentialValue The string to test
	 * @return whether the value could be parsed. True if it can be parsed, false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false; //make default value not parseable/true
				
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true; //if try doesnt break it goes here
		}
		catch(NumberFormatException notDouble) //if try breaks goes here
		{
			display.displayMessage("This is not a double value :(");
		}
		
		return isParseable;
	}
}
