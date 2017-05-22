import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
		String pi = "3.141592653589793238";
		
		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
		System.out.println(pi.charAt(0));
		System.out.println(pi.charAt(1));
		System.out.println(pi.charAt(2));

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
		for(int j = 0; j < 10; j++){
			String introMessage = "You have " + (10-j) + " tries left to guess pi. Get ready!";
			
			JOptionPane.showMessageDialog(null, introMessage);
			
			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
			for(int i = 0; i < pi.length(); i++){
				
				// 5. Ask the user for the NEXT digit of pi.
				String piMessage;
				if(i > 0) {
					piMessage = "Guess the next number in pi!";
				} else {
					piMessage = "Guess the first number in pi!";
				}
				String answer = JOptionPane.showInputDialog(piMessage);
				
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 
				if(answer.charAt(0) == pi.charAt(i)) {
					
					// 7. If they are correct, print out "correct".
					JOptionPane.showMessageDialog(null, "That is correct! Get ready for the next digit!");
				} else {
					
					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
					JOptionPane.showMessageDialog(null, "That is incorrect.  Please start over!");
					break;
				}
			}
		}
	}
}


