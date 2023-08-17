package day14_Collection_topic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List_Topic {
	
	public static void main(String[] args) {
	LinkedList<Integer> al = new  LinkedList<Integer> ();
		
		al.add(122);
		al.add(333);
		al.add(3333);
		al.add(2);
		al.add(555);
		al.add(6555);
		al.add(122);
		
		for (Integer h : al) {
			System.out.println(h);
			
		}
	}

}
