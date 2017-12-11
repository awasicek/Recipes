import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Practice: Coding  Exercise #1 */
public class PracticeExamRobotBaseball {

    public static void main(String[] args) {
    	
    	Robot rob = new Robot();
    	rob.setX(800);
    	rob.setY(800);
    	rob.setSpeed(5);
	 // 1. Create a random number from 0 to 4 and store it in a ‘bases’ variable

    	int bases = new Random().nextInt(5);
    	
	 // 2. If the number is zero  display a window that says “the batter is out”

    	if (bases == 0) {
    		JOptionPane.showMessageDialog(null, "The batter is out!");
    	}
    	
   	 // 3. Otherwise display “the batter hit a ” and “single”, “double”, “triple” or “home run”

    	else if (bases == 1) {
    		JOptionPane.showMessageDialog(null, "The batter hit a single!");
    		rob.turn(45);
    		rob.move(200);
    	} 
    	else if (bases == 2) {
    		JOptionPane.showMessageDialog(null, "The batter hit a double!");
    		rob.turn(45);
    		rob.move(200);
    		rob.turn(-90);
    		rob.move(200);
    	}
     	else if (bases == 3) {
    		JOptionPane.showMessageDialog(null, "The batter hit a triple!");
    		rob.turn(45);
    		rob.move(200);    		
    		rob.turn(-90);
    		rob.move(200);    		
    		rob.turn(-90);
    		rob.move(200);
    	}
     	else if (bases == 4) {
    		JOptionPane.showMessageDialog(null, "The batter hit a home run!");
    		rob.turn(45);
    		rob.move(200);    		
    		rob.turn(-90);
    		rob.move(200);    		
    		rob.turn(-90);
    		rob.move(200);
    		rob.turn(-90);
    		rob.move(200);
    	}
    	
    	
   	 // 4. Make the robot draw the path of the base runner. For example, if 
	 //     the batter hit a double, draw a line from home plate to first and another line from
            //      first to second. Home plate should be at the bottom and first should be on the
            //      right. You do not need to draw the bases themselves or any other features.
   	 
    }

}

