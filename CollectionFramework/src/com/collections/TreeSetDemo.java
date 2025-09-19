package com.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t = new TreeSet<>();
		TreeSet<String> t2 = new TreeSet<String>();

		t.add("Mango");
		t.add("Banana");
		t.add("Appple");
		t.add("Grapes");

		t2.add("Dhoni");
		t2.add("Shreyas");
		System.out.println(t);
		System.out.println(t2);

	}

}
