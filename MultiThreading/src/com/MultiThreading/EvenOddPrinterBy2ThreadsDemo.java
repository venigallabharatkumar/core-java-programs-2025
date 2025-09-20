package com.MultiThreading;

public class EvenOddPrinterBy2ThreadsDemo implements Runnable {

	static int count = 1;
	Object object;

	public EvenOddPrinterBy2ThreadsDemo(Object object) {
		
		this.object = object;
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (count <= 10) {
			if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {

				synchronized (object) {
					System.out.println("Thread Name : "+Thread.currentThread().getName()+" value " + count);
					count++;

					try {
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

			if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {

				synchronized (object) {
					System.out.println("Thread Name : "+Thread.currentThread().getName()+" value " + count);
					count++;

					object.notify();
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object lock = new Object();
		
		Runnable r1 = new EvenOddPrinterBy2ThreadsDemo(lock);
		Runnable r2 = new EvenOddPrinterBy2ThreadsDemo(lock);
		
		new Thread(r1, "even").start();
		
		new Thread(r2, "odd").start();
		

	}

}
