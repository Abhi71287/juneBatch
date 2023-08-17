package day14_Collection_topic;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet_Topic {
	
	public static void main(String[] args) {
		
	
	TreeSet<Integer> hs = new TreeSet<Integer>();
	hs.add(122);
	hs.add(333);
	hs.add(3333);
	hs.add(2);
	hs.add(555);
	hs.add(6555);
	hs.add(122);
	
	for (Integer h : hs) {
		System.out.println(h);
	}
}
}