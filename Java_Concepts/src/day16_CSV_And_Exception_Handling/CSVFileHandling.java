package day16_CSV_And_Exception_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileHandling {

	public void readFile() throws IOException {
		File f = new File("../Java_Concepts/emp.csv");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		while ((s = br.readLine()) != null) {
//			 System.out.println(s); to read line by line.
//			Below code is to read word by word
			String[] s1 = s.split(",");
			int L = s1.length;
			for (int i = 0; i < L; i++) {
				System.out.println(s1[i]);
			}
		}
	}

  public void writeFile() throws IOException {
	  File f = new File("../Java_Concepts/emp1.csv");
	  FileWriter fw = new FileWriter(f);
	  BufferedWriter bw =new BufferedWriter(fw);
	  for(int i=0 ;i<3 ;i++) {
		  for (int j=0;j<3;j++) {
			  bw.write("My");
			  bw.write(",");
		  }
		  bw.newLine();
	  }
	  bw.close();
  }
	public static void main(String[] args) throws IOException {
		CSVFileHandling csv = new CSVFileHandling();
		csv.readFile();
		csv.writeFile();
	}

}
