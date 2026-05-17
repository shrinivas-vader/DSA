package stack;

public class StackMain {

	public static void main(String[] args) {
//		int arr[] = new int[] {1,2,3,4,5};
//		int arr2[] = new int[5];
//		System.arraycopy(arr, 1, arr2, 1, 3);
		
//		for(int i: arr2) {
//			System.out.println(i);
//		}
//		Stack s = new Stack();
		DynamicStack s = new DynamicStack();
		s.push(4);

		System.out.println(s.peek());
		s.push(6);
		s.push(8);
		s.push(8);
		s.push(8);
		s.push(8);
		s.push(8);
		s.push(8);
		s.push(87);
		System.out.println(s.peek());
		s.pop();

		System.out.println(s.peek());
	}

}
