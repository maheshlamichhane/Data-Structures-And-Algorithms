package com.lamichhane.interview.question;

public class Main {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		ll.createLL(1);
		ll.insertNode(9);
		ll.insertNode(5);
		ll.insertNode(10);
		ll.insertNode(2);
		ll.traverselLL();
		
		Questions question = new Questions();
//		question.deleteDups(ll);
//		ll.traverselLL();
		
//		Node num = question.nthToLast(ll, 1);
//		System.out.println(num.value);
		
		
		question.partition(ll, 3);
		ll.traverselLL();
		
	}

}
