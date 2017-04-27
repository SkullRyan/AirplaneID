package PlaneIdentification;

import javax.swing.JOptionPane;

public class TailInformation {
	public int[] start() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean yesno(String Message) {
		String[] choices = { "Yes", "No" };
		String input = (String) JOptionPane.showInputDialog(null, Message, "Tail Information",
				JOptionPane.QUESTION_MESSAGE, null, // U // icon
				choices, // Array of choices
				choices[1]); // Initial choice
		if (input.equals("Yes"))
			return true;
		else
			return false;

	}

	public int NumberOfVerticalStabalizers() {// Ryan
		;
		String[] choices = { "1", "2" };
		String input = (String) JOptionPane.showInputDialog(null, "How Many Vertical Tail Wings Does The Plane Have?",
				"Tail Information", JOptionPane.QUESTION_MESSAGE, null, // U
																		// //
																		// icon
				choices, // Array of choices
				choices[1]); // Initial choice
		return Integer.parseInt(input);

	}
	public int StabalizersLocation() {// Ryan
		String Message = ("\nAre The Vertical Tail Wings In Line With The Engines?");
		if (yesno(Message) == true)
			return 0;
		else 
			return 1;
	}

}
