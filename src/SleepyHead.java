
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Sleepy Head
 *    Duration=.75
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=nested if/else, testing all the options	
 *    
 *    
 ******************************************************************************/

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */

		int x = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		// yes returns 0, no returns 1
		// System.out.println(x);
		if (x == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}

		int y = JOptionPane.showConfirmDialog(null, "is it a vacation day?", "", JOptionPane.YES_NO_OPTION);

		if (y == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
		if (isVacation || !isWeekday) {
			System.out.println("sleep in!!");
		} else if (isWeekday) {
			System.out.println("get up lazybones!");
		}
	}
}
