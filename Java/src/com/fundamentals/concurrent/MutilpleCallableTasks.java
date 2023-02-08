package com.fundamentals.concurrent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MutilpleCallableTasks {

	public static void main(String[] args) throws InterruptedException,ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		Callable<String> callable1=()->{
			Thread.sleep(1000);
			return "Hello Future TCS Analyst";
		};
		Callable<String> callable2=()->{
			Thread.sleep(1000);
			return "Hello Future API Analyst";
		};
		Callable<String> callable3=()->{
			Thread.sleep(1000);
			return "Hello Future MICROSERICES Analyst";
		};
		List<Callable<String>> callableTasks=List.of(callable1,callable2,callable3);
//		List<Future<String>> futureList=executorService.invokeAll(callableTasks);
//		System.out.println(" **** "+futureList+" **** ");
//		futureList.forEach(f->{
//			try {
//				System.out.println(f.get());
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
		String result=executorService.invokeAny(callableTasks);
		System.out.println(result);
		executorService.shutdown();
		System.out.println("**** Executor Service execution completed. ****");
		System.out.println("**** Main completed.**** ");
	}
}
