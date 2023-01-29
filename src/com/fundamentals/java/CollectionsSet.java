package com.fundamentals.java;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {

	public static void main(String[] args) {
		List<Character> charList=List.of('A','Z','B','A','F','F','B');
		//Sorted order
		Set<Character> charTreeSet=new TreeSet<>(charList);
		System.out.println("treeset : "+charTreeSet);
		//Insertion order
		Set<Character> charLinkedSet=new LinkedHashSet<>(charList);
		System.out.println("linkedhashset : "+charLinkedSet);
		//Unordered 
		Set<Character> charHashSet=new HashSet<>(charList);
		System.out.println("hashset : "+charHashSet);
		TreeSet<Integer> numbers=new TreeSet<>(Set.of(12,45,33,90,76,54));
		System.out.printf("%d, %d, %d\n",numbers.lower(33),numbers.floor(40),numbers.ceiling(45));
		System.out.println(numbers.subSet(30, 80));
		System.out.println(numbers.headSet(45)+" "+numbers.tailSet(45));
		
		Comparator<String> comp=(s1,s2)->Integer.compare(s2.length(), s1.length());
		Queue<String> queue=new PriorityQueue<>(comp);
		queue.addAll(List.of("Apple","Zebra","Elephant","Banana"));
		System.out.println(queue.offer("Lion"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
