package queue;

public interface Interface <T>{
	void enqueue(T ele);
	T dequeue();
	boolean isFull();
	boolean isEmpty();
	void print();

}
