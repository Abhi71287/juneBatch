package Java_basics;

public class Day6_SuperKeyWordParentClass_Assignment1 {
	
	public Day6_SuperKeyWordParentClass_Assignment1() {
		
		System.out.println("Parent Default Constructor");
	}
	
	public Day6_SuperKeyWordParentClass_Assignment1(int a) {
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	
	public Day6_SuperKeyWordParentClass_Assignment1(int a, int b) {
		this(1);
		System.out.println("Parent Two Parameterized Constructor");
	}
	
	public Day6_SuperKeyWordParentClass_Assignment1(int a, int b ,int c) {
		this(2,3);
		System.out.println("Parent Three Parameterized Constructor");
	}


}
