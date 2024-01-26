package com.lamichhane.linear.queue.with.linkedlist;

import java.awt.List;

public class LinearQueue {

	public Node head;
	public Node tail;
	public int size;
	
	public LinearQueue(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		System.out.println("Linear Queue Created!");
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enQueue(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		
		node.next = null;
		tail.next = node;
		tail = node;
		size++;
		System.out.println("Successfully Inserted "+nodeValue+" in the queue");
		
	}
	
	public int deQueue() {
		int value  = -1;
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
		}
		else {
			value = head.value;
			head = head.next;
			size--;
			if (size == 0) {
				tail = null;
			}
		}
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			return -1;
		}
		else {
			return head.value;
		}
	}
	
	public void deleteQueue() {
		head = tail = null;
		System.out.println("Entire Queue Deleted Successfully");
	}
	
	
}
