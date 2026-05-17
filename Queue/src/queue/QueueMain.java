package queue;

public class QueueMain {

	public static void main(String[] args) {

		QueueImplimentation q = new QueueImplimentation();
		
		q.enqueue(5);
		q.enqueue(10);
		q.dequeue();
		System.out.println(q.peek());
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(30);


		
	}

}
