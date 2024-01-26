package com.lamichhane.doubly.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList dbList = new DoublyLinkedList();
		
		//Creating Doubly Linked List
		dbList.createDoublyLinkedList(10);
//		System.out.println(dbList.head.value);
//		System.out.println(dbList.tail.value);
		
		
		//Insertion at beginning of doubly linked list
		dbList.insertDLL(20, 0);
//		System.out.println(dbList.head.value);
		
		//Insertion at the end of doubly linked list
		dbList.insertDLL(30, 2);
//		System.out.println(dbList.head.next.next.value);
		
		//Insertion at the middle of the doubly linked list
		dbList.insertDLL(50, 1);
//		System.out.println(dbList.head.next.value);
		
		
		//Traversing doubly linked list from the beginning
		dbList.traverseDLL();
		
		//Traversing doubly linked list from the end
//		dbList.traverseInReverseDLL();
		
		//Searching an element from doubly linked list
		dbList.searchInDLL(60);
		
		//Deleting a node from start position 
//		dbList.deleteNodeDLL(0);
//		dbList.traverseDLL();
		
		//Deleting a node from last position
//		dbList.deleteNodeDLL(3);
//		dbList.traverseDLL();
		
		//Deleting a node from any position
//		dbList.deleteNodeDLL(2);
//		dbList.traverseDLL();
		
		//Deleting entire doubly linked list
		dbList.deleteDLL();

	}

}
