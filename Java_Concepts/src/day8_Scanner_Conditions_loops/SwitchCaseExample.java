package day8_Scanner_Conditions_loops;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		System.out.println("Please enter the value of a :");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println("Please enter the value of b");
		int b = obj.nextInt();
		System.out.println("Please enter operation which you want to perform :");
		int Operation = obj.nextInt();
		int result;
		switch(Operation) {
		
		case 1:
			result = a+b;
			System.out.println("Sum of two numbers are :"+result);
			break;
		case 2:
			result = a/b;
			System.out.println("Division of two numbers are :"+result);
			break;
		case 3:
			result = a*b;
			System.out.println("Multiplication of two numbers are :"+result);
			break;
		case 4:
			result = a+b;
			System.out.println("Substarction of two numbers are :"+result);
			break;
		default:
		{System.out.println("Please eneter a valid operator");
		break;
		}
		}
		
		

	}

}
