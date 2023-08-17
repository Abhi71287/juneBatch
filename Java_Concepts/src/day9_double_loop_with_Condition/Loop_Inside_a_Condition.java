package day9_double_loop_with_Condition;

import java.util.Scanner;

public class Loop_Inside_a_Condition {

	public static void main(String[] args) {
		System.out.println("Please Enter value of max");
		Scanner s= new Scanner(System.in);
		int max = s.nextInt();
		if (max>0) {
			for (int i=1;i<max;i++){
				System.out.println(i);
			}
		}

	}

}
