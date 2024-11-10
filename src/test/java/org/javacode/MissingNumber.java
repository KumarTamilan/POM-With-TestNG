package org.javacode;

public class MissingNumber {

	public static void main(String[] args) {
		int z[] = { 1, 2, 4, 5 };

		int sum1 = 0;
		for (int i = 0; i < z.length; i++) {
			sum1 = sum1 + z[i];
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int i=1; i<=5; i++) {
			sum2 = sum2+i;
		}
		System.out.println(sum2);
		int sum = sum2-sum1;
		System.out.println(sum);

	}
}
