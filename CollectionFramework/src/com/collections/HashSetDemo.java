package com.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("banana");
		hs.add("apple");
		hs.add("mango");
		hs.add("mango");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

	}

}
