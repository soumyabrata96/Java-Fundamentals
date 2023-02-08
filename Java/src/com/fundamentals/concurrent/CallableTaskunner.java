package com.fundamentals.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{

	private String name;
	
	public CallableTask(String name) {
		super();
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello "+name;
	}
	
}
public class CallableTaskunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		Future<String> futureResult=executorService.submit(new CallableTask("Soumyabrata Mukherjee"));
		System.out.println(" **** "+futureResult+" **** ");
		System.out.println("new CallableTask(\"Soumyabrata Mukherjee\") execution completed.");
		System.out.println(futureResult.get());
		System.out.println(" **** "+futureResult+" **** ");
		
		Callable<String> callable=()->{
			Thread.sleep(1000);
			return "Hello Future TCS Analyst";
		};
		Future<String> futureResult1=executorService.submit(callable);
		System.out.println(" **** "+futureResult1+" **** ");
		System.out.println("callable execution completed.");
		System.out.println(futureResult1.get());
		System.out.println(" **** "+futureResult1+" **** ");
		executorService.shutdown();
		System.out.println("Main execution completed.");
	}
}
