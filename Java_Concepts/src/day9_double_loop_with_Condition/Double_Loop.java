package day9_double_loop_with_Condition;

public class Double_Loop {

	public static void main(String[] args) {
		for(int i= 1;i<=5;i++) { // loop for row
			System.out.println(); // ll move cursor to the next line
			for (int j = 0; j <i; j++) { // loop for column
				System.out.print("*");
			}
		}

	}

}
