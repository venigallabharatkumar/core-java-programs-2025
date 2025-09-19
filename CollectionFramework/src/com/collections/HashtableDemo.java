package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(102, "Bharat");
		ht.put(101, "Srini");
		ht.put(103, "Ashok");
		ht.put(107, "Yasodha");
		ht.put(105, "Priya");
		ht.put(106, "Sasi");
		ht.put(104, "Haritha");

		System.out.println(ht);
		System.out.println();

		for (Entry<Integer, String> entry : ht.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
		System.out.println();
		
//		for(Integer keys : ht.keySet()) {
//			System.out.println(keys);
//		}
//		
//		
//		System.out.println();
//		
//		for(String values : ht.values()) {
//			System.out.println(values);
//		}
		
		Enumeration<Integer> keys = ht.keys();
		
		while (keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
		
		System.out.println();
		
		Enumeration<String> values = ht.elements();
		while(values.hasMoreElements()) {
			System.out.println(values.nextElement());
		}
		
		
		
		
		

	}

}
