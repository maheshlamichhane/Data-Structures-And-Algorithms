package com.lamichhane.questions;

public class ProductOfMaximumNums {

	public static void main(String[] args) {
		
		ProductOfMaximumNums nums = new ProductOfMaximumNums();
		int[] array = {1,4,6,7,3,9};
		nums.findProductOfMaximumNums(array);
		

	}
	
	public void findProductOfMaximumNums(int array[]) {
		int maxSum = 0;
		String pairs="";
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				if(array[i] * array[j] > maxSum) {
					maxSum = array[i]*array[j];
					pairs = array[i]+" "+array[j];
				}
			}
		}
		System.out.println("Maximum numbers sum ="+maxSum);
		System.out.println("Pairs="+pairs);
	}

}
