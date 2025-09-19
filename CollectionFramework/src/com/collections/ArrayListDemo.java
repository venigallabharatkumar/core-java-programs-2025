package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add("Srini");
		al.add(10);
		al.add(10f);
		al.add("Srini");
		al.add(10.748474);
		al.add(true);
		al.add(false);

		System.out.println(al);

		al.remove(4);
		System.out.println(al);

	}

}
