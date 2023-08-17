package day8_Assignments;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = obj.nextInt();
		isPalindrom(num);

	}

	public static void isPalindrom(int num) {

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println(t + ": is palindrom Number");
		} else {
			System.out.println(t + ": is not a palindrom Number");
		}
	}
}
