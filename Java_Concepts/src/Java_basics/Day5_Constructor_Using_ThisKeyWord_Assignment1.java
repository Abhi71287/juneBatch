package Java_basics;

public class Day5_Constructor_Using_ThisKeyWord_Assignment1 {

	public Day5_Constructor_Using_ThisKeyWord_Assignment1() {
		this(20, 40, 60);
		System.out.println("Default Constructor");
	}

	public Day5_Constructor_Using_ThisKeyWord_Assignment1(int a) {
		this();
		System.out.println("One Parameterized Constructor");
	}

	public Day5_Constructor_Using_ThisKeyWord_Assignment1(int a, int b) {
		this(10, 20, 30, 40);
		System.out.println("Two Parameterized Constructor");
	}

	public Day5_Constructor_Using_ThisKeyWord_Assignment1(int a, int b, int c) {
		System.out.println("Three Parameterized Constructor");
	}

	public Day5_Constructor_Using_ThisKeyWord_Assignment1(int a, int b, int c, int d) {
		this(10);
		System.out.println("Four Parameterized Constructor");
	}

	public static void main(String[] args) {
		Day5_Constructor_Using_ThisKeyWord_Assignment1 obj = new Day5_Constructor_Using_ThisKeyWord_Assignment1(10, 20);
	}
}
