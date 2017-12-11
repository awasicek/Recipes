import javax.swing.JOptionPane;

public class Rollercoaster {

	// Use Input/Output dialogs (JOptionPane) Ask the user what height they are. 
	// If they are over 4ft, tell them they can go on the rollercoaster. 
	// If they are under 4ft, tell them they need to grow more first.
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How tall are you (feet)?");
		int inputNum = Integer.parseInt(input);
		if (inputNum >= 4) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
		} else if (inputNum < 4) {
			JOptionPane.showMessageDialog(null, "You need to grow more first.");
		}
	}
	
}
