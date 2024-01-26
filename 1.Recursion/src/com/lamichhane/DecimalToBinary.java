package com.lamichhane;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		//Decimal to binary without recursion 
		DecimalToBinary decimalToBinary = new DecimalToBinary();
		System.out.println(decimalToBinary.getBinaryString(10));
		
		// decimal to binary with recursion
		System.out.println(decimalToBinary.getBinaryStringWithIteration(10));
	}

	public StringBuffer getBinaryString(int n) {
		StringBuffer buffer = new StringBuffer();
		while (n != 0) {
			buffer.append(n % 2);
			n = n / 2;
		}
		return buffer.reverse();
	}
	
	public int getBinaryStringWithIteration(int n) {
		if(n==0) {
			return 0;
		}
		return n%2 + 10*getBinaryStringWithIteration(n/2);
	}

}
