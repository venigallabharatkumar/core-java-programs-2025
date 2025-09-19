package com.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		v.add("Srini");
		v.add(10);
		v.add("Srini");
		v.add(10f);
		v.add(false);
		v.add(null);
		v.add(25.25678);
		
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		
		
		

	}

}
