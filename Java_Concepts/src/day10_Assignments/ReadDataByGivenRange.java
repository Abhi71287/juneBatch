package day10_Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataByGivenRange {
	
	public void ReadDataByGivenRange(int startRange,int endRange) throws IOException {
		File f= new File("../Java_Concepts/src/AbhiTXT2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b= new BufferedReader(fr);
		
		int range=1;
		String s;
		while((s=b.readLine())!=null) {
			if( range>=startRange && range<=endRange){
				System.out.println(s);
			}
			range= range+1;
		}
	}

	public static void main(String[] args) throws IOException {
		ReadDataByGivenRange f= new ReadDataByGivenRange();
		f.ReadDataByGivenRange(2, 5);

	}

}
