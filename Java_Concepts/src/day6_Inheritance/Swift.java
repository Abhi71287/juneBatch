package day6_Inheritance;


//Super KeyWord :-
//If we don'+t use super Keyword and Create object in child class than default constructor of parent class will be called automatically.
//If we want to use Parameterized constructor of Parent class in child class then we use Super Keyword.


public class Swift extends Maruti {
	
	public void m1() {
		super.method1();
		System.out.println("Child class Method 1");
		super.method2();
	}
	
	public Swift() {
		System.out.println("Child Class Default Constructor");
	}
	
	public Swift(int a) {
		System.out.println("Child Class One Parameterized Constructor");
	}
	
	public Swift(int a, int b) {
		super(22,23);// It ll call parent class two Parameterized Constructor 
		System.out.println("Child Class Two Parameterized Constructor");
	}

	public static void main(String[] args) {
		Swift Obj = new Swift(22,33);//It will call Child class two Parameterized Constructor
		Obj.m1();

}
}
