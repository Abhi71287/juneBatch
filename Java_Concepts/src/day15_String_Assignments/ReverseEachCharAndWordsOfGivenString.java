package day15_String_Assignments;


//4) my name is deepak------------kapeed si eman ym
public class ReverseEachCharAndWordsOfGivenString {

	public static void reverseEachCharAndWordsOfGivenString(String inputString) {
		String[] s = inputString.split(" ");
		int L = s.length;
		for (int i = L - 1; i >= 0; i--) {
			for (int j = s[i].length() - 1; j >= 0; j--) {
				System.out.print(s[i].charAt(j));
			}
			System.out.print(" ");

		}
	}

	public static void main(String[] args) {
	   ReverseEachCharAndWordsOfGivenString.reverseEachCharAndWordsOfGivenString("My Name Is Abhishek");
   }
}