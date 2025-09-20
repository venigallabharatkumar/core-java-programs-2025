package com.MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenOddPrinterByExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		IntStream.rangeClosed(1, 10).forEach(n -> {
			
			CompletableFuture<Integer> OddcompletableFuture = CompletableFuture.completedFuture(n).thenApplyAsync(t -> {
				if (n % 2 != 0) {

					System.out.println("Thread Name" + Thread.currentThread().getName() + " : " + t);

				}

				return n;

			},executorService);
			
			OddcompletableFuture.join();
			
			CompletableFuture<Integer> EvencompletableFuture = CompletableFuture.completedFuture(n).thenApplyAsync(t -> {
				if (n % 2 == 0) {

					System.out.println("Thread Name" + Thread.currentThread().getName() + " : " + t);

				}

				return n;

			},executorService);
			
			EvencompletableFuture.join();
			
			
		});
		
		executorService.shutdown();

	}

}
