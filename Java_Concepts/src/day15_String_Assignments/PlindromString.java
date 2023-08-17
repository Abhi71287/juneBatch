package day15_String_Assignments;


// 1) A String is palindrome or not ?
public class PlindromString {
	
	public static void isGivenStringPalindrom(String inputString) {
		String reverse= "";
		int L=inputString.length();
		for (int i = L-1; i >= 0; i--) {
			 reverse= reverse+inputString.charAt(i);
		}
		if(inputString.equals(reverse)) {
			System.out.println(inputString+ "  Given String is palindrom");
		}else {
			System.out.println(inputString+ " Given String is not palindrom");
		}
	}
	
	public static void main(String[] args) {
		PlindromString.isGivenStringPalindrom("AbbAbbA");
	}

}
