
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.

		String bobPower = "mutant strength!";
		String susanPower = "teleporting!";
		String joePower = "laser eyes!";
		String maryPower = "invisibility and flying!!!";

		for (;;) {
			// 2. Ask the user to enter a name. Store their answer in a
			// variable.
			String userInput = JOptionPane.showInputDialog(
					"Please enter the name of the superhero to find out his/her superpower(s)! \n\nThe superheroes are Bob, Susan, Joe, and Mary.\n\n [Type Exit to terminate this program]");
			// 3. Show the superpower in a pop-up, depending on the name
			// entered.
			if (userInput.equals("Bob")) {
				JOptionPane.showMessageDialog(null, "Bob's power is " + bobPower);
			} else if (userInput.equals("Susan")) {
				JOptionPane.showMessageDialog(null, "Susan's power is " + susanPower);
			} else if (userInput.equals("Joe")) {
				JOptionPane.showMessageDialog(null, "Joe's power is " + joePower);
			} else if (userInput.equals("Mary")) {
				JOptionPane.showMessageDialog(null, "Mary's power is " + maryPower);
			} else if (userInput.equals("Exit")) {
				JOptionPane.showMessageDialog(null, "Thanks for using the superhero/superpower program!");
				break;
			} else {
				JOptionPane.showMessageDialog(null,
						"I don't know that superhero.  I only know Bob, Susan, Joe, and Mary.");
			}
		}

	}
}
