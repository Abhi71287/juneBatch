package Java_basics;

//  Assignment2 : (((((10*2)-2)+2)-2)/2)
public class Day2_Assignment2 {

	public int sum(int a, int b) {
		int c = a + b;
		System.out.println("Sum is : " + c);
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		System.out.println("Sub is : " + c);
		return c;
	}

	public int multi(int a, int b) {
		int c = a * b;
		System.out.println("Multi is : " + c);
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		System.out.println("div is : " + c);
		return c;
	}

	public static void main(String[] args) {
		Day2_Assignment2 obj = new Day2_Assignment2();
		int multi1 = obj.multi(10, 2);
		int sub1 = obj.sub(multi1, 2);
		int sum1 = obj.sum(sub1, 2);
		int sub2 = obj.sub(sum1, 2);
		int finalResult = obj.div(sub2, 2);

		System.out.println("Final Result of (((((10*2)-2)+2)-2)/2) : " + finalResult);

	}

}
