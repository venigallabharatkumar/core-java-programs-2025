package com.MultiThreading;

public class ThreadLifeCycleDemo extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadLifeCycleDemo t = new ThreadLifeCycleDemo();

		t.start();

//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Main ThreaD");
//		}

	}

}
