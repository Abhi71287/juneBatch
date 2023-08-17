package day15_String_Assignments;

//5) my name is deepak-----------occurence of character e here
public class CountOccuranceOfAChar {

	public static void countOccuranceOfACharInGivenString(String inputString, char c) {
		char[] ch = inputString.toCharArray();
		int j = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {

				j = j + 1;
			} else {

			}
		}

		System.out.println("The occurance of " + c + " is : " + j);
	}

	public static void main(String[] args) {
		CountOccuranceOfAChar.countOccuranceOfACharInGivenString("my name is abhishek", 'e');
	}
}
