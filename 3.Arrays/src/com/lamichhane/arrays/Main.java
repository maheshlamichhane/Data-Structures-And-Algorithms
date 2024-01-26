package com.lamichhane.arrays;

public class Main {

	public static void main(String[] args) {
		
		//Creating Array
		OneDimensionalArray array = new OneDimensionalArray(5);
		
		//Adding element into array
		array.addElement(0, 10);
		array.addElement(1, 20);
		array.addElement(2, 30);
		array.addElement(3, 40);
		array.addElement(4, 50);
		
		//Traversing array
		array.traverseArray();
		
		//search array
		array.searchInArray(20);
		

	}

}
