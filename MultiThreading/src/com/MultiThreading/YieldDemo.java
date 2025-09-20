package com.MultiThreading;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			System.out.println("Thread 1");
			
			
		}

	}

}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			System.out.println("Thread 2");
		}
		
	}
	
}

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());
		
		System.out.println(t1.getPriority()+" : "+t2.getPriority());
		
		
		
		t1.start();
		t1.yield();
		t2.start();
		
	
		

	}

}
