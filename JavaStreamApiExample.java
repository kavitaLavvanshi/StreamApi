package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}
public class JavaStreamApiExample {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP Laptop",2500f));
		productList.add(new Product(2,"Dell Laptop",2600f));
		productList.add(new Product(3,"Lenevo Laptop",5600f));
		productList.add(new Product(4,"Mac Laptop",9600f));
		productList.add(new Product(5,"Sony Laptop",7800f));
		
		List<Float> productPriceList = productList.stream()
				.filter(p->p.price>2600)//filtering
				.map(m->m.price)//fectching
				.collect(Collectors.toList());
		System.out.println(productPriceList);//displaying data
	}

}
