package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Redmi");
		hm.put(2, "Realme");
		hm.put(3, "Vivo");
		hm.put(4, "Oppo");
		hm.put(5, "Nokia");
		hm.put(6, "Samsung");

		System.out.println(hm);

		System.out.println();

		System.out.println(hm.get(4));
		System.out.println();

		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key =  " + entry.getKey() + " Value = " + entry.getValue());

		}

		System.out.println();

		for (Integer keys : hm.keySet()) {
			System.out.println(keys);
		}

		System.out.println();

		for (String values : hm.values()) {
			System.out.println(values);
		}

		System.out.println();

		if (hm.containsKey(7)) {
			System.out.println("Key is available");
		} else {
			System.out.println("Key is not available");
		}
		
		System.out.println();
		
		hm.remove(1);
		System.out.println(hm);
		

	}

}
