package com.lamichhane.sort.heap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,3,2,7,7,5,8,4,1,2,9,7,8,11};
		
		HeapSort heapSort = new HeapSort(array);
		HeapSort.sort();
		HeapSort.printArray();
	}

}
