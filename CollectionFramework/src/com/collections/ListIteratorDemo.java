package com.collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hello");
		list.add("how are you");
		list.add("Srini");
		Iterator <String> liter = list.iterator();
			while(liter.hasNext()) {
				String str = liter.next();
				System.out.println(str);
			}
		
		
		
		
		
		
		
		

	}

}
