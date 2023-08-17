package day15_String_Assignments;

public class AddAllTheZeroAtEnd {

//	7) 1010101010----------------------1111100000
	public static void GetAllTheZeroAtEndOnGivenString(String inputString) {

		char[] ch = inputString.toCharArray();
		String ones = "";
		String zeros = "";
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == '1') {
				ones = ones + ch[i];
			} else {
				zeros = zeros + ch[i];
			}

		}
		System.out.println("Final Output : " + ones + zeros);
	}

	public static void main(String[] args) {
		AddAllTheZeroAtEnd.GetAllTheZeroAtEndOnGivenString("1010101010");
	}

}
