package com.lamichhane.stack.with.array;

public class Stack {

	int[] arr;
	int topOfStack;
	
	
	//Creating a stack
	public Stack(int size) {
		this.arr = new int[size];
		topOfStack = -1;
		System.out.println("The Stack is created with size of: "+size);
	}
	
	//Checking is stack empty
	public boolean isEmpty() {
		if(topOfStack == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Checking is stack is full
	public boolean isFull() {
		if(topOfStack == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Adding element in stack
	public void push(int value) {
		if(isFull()) {
			System.out.println("The Stack is Full!");
		}
		else {
			arr[topOfStack+1] = value;
			topOfStack++;
			System.out.println("The Element is Added to Stack");
			
		}
	}
	
	//Deleting an Element From Stack
	public int pop() {
		if(isEmpty()) {
			System.out.println("The Stack is empty");
			return -1;
		}
		else {
			int topStack = arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	
	
	//Peeking an Element From Stack
	public int peek() {
		if(isEmpty()) {
			System.out.println("The stack is empty!");
			return -1;
		}
		else {
			int value = arr[topOfStack];
			return value;
		}
	}
	
	//Deleting Entire Stack
	public void deleteStack() {
		arr = null;
		System.out.println("Stack deleted Successfully");
	}
	
}
