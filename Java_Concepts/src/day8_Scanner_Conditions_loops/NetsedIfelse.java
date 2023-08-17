package day8_Scanner_Conditions_loops;

import java.util.Scanner;

public class NetsedIfelse {

	public static void main(String[] args) {
		System.out.println("Please enter the value of a :");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		
		if (a>0) {
			if (a%2==0) {
			System.out.println("Even Number "+a);
			}
			else {
				System.out.println("odd Number "+a);
			}
		}
		else {
			System.out.println("Please eneter popsitive number");
			
		}

	}

}
