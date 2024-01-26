package com.lamichhane.circular.queue.with.array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue circularQueue = new CircularQueue(3);
		boolean result = circularQueue.isEmpty();
		System.out.println(result);
		circularQueue.enQueue(10);
		circularQueue.enQueue(30);
		circularQueue.enQueue(20);
		int result2 = circularQueue.deQueue();
		System.out.println(result2);
		System.out.println(circularQueue.peek());
		System.out.println(circularQueue.peek());
		circularQueue.delete();
		System.out.println(circularQueue.peek());

	}

}
