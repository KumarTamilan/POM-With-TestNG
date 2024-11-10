package org.javacode;

public class ChildInterface implements InterDemo1,InterDemo2{
	//MULTIPLE INHERITANCE & HYBRID INHERITANCE :
	@Override
	public void m1() {
		System.out.println("InterDemo is  a First Parent Class");}
	@Override
	public void m3() {
		System.out.println("InterDemo1 is  a Second Parent Class");}
	@Override
	public void m2() {
		System.out.println("InterDemo2 is  a Third Parent Class");}
	public static void m4() {
		System.out.println("ChildInterface is a Child Class");}
	public static void main(String[] args) {
		ChildInterface c = new ChildInterface();
		c.m1();
		c.m2();
		c.m3();
		m4();
	}
	
	
	
	
	
	
	
	

}
