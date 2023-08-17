package day14_Collection_topic;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Topic {
	//Do not  Maintain the order and override the key values for duplicate key
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
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

