package day14_Collection_topic;

import java.util.ArrayList;

public class Array_List_Topic {
	
//	ArrayList :- Duplicates are allowed and maintain index order
//	LinkedList :- Duplicates are allowed and maintain Node order
	
//	Searching is faster in case of ArrayList because searching will happen based upon the index number 
//	Searching is slower in case of Linkedlist 
	
//	Insertion and Deletion is faster in case of LinkedList
//	Insertion and Deletion is slower in case of ArrayList

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new  ArrayList<Integer> ();
		
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
