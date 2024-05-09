package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		
		List<String> list1 = List.of("kavita","sneha","sana","hema");
		List<String>names = list1.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
		System.out.println(names);
		
  }

}
