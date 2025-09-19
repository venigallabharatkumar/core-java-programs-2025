package com.collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(6, "Bharat");
		tm.put(1, "Ashok");
		tm.put(4, "Haritha");
		tm.put(2, "Priya");
		tm.put(5, "Sasi");
		tm.put(3, "Yasodha");
		System.out.println(tm);
		
		for (Entry<Integer, String> entry : tm.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		System.out.println();
		System.out.println(tm.headMap(3));
		System.out.println();
		System.out.println(tm.tailMap(3));
		System.out.println();
		System.out.println(tm.subMap(2,5));
		
		

	}

}
