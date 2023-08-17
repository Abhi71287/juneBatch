package day7_Polymorphism;

public class MethodOverloadinStaticPolymorphis {
	
	public void Sum() {
	System.out.println("1");
	}
	
	public void Sum(int a) {
		System.out.println("2");
		}
	public void Sum(int a , int b) {
		System.out.println("3");
		}
	public void Sum(int a , float b) {
		System.out.println("4");
		}
	public void Sum( float a, int b) {
		System.out.println("4");
		}
	
	public int Sum(int x,int y,int z) {
		int Result = x+y+z;
		System.out.println(Result);
		return Result;
	}
	
	public static void main(String[] args) {
		MethodOverloadinStaticPolymorphis obj = new MethodOverloadinStaticPolymorphis();
		obj.Sum();
		obj.Sum(10);
		obj.Sum(1, 2, 3);
	}

}
