package day10_Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_Paste {
	
	public void copyDataAndPaste() throws IOException {
		
		File f = new File("../Java_Concepts/src/AbhiTXT2.txt");
		FileReader fr =new  FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		File f1 = new File("../Java_Concepts/src/AbhiTXT4.txt");
		FileWriter fw =new  FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		while ((s=br.readLine())!=null) {
			System.out.println(s);
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		Copy_Paste cp = new Copy_Paste();
		cp.copyDataAndPaste();
	}


}
