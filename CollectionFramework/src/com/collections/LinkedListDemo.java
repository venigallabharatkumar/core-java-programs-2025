package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();

		ll.add("Srini");
		ll.add(10);
		ll.add(null);
		ll.add("Srini");
		ll.add(10f);
		ll.add(true);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);

	}

}
