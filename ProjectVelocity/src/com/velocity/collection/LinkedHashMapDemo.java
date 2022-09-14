package com.velocity.collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
	map.put("102", "pune");
	map.put("104", "banglore");
	map.put("105", "wadsa");
	map.put("106", "mumbai");
	
	Set<String> set = map.keySet();
	for(String s:set) {
		System.out.print(s);
		System.out.println(map.get(s));
	}
	
}
}
