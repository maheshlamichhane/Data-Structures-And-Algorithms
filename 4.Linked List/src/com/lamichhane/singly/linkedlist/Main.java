package com.lamichhane.singly.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.createSinglyLinkedList(5);
//		System.out.println(sll.head.value);
		
		//adding node in the beginning
		sll.insertInLinkedList(6, 0);
		
		// adding node in the end
		sll.insertInLinkedList(10, 2);
		
		//adding in the middle
		sll.insertInLinkedList(20, 1);
		
//		System.out.println(sll.head.next.next.next.value);
		
		//traverse linked list
		sll.traverseSinglyLinkedList();
		
		//search node
		sll.searchNode(20);
		
		// delete a node
		sll.deletionOfNode(1);
		sll.traverseSinglyLinkedList();
		
		// delete Singly Lined list
		sll.deleteSLL();
		sll.traverseSinglyLinkedList();

	}

}
