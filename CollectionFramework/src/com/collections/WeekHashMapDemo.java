package com.collections;

import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeekHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeakHashMap<Integer, String> whm = new WeakHashMap<>();
		
		whm.put(1, "Shreyas Iyer");
		whm.put(2, "Rahul");
		whm.put(3, "Rohith");
		whm.put(4, "Kohli");
		whm.put(5, "Jadeja");
		whm.put(6, "Raina");
		whm.put(7, "Dhoni");
		
		System.out.println(whm);
		
		System.out.println();
		
		for(Entry<Integer, String> entry : whm.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		

	}

}
