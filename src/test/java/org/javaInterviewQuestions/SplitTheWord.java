package org.javaInterviewQuestions;

public class SplitTheWord {

	public static void main(String[] args) {
		String s = "Hi Kumara How Are You?";
		
		String [] split = s.split(" ");
		int count = 0;
		
		for(String ss : split) {
			System.out.println(ss);
			count++;
		}
		System.out.println("Total word count : "+count);
	}
	
}

