package day14_Collection_topic;

import java.util.LinkedHashMap;
import java.util.Set;
//Maintain the insertion order and override the key values for duplicate key
public class LinkedHashMap_Topic {
  public static void main(String[] args) {
	  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(11, "Abhi");
		hm.put(122, "Automation");
		hm.put(333, "API");
		hm.put(3222, "Devops");
		hm.put(3222, "ML");
		
		Set<Integer> allKeys=hm.keySet();
		
		for (Integer i : allKeys) {
			
			System.out.println("Key is :"+i);
			System.out.println("Value is :"+hm.get(i));
			
			
		}
}
}
