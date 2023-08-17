package Java_basics;

public class Day6_Super_Method_ChildClass_Assignment2 extends Day6_Super_Method_ParentClass_Assignment2 {
	
	public void m2() {
		System.out.println("Child Class Default Method");
	}
	
	public void m2(int a) {
		System.out.println("Child Class One parameterized  Method");
	}
	
	public void m2(int a ,int b) {
		System.out.println("Child Class Two parameterized  Method");
	}
	
	public void m2(int a,int b,int c) {
		super.m1(1, 2, 3);
		this.m2(1,2);
		this.m2();
		System.out.println("Child Class Three parameterized Method");
		this.m2(1);
	}

	public static void main(String[] args) {
		Day6_Super_Method_ChildClass_Assignment2 obj = new Day6_Super_Method_ChildClass_Assignment2();
		obj.m2(1, 2, 3);

	}

}
