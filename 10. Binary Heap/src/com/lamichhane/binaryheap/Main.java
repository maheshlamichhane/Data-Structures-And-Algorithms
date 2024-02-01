package com.lamichhane.binaryheap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryHeap binaryHeap = new BinaryHeap(5);
		binaryHeap.peek();
		binaryHeap.sizeOfBP();
		
		binaryHeap.insert(5, "Max");
		binaryHeap.insert(10, "Max");
		binaryHeap.insert(20, "Max");
		binaryHeap.insert(1, "Max");
		binaryHeap.levelOrder();
		binaryHeap.extractHeadOfBP("Max");
		binaryHeap.levelOrder();
		
		binaryHeap.deleteBH();

	}

}
