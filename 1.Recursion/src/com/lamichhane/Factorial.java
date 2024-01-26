package com.lamichhane;
public class Factorial {

	public static int getFactorialWithRecursion(int n) {

		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * getFactorialWithRecursion(n - 1);

	}

	public static int getFactorialWithoutRecursion(int n) {
		int mytotal = 1;
		for (int i = n; i >= 1; i--) {
			mytotal = mytotal * i;
		}
		return mytotal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// with recursion
		int sum = Factorial.getFactorialWithRecursion(0);
		System.out.println(sum);

		// without recursion
		int sum2 = Factorial.getFactorialWithoutRecursion(5);
		System.out.println(sum2);

	}

}
