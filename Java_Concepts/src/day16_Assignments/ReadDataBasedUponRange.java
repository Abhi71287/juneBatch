package day16_Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;




public class ReadDataBasedUponRange {
	
	public void ReadDataByGivenRange(int initialRange,int endRange) throws  IOException {
		File f = new File("../Java_Concepts/emp.csv");
		FileReader fr = new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		
		int range=1;
		String s;
		while((s=b.readLine())!=null) {
			if( range>=initialRange && range<=endRange){
				System.out.println(s);
			}
			range= range+1;
		}
	}

	public static void main(String[] args) throws IOException {
		ReadDataBasedUponRange f= new ReadDataBasedUponRange();
		f.ReadDataByGivenRange(2, 5);

	}

}
