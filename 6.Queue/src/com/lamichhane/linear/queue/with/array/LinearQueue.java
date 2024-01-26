package com.lamichhane.linear.queue.with.array;

public class LinearQueue {

	int[] arr;
	int topOfQueue;
	int beginningOfQueue;

	public LinearQueue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("The Linear Queue is successfully created with size of "+size);
	}
	
	public boolean isFull() {
		if(topOfQueue == arr.length - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(beginningOfQueue == -1 || beginningOfQueue == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("The Queue is Full!");
		}
		else if(isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
		else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("The Queue is empty!");
			return -1; 
		}
		else {
			int result = arr[beginningOfQueue];
			beginningOfQueue++;
			if(beginningOfQueue > topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			return result;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is empty!");
			return -1; 
		}
		else {
			return arr[beginningOfQueue];
		}

	}
	
	public void deleteLinearQueue() {
		arr = null;
		System.out.println("Linear Queue is successfully deleted");
	}
	
	
	
	
	

}
