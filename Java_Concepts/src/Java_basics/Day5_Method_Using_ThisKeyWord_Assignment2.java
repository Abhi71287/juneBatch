package Java_basics;

public class Day5_Method_Using_ThisKeyWord_Assignment2 {
	
	public void m1() {
		this.m1(1, 2, 3);
		System.out.println("Default Method");
	}
	
	public void m1(int a) {
		this.m1();
		System.out.println("One Parameterized  Method");
	}
	
	public void m1(int a,int b) {
		this.m1(1,2,3,4);
		System.out.println("Two Parameterized  Method");
	}
	
	public void m1(int a,int b,int c) {
		System.out.println("Three Parameterized  Method");
	}
	
	public void m1(int a,int b,int c,int d) {
		this.m1(1);
		System.out.println("Four Parameterized  Method");
	}
	
	public static void main(String[] args) {
		Day5_Method_Using_ThisKeyWord_Assignment2 Obj = new Day5_Method_Using_ThisKeyWord_Assignment2();
		Obj.m1(1,2);

}
}
