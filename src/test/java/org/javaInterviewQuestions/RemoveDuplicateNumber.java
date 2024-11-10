package org.javaInterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		int [] a = {9,9,8,8,7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0};
		
		Set<Integer>set = new LinkedHashSet();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		Integer [] b = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
}
}
