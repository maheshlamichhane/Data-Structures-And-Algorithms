package com.lamichhane.direct.chaining;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectChaining directChaining = new DirectChaining(13);
		directChaining.insertHashTable("The");
		directChaining.insertHashTable("quick");
		directChaining.insertHashTable("brown");
		directChaining.insertHashTable("fox");
		directChaining.insertHashTable("over");
		
		directChaining.displayHashTable();
		
//		System.out.println(directChaining.searchHashTable("fox"));
//		directChaining.deleteKeyHashTable("foxx");
//		directChaining.displayHashTable();
		

	}

}
