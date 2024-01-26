package com.lamichhane.doubly.linkedlist.circular;

public class Main {

	public static void main(String[] args) {
		
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		
		//Creating doubly circular linked list
		list.createDoublyCircularLinkedList(5);
//		System.out.println(list.head.value);
		
		//Inserting from beginning from the circular doubly linked list;
		list.insertNode(0, 0);
//		System.out.println(list.head.value);
		
		//Inserting from end of the circular doubly linked list
		list.insertNode(10, 2);
//		System.out.println(list.head.next.next.value);
		
		//Inserting from anywhere of the circular doubly linked list
		list.insertNode(88, 1);
//		System.out.println(list.head.next.value);
		
		//Traversing the circular doubly linked list from head
		list.traverseCDLL();
		
		//Traversing the circular doubly linked list from tail
		list.traverseInReverseCDLL();
		
		//Searching the node from circular doubly linked list traversing from head
		list.searchInDLL(88);
		
		//Deleting a first node from the doubly circular linkedlist
//		list.traverseCDLL();
//		list.deleteNode(0);
//		list.traverseCDLL();
		
		//Deleting a last node from the doubly circular linked list
//		list.traverseCDLL();
//		list.deleteNode(3);
//		list.traverseCDLL();
		
		//Deleting a middle node from the doubly circular linked list
//		list.traverseCDLL();
//		list.deleteNode(2);
//		list.traverseCDLL();
		
		//Deleting Entire Circular Doubly Linked List
		list.deleteCDLL();
		
	}

}
