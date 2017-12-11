import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer1 = JOptionPane.showInputDialog("Are you happy?");
		if (answer1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
		} else if (answer1.equalsIgnoreCase("no")) {
			String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else if (answer2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
			}
		} 
	}
}
