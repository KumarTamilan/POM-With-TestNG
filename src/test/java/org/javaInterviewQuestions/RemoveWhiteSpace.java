package org.javaInterviewQuestions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s = "   K  u  m   r   a   n   ";
		
		String  removeWhiteSpaces = s.replaceAll("\\s","");
		System.out.println(removeWhiteSpaces);		
	}
}
