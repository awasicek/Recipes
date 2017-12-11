// NOTE: link for the exam bit.ly/league-level0-exam

import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class Level0Exam1 {

	/* Level 0 Exam: Coding Exercise #1 */
	

	public static void main(String[] args) {
		Robot rob = new Robot();

		// 3. ask the user what color they would like the Robot to draw
		String input = JOptionPane.showInputDialog("What color would you like the robot to use for drawing?");

		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (input.equals("red")) {
			rob.setPenColor(Color.red);
		} else if (input.equals("blue")) {
			rob.setPenColor(Color.blue);
		} else {
			rob.setPenColor(Color.green);
		}
		

		// 2. set the pen width to 10
		rob.setPenWidth(10);
		rob.penDown();

		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}

}
