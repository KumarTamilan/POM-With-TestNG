package org.javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String s = "cucumber";
		
		Map<Character,Integer> map = new HashMap();
		char[] charArray = s.toCharArray();
		
		for(Character ch : charArray) {
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}else {
			map.put(ch,map.get(ch)+1);
			}
		}
		System.out.println(map);
	}
}
