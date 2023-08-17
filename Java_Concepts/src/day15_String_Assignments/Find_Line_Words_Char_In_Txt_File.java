package day15_String_Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Find_Line_Words_Char_In_Txt_File {

//	9) how many lines,words and characters in a txt file ------------we have to find out
	public static void find_Line_Words_Char_Count() throws IOException {
		File f = new File("../Java_Concepts/src/AbhiTXT.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		int l = 0;
		int w = 0;
		int c = 0;
		while ((s = b.readLine()) != null) {
			l++;
			String[] words = s.split(" ");
			 w  = w+words.length;
			for (int i = 0; i < words.length; i++) {
             c = c + words[i].length();

			}
		}
		System.out.println("Line Count in text file :"+l);
		System.out.println("Words Count in text file :"+w);
		System.out.println("Char Count in text file :"+c);

	}
	
	public static void main(String[] args) throws IOException {
		Find_Line_Words_Char_In_Txt_File.find_Line_Words_Char_Count();
	}
}
