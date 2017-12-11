import javax.swing.JOptionPane;

public class VotingBooth {
	// Ask the user how old they are. If they are over 18, ask them who the next president should be. 
	// If they are less, tell them “nobody cares what you think”.
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How old are you?");
		int inputNum = Integer.parseInt(input);
		if (inputNum >= 18) {
			JOptionPane.showMessageDialog(null, "Who should the next president be?");
		} else if (inputNum < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
}
