package com.velocity.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("satyam","sachin","amol","rahul");
		
	
		for(String str:list) {
			System.out.println(str);
		}
		
}
}