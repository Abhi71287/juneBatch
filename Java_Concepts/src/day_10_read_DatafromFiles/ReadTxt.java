package day_10_read_DatafromFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class ReadTxt {
	
	public void readTxtFile() throws IOException {
		File f= new File("../Java_Concepts/src/AbhiTXT.txt");
		FileReader fr =new FileReader(f);
		int a;
		while((a=fr.read())!=-1) {
			System.out.print((char)a);
			
		}
	}
	
	public void readTxtFileLineByLine() throws IOException {
		File f= new File("../Java_Concepts/src/AbhiTXT.txt");
		FileReader fr =new FileReader(f);
	    BufferedReader b= new  BufferedReader(fr);
	    String s;
	    while((s=b.readLine())!=null) {
	    	System.out.println(s);
	    }
	    }
	    
	public void writeSingleLineText() throws IOException {
		File f = new File("../Java_Concepts/src/AbhiTXT1.txt");
		FileWriter fr = new FileWriter(f);
		fr.write("Welcome to all of you all");
		fr.close();// For Saving and Closing the file

	}
	
	public void writeMultipleLineText() throws IOException {
		File f = new File("../Java_Concepts/src/AbhiTXT2.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter b= new BufferedWriter(fw);
		b.write("First Line of Code");
		b.newLine();
		b.write("Second Line of code");
		b.newLine();
		b.write("Third Line of code");
		b.close();

	}

	public static void main(String[] args) throws IOException {
		
		ReadTxt f = new ReadTxt();
//	f.readTxtFile();
//		f.readTxtFileLineByLine();
//     	f.writeSingleLineText();
	 	f.writeMultipleLineText();

	}

}
