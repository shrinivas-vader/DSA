package stack;

public class DynamicStack {

	int top = -1;
	int stackSize;
	int[] arr = new int[5];
	
	boolean isFull() {
		return top == arr.length-1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	void push(int num) {
		if(isFull()) {
			int[] newarr=new int[arr.length + 5];
			System.arraycopy(arr, 0, newarr, 0, arr.length);
			arr = newarr;
		}
		arr[++top] = num;
	}
	
	void pop() {
		if(!isEmpty()) {
			top--;
		}
	}
	
	int peek() {
		return isEmpty() ? -1 : arr[top];
	}
}
