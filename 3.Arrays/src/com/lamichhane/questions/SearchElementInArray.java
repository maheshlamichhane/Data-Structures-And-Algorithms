package com.lamichhane.questions;

public class SearchElementInArray {

	public static void main(String[] args) {
		SearchElementInArray search = new SearchElementInArray();
		int[] array = {1,2,4,5,2,7};
		try {
			search.searchElement(array, 2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void searchElement(int array[],int value) throws Exception {
		for(int i=0; i<array.length;i++) {
			if(array[i] == value) {
				System.out.println("Element Found in index="+i);
				return;
			}
		}
		throw new Exception("Element not found");
	}

}
