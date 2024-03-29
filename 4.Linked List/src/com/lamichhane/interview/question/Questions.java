package com.lamichhane.interview.question;

import java.util.HashSet;


class Questions {

//	Questions(){
//		
//	}
	public void deleteDups(LinkedList ll) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node current = ll.head;
		Node prev = null;
		while(current != null) {
			int curval = current.value;
			if(hs.contains(curval)) {
				prev.next = current.next;
				ll.size--;
			}
			else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}
	}
	
	Node nthToLast(LinkedList ll,int n) {
		Node p1 = ll.head;
		Node p2 = ll.head;
		for(int i=0; i<n; i++) {
			if(p2 == null) return null;
			p2 = p2.next;
		}
		while(p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	LinkedList partition(LinkedList ll,int x) {
		Node currentNode = ll.head;
		ll.tail = ll.head;
		while(currentNode != null) {
			Node next = currentNode.next;
			if(currentNode.value < x) {
				currentNode.next = ll.head;
				ll.head = currentNode;
			}
			else {
				ll.tail.next = currentNode;
				ll.tail = currentNode;
			}
			currentNode = next;
		}
		ll.tail.next = null;
		return ll;
	}
	
	
	
	
}
