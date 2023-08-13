package Java_basics;

public class Day_1_Assignment_Student {
	
	int rollNumber;
	int age;
	
	public void display1() {
		System.out.println("Welcome to all of you");	
	}
	
	public void display2() {
		System.out.println("Automation is very easy");	
	}

	public static void main(String[] args) {
		Day_1_Assignment_Student  obj = new Day_1_Assignment_Student();
		obj.display1();
		obj.display2();
		int rn =obj.rollNumber=201;
		int age=obj.age=30;
		System.out.println("Studen roll number is :-"+rn);
		System.out.println("Studen age is :-"+age)
				;
	}
	
}
