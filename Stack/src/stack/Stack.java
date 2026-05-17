package stack;

public class Stack {

	int top = -1;
	int arr[] = new int[5];
	
	int peek() {
		if(top!=-1)
		{
			return arr[top];

		}
		System.out.println("stack is empty buddy");
		return -1;
	}
	
	void push(int num) {
		if(top==arr.length)
		{
			System.out.println("stack is full buddy");;
		}
		arr[top+1] = num;
		top++;
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("stack is empty buddy");
			return;
		}
		top--;
	}
	
	
	
	
}
