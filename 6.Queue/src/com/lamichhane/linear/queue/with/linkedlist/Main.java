package com.lamichhane.linear.queue.with.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinearQueue linearQueue = new LinearQueue(5);
		System.out.println(linearQueue.head.value);
		
		System.out.println(linearQueue.isEmpty());
		
		linearQueue.enQueue(10);
		System.out.println(linearQueue.head.next.value);
		
		linearQueue.enQueue(20);
		System.out.println(linearQueue.head.next.next.value);
		
		linearQueue.deQueue();
		System.out.println(linearQueue.head.value);
		linearQueue.deQueue();
		System.out.println(linearQueue.head.value);
//		linearQueue.deQueue();
		System.out.println(linearQueue.isEmpty());
		
		
		System.out.println(linearQueue.peek());
		linearQueue.deleteQueue();
		System.out.println(linearQueue.isEmpty());

	}

}
