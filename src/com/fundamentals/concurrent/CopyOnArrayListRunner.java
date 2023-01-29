package com.fundamentals.concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListRunner {

	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<>();
		//Threads -3
		list.add("Ant");
		list.add("Apple");
		list.add("Admin");
		//Threads -1000
		for(String word:list) {
			System.out.println(word);
		}
	}

}
