package day15_String_Assignments;

public class CountOccuranceOfAWord {
//	8) my name is deepak my name ----occurence of word my here

	public static void countOccuranceOfAWordInGivenString(String inputString, String word) {
		String[] S = inputString.split(" ");
		int L = S.length;
		int j = 0;
		for (int i = 0; i < L; i++) {
			if (S[i].equals(word)) {

				j = j + 1;
			} else {

			}
		}

		System.out.println("The occurance of " + word+ " words is : " + j);
	}

	public static void main(String[] args) {
		CountOccuranceOfAWord.countOccuranceOfAWordInGivenString("my name is my abhi is my is name", "my");
	}

}
