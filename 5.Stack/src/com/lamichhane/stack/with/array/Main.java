package com.lamichhane.stack.with.array;

public class Main {

	public static void main(String[] args) {
		
		// Creating Stack
		Stack newStack = new Stack(4);

		//Checking empty
//		boolean b = newStack.isEmpty();
//		if(b) {
//			System.out.println("Stack is empty");
//		}
//		else {
//			System.out.println("Stack is not empty");
//		}
		
		
		//Checking is stack is full
//		boolean b2 = newStack.isFull();
//		if(b2) {
//			System.out.println("Stack is Full");
//		}
//		else {
//			System.out.println("Stack is not Full");
//		}
		
		
		//Adding Element to Stack
		newStack.push(10);
		newStack.push(20);
		newStack.push(30);
		newStack.push(40);
		
//		int deletedValue = newStack.pop();
//		System.out.println("Deleted Value is="+deletedValue);
		
		//Peeking an element from the stack
		int value = newStack.peek();
		System.out.println(value);
		
		//Deleting Entire Stack
		newStack.deleteStack();
		
		
		
		
	}

}
