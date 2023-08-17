package day8_Assignments;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter number to get the table :");
		int num =obj.nextInt();
		tableOfGivenNumber(num);

	}
	
	public static void tableOfGivenNumber(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num+"X"+i +" = "+ num*i);
		}
	}

}
