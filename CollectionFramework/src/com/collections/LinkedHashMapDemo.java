package com.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(1, "Sachin");
		lhm.put(2, "Shreyas Iyer");
		lhm.put(3, "Hardik");
		lhm.put(4, "Kohli");
		lhm.put(5, "Raina");
		lhm.put(6, "Jadeja");
		lhm.put(7, "Dhoni");
		
		System.out.println(lhm);
		
		System.out.println();
		
		for(Entry<Integer, String> entry : lhm.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		System.out.println();
		
       for(Integer keys : lhm.keySet()) {
    	   System.out.println(keys);
       }
       
       System.out.println();
       
       for(String values : lhm.values()) {
    	   System.out.println(values);
       }
       
       System.out.println();
       
       if(lhm.containsKey(7)) {
    	   System.out.println("Key is available");
       }else {
    	   System.out.println("Key is not available");
       }
       
	}

}
