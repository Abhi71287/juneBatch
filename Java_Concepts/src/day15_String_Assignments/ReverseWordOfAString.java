package day15_String_Assignments;


//2) my name is deepak-------------deepak is name my

public class ReverseWordOfAString {
	
	public static void reverseWordsForGivenString(String inputString) {
		String [] s= inputString.split(" ");
		int L=s.length;
		for (int i = L-1; i >= 0; i--) {
			 System.out.print(s[i]);
			 System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		ReverseWordOfAString.reverseWordsForGivenString("My name is Abhishek");
	}

}
