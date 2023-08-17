package day8_Assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Please enter your number :-");
		int num =obj.nextInt();
		isArmstrongNumber(num);

	}
	
	public static void isArmstrongNumber(int num) {
		 int cube =0;
		 int r;
		 int t;
		 
		 t=num;
		 
		 while(num >0) {
			 r = num%10;
			 num = num/10;
			 cube = cube+(r*r*r);
		 }
		 if (t==cube) {
			 System.out.println(t +": is an Armstrong Number");
		 }else {
			 System.out.println(t +": is not an Armstrong Number"); 
		 }
	}

}
