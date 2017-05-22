import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String inputName = "";

		// 1. Ask the user to enter their name

		inputName = JOptionPane.showInputDialog("Please enter your name.");
		
		String goofyName = inputName;

		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		
		System.out.println(inputName.toUpperCase());

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
		
		for(int i = 0; i < inputName.length(); i++) {
			
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			String next = inputName.substring(i, (i+1));
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
			if (i % 2 == 0) {
				next = next.toUpperCase();
			} else {
				next = next.toLowerCase();
			}
			
			// 6. ADD this String  (containing 1 char) to the goofyName String
			goofyName += next;
		}
		
		// 7. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, goofyName);

	}
}
