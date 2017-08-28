import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String inputString = JOptionPane.showInputDialog("Please give me a number and I will tell you if it is prime or not.");
    	int inputInt = Integer.parseInt(inputString);
		// 1, 0, and negative numbers are not prime.
		if (inputInt <= 1 ) {
			JOptionPane.showMessageDialog(null, inputInt + " is not prime.");
		}
	     // Test whether num is prime by testing whether it is evenly divisible by any other numbers besides itself and 1 
        // Loops through and tests the numbers 2 through the square root of num to see if any evenly divide num (and hence that num would not be prime) 
		// It is more than fine for the students to use just the input number itself as the loop condition instead of the square root of that number
        for (int x = 2; x <= Math.sqrt(inputInt); x++) { // start at 2 (because the definition of a prime number is that it is only evenly divisible by 1 and itself)
        	if (inputInt % x == 0) {
    			JOptionPane.showMessageDialog(null, inputInt + " is not prime.");
        	} 
        }
		JOptionPane.showMessageDialog(null, inputInt + " is prime!");
	}
}
