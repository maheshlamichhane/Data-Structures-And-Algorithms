package com.lamichhane.questions;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,7,8,9};
		MissingNumber number = new MissingNumber();
		number.findMissingNumber(array);

	}
	
	public void findMissingNumber(int[] array) {
		int sum1=0;
		for(int i=0; i<array.length;i++) {
			sum1+=array[i];
		}
		
		int sum2 = (9*10)/2;
		System.out.println("Missing number is="+(sum2-sum1));
	}

}
