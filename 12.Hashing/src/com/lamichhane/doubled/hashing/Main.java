package com.lamichhane.doubled.hashing;

import com.lamichhane.linear.probing.LinearProbing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleHashing doubleHashing = new DoubleHashing(13);
		doubleHashing.insertKeyInHashTable("The");
		doubleHashing.insertKeyInHashTable("quick");
		doubleHashing.insertKeyInHashTable("brown");
		doubleHashing.insertKeyInHashTable("fox");
		doubleHashing.insertKeyInHashTable("over");
		doubleHashing.displayHashTable();
	

	}

}
