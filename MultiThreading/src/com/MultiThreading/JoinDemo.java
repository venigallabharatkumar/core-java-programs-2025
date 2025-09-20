package com.MultiThreading;

class MyThread3 extends Thread{
	
	MyThread3(String name){
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(getName()+" : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread3 t1 = new MyThread3("Thread-1");
		MyThread3 t2 = new MyThread3("Thread-2");
		
		t2.start();
		t2.join();
		t1.start();
		

	}

}
