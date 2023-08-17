 package day9_double_loop_with_Condition;

public class Static_Keyword {
	static int a=122;
	int b = 23;

	
	public static void abc() {
		a=a+1;// Static method can use only static variable.
//		b =b+1; cant use the non static varibale in static method.
		System.out.println("I am static Method");
	}

	public  void xyz() {
		a=a+1;// Static var can be used in non static method.
		b =b+1; 
		System.out.println("I am non static Method");
	}

	public static void main(String[] args) {
		Static_Keyword.abc();//can call without creating object
		System.out.println(Static_Keyword.a);
	
		
		
	}

}
