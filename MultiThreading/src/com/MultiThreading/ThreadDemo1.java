package com.MultiThreading;

public class ThreadDemo1 extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo1 t = new ThreadDemo1();

		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
