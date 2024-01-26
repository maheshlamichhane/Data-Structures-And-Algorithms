package com.lamichhane.questions;

public class UniqueArrayCheck {

	public static void main(String[] args) {
		
		UniqueArrayCheck unique = new UniqueArrayCheck();
		int[] array = {1,2,4,5};
		unique.checkUnique(array);

	}
	
	public void checkUnique(int[] array) {
		boolean unique = true;
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				if(array[i] == array[j]) {
					unique = false;
					break;
				}
			}
		}
		
		System.out.println("Unique="+unique);
	}

}
