package com.MultiThreading;

public class RunnableDemo implements Runnable {

	public void run() {
		System.out.println("run() method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableDemo r = new RunnableDemo();
		Thread t1 = new Thread(r);
		t1.start();

	}

}
