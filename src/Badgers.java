/**	
 No recipe	
 Print the lyrics to this song: bit.ly/badgers-badgers 
 Lyrics at: https://en.wikipedia.org/wiki/Badgers_(animation)#Lyrics
 You can only use the words “badger”, “mushroom” and “snake” once each in your code.		
 
 Notes: Highlight for students that there are several repeating patterns. 4x lines comprised of 3x badgers then another line.  Each badger section made up of 3 badger lines.
 What do we want to use when we see repeating patterns (i.e., we want to do something a bunch of times)? For loops!
*/														

 
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Mushroom! Mushroom!
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Mushroom! Mushroom!
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Mushroom! Mushroom!
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//Badger, badger, badger, badger
//A snake! A snake! Snake! A snake!
//Oh, it's a snake!


public class Badgers {
	public static void main(String[] args) {
		String b = "badger";
		String m = "mushroom";
		String s = "snake";
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 3; j ++) {
				System.out.println(b + ", " + b + ", " + b + ", " + b);
			}
			if (i < 3) {
				System.out.println(m + "! " + m + "!");
			} else {
				System.out.println("A " + s + "! " + "A " + s + "! " + s + "! " + "A " + s + "! ");
				System.out.println("Oh, it's a " + s + "!");
			}
		}
	}
}
