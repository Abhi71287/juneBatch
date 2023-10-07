package day16_CSV_And_Exception_Handling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
//		To Handle exception we use try catch block
		System.out.println("First Line....");
		System.out.println("Second line..");
		try {
		int a=12/0;
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("third line..");
		System.out.println("Final line...");
		
		
//	 Can we use Multiple catch block - Yes 
		System.out.println("First Line....");
		System.out.println("Second line..");
		try {
		int a=12/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();	
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();	
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("third line..");
		System.out.println("Final line...");
		
//		 Can we Try catch block inside a try catch block- Yes 
			System.out.println("First Line....");
			System.out.println("Second line..");
			try {
			int a=12/2;
			System.out.println("Inside try");
			try {
				int a1=12/0;
			} catch (Exception e) {
				e.printStackTrace();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("third line..");
			System.out.println("Final line...");		
		
	}

}
