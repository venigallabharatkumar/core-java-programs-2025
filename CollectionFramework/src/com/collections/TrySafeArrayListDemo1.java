package com.collections;

import java.util.ArrayList;

public class TrySafeArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

//		System.out.println(list);

//		for(Integer i : list) {
//			System.out.println(i);
//		}

//		for (int i = 0; i < list.size(); i++) {
////			System.out.println(list);
//			System.out.println(list.get(i));
//		}
		list.forEach(System.out::println);

	}

}
