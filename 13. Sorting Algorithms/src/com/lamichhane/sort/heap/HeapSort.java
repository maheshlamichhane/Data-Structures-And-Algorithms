package com.lamichhane.sort.heap;

public class HeapSort {
	
	
	static int[] arr = null;
	
	public HeapSort(int[] arr) {
		this.arr = arr;
	}
	
	public static void sort() {
		BinaryHeap bh = new BinaryHeap(arr.length);
		for(int i=0; i<arr.length;i++) {
			bh.insert(arr[i],"Min");
		}
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = bh.extractHeadOfBP("Min");
		}
	}
	
	
	
	

	public static void printArray() {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}
