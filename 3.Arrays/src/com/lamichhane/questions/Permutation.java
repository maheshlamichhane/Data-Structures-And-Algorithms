package com.lamichhane.questions;

public class Permutation {

	public static void main(String[] args) {
		
		int[] arr1 = {6,5,3,4,2,1};
		int[] arr2 = {1,2,4,6,3,5};
		
		Permutation per = new Permutation();
		boolean bool = per.checkForPermutation(arr1, arr2);
		System.out.println(bool);

	}
	
	public boolean checkForPermutation(int array1[],int array2[]) {
		
		if(array1.length != array2.length) {
			return false;
		}
		int product1 = 1;
		int sum1 = 0;
		int product2 = 1;
		int sum2 = 0;
		
		for(int i=0; i<array1.length; i++) {
			product1*=array1[i];
			sum1+=array1[i];
			product2*=array2[i];
			sum2+= array2[i];
		}
		
		if(product1 == product2 && sum1 == sum2) {
			return true;
		}
		return false;
	}

}
