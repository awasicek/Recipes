public class StringMethods2 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		
		String myString = "mY naME Is aNDreW";

		// 2. Print your String to the console in upper case.
		
		System.out.println(myString.toUpperCase());
		
		// 3. Print your String to the console in lower case.

		System.out.println(myString.toLowerCase());
		
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		
		System.out.println(myString.substring(0, 3));
		
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		
		System.out.println(myString.charAt(4));
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		
		System.out.println(myString.substring((myString.length()-3), myString.length()));
	}
}
