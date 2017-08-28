
public class Fibonacci {
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	public static void main(String[] args) {
		int currentNumber = 0;
		int numberBefore = 1;
		
		for (int i = 0; i < 13; i++)
		{
			System.out.println(currentNumber + " ");
			currentNumber = currentNumber + numberBefore;
			numberBefore = currentNumber - numberBefore;
		}
	}
}
