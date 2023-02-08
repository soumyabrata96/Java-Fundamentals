package com.fundamentals.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.age, o.age);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class PracticeCollectionsLists {
	public static void main(String[] args) {
		/*
		 * ArrayList and Vector uses Array underneath as datastructure. LinkedList uses
		 * Linked lists underneath as datastructure. Vector is thread safe - synchronized.
		 */
		List<String> words=List.of("Dog","Cat","Tiger","Wolf","Eagle");
		List<String> wordsArrayList=new ArrayList<>(words);
		List<String> wordsLinkedList=new LinkedList<>(words);
		List<String> c=new Vector<>(words);
		List<String> animals=List.of("Yak","Shark");
		wordsArrayList.addAll(2,animals);
		System.out.println("ArraysList : "+wordsArrayList);
		wordsLinkedList.set(3, "Hawk");
		System.out.println("LinkedList : "+wordsLinkedList);
		Iterator<String> wordsIterator=wordsArrayList.iterator();
		while(wordsIterator.hasNext()) {
			if(wordsIterator.next().endsWith("at")) {
				wordsIterator.remove();
			}	
		}
		System.out.println("ArraysList after deletion : "+wordsArrayList);
		Collections.sort(wordsLinkedList);
		System.out.println("Natural sort order : "+wordsLinkedList);
		wordsLinkedList.sort(Comparator.comparing(String::length));
		System.out.println("Sorted based on lentgh of string : "+wordsLinkedList);

		List<Student> studentList=List.of(new Student(1,"Raju",10),new Student(2,"Pappu",20),
				new Student(3,"Dholu",8),new Student(4,"Munni",17));
		List<Student> studentArrayList=new ArrayList<>(studentList);
		//Collections.sort(studentArrayList);
		//System.out.println(studentArrayList);
		
		//Comparator<Student> studentComparator=Comparator.comparingInt(s->s.age);
		//Ascending
		Comparator<Student> studentComparator=(s1,s2)->Integer.compare(s1.age, s2.age);
		//Descending Comparator<Student> studentComparator=(s1,s2)->Integer.compare(s2.age, s1.age);
		studentArrayList.sort(studentComparator);
		System.out.println(studentArrayList);
	}

}
