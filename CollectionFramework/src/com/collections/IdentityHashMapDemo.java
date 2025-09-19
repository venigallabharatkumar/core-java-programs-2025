package com.collections;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
		
		ihm.put(1, "Ashok");
		ihm.put(2, "Bharat");
		ihm.put(3, "Priya");
		ihm.put(4, "Yasodha");
		ihm.put(5, "Sasi");
		ihm.put(6, "Haritha");
		
		System.out.println(ihm);
		
		System.out.println();
		
		for(Integer keys : ihm.keySet()) {
			System.out.println(keys);
		}
		
		System.out.println();
		for(String values : ihm.values()) {
			System.out.println(values);
		}

	}

}
