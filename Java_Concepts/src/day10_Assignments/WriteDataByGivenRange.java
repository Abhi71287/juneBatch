package day10_Assignments;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataByGivenRange {

	public void writeDataByRange(int startRow, int endRow) throws IOException {
		File f = new File("../Java_Concepts/src/AbhiTXT3.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		System.out.println("Please Enter The String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i= 1; i <= endRow; i++) {
			if (i > startRow && i <= endRow) {
				b.write(s);
				b.newLine();
			}
			else {
				b.newLine();
			}
		}
		b.close();
	}
	
	
	

	public static void main(String[] args) throws IOException {
		WriteDataByGivenRange f = new WriteDataByGivenRange();
		f.writeDataByRange(2, 8);
	}

}
