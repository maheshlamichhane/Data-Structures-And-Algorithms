package com.lamichhane.tree.binary.array;

public class Main {
	
	public static void main(String args[]) {
		BinaryTree newBinaryTree = new BinaryTree(9);
		
		//Inserting node
		newBinaryTree.insert("N1");
		newBinaryTree.insert("N2");
		newBinaryTree.insert("N3");
		newBinaryTree.insert("N4");
		newBinaryTree.insert("N5");
		newBinaryTree.insert("N6");
		newBinaryTree.insert("N7");
		newBinaryTree.insert("N8");
		newBinaryTree.insert("N9");
		System.out.println();
		
		
		//PreOrder Traversal
		newBinaryTree.preOrder(1);
		System.out.println();
		
		//InOrder Traversal
		newBinaryTree.inOrder(1);
		System.out.println();
		
		//PostOrder Traversal
		newBinaryTree.postOrder(1);
		System.out.println();
		
		//LevelOrder Traversal
		newBinaryTree.levelOrder(1);
		System.out.println();
		
		//search element
		newBinaryTree.search("N97");
		
		//Delete node
		newBinaryTree.delete("N5");
		newBinaryTree.levelOrder(1);
		
		//Delete Binary treee
		newBinaryTree.deleteBinaryTree();
		newBinaryTree.levelOrder(1);
	}

	
}
