package org.javacode;

public class Constructors {
	//4.A Constructor can be call from with in another
	//			Constructor True OR False ? How ?
	public Constructors() {
		this(10);
		System.out.println("Int value = 10");
	}
	public Constructors(int a) {
		this(4361.003F);
		System.out.println("float value = 4361.003");
	}
	public Constructors(float a) {
		this(10254467l);
		System.out.println("long value = 10254467");
	}
	public Constructors(long a) {
		this('S');
		System.out.println("Char value = 'S'");
	}
	public Constructors(char a) {
		this(true);
		System.out.println("Boolean value = true");
	}
	public Constructors(boolean a) {
		this(735643545d);
		System.out.println("Double value = 735643545");
	}
	public Constructors(double a) {
		
	}
	public static void main(String[] args) {
		new Constructors();
	}
}
