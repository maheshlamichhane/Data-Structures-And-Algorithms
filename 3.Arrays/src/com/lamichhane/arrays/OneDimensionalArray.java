package com.lamichhane.arrays;

public class OneDimensionalArray {

	public int[] array;
	public int size;

	public OneDimensionalArray(int size) {
		this.size = size;
		array = new int[size];
	}

	public void addElement(int index,int value) {
		if(index > size-1 ) {
			System.out.println("Array is full");
		}
		else {
			array[index] = value;
		}
	}
	public void traverseArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void searchInArray(int valueToSearch) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valueToSearch) {
				System.out.println("Value is found at the index of " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found");
	}

	public void deleteValue(int valueToDeleteIndex) {
		try {
			array[valueToDeleteIndex] = Integer.MIN_VALUE;
			System.out.println("The value has been deleted successfully");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array");
		}
	}

}
