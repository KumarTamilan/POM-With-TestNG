package org.javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortTheString {
	public void sortTheString() {
		String[] s = { "Eagle", "Dog", "Cat", "Book", "Apple" };

		Arrays.sort(s);
		for (String ss : s) {
			System.out.print(ss + ",");
		}
		System.out.println();
	}
	public void sortTheString2() {
		

		List<Integer> list = Arrays.asList(122,122,233,233,344,344,455,455,566,566,677,677,788,899 );

//		list.add("Eagle");
//		list.add("Dog");
//		list.add("Cat");
//		list.add("Book");
//		list.add("Apple");
		Set<String> set = new LinkedHashSet(list);
		//List<String> list1 = new ArrayList(set);
		System.out.println(set);
	}
	public static void main(String[] args) {
		SortTheString s = new SortTheString();
		s.sortTheString();
		s.sortTheString2();
	}
}
