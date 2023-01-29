package com.fundamentals.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

	/*
	 * An AtomicInteger is used in applications such as atomically
	 * incremented counters. AtomicInteger is thread-safe. So we don't need locks here.
	 */
	private AtomicInteger i=new AtomicInteger();
	private AtomicInteger j=new AtomicInteger();
		 
	public void incrementI() {
		i.incrementAndGet();
	}
	
	public void incrementJ() {
		j.incrementAndGet();
	}

	public AtomicInteger getI() {
		return i;
	}
	public AtomicInteger getJ() {
		return j;
	}
}
