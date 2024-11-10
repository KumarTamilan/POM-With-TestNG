package org.javacode;

public class StringMethods2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Welcome");
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		StringBuffer append = sb.append(sb1);
		System.out.println(append.hashCode());
		System.out.println(sb);
		
	}
}
