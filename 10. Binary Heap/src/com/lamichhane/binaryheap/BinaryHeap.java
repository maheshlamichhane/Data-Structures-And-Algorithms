package com.lamichhane.binaryheap;

public class BinaryHeap {
	
	int arr[];
	int sizeOfTree;
	
	
	//Creating Binary Heap tc:O(1) ,sc:O(N)
	public BinaryHeap(int size) {
		arr = new int[size+1];
		this.sizeOfTree = 0;
		System.out.println("Binary Heap was created");
	}
	
	
	//Creating method for empty check
	public boolean isEmpty() {
		if(sizeOfTree == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//peek method tc:O(1),sc:O(1)
	public Integer peek() {
		if(isEmpty()) {
			System.out.println("Binary Heap is Empty");
			return null;
		}
		return arr[1];
	}
	
	//size of binary heap
	public int sizeOfBP() {
		return sizeOfTree;
	}
	
	//traversing Binary Heap tc:O(N),sc:O(1)
	public void levelOrder() {
	    for (int i =1; i<=sizeOfTree; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println("\n");
    }  
	
	// Heapify for Insert tc O(logN),sc O(logN)
	public void heapifyBottomToTop(int index, String heapType) {
		int parent = index / 2 ;
		if(index <= 1) {
			return;
		}
		if(heapType == "Min") {
			if(arr[index] < arr[parent]) {
				int tmp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = tmp;
			}
		}
		else if(heapType == "Max") {
			if(arr[index] > arr[parent]) {
				int tmp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = tmp;
			}
		}
		
		heapifyBottomToTop(parent, heapType);
	}
	
	
	
	
	public void insert(int value,String typeHeap) {
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree, typeHeap);
		System.out.println("Inserted "+value+" successfully in Heap");
	}
	
	//heapify TopToBottom tc:O(logN),sc:O(logN)
	public void heapifyTopToBottom(int index,String heapType) {
		int left = index*2;
		int right = index*2 + 1;
		int swapChild = 0;
		if(sizeOfTree < left) {
			return;
		}
		if(heapType == "Max") {
			if(sizeOfTree == left) {
				if(arr[index] < arr[left]) {
					int tmp = arr[index];
					arr[index] = arr[left];
					arr[left] = tmp;
				}
				return;
			}
			else {
				if(arr[left] > arr[right]) {
					swapChild = left;
				}
				else {
					swapChild = right;
				}
				if(arr[index] < arr[swapChild]) {
					int tmp = arr[index];
					arr[index] = arr[swapChild];
					arr[swapChild] = tmp;
				}
			}
		} else if(heapType == "Min") {
			if(sizeOfTree == left) {
				if(arr[index] > arr[left]) {
					int tmp = arr[index];
					arr[index] = arr[left];
					arr[left] = tmp;
				}
				return;
			}
			else {
				if(arr[left] < arr[right]) {
					swapChild = left;
				}
				else {
					swapChild = right;
				}
				if(arr[index] > arr[swapChild]) {
					int tmp = arr[index];
					arr[index] = arr[swapChild];
					arr[swapChild] = tmp;
				}
			}
		
		}
		
		heapifyTopToBottom(swapChild, heapType);
		
		
	}
	
	
	public int extractHeadOfBP(String heapType) {
		if(isEmpty()) {
			return -1;
		}
		else {
			int extractedValue = arr[1];
			arr[1] = arr[sizeOfTree];
			sizeOfTree--;
			heapifyTopToBottom(1, heapType);
			return extractedValue;
		}
	}
	
	
	
	//delete binary heap tc:O(1) and sc:O(1)
	public void deleteBH() {
		arr = null;
		System.out.println("Binary heap deleted successfully");
	}
	
	

}
