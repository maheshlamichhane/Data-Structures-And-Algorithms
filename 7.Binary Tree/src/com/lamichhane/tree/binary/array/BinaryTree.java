package com.lamichhane.tree.binary.array;

public class BinaryTree {

	String[] arr;
	int lastUsedIndex;

	// Creating treee tc:O(1) an d sc: O(N)
	public BinaryTree(int size) {
		arr = new String[size + 1];
		this.lastUsedIndex = 0;
		System.out.println("Blank Tree of size " + size + " has been created");
	}

	// Is full
	public boolean isFull() {
		if (arr.length - 1 == lastUsedIndex) {
			return true;
		} else {
			return false;
		}
	}

	// Insert method tc: O(1) and sc:O(1)
	public void insert(String value) {
		if (!isFull()) {
			arr[lastUsedIndex + 1] = value;
			lastUsedIndex++;
			System.out.println("The value of " + value + " has been inserted");
		} else {
			System.out.println("The Binary Tree is full");
		}
	}

	// PreOrder Traversal tc:O(N),sc:O(N)
	public void preOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " ");
		preOrder(index * 2);
		preOrder((index * 2) + 1);
	}

	// InOrder Traversal tc:O(N),sc:O(N)
	public void inOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}

		inOrder(index * 2);
		System.out.print(arr[index] + " ");
		inOrder((index * 2) + 1);
	}

	// PostOrder Traversal tc:O(N),sc:O(N)
	public void postOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}

		postOrder(index * 2);
		postOrder((index * 2) + 1);
		System.out.print(arr[index] + " ");
	}

	//LevelOrder Traversal tc:O(N) sc:O(1)
	public void levelOrder(int index) {
		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//Search element tc:O(N) and sc:O(1)
	public int search(String value) {
		for(int i=1; i<=lastUsedIndex;i++) {
			if(arr[i] == value) {
				System.out.println(value+" exists at the location: "+i);
				return i;
			}
		}
		System.out.println("The value does not exists in binary tree");
		return -1;
	}
	
	//Delete node from binary tree tc: O(N) sc:O(1)
	public void delete(String value) {
		int location = search(value);
		if(location == -1) {
			return;
		}
		else {
			arr[location] = arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("The node successfully deleted");
		}
	}
	
	//Delete binary tree tc: O(1), sc:O(1)
	public void deleteBinaryTree() {
		try {
			arr = null;
			System.out.println("The BT has been successfully deleted");
		}
		catch(Exception e) {
			System.out.println("There was an error deleting the tree");
		}
	}

}
