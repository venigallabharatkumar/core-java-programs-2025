package com.MultiThreading;

class SharedResource {
	private int data;
	private boolean available = false;

	public synchronized void produce(int value) {
		while (available) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		data = value;
		System.out.println("Producer : "+data);
		available = true;

		System.out.println("Notify to Consumer");

		notify();

	}

	public synchronized void consumer() {

		while (!available) {

			try {
				wait();
				} catch (InterruptedException e) {
					
			}
			
		}
          System.out.println("Consumed : "+data);
          available=false;
		System.out.println("Notify to Producer");
		notify();
	}

}

class Producer extends Thread {

	SharedResource resource;

	Producer(SharedResource res) {
		this.resource = res;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			resource.produce(i);
		}
	}
}

class Consumer extends Thread {
	SharedResource resource;

	Consumer(SharedResource res) {
		this.resource = res;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			
            resource.consumer();
		}
	}

}

public class IntermediateThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SharedResource res = new SharedResource();
		
		Producer producer = new Producer(res);
        producer.start();
        System.out.println("Producer Started");
        
        Consumer consumer = new Consumer(res);
        consumer.start();
        System.out.println("Consumer Started");
        
	}

}
