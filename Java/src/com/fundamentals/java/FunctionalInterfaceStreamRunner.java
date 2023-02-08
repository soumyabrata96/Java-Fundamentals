package com.fundamentals.java;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceStreamRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(mapToSquare(numbers, n->n*n));
		Predicate<Integer> integerPredicate = n -> n % 2 == 0;
		System.out.println(findEevenNumbers(numbers, integerPredicate));
		System.out.println(findOddNumbers(numbers, integerPredicate));
	}

	private static List<Integer> findOddNumbers(List<Integer> numbers, Predicate<Integer> checkEvenNumber) {
		return numbers.stream().filter(Predicate.not(checkEvenNumber)).collect(Collectors.toList());
	}

	public static List<? extends Integer> mapToSquare(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}
	public static List<Integer> findEevenNumbers(List<Integer> numbers,
			Predicate<Integer> checkEvenNumber) {
		return numbers.stream().filter(checkEvenNumber).collect(Collectors.toList());
	}

}
