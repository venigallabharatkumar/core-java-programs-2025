package com.collections;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet<Integer> s = new TreeSet<>();
		
		s.add(30);
		s.add(20);
		s.add(15);
		s.add(10);
		s.add(40);
		System.out.println(s);
		
		SortedSet<Integer> ss = Collections.synchronizedSortedSet(s);
        synchronized (ss) {
		for (int i = 10; i <= 20; i++)
			s.add(i);
		
		System.out.println(s);

		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(16));
		System.out.println(s.tailSet(16));
		System.out.println(s.subSet(11, 19));
		
        }

	}

}
