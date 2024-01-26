package com.lamichhane.linear.queue.with.array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Linear Queue
		LinearQueue linearQueue = new LinearQueue(3);
		
		//Checking is Linear Queue Full
		boolean result = linearQueue.isFull();
		System.out.println(result);
		
		//Checking is Linear Queue is Empty
		boolean result2 = linearQueue.isEmpty();
		System.out.println(result2);
		
		//Insertion in Linear Queue
		linearQueue.enQueue(1);
		linearQueue.enQueue(2);
		linearQueue.enQueue(3);
		
		//Deleting in Linear Queue
		System.out.println(linearQueue.deQueue());
		
		//Peek in Linear Queue
		System.out.println(linearQueue.peek());
		System.out.println(linearQueue.peek());
		
		//Deleting Entire Queue
		linearQueue.deleteLinearQueue();
		
		
		
		

	}

}
