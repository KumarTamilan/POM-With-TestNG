package org.javaInterviewQuestions;

public class ReplaceTheCharacter {

	public static void main(String[] args) {
		String s = "Hi Kumara! How Are You?";
		
		String replace = s.replaceAll("Kumara!","Harsha and Rithi");
		System.out.println(replace);
	}
}
