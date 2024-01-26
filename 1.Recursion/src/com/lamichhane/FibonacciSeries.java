package com.lamichhane;

public class FibonacciSeries {

	public static void main(String[] args) {

		FibonacciSeries series = new FibonacciSeries();
		System.out.println(series.fibonacci(3));

		// without recursion
		System.out.println(series.fibonacciWithoutRecursion(3));

	}

	public int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int fibonacciWithoutRecursion(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}

		int prev = 0;
		int curr = 1;
		int result = 0;

		for (int i = 2; i <= n; i++) {
			result = prev + curr;
			prev = curr;
			curr = result;
		}

		return result;
	}
}
