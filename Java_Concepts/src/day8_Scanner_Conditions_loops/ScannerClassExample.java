package day8_Scanner_Conditions_loops;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {

		System.out.println("Please enter the value of a :");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
//		float b = obj.nextFloat();

		if (a % 2 == 0) {
			System.out.println("Even number" + a);
		} else {
			System.out.println("Odd number " + a);
		}

	}

}
