package com.lamichhane.questions;

public class PairSum {

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,8,9};
		PairSum pair = new PairSum();
		pair.pairSum(3, array);
		

	}
	
	public void pairSum(int value,int array[]) {
		for(int i=0; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j] == value) {
					System.out.println("The pair element which equals to "+value+" is "+array[i]+","+array[j]);
				}
			}
		}
	}

}
