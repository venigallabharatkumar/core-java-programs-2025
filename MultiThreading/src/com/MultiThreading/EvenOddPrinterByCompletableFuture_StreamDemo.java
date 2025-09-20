package com.MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinterByCompletableFuture_StreamDemo {

	private static Object object = new Object();

	private static IntPredicate evenCondition = e -> e % 2 == 0;
	private static IntPredicate oddConditon = e -> e % 2 != 0;

	public static void printResults(IntPredicate condition) {
		IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOddPrinterByCompletableFuture_StreamDemo::execute);
	}

	public static void execute(int i) {
		synchronized (object) {

			try {
				System.out.println("Thread Name : " + Thread.currentThread().getName() +" : "+ i);
				object.notify();
				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CompletableFuture.runAsync(()->EvenOddPrinterByCompletableFuture_StreamDemo.printResults(oddConditon));
		
		CompletableFuture.runAsync(()->EvenOddPrinterByCompletableFuture_StreamDemo.printResults(evenCondition));
		Thread.sleep(1000);

	}

}
