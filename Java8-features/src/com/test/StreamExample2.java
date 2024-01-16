package com.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("C Programming","Java Programming","Python Programming");
		
		//anyMatch
		
		
		boolean status=list.stream()
			.anyMatch(v -> {return v.startsWith("Php");});
		
		System.out.println(status);
		
		//allMatch
		
		 status=list.stream()
				.allMatch(v -> {return v.endsWith("Programming");});
			
			System.out.println(status);
			
		//noneMatch	
			
			 status=list.stream()
						.noneMatch(v -> {return v.endsWith("SQL");});
					
					System.out.println(status);
	   //count
					long count=list.stream()	
							.count();	
					System.out.println(count);
					
	}

}
