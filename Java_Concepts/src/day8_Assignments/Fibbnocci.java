package day8_Assignments;

import java.util.Scanner;

public class Fibbnocci {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Please enter your number :-");
		int num =obj.nextInt();
        getFibbnocciSeries(num);
	}
	
	public static void getFibbnocciSeries(int num) {
		int num1 =0;
		int num2 =1; 
		int sum;
		
		System.out.print(num1+" "+num2);
		for(int i=0;i<=num;i++) {
			sum=num1+num2;
			System.out.print(" "+sum);
			num1 =num2;
			num2 =sum;
			 
		}
	}

}
