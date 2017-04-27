
package PlaneIdentification;

import javax.swing.JOptionPane;

public class EngineInformation {
	public int[] start() {
		int[] Engine = new int[3];
		Engine[0] = JetOrPropeller();
		Engine[1] = NumberOfEngines();
		if (Engine[1] == 1)
			Engine[2] = OneEngineLocation();
		else if (Engine[1] == 2)
			Engine[2] = TwoEngineLocation();
		else if (Engine[1] == 3)
			Engine[2] = ThreeEngineLocation();
		else
			Engine[2] = FourEngineLocation();
		return Engine;
	}

	public boolean yesno(String Message) {
		String[] choices = { "Yes", "No" };
		String input = (String) JOptionPane.showInputDialog(null, Message, "Engine Information",
				JOptionPane.QUESTION_MESSAGE, null, // U // icon
				choices, // Array of choices
				choices[0]); // Initial choice
		if (input.equals("Yes"))
			return true;
		else
			return false;

	}

	public int JetOrPropeller() {// Dylan
		String Message = ("\nDoes The Plane Have A Jet Engine?");
		if (yesno(Message) == true)
			return 0;
		else
			return 1;

	}

	public int NumberOfEngines() {// Ryan
		;
		String[] choices = { "1", "2", "3", "4" };
		String input = (String) JOptionPane.showInputDialog(null, "How Many Engines Does The Plane Have?",
				"Engine Information", JOptionPane.QUESTION_MESSAGE, null, // U
																			// //
																			// icon
				choices, // Array of choices
				choices[0]); // Initial choice
		return Integer.parseInt(input);

	}

	public int FourEngineLocation() {// Dylan

		//All On Wings?
		String Message = ("\nAre All Of The Engines On The Wings?");
		if(yesno(Message) == true)
			return 0;
		else 
			return 1;
	}

	public int TwoEngineLocation() {// JT
		String Message = ("\n Are The Two Engines On The Wings?");
		if (yesno(Message) == true)
			return 0;
		else {
			String Message1 = ("\n Are The Two Engines Inside Of The Body?");
			if (yesno(Message1) == true)
				return 1;
			else{
			String Message2 = ("\n Are The Two Engines On The Body?");
			if (yesno(Message2) == true)
				return 2;
			else
				return 3;
			}
		}
	}

	public int ThreeEngineLocation() {// JT
		String Message = ("\n Are The Three Engines On The Nose And The Wings?");
		if (yesno(Message) == true)
			return 0;
		else {
			String Message1 = ("\n Are The Three Engines On The Tail?");
			if (yesno(Message1) == true)
				return 1;
			else
				return 2;
		}
	}

	public int OneEngineLocation() {// Ryan
		String Message = ("\nIs The Engine On The Nose?");
		if (yesno(Message) == true)
			return 0;
		else {
			Message = ("\nIs The Engine Inside Of The Body?");
			if (yesno(Message) == true)
				return 1;
			else
				return 2;
		}
		// Tail

	}
}
