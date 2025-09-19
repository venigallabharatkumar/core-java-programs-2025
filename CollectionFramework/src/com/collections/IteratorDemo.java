package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list = new ArrayList<>();

		list.add("hi");
		list.add("hello");
		list.add("how are you");
		list.add("Srini");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

	}

}
