package com.lamichhane.sort.quick;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,3,2,7,7,5,8,4,1,2,9,7,8,11};
		QuickSort.quickSort(array, 0, array.length-1);
		QuickSort.printArray(array);
	}

}
