import javax.swing.JOptionPane;

//Students try to fool their classmates with their own "Spot the Error" puzzle.
//Students get some code working on their computer. Have them add 5 errors. Student writes the code with errors on the whiteboard and has classmates find the errors

// Sample coding exercise: write a program that asks the user for a number.  Then take that number and display it back to the user (syso), but make sure to display it 
// a number of times equal to the number itself (e.g., if they answer 3 then you should display 3 3 3; if they answer 5 you should display 5 5 5 5 5).

public class SpotTheError {
@SuppressWarnings("all")	public static void main(String[] args) {
		String answerString = JOptionPane.showInputDialog("What is your favorite number? (1 - 10)");
		int answerNum = Integer.parseInt(answerString);
		for (int i = 0; i < answerNum; i++) {
			System.out.println(answerNum);
		}
	}
}
