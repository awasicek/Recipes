public class Platypus {
	private String name;

	// THIS IS THE CONSTRUCTOR -- remember the constructor needs the same name as the class
	public Platypus(String platypusName) {
		name = platypusName;
	}
	
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus fred = new Platypus("Fred the Platypus");
		Platypus greg = new Platypus("Greg the Brave");
		
		//2. Call the sayHi method
		
		fred.sayHi();
		greg.sayHi();
		
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}
