package day15_String_Assignments;

public class AddSpecialCharWithinAString {
	
//	6) mynameisdeepak--------------my$name$is$deepak
	public static void main(String[] args) {
		String S1="mynameisabhishek";
		S1=S1.replace("mynameisabhishek", "my$name$is$abhishek");
		System.out.println(S1);
	}

}
