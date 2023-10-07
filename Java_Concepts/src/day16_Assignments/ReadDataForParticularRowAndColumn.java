package day16_Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataForParticularRowAndColumn {

	public void readDataBasedUponRowNoAndColumnNo(int row, int column) throws IOException {
		File f = new File("../Java_Concepts/emp.csv");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);


		String  s;
		while ((s = b.readLine()) != null) {
			
			 String a[] =s.split(",");
			for (int i = 0; i < s.length()-1 ; i++) {
				for (int j= a.length;j<column;j--)
				if(i==row && j==column) {
					System.out.println(a[j]);
				}

			}
			
			
		}
	}
	

	public static void main(String[] args) throws IOException {
		ReadDataForParticularRowAndColumn obj = new ReadDataForParticularRowAndColumn();
		obj.readDataBasedUponRowNoAndColumnNo(3, 2);
	}

}
