package org.javacode;

public class StringMethods {

	// What is mean by exactly in String?
		// 1.String is a Sequential of Characters in double quotes.
		// 2.In Java String is a IMMUTABLE Object Which means it is a constant and once
		// created after cannot be changed.
		// 3.String Java.lang package.
		// 4.Interface means only unimplemented methods.
		// 5.String class implements serializable comparable and Charsequence
		// interfaces.
		private static void stringMethods() {

			String name = "Kumaranharshanth";
			String h = "u";
			int number = 12345678;
			

			int compareTo = name.compareTo(h);
			System.out.println(compareTo);
			// It is returns character value in particular index
			char charAt = name.charAt(6);
			System.out.println(charAt);

			// It's returns total characters count
			int length = name.length();
			System.out.println(length);

			// It checks equality of string with the given object
			boolean equals = name.equals("kumaranharshanth");
			System.out.println(equals);

			// It checks equality of string with the given object and without case sensitive
			boolean equalsIgnoreCase = name.equalsIgnoreCase("KUMARANHARSHANTh");
			System.out.println(equalsIgnoreCase);

			// It checks given string is empty or not
			boolean empty = name.isEmpty();
			System.out.println(empty);

			// It checks the true or false based on given value is present or not and also
			// case sensitive.
			boolean contains = name.contains("M");
			System.out.println(contains);

			// Takes a particular portion in a given string
			String substring = name.substring(4);
			System.out.println(substring);

			// It takes a particular portion in a given string and take a middle of the
			// value
			String substring2 = name.substring(1, 8);
			System.out.println(substring2);

			// Appends the string to the given string
			String concat = name.concat("Ritvik");
			System.out.println(concat);

			// It is replace the existing charcter with given charecter
			String replace = name.replace("n", "N");
			System.out.println(replace);

			// It's Replced in existing charcters with the given charcters
			String replace2 = name.replace("Kumaranharshanth", "Hemaharshanth");
			System.out.println(replace2);

			// It replaced with all characters
			String replaceAll = name.replaceAll(replace, replace2);
			System.out.println(replaceAll);

			// It's find the position of character with in given string
			int indexOf = name.indexOf("h");
			System.out.println("First inndexOf :" + indexOf);
			System.out.println("Second indexOf :" + name.indexOf('u'));
			System.out.println("Third indexOf :" + name.indexOf('a', 0));
			System.out.println("Fourth indexOf :" + name.indexOf("r", 0));
			System.out.println("lastIndexOf :" + name.lastIndexOf("a"));
			System.out.println("lastIndexOf :" + name.lastIndexOf("h", 20));

			// It's convert the given integer value to string
			String valueOf = String.valueOf(number);
			System.out.println(valueOf);

			// It change to lowerCase to upperCase
			String upperCase = name.toUpperCase();
			System.out.println(upperCase);

			// It change to upperCase to lowerCase
			String lowerCase = upperCase.toLowerCase();
			System.out.println(lowerCase);

			// It's joined with given delimeter
			String s = "-";
			String[] s1 = { "Java", "Selenium", "Maven", "DataDriven", "Testng", "Cucumber" };
			String join = String.join(s, s1);
			System.out.println(join);
			System.out.println(String.join("@", "13", "01", "2024"));
		}

		private static void split() {

			// It'ss remove in all special charecters
			String s = "H!i@,K#u$m%a^r&a*n.H!o@w# A@r#e% Y!o@u?";
			String[] split = s.split("!");
			for (String oneByOne : split) {
				System.out.print(oneByOne);

			}
			System.out.println();
		}

		private static void split2() {
			String oneByOne = "Hi@,K#u$m%a^r&a*n.Ho@w# A@r#e% Yo@u?";
			String[] split2 = oneByOne.split("@");
			for (String oneByOne2 : split2) {
				System.out.print(oneByOne2);
			}
			System.out.println();
		}

		private static void split3() {
			String s1 = "Hi,K#u$m%a^r&a*n.How# Ar#e% You?";
			String[] split = s1.split("#");
			for (String sh : split) {
				System.out.print(sh);

			}
			System.out.println();
		}

		private static void split4() {
			String s2 = "Hi,Ku%m%a%r%a%n.How Are% You?";
			String[] split = s2.split("%");
			for (String s : split) {
				System.out.print(s);
			}
		}

		private static void toCharArray() {
			String s = "Kumaran";
			char[] charArray = s.toCharArray();
			for (int i = charArray.length - 1; i >= 0; i--) {
				System.out.print(charArray[i]);
			}
			System.out.println();
		}

		private static void charAt() {
			String s = "Karuppannan";
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}

		private static void stringBufferUsingStringreverse() {
			String s = "Kumaran";
			StringBuffer sb = new StringBuffer(s);
			System.out.println(sb.reverse());
		}

