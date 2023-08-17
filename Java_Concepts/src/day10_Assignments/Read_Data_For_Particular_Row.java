package day10_Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_For_Particular_Row {
	
	public void read_Data(int a) throws IOException {
		File f= new File("../Java_Concepts/src/AbhiTXT2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		int currentRow = 1;
		String s;
	    while((s=b.readLine()) != null) {
	    	if(currentRow==a) {
	    		System.out.println(s);
	    	}
	    	currentRow=currentRow+1;
	    }
		
	}

	public static void main(String[] args) throws IOException {
		Read_Data_For_Particular_Row f= new Read_Data_For_Particular_Row();
		f.read_Data(4);

	}

}
