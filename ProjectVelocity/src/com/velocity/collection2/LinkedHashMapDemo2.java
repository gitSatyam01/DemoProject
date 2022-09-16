package com.velocity.collection2;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo2 {
public static void main(String[] args) {
	LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
	map.put("1 ", "pune");
	map.put("2 ", "banglore");
	map.put("3 ", "wadsa");
	map.put("4 ", "mumbai");
	
	Set<String> set = map.keySet();
	for(String s:set) {
		System.out.print(s);
		System.out.println(map.get(s));
	}
	
	
	System.err.println("i made changes");
}
}
