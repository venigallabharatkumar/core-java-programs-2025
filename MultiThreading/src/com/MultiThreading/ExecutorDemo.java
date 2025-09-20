package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnableTask implements Runnable {
	private String taskName;

	MyRunnableTask(String name) {
		this.taskName = name;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing: " + taskName);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println(Thread.currentThread().getName() + " has completed: " + taskName);

	}
}

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(5);
//
//		executor.execute(new MyRunnableTask("Task-1"));
//		executor.execute(new MyRunnableTask("Task-2"));
//		executor.execute(new MyRunnableTask("Task-3"));
//		executor.execute(new MyRunnableTask("Task-4"));
//		executor.execute(new MyRunnableTask("Task-5"));

		for (int i = 1; i <= 5; i++) {
			Runnable task = new MyRunnableTask("task" + i);

			executor.execute(task);

		}

		executor.shutdown();
	}

}
