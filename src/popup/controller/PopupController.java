package popup.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class PopupController
{
	private PopupViewer display;
	private List<Thingy> thingyList;
	public PopupController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
	}
	
	
	public void start()
	{
		learnLists();
		
	}
	
	
	private void testLoop()
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

	private void learnLists()
	{
		display.displayMessage(thingyList.size() + " is the size of the list.");
		Thingy testThingy = new Thingy();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size() + " is the size of the list.");
		
		for (int index = 0; index <5; index ++)
		{
			Thingy addThingy = new Thingy();
			thingyList.add(addThingy);
			display.displayMessage(addThingy.getwords());
	
		}
	
		display.displayMessage(thingyList.size() + " is the size.");
	
		
		thingyList.get(3).setwords("look I changed a value");
		
		Thingy temp = thingyList.get(4);
		temp.setwords("stuff");	
		
		for ( int index =0; index <thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getwords());
		}
		
		thingyList.add(3, new Thingy());
		
		display.displayMessage("The size is: " + thingyList.size());
		
		thingyList.remove(0); // i no longer have access to this object because there is no = sign
		
		display.displayMessage("The size is " + thingyList.size());
		
		Thingy deletedThingy = thingyList.remove(0);
		display.displayMessage(deletedThingy.getwords() + "and the list size is " + thingyList.size());
		
		thingyList.set(0, deletedThingy);
		
		for(int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getwords());
		}
	}
}










