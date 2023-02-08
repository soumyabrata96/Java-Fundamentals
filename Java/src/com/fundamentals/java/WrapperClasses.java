package com.fundamentals.java;

public class WrapperClasses {

	public static void main(String[] args) {
		Integer value1=Integer.valueOf(500);
		Integer value2=Integer.valueOf(500);
		System.out.println(value1.equals(value2));
		Integer value3=Integer.parseInt("500");
		System.out.println(value1.equals(value3));
	}
}
