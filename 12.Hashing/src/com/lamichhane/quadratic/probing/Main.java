package com.lamichhane.quadratic.probing;

import com.lamichhane.linear.probing.LinearProbing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuadraticProbing quadraticProbing = new QuadraticProbing(13);
		quadraticProbing.insertKeyInHashTable("The");
		quadraticProbing.insertKeyInHashTable("quick");
		quadraticProbing.insertKeyInHashTable("brown");
		quadraticProbing.insertKeyInHashTable("fox");
		quadraticProbing.insertKeyInHashTable("over");
		quadraticProbing.displayHashTable();
	

	}

}
