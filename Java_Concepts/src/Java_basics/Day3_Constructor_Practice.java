package Java_basics;

public class Day3_Constructor_Practice {
	
	public Day3_Constructor_Practice() {
		System.out.println("Default Constructor");
	}
	
	public Day3_Constructor_Practice(int a) {
		System.out.println("One Parameterized Constructor with input as :"+a);
	}
	
	public Day3_Constructor_Practice(String name,int age) {
		System.out.println("Two Parameterized Constructor");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
	public static void main(String[] args) {
		Day3_Constructor_Practice obj =new Day3_Constructor_Practice();
		Day3_Constructor_Practice obj1=new Day3_Constructor_Practice(10);
		Day3_Constructor_Practice obj2=new Day3_Constructor_Practice("Rajeev",26);
	}

}
