package com.lamichhane;

public class GCD {

	public static void main(String[] args) {

		GCD gcd = new GCD();
		System.out.println(gcd.getGCD(32, 12));

		// solution without recursion
		System.out.println(gcd.getGCDForIteration(32, 12));

	}

	public int getGCD(int x, int y) {
		if(x<0 || y<0) {
			return -1;
		}
		if (y == 0) {
			return x;
		}
		return getGCD(y, x % y);
	}

	public int getGCDForIteration(int x, int y) {
		if(x<0 || y<0) {
			return -1;
		}
		if (y == 0) {
			return x;
		}

		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;

	}

}
