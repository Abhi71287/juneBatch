package day7_Polymorphism;

public class SwiftOverride2 extends MarutiOverride1 {
	
	public void basePrice() {
		System.out.println("Swift base Price");
	}
	
	public static void main(String[] args) {
		SwiftOverride2 obj = new SwiftOverride2();
		obj.basePriceCalculation(10, 20);
		obj.basePrice();
		
		MarutiOverride1 ob2 = new MarutiOverride1();
		ob2.basePrice();
	}

}
