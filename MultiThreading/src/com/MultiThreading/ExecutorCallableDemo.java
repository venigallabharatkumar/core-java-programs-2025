package com.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTaskCallable implements Callable <Object>{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("call () method is executed");
		
		return "Success";
	}
	
	
}

public class ExecutorCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		MyTaskCallable call = new MyTaskCallable();
		
		ExecutorService executorservice = Executors.newFixedThreadPool(5);
		
		for(int i=1; i<=5; i++) {
			Future <?> submit = executorservice.submit(call);
			System.out.println(submit.get());
			
			
		}
		
		executorservice.shutdown();

	}

}
