package org.javacode;

public class ConstructorDemo {

	// 3.A method can be call from with in another Method True OR False ? How ?
	//      -Using this. Keyword [OR] Directly we can access from one method to another
	//      method.
	// 	 -Using this. keyword a variable can be we can access.
	// 	 -This. means Current class Instance [OR] current class Property.
	// 	 -This. keyword only works with Instance method OR instance variable.
	//		 -A method cannot be call from another static method.
	// 4.A Constructor can be call from with in another Constructor True OR False ?
	// How ?
	// 	 -Using this() Keyword.

	int a = 10; // instance Globel variable.
	static int i = 20; // Static globel variable.

	public void m1() { // Normal Instance Method
		int a = 30;
		int i = 40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(i);
		System.out.println(this.i);
	}
	//6.A Constructor can be call from anothor Instance method True OR False ? How ? 
	public  void m2() { // Static Method
		m1();
		new ConstructorDemo();
		new ConstructorDemo(100);
	}
	public ConstructorDemo() { // Non-Parameterized Cons
		System.out.println("Non-Parameterized Constructor");
	}
	public ConstructorDemo(int a) { // Parameterized Constructor
		System.out.println(a);
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		cd.m2();
	}
}
