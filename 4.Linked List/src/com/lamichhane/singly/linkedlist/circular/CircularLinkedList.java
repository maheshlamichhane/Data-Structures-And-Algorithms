package com.lamichhane.singly.linkedlist.circular;

public class CircularLinkedList {
	public Node head;
	public Node tail;
	public int size;

	// Create Linked List
	public Node createCircularLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// Insertion In Linked List
	public void insertCircularSinglyLinkedList(int nodeValue, int location) {

		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			createCircularLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		} else if (location >= size) {
			tail.next = node;
			tail = node;
			node.next = head;
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}

	// Traverse Circular Singly Linked List
	public void traverseCircularSinglyLinkedList() {
		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
			System.out.println();
		} else {
			System.out.println("Circular Linked List Does Not Exists");
		}
	}
	
	//Search node in Circular Singly Linked List
	public boolean searchNode(int nodeValue) {
		
		if(head != null) {
			Node tempNode = head;
			for(int i=0; i<size;i++) {
				if(tempNode.value == nodeValue) {
					System.out.println("Found node at location: "+i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found");
		return false;
	}
	
	//Delete node from circular linked list
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("The CSLL does not exists!");
			return;
		}
		else if(location == 0) {
			head = head.next;
			tail.next = head;
			size--;
			if(size==0) {
				tail = null;
				head.next = null;
				head = null;
			}
		}
		else if(location >= size) {
			Node tempNode = head;
			for(int i=0; i<size-1;i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == head) {
				head.next = null;
				tail = head = null;
				size--;
				return;
			}
			tempNode.next = head;
			tail = tempNode;
			size--;
		}
		else {
			Node tempNode = head;
			for(int i=0; i<location-1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	//Delete Entire Circular Singly Linked List
	public void deleteCSLL() {
		if(head == null) {
			System.out.println("The CSLL does not exists!");
		}
		else {
			head = null;
			tail.next = null;
			tail = null;
			System.out.println("The CSLL has been deleted!");
		}
	}
	
	
	
	
	
	
	
	
}
