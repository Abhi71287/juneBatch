package day8_Assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.err.println("Please Enter a number");
		int num = obj.nextInt();
		
		isPrimeNumber(num);
		getPrimeNumber(num);
	}
	
	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i=2 ; i<num ;i++) {
			if (num%i==0) {
			return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		for(int i =2; i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + "  :given number is prime number");
			}
		}
	}
}
