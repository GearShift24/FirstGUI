package popups.view;

import javax.swing.JOptionPane;


/**
 * A Popup Viewer class.
 * @author Joe Wrigley
 *@version 0.0 September 27, 2016.
 */
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
		
		/**
		 * Creates a popup window to ask a yes/no/cancel type question.
		 * @param question The question being asked to the user
		 * @return The constant value from JOptionPane for y/n/c
		 */
		
		public int collectUserOption(String question)
		{
			int response = 0;
			
			response = JOptionPane.showConfirmDialog(null, question);
			//showConfirm gives us a yes, no, or cancel aka nothing.
			
			return response;
		}
		
}
