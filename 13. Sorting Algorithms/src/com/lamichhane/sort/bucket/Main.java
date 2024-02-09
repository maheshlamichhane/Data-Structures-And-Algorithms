package com.lamichhane.sort.bucket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[] = {9,7,5,4,2,1,3,6,8};
		BucketSort bs = new BucketSort(arr);
		bs.printArray();
		bs.bucketSort();
		bs.printArray();
		
		
	

	}

}
