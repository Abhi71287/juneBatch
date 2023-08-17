package day6_Inheritance;

public class Appium extends Selenium {
	
	
//	Multi Level inheritance
	public void method3() {
		System.out.println("Child (Appium ) Class Method");
	}
	
	public static void main(String[] args) {
		Appium obj = new Appium();
		obj.method1();//Grand parent method
		obj.method2();// Parent Method
		obj.method3();// Child method
		int c= obj.abc=122;//Grand parent method
		System.out.println(c);
	}

}
