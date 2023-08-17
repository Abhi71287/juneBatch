package day6_Inheritance;

public class Selenium extends Automation {
	
//	Single inheritance
// Reusability : Means we can use the method and variable of parent class in to the child class
//	             with the help of child class reference Variable
	public void method2() {
		System.out.println("Child(Selenium) Class method");
	}
	
	public static void main(String[] args) {
		Selenium obj = new Selenium();
		obj.method1();// parent method
		obj.method2();// child method
		System.out.println(obj.abc=13); // Parent Method 
	}

}
