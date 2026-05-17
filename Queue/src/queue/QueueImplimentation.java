package queue;

public class QueueImplimentation {

	int front = 0;
	int rear = -1;
	int arr[] = new int[5];
	boolean isEmpty() {
		return front > rear;
	}
	
	boolean isFull() {
		return rear == arr.length-1;
	}
	void enqueue(int num) {
		if(!isFull()) {
			arr[++rear] = num;
			
		}
	}
	
	void dequeue() {
		if(!isEmpty()) {
			front++;
		}
	}
	
	int peek() {
		return arr[front];
	}
}
