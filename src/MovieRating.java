import javax.swing.JOptionPane;

public class MovieRating {

//	1. Write a program in eclipse that asks the user how old they are. If they enter 18 or higher, tell them they can watch all the movies. 
//	If they put 0 to 17, tell them they must have a parent. Give them an error if they put a negative number.
//
//	EXAMPLE:
//	how old are you?
//	200
//	You can watch all the movies!

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Movie time! How old are you?");
		int inputNum = Integer.parseInt(input);
		if (inputNum >= 18) {
			JOptionPane.showMessageDialog(null, "You can watch all the movies!");
		} else if (inputNum < 18 && inputNum >= 0) {
			JOptionPane.showMessageDialog(null, "You can watch the movies but you must have a parent with you!");
		} else if (inputNum < 0) {
			JOptionPane.showMessageDialog(null, "Error: Hey you can't be a negative age!");
		}
	}
	
}
