package day8_Assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter number to get the factorial");
		int num =obj.nextInt();
		getFactorial(num);

	}
	
	public static void getFactorial(int num) {
		int fact=1;
		for (int i=1;i<=num;i++) {
			fact =fact*(i);
//			System.out.println(fact);
		}
		System.out.println(fact);
	}
}
