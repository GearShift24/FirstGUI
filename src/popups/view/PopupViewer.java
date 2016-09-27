package popups.view;

import javax.swing.JOptionPane;

public class PopupViewer
{
	
	/**
	 * Makes a pup window to display the supplied message
	 * @param message should be displayed in popup
	 */
		public void displayMessage(String message)
		{
			JOptionPane.showMessageDialog(null, message);
		}
	
		/**
		 * Creates an input popup to collect a response from the user as a string. 
		 * @param question he question being asked to the user
		 * @return the users response.
		 */
		public String collectResponse(String question)
		{
			String response = "";
			
			response = JOptionPane.showInputDialog(null, question);
			
			return response;
		}
}
