package day15_String_Handling_Topic;

public class String_Class_Concept {
	
	public void stringComparision(String a,String b) {
		if (a==b) {
			System.out.println("address is same");
		}else {
			System.out.println("address is not same");
		}
	}
	
	public void stringContent(String a,String b) {
		if (a==b) {
			System.out.println("Content is same");
		}else {
			System.out.println("Content is not same");
		}
	}
	public static void main(String[] args) {
		String_Class_Concept  s= new String_Class_Concept();
		String s1= "Abhi";
		String s2= "Abhi";
		s.stringComparision(s1, s2); // SCP- Address will be same as it refer the same object.
		
		String s3= new String("Abhi");
		String s4= new String("Abhi");
		s.stringComparision(s3, s4); // Heap-Address will be diff as it refer the different object.
		
//		Content verification:-
		s.stringContent(s1, s2);
		s.stringContent(s3, s4);
		
//		CompareTo method ll verify the ascii value
		
		System.out.println(s1.compareTo(s2)); // If its equal than ll 0 and if not than ll return -32
		
	}

}
