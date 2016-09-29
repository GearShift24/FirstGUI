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
		while(answer != null && !isDouble(answer))
		{
			answer = display.collectResponse("You need to type in a number!!!!");
			
		}
	}
	
	/**
	 * checks if the supplied user String can be parsed to a double value	
	 * @param potentialValue The string to test
	 * @return whether the value could be parsed. True if it can be parsed, false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false; //make default value not parse able/true
				
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true; //if try doesn't break it goes here
		}
		catch(NumberFormatException notDouble) //if try breaks goes here
		{
			display.displayMessage("This is not a double value :(");
		}
		
		return isParseable;
	}
	
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage()); //this will show the error message java gives us.
			display.displayMessage("Type in an intert next time!");
		}
		return isParseable;
	}
}










