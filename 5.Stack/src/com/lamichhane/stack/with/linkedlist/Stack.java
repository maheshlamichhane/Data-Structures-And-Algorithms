package com.lamichhane.stack.with.linkedlist;

public class Stack {

	public Node head;
	public Node tail;
	public int size;

	//Create a Stack
	public Node createStack(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	//Add a node in Stack
	public void push(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			createStack(nodeValue);
			return;
		}
		node.next = head;
		head = node;
		size++;
	}

	//Traverse a node in Stack
	public void traverseStack() {
		if (isEmpty()) {
			System.out.println("Stack does not exists!");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("\n");
	}

	// Serach for a node in Stack
	int peek(int nodeValue) {
		if (head != null) {
			Node tempNode = head;
			return tempNode.value;
//			for (int i = 0; i < size; i++) {
//				if (tempNode.value == nodeValue) {
//					System.out.println("Found the node at location: " + i + "\n");
//					return true;
//				}
//				tempNode = tempNode.next;
//			}
		}
		System.out.print("Node not found! ");
		return -1;
	}

	// delete a node in Stack
	public void pop() {
		if (isEmpty()) {
			System.out.println("The Stack does not exits");
			return;
		}
			head = head.next;
			size--;
			if (size == 0) {
				tail = null;
			}
 
	}

	// Delete Entire Stack
	public void deleteStack() {
		head = null;
		System.out.println("The Stack deleted successfully");
	}
	
	//Check Stack is empty or not
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}

}
