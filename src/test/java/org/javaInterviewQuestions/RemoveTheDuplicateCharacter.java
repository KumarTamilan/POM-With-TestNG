package org.javaInterviewQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveTheDuplicateCharacter {

	public static void main(String[] args) {
		String s = "Java";
		
		StringBuilder sb = new StringBuilder();
		Set<Character>set = new LinkedHashSet();
		
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Character ch : set) {
			sb.append(ch);
		}
		System.out.println(sb);
	}
}
