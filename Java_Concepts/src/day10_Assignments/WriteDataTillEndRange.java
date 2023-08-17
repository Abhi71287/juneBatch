package day10_Assignments;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataTillEndRange {
	
	public void writeDataTillGivenRow(int endRange) throws IOException {
		File f = new File("../Java_Concepts/src/AbhiTXT0.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter b= new BufferedWriter(fw);
		System.out.println("Please Enter The String");
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
	for (int i=1; i<=endRange;i++) {
		b.write(s);
		b.newLine();
	}
		b.close();
	}
	
	public static void main(String[] args) throws IOException {
		WriteDataTillEndRange f= new WriteDataTillEndRange();
		f.writeDataTillGivenRow(4);
	}

}
