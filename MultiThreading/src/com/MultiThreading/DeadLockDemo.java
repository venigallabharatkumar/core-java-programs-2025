package com.MultiThreading;

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resource1 = "Pen";
		String resource2 = "Paper";

		Thread thread1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: Locked Pen");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1: Waiting for Paper...");
				
				synchronized (resource2) {
					System.out.println("Thread 1: Locked Paper");
				}
			}
		}, "Thread-1");

		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2: Locked Paper");
				try {

					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2: Waiting for Pen...");
				synchronized (resource1) {
					System.out.println("Thread 2: Locked Pen");
				}
			}
		}, "Thread-2");

		thread1.start();
		thread2.start();
	}
}
