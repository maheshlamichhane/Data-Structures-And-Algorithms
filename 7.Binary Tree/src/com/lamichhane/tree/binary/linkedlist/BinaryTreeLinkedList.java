package com.lamichhane.tree.binary.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
	BinaryNode root;
	
	
	//tc 1 sc 1
	public BinaryTreeLinkedList() {
		this.root = null;
	} 
	
	//PreOrder Traversal  tc n/2 sc  n/2 ---> O(N) for both
	void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//Post Order Traversal  O(N) for both
	void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
	}
	
	//InOrder Traversal O(N) for both
	void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
	
	//Level Order O(N) for both
	void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.value+" ");
			if(presentNode.left != null) {
				queue.add(presentNode.left);
			} 
			if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
				
	}
	
	//Search Method with level order tc O(N) sc O(N)
	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.value == value) {
				System.out.println("The value-"+value+" is found in Tree");
				return;
			}
			else {
				if(presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
		}
		
		System.out.println("The value-"+value+" is not found in Tree");
		
	}
	
	
	//Inserting in binary tree tc:O(N),sc:O(N)
	public void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if(root == null) {
			root = newNode;
			System.out.println("Inserted new node at Root");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.left == null) {
				presentNode.left = newNode;
				System.out.println("Successfully Inserted");
				break;
			}
			else if(presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println("Successfully Inserted");
				break;
			}
			else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}
	}
	
	//Delete in Binary Tree
	
	//Get Deepest node
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		return presentNode;
	}
	
	//Delete Deepest Node
	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode,presentNode = null;
		while(!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if(presentNode.left == null) {
				previousNode.right = null;
				return;
			}
			else if(presentNode.right == null) {
				presentNode.left = null;
				return;
			}
				queue.add(presentNode.left);
				queue.add(presentNode.right);
		}
	}
	
	//Delete Given Node tc:O(N),sc:O(N)
	public void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.value == value) {
				presentNode.value = getDeepestNode().value;
				deleteDeepestNode();
				System.out.println("The node is deleted!");
				return;
			}
			else {
				if(presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
			
		}
		
		System.out.println("The node does not exists in the binary tree");
	}
	
	//Delete Entire binay tree tc O(1),sc O(1)
	public void deleteBinaryTree() {
		root = null;
		System.out.println("Binary Tree Deleted Successfully");
	}
	
	
	
}
