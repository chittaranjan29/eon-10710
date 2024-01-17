package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
	
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
		
}
public class CollectorsClassExample {

	public static void main(String[] args) {
		
		
		Product p1=new Product(33, "Acer Laptop", 50000);
		Product p2=new Product(34, "Lenovo Laptop", 60000);
		Product p3=new Product(35, "HP Laptop", 70000);
		Product p4=new Product(36, "Dell Laptop", 70000);
		Product p5=new Product(37, "Apple Laptop", 150000);
		
		List<Product> products=Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(products);
		//List to Set collection
		
		
		//toSet() - a Collector which collects all the input elements into a Set
		Set<Float> sets=products.stream()
				.map(x->x.price)
				.collect(Collectors.toSet());
		
		System.out.println(sets);
		
		//toList() - a Collector which collects all the input elements into a List, in encounter order
		List<String> names=products.stream()
				.map(x->x.name)
				.collect(Collectors.toList());
		
		System.out.println(names);
		
		//SummingDouble()- a Collector that produces the sum of a derived property
		
		Double sumOfProductPrices=products.stream()
				.collect(Collectors.summingDouble(x->x.price));
		System.out.println(sumOfProductPrices);
		
		
		//averagingDouble() 
		Double avgOfProductPrices=products.stream()
				.collect(Collectors.averagingDouble(x->x.price));
		System.out.println(avgOfProductPrices);
		
		//counting()
		Long noOfProducts=products.stream()
				.collect(Collectors.counting());
		System.out.println(noOfProducts);
		
		
		

	}

}
