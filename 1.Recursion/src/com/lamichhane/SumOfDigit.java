package com.lamichhane;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigit sumOfDigit = new SumOfDigit();
		System.out.println(sumOfDigit.sumOfDigits(789));
		
		//without recursion
		System.out.println(sumOfDigit.sumOfDigits(789));
		
		
		

	}
	
	public int sumOfDigits(int n) {
		if(n<0) {
			return 0;
		}
		if(n == 0) {
			return 0;
		}
		return n % 10 + sumOfDigits(n/10);
	}
	
	public int sumOfDigitWithIteration(int n) {
		int sum = 0;
		if(n<0) {
			return 0;
		}
		while(n<=0) {
			sum = sum + n%10;
			n = n/10;
		}
		return sum;
	}

}
