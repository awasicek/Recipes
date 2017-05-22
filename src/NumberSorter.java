import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		// ask the user for three numbers (hint: easiest to ask them three separate times)
		String inputOne = JOptionPane.showInputDialog("Please enter your first number.");
		String inputTwo = JOptionPane.showInputDialog("Please enter your second number.");
		String inputThree = JOptionPane.showInputDialog("Please enter your third number.");
		// make sure that we are working with integer variables (hint: JOptionPane.showInputDialog() returns a String not an int)
		int numOne = Integer.parseInt(inputOne);
		int numTwo = Integer.parseInt(inputTwo);
		int numThree = Integer.parseInt(inputThree);
		
		// create the logic / test conditions for when each number is printed to the console so they are printed in ascending order
		
		// if numOne is the smallest
		if(numOne < numTwo && numOne < numThree) {
			System.out.println(numOne); // print out numOne first because it is the smallest based on the previous if statement
			// now we determine the order to print numTwo and numThree
			if(numTwo < numThree) {
				System.out.println(numTwo);
				System.out.println(numThree);
			} else {
				System.out.println(numThree);
				System.out.println(numTwo);
			}
		} 
		// if numTwo is the smallest (we already know numOne is bigger otherwise we would never have gotten to this else if statement)
		else if (numTwo < numThree) {
			System.out.println(numTwo); // print out numTwo first because it is the smallest based on the previous two primary if statements
			// now we determine the order to print numOne and numThree
			if(numOne < numThree) {
				System.out.println(numOne);
				System.out.println(numThree);
			} else {
				System.out.println(numThree);
				System.out.println(numOne);
			}
		}
		// if numThree is the smallest (we already know its smaller than numOne and numTwo otherwise we would never have gotten to this else statement)
		else {
			System.out.println(numThree); // print out numThree first because it is the smallest based on the previous primary if statements
			// now we determine the order to print numOne and numTwo
			if(numOne < numTwo) {
				System.out.println(numOne);
				System.out.println(numTwo);
			} else {
				System.out.println(numTwo);
				System.out.println(numOne);
			}
		}
	}
}
