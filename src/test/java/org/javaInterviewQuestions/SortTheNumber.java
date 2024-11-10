package org.javaInterviewQuestions;

import java.util.Arrays;

public class SortTheNumber {

	public static void main(String [] args) {
	
		int [] a = {0,9,8,9,8,7,7,6,6,5,5,4,4,3,3,2,2,1,0,1};
		
		Arrays.sort(a);
		
		for(int  z : a) {
			System.out.print(z);
		}
	}
}
