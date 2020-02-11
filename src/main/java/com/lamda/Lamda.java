package com.lamda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda {
	
	
	public void toArray(List<String> strList){
		
		String tempStr = strList.stream().findFirst().get();
		System.out.println("first data = " + tempStr);
		long count = strList.stream().filter(x -> x.equals("c")).count();
		System.out.println("'c' charter set count = " + count);
		
		List<String> strLists = strList.stream().filter(x -> x.equals("b")).collect(Collectors.toList());
		for (Iterator<String> iterator = strLists.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//strList.stream().collect(Collectors.groupingBy(x->x.level));
	}
	
	public static void main(String ...args) throws Exception {
		
		// SAMPLE
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		
		
		Lamda lamda = new Lamda();
		lamda.toArray(strList);
	}
}
