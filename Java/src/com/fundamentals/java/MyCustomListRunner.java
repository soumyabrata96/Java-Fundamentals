package com.fundamentals.java;

import java.util.ArrayList;
import java.util.List;

class MyCustomList<T>{
	ArrayList<T> list=new ArrayList<>();
	public void addElement(T object) {
		list.add(object);
	}
	public T getElement(int index) {
		return list.get(index);
	}
}
public class MyCustomListRunner {

	public static <T extends  Number> T doubleValue(T value){
		return value;
	}
	public static <T extends List> void duplicate(T list) {
		list.addAll(list);
	}
	public static void main(String[] args) {
		MyCustomList<String> myList=new MyCustomList<>();
		myList.addElement("Soumya");
		MyCustomList<Integer> myList1=new MyCustomList<>();
		myList1.addElement(1);
		myList1.addElement(2);
		myList1.addElement(3);
		ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3));
		duplicate(list);
		System.out.println(list);
		System.out.println(doubleValue(Integer.valueOf(15)));
	}

}
