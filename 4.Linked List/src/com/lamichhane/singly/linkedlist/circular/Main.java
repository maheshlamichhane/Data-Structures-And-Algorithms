package com.lamichhane.singly.linkedlist.circular;

public class Main {

	public static void main(String[] args) {
		
		//Creating Circular Linked List
		CircularLinkedList cll = new CircularLinkedList();
		cll.createCircularLinkedList(4);
//		System.out.println(cll.head.value);
		
		//Inserting in Circular Linked List at beginning
		cll.insertCircularSinglyLinkedList(10, 0);
//		System.out.println(cll.head.value);
		
		//Inserting in circular linked list at ending
		cll.insertCircularSinglyLinkedList(20, 2);
//		System.out.println(cll.tail.value);
		
		
		//Inserting in middle of the linked list
		cll.insertCircularSinglyLinkedList(30, 2);
//		System.out.println(cll.head.next.next.value);
		
		// Traversing Circular Singly Linked List
		cll.traverseCircularSinglyLinkedList();
		
		//Search node in Circular Singly Linked List
		cll.searchNode(20);
		
		//Delete from first in circular singly linked list
//		cll.deleteNode(0);
//		cll.traverseCircularSinglyLinkedList();
		
		//Delete from end in circular singly linked list
//		cll.deleteNode(3);
//		cll.traverseCircularSinglyLinkedList();
		
		//Delete from middle in circular singly linked list
//		cll.deleteNode(1);
//		cll.traverseCircularSinglyLinkedList();
		
		
		//Delte Entire Circular Singly Linked List
//		cll.deleteCSLL();
//		cll.traverseCircularSinglyLinkedList();
		
		
	}

}
