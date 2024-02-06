package com.lamichhane.linear.probing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearProbing linearProbing = new LinearProbing(13);
		linearProbing.insertInHashTable("The");
		linearProbing.insertInHashTable("quick");
		linearProbing.insertInHashTable("brown");
		linearProbing.insertInHashTable("fox");
		linearProbing.insertInHashTable("over");
		
//		linearProbing.displayHashTable();
		
		linearProbing.searchHashTable("over");
		linearProbing.displayHashTable();
		linearProbing.deleteKeyHashTable("over");
		linearProbing.displayHashTable();

	}

}
