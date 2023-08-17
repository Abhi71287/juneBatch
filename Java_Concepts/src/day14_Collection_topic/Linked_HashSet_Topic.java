package day14_Collection_topic;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_HashSet_Topic {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
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
