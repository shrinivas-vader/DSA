package linkedlistDemo;

public class LinkedList {

	Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		l.print();
	}
}
