package com.example.queue;

public class Queue {
	int front = -1;
	int rear = -1;
	int size = 5;
	int arr[] = new int[size];
	
	public void enqueue(int num) {
		if(isFull()) {
			System.out.println("CAnt add array is full");
			return;
		}
		if(front==-1) {
			front=0;
		}
		rear++;
		arr[rear]=num;
	}
	
	public void dequeue() {
		if(isEmpty()||(front==rear)) {
			System.out.println("Array is already empty no elements to delete");
			rear=-1;
			front=0;
			return;
		}
		front++;
	}
	
	public void peek() {
		System.out.println("Peek value is "+arr[front]);
	}

	private boolean isEmpty() {
		return rear == -1;
	}

	private boolean isFull() {
		
		return rear==size-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
