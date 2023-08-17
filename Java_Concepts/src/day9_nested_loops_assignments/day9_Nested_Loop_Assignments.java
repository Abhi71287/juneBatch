package day9_nested_loops_assignments;

public class day9_Nested_Loop_Assignments {
	
	public static void main(String[] args) {
		printStartsFromLeft(4);
		printStartsFromRight(4);
		printStartsFromMid(4);
		printStarsFromBottomtoTop(4);
		printNumbers1(4);
		printNumbers2(4);}
		
//		public static void main(String args[]){
//			  try{
//			    try{
//			     System.out.println("going to divide by 0");
//			     int b =39/0;
//			   }
//			    catch(ArithmeticException e)
//			    {
//			      System.out.println(e);
//			    }
//			    try{
//			    int a[]=new int[5];
//			     a[5]=4;
//			     }
//			    catch(ArrayIndexOutOfBoundsException e)
//			    {
//			       System.out.println(e);
//			    }
//			    System.out.println("other statement");
//			  }
//
//			 
//
//			  catch(Exception e)
//			  {
//			    System.out.println("handled the exception (outer catch)");
//			  }
//
//			 
//
//			  System.out.println("normal flow..");
//			}
		

	

	public static void printStartsFromLeft(int num) {

		for (int i = 0; i <= num; i++) {
			System.out.println(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
	}

	public static void printStarsFromBottomtoTop(int num) {

		for (int i = 0; i <= num; i++) {
			System.out.println(" ");
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
		}
	}

	public static void printNumbers1(int num) {

		for (int i = 0; i <= num; i++) {
			System.out.println(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
		}
	}

	public static void printNumbers2(int num) {

		for (int i = 1; i <= num; i++) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.print(j + i);

			}
		}
	}

	public static void printStartsFromRight(int num) {

		for (int i = 0; i <= num; i++) {
			System.out.println("");
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
		}

	}

	public static void printStartsFromMid(int num) {

		for (int i = 0; i <= num; i++) {
			System.out.println("");
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
		}

	}

}
