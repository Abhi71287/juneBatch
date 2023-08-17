package day15_String_Handling_Topic;

public class Traversing_A_String {
	
	public static void readStringCharByChar(String inputString) {
		int L= inputString.length();
		for (int i=0;i<L;i++) {
			System.out.println(inputString.charAt(i));
		}
	}
	
	public static void readStringWordByWord(String inputString) {
		String s[]= inputString.split(" ");
		int L= s.length;
		for (int i=0;i<L;i++) {
			System.out.println(s[i]);
		}
	}
	
	public static void main(String[] args) {
		Traversing_A_String.readStringCharByChar("My Name is Abhishek");
		Traversing_A_String.readStringWordByWord("Rain rain go away");
		
//		Some pre-Defined method:-
		String S1= "My Name is Abhishek";
		String S2 =S1.toUpperCase();
		System.out.println(S2);
		String S3= S1.toLowerCase();
		System.out.println(S3);

		
	}
}
