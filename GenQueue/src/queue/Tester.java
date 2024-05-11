package queue;

public class Tester {

	public static void main(String[] args) {
		GenQueue<Integer> queue = new GenQueue<>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(10);
		queue.print();

	}

}
