package com.fundamentals.concurrent;

public class Counter {

	private int i=0;
	
	synchronized public void incrementI() {
		i++;
	}

	public int getI() {
		return i;
	}
	
}
