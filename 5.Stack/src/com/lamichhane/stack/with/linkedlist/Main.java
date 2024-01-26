package com.lamichhane.stack.with.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		//Create Stack
		Stack stack = new Stack();
		stack.createStack(1);
		
		//Add Element into Stack
		stack.push(2);
		stack.push(3);
		
		//Traversing Stack
		stack.traverseStack();
		
		//Delete node from stack
		stack.pop();
		stack.traverseStack();
		
		//Search an element from stack
		int val = stack.peek(1);
		System.out.println(val);
		
		//Deleting Entire Stack
		stack.deleteStack();
		stack.traverseStack();
		
		//Check Stack Empty
		System.out.println(stack.isEmpty());

	}

}
