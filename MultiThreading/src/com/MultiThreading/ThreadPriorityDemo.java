package com.MultiThreading;

public class ThreadPriorityDemo extends Thread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriorityDemo t1 = new ThreadPriorityDemo();
		ThreadPriorityDemo t2 = new ThreadPriorityDemo();
		ThreadPriorityDemo t3 = new ThreadPriorityDemo();
		
		
		System.out.println(t1.getPriority()+" : "+t2.getPriority()+" : "+t3.getPriority());
		
		t1.setPriority(NORM_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		System.out.println(t1.getPriority()+" : "+t2.getPriority()+" : "+t3.getPriority());
	

	}

}
