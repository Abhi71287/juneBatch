package Java_basics;

public class Day6_Super_Method_ParentClass_Assignment2 {
	
	public void m1() {
		System.out.println("Parent Class Default Method");
	}
	
	public void m1(int a) {
		System.out.println("Parent Class One parameterized  Method");
	}
	
	public void m1(int a ,int b) {
		System.out.println("Parent Class Two parameterized  Method");
	}
	
	public void m1(int a,int b,int c) {
		System.out.println("Parent Class Three parameterized Method");
		this.m1();
		this.m1(1);
		this.m1(1, 2);
	}

}
