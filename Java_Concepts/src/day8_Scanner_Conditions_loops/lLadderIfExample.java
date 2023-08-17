package day8_Scanner_Conditions_loops;

import java.util.Scanner;

public class lLadderIfExample {

	public static void main(String[] args) {
		System.err.println("Please Enter your final marks :- ");

		Scanner obj = new Scanner(System.in);
		int Marks = obj.nextInt();

		if ((Marks >= 1) && (Marks < 35)) {
           System.out.println("Failed "+ Marks);
		}
		else if ((Marks >= 35) && (Marks < 60)) {
	           System.out.println("Passed "+ Marks);
			}
		else if ((Marks >= 60) && (Marks < 80)) {
	           System.out.println("First Division "+ Marks);
			}
		else if ((Marks >= 80) && (Marks <= 100)) {
	           System.out.println("Merit "+ Marks);
			}
		else {
			System.out.println("Not attended the exams");
		}
		

	}

}
