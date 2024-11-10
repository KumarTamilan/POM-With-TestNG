package org.javaInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveTheDuplicateString {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("java");
		list.add("selenium");
		list.add("selenium");
		list.add("java");
		list.add("maven");
		list.add("maven");
		
		Set<String> set = new HashSet(list);
		List<String> list1 = new ArrayList(set);
		System.out.println(list1);
		
	}
	
	
}
