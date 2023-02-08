package com.fundamentals.concurrent;

class Task1 extends Thread
{
	private int i;
	Task1(int i){
		this.i=i;
	}
	@Override
	public void run() {
		System.out.println("Task"+this.i+" Started");
		for(int i=this.i*100;i<=this.i*100+99;i++)
			System.out.print(i+" ");
		System.out.println("\nTask"+this.i+" Done");
	}
	
}

public class Threads {

	static Runnable runnable=()->{
		System.out.println("Task2 Started");
		for(int i=201;i<300;i++)
			System.out.print(i+" ");
		System.out.println("\nTask2 Done");
	};
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * NEW -> Thread is ready to run
		 * RUNNABLE -> Thread is waiting for the cpu to run
		 * RUNNING -> Thread is running
		 * BLOCKED/WAITING -> Thread waiting for some other thread to provide some data
		 * TERMINATED/DEAD - > Thread is completed
		 */
		Task1 task1=new Task1(1);
		task1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Task1 Kicked Off");
		task1.start();
		
		Thread task2=new Thread(runnable);
		task2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Task2 Kicked Off");
		task2.start();
		//Wait for task2 to complete
		task2.join();
		System.out.println("Task3 Kicked Off");
		System.out.println("Task3 Started");
		for(int i=301;i<400;i++)
			System.out.print(i+" ");
		System.out.println("\nTask3 Done");
		System.out.println("\nMain Done");
	}

}
