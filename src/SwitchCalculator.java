
public class SwitchCalculator {
	public static void main(String[] args) {
		arithmetic(5, 4, "add");
	}

	public static void arithmetic(int a, int b, String operator) {
		    // your code here
		    int answer = 0;
		  switch(operator) {
		  case "add": 
		    answer = a+b;
			System.out.println(answer);
		    break;
		  case "subtract": 
		    answer = a-b;
			System.out.println(answer);
		    break;
		  case "multiply":  
		    answer = a*b;
			System.out.println(answer);
		    break;
		  case "divide":  
		    answer = a/b;
			System.out.println(answer);
		    break;
		  }
		  }

}
