package Java_basics;

public class Day6_SuperKeyWordChildClass_Assignment1 extends Day6_SuperKeyWordParentClass_Assignment1 {
	
	public Day6_SuperKeyWordChildClass_Assignment1() {
     	super(1,2);
		System.out.println("Child Default Constructor");
	}
	
	public Day6_SuperKeyWordChildClass_Assignment1(int a) {
		this(1,2,3);
		System.out.println("Child One Parameterized Constructor");
	}
	
	public Day6_SuperKeyWordChildClass_Assignment1(int a, int b) {
		this(1);
		System.out.println("Child Two Parameterized Constructor");
	}
	
	public Day6_SuperKeyWordChildClass_Assignment1(int a, int b ,int c) {
		this();
		System.out.println("Child Three Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		Day6_SuperKeyWordChildClass_Assignment1 Obj = new Day6_SuperKeyWordChildClass_Assignment1(2,3);
	}

}
