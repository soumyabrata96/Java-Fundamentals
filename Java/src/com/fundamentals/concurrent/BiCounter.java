package com.fundamentals.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {

	private int i=0;
	private int j=0;
	
	Lock lockI=new ReentrantLock();
	Lock lockJ=new ReentrantLock();
	
	/*
	 * Synchronized is not needed when we are using locks. When one thread is
	 * holding the lock other thread needs to wait until the lock is released.
	 * 
	 * With Synchronized only one method of the class can be accessed by one thread at a time
	 * which is drawback of the synchronized keyword.
	 */	 
	public void incrementI() {
		lockI.lock(); //Get lock for I
		i++;
		lockI.unlock(); //Release lock for I
	}
	
	public void incrementJ() {
		lockJ.lock(); //Get lock for J
		j++;
		lockJ.unlock(); //Release lock for J
	}

	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
}
