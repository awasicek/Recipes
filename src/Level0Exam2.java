// NOTE: link for the exam bit.ly/league-level0-exam

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class Level0Exam2 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How old are you?");
		int inputNum = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, ("You were born in " + (2017 - inputNum)) + ".");
		if (inputNum > 30) {
			JOptionPane.showMessageDialog(null, "You are too old to play this game!");
		}
	}
}
