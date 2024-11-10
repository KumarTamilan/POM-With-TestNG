package org.javaInterviewQuestions;

public class RemoveTheSpecialCharacter {

	public void removeSpecialCharacter() {
		
		String s = "K@u!m$a&r@a&n%";
		
		String removeSpecialCharacter = s.replaceAll("[^a-zA-Z0-9]","");  
		System.out.println(removeSpecialCharacter);
	}
	public void removeSpecialCharacter2() {
		String s = "K1u2m3a4r5a6n7";
		
		String removeLetters = s.replaceAll("[^0-9]","");
		System.out.println(removeLetters);
	}
	public static void main(String[] args) {
		RemoveTheSpecialCharacter r = new RemoveTheSpecialCharacter();
		r.removeSpecialCharacter();
		r.removeSpecialCharacter2();
	}
}
