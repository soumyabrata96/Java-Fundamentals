package com.fundamentals.concurrent;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	/*
	 * Hashtable was the previous thread safe approach but all the methods of
	 * hashtable are synchronized. So when we are inserting in any bukcet of
	 * hashtable the whole hashtable becomes locked other threads has to wait.
	 * ConcurrentHashMap divides the entire map into regions and place separate locks in
	 * different regions. So we get better performance as if one thread is working on
	 * one region another thread can work on other region, no need to wait. Basically ConcurrentHashMap uses bucket level lock.
	 */
	public static void main(String[] args) {
		
		String string="This is an awsome occasion. This has never happened before.";
		char[] charArray=string.toCharArray();
//		Map<Character,LongAdder> charMap=new Hashtable<>();
//		for(char c:charArray) {
//			LongAdder longAdder=charMap.get(c);
//			if(longAdder==null) {
//				longAdder=new LongAdder();	
//			}
//			longAdder.increment();
//			charMap.put(c, longAdder);
//		}
		Map<Character,LongAdder> charMap=new ConcurrentHashMap<>();
		for(char c:charArray) {
			charMap.computeIfAbsent(c, (ch)->new LongAdder()).increment();
		}
		System.out.println(charMap);
	}

}
