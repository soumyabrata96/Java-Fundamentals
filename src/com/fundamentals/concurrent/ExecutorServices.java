package com.fundamentals.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServices {

	public static void main(String[] args) {
		//ExecutorService executorService=Executors.newSingleThreadExecutor();
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		executorService.execute(new Task1(1));
		executorService.execute(new Task1(2));
		executorService.execute(new Task1(3));
		executorService.execute(new Task1(4));
		executorService.execute(new Task1(5));
		executorService.execute(new Task1(6));
		executorService.execute(new Task1(7));
		//executorService.execute(new Thread(Threads.runnable));
		
		System.out.println("\nMain Done");
		executorService.shutdown();
	}
}
