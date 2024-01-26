package com.lamichhane.doubly.linkedlist;

public class DoublyLinkedList {
	DoublyNode head;
	DoublyNode tail;
	int size;
	
	//Creating Doubly Linked List
	public DoublyNode createDoublyLinkedList(int nodeValue) {
		head = new DoublyNode();
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode;
		size=1;
		return head;
	}
	
	//Insertion in Doubly Linked List
	public void insertDLL(int nodeValue,int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		if(head == null) {
			createDoublyLinkedList(nodeValue);
			return;
		}
		else if(location == 0) {
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
		}
		else if(location >=size) {
			newNode.next = null;
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		else {
			DoublyNode tempNode = head;
			int index=0;
			while(index <location-1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.prev = tempNode;
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			newNode.next.prev = newNode; 
		}
		size++;
	}
	
	
	//Traversing the doubly linked list from the beginning
	public void traverseDLL() {
		if(head != null) {
			DoublyNode tempNode = head;
			for(int i=0; i<size;i++) {
				System.out.print(tempNode.value);
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
		else {
			System.out.println("Doubly Linked List does not exists!");
		}
		System.out.println("\n");
	}
	
	//Traversing the doubly linked list from the end
	public void traverseInReverseDLL() {
		if(tail != null) {
			DoublyNode tempNode = tail;
			for(int i=0; i<size; i++) {
				System.out.print(tempNode.value);
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.prev;
			}
		}
		else {
			System.out.println("Doubly Linked List does not exists!");
		}
		System.out.println("\n");
	}
	
	
	//Serach node in doubly linked list
	public boolean searchInDLL(int nodeValue) {
		if(head !=null) {
			DoublyNode tempNode = head;
			for(int i=0; i<size;i++) {
				if(tempNode.value == nodeValue) {
					System.out.println("Element found at index="+i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("Element not found");
		return false;
	}
	
	//Deleting a node from doubly linked list
	public void deleteNodeDLL(int location) {
		if(head == null) {
			System.out.println("The DLL does not exists!");
			return;
		}
		else if(location == 0) {
			if(size == 1) {
				head = tail = null;
				size--;
				return;
			}
			else {
				head = head.next;
				head.prev = null;
				size--;
			}
		} else if(location >=size) {
			DoublyNode tempNode = tail.prev;
			if(size == 1) {
				head = tail = null;
				size--;
				return;
			}
			else {
				tempNode.next = null;
				tail = tempNode;
				size--;
			}
		} else {
			DoublyNode tempNode = head;
			for(int i=0; i<location-1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			tempNode.next.prev = tempNode;
			size--;
		}
	}
	
	//Deleting entire doubly linked list
	public void deleteDLL() {
		DoublyNode tempNode = head;
		for(int i=0; i<size;i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = null;
		tail = null;
		System.out.println("The DLL has been deleted!");
	}

	
}
