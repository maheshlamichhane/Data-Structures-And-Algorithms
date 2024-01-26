package com.lamichhane.binary.search.tree;

public class Main {

	public static void main(String args[]) {
		BinarySearchTree newBST = new BinarySearchTree();
		
		//Insert in BST
		newBST.insert(70);
		newBST.insert(50);
		newBST.insert(90);
		newBST.insert(30);
		newBST.insert(60);
		newBST.insert(80);
		newBST.insert(100);
		newBST.insert(20);
		newBST.insert(40);
		
		System.out.println(newBST.root);
		
		//PreOrder Traversal
		newBST.preOrder(newBST.root);
	}
}
