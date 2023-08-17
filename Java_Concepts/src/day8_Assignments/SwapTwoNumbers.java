package day8_Assignments;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Swap Value without using third Variable :");
		swapNumbers(12, 15);
		System.out.println("Swap Value with using third Variable :");
		swapNumUsingThirdVar(12, 15);

	}

	public static void swapNumbers(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swaped value of a is :" + a);
		System.out.println("Swaped value of b is :" + b);
	}
	
	public static void swapNumUsingThirdVar(int a, int b) {
		int c;
		 c=a+b;
		 b=c-b;
		 a=c-b;
		System.out.println("Swaped value of a is :" + a);
		System.out.println("Swaped value of b is :" + b);
	}

}
