package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		
		//filter
		
		List<String> languages=Arrays.asList("C","Java","Python","SQL","C#","PHP","C++");
		
		//filter - intermediate operation
		//foreach - terminal operation
		languages.stream()
			.filter(l->!l.startsWith("C"))
			.forEach(x -> System.out.println(x)
					);
		//filter, map - intermediate operation
		//collect - terminal operation
		List<String> myLanguages=languages.stream()
				.filter(l->l.startsWith("C"))
				.map(x->x.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(myLanguages);
		
		//sorted() intermediate operation
		List<String> orderedLanguages=languages.stream()
				.sorted().collect(Collectors.toList());
		System.out.println(languages);
		System.out.println(orderedLanguages);
		
		
		List<Integer> numbers=Arrays.asList(12,67,90,33,56,66,8,3,95,33,12);
		
		numbers.stream()
			.forEach(x-> System.out.print(x+" "));
		
		System.out.println();

		numbers.stream()
		.filter(x->x%2==0)
		.forEach(x-> System.out.print(x+" "));
		
		System.out.println();
		
		numbers.stream()
		.filter(x->x%2!=0)
		.forEach(x-> {System.out.print(x+" ");});

		System.out.println();
		numbers.stream()
		.sorted()
		.forEach(x-> {System.out.print(x+" ");});
		
		//sorted - intermediate operation - used to sort the elements
		System.out.println();
		numbers.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(x-> {System.out.print(x+" ");});
		
		//distinct() - intermediate operation returns distinct elements stream
		System.out.println();
		numbers.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.forEach(x-> {System.out.print(x+" ");});
		
		
		
		System.out.println();
		//limit() - intermediate operation - 
		languages.stream()
			.limit(4)
			.forEach(x -> System.out.println(x));
		
		
		
		
	}

}
