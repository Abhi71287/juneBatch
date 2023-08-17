package day6_Inheritance;

public class ApiAutomation extends Automation {
	
	public void m1() {
		System.out.println("Child 2 Method");
	}
	
	public static void main(String[] args) {
		ApiAutomation obj = new ApiAutomation();
		obj.m1();// Child 2 method
		obj.method1();// Grand parent method
		int c=obj.abc=123;//Grand parent variables
		System.out.println(c);
		
	}

}