		private static void stringBuilderUsingStringReverse() {
			String s = "Kumaran Karuppannan";
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse());
		}

		// VERY VERY IMPORTANT:
		private static void howToReverseEachWord() {
			String s = "Kumaran Harsh Rithvik Amutha";
			String[] split = s.split(" ");
			for (String sp : split) {
				String revword = "";
				for (int i = sp.length() - 1; i >= 0; i--) {
					revword = revword + sp.charAt(i);
					System.out.println(revword);
				}

			}
		}

		private static void howToReverseEachWord2() {
			String s = "Kumaran Harsh Rithvik Amutha";
			String[] split = s.split(" ");
			for (String sp : split) {
				String revword = "";
				for (int i = sp.length() - 1; i >= 0; i--) {
					revword = revword + sp.charAt(i);

				}
				System.out.print(revword + " ");
			}
		}

		private static void forLoop() {
			String s = "Kumaran";
			for (int i = 0; i <= 20; i++) {
				System.out.println(s);
			}
		}

		private static void forLoops() {
			for (int i = 110; i < 150; i++) {
				System.out.println(10);
			}
		}

		private static void nestedForLoop() {

			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("*     ");
				}
				System.out.println();
			}
		}

		private static void increasingTriangle() {
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("K    ");

				}
				System.out.println();
				// System.out.println();
			}
			System.out.println();
		}

		private static void decreasingTriangle() {

			for (int i = 1; i <= 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print("K    ");
				}
				System.out.println();
			}

		}

		private static void leftSideTriangle() {

			for (int i = 1; i <= 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print("      ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("K    ");
				}
				System.out.println();
			}
		}

		private static void rightSideTriangle() {

			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("      ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("K    ");
				}
				System.out.println();
			}
		}

		private static void hillPattern() {

			for (int i = 1; i <= 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print("      ");
				}
				for (int j = 1; j < i; j++) {
					System.out.print("K    ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("K    ");
				}
				System.out.println();
			}
		}

		private static void reverseHillPattern() {

			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("      ");
				}
				for (int j = i; j < 10; j++) {
					System.out.print("K    ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("K    ");
				}
				System.out.println();
			}
		}

		private static void hillAndReverseHillPattern() {

			for (int i = 1; i < 5; i++) {
				for (int j = i; j <= 5; j++) {
					System.out.print("    ");
				}
				for (int j = 1; j < i; j++) {
					System.out.print("1  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("2  ");
				}
				System.out.println();
			}
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("    ");
				}
				for (int j = i; j <= 5; j++) {
					System.out.print("3  ");
				}
				for (int j = i; j < 5; j++) {
					System.out.print("4  ");
				}
				System.out.println();
			}
		}

		private static void hillAndReverseHillPatteren2() {

			for (int i = 1; i < 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print("    ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("1  ");
				}
				for (int j = 1; j < i; j++) {
					System.out.print("2  ");
				}
				System.out.println();
			}
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("    ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("3  ");
				}
				for (int j = i; j < 10; j++) {
					System.out.print("4  ");
				}
				System.out.println();
			}
		}

		private static void butterfly2() {

			for (int i = 1; i <=10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("2  ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("    ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("    ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("3  ");
				}
				System.out.println();
			}
			for (int i = 1; i <= 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print("4  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("    ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("    ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("5  ");
				}
				System.out.println();
			}
		}

		private static void increaseAndDecreaseTriangle() {

			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("    ");
				}
				for (int j = i; j < 10; j++) {
					System.out.print("2  ");
				}
				for (int j = i; j <= 10; j++) {
					System.out.print("2  ");
				}
				System.out.println();
			}
			for (int i = 1; i <= 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print("    ");
				}
				for (int j = 1; j < i; j++) {
					System.out.print("2  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("2  ");
				}
				System.out.println();
			}
		}

		private static void numberPattern() {

			for (int i = 1; i <= 10; i++) {
				for (int j = i; j <= 10; j++) {
					System.out.print(j + "  ");
				}
				System.out.println();
			}
		}

		private static void numberPattern2() {

			for (int i = 1; i <= 1; i++) {
				for (int j = 100; j >= 90; j--)
					System.out.print(j + "  ");
			}
		}
		private void stringMethodss() {

			String a = "Kumaran";
		}
		

		public static void main(String[] args) {

			/*
			 * stringMethods(); split(); split2(); split3(); split4(); toCharArray();
			 * charAt(); stringBufferUsingStringreverse();
			 * stringBuilderUsingStringReverse(); howToReverseEachWord();
			 * howToReverseEachWord2(); forLoop(); forLoops(); nestedForLoop();
			 * increasingTriangle(); decreasingTriangle(); leftSideTriangle();
			 * rightSideTriangle();
			 */
			hillPattern();
			//reverseHillPattern();
			//hillAndReverseHillPattern();
			//hillAndReverseHillPatteren2();
			butterfly2();	
			increaseAndDecreaseTriangle();
			numberPattern();

			numberPattern2();

		}
}
