package Java_basics;

public class Day2_Assigment1 {
//	Assignment1 : ((((10+2)+2)-2)*2)/2)
	
	public int sum(int a , int b) {
		int c= a+b;
		System.out.println("Sum is : "+c);
		return c;
	}
	
	public int sub(int a , int b) {
		int c= a-b;
		System.out.println("Sub is : "+c);
		return c;
	}
	
	public int multi(int a , int b) {
		int c= a*b;
		System.out.println("Multi is : "+c);
		return c;
	}
	
	public int div(int a , int b) {
		int c= a/b;
		System.out.println("div is : "+c);
		return c;
	}
	
	public static void main(String[] args) {
		Day2_Assigment1 obj= new Day2_Assigment1();
		int sum1 = obj.sum(10, 2);
		int sum2 = obj.sum(sum1, 2);
		int sub1 = obj.sub(sum2, 2);
		int multi =obj.multi(sub1, 2);
		int finalResult = obj.div(multi, 2);
		
		System.out.println("Final Result of ((((10+2)+2)-2)*2)/2) : "+finalResult);
		
		
	}
	

}
