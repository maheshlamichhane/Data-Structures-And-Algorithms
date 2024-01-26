package com.lamichhane.tree.binary.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		BinaryTreeLinkedList binaryTreeLinkedList = new BinaryTreeLinkedList();
		binaryTreeLinkedList.insert("N1");
		binaryTreeLinkedList.insert("N2");
		binaryTreeLinkedList.insert("N3");
		binaryTreeLinkedList.insert("N4");
		binaryTreeLinkedList.insert("N5");
		binaryTreeLinkedList.insert("N6");
		
		
		//Deleting node
		binaryTreeLinkedList.levelOrder();
		System.out.println();
		binaryTreeLinkedList.deleteNode("N3");
		binaryTreeLinkedList.levelOrder();
		
//		System.out.println(binaryTreeLinkedList.getDeepestNode().value);
		
	
//		BinaryNode n1 = new BinaryNode();
//		n1.value = "N1";
//		
//		BinaryNode n2 = new BinaryNode();
//		n2.value = "N2";
//		BinaryNode n3 = new BinaryNode();
//		n3.value = "N3";
//		n1.left = n2;
//		n1.right = n3;
//		
//		BinaryNode n4 = new BinaryNode();
//		n4.value = "N4";
//		BinaryNode n5 = new BinaryNode();
//		n5.value = "N5";
//		n2.left = n4;
//		n2.right = n5;
//		BinaryNode n6 = new BinaryNode();
//		n6.value = "N6";
//		BinaryNode n7 = new BinaryNode();
//		n7.value = "N7";
//		n3.left = n6;
//		n3.right = n7;
//		BinaryNode n8 = new BinaryNode();
//		n8.value = "N8";
//		BinaryNode n9 = new BinaryNode();
//		n9.value = "N9";
//		n4.left = n8;
//		n4.right = n9;
		
//		binaryTreeLinkedList.preOrder(n1);
		
//		binaryTreeLinkedList.root = n1;
//		binaryTreeLinkedList.postOrder(binaryTreeLinkedList.root);
		
//		binaryTreeLinkedList.inOrder(n1);
		
//		binaryTreeLinkedList.levelOrder();
		
//		binaryTreeLinkedList.search("N8");
		
		
		

	}

}
