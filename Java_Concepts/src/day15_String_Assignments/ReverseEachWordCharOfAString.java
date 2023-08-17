package day15_String_Assignments;


//3)my name is deepak-------------ym enam si kapeed
public class ReverseEachWordCharOfAString {
	
	public static void reverseEachWordCharForGivenString(String inputString) {
		String [] s= inputString.split(" ");
		int L=s.length;
		for (int i = 0; i<L; i++) {
			for (int j=s[i].length()-1;j>=0;j--) {
				System.out.print(s[i].charAt(j));
			}
			System.out.print(" ");
			
		}
	}
 public static void main(String[] args) {
	 ReverseEachWordCharOfAString.reverseEachWordCharForGivenString("My Name is Abhishek");
}
}
