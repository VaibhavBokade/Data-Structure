package DL;

public class DLL<T> implements DLInterface<T>{
	private Node<T> head;
	private int size;
	
	public DLL() {
		super();
	}

	public DLL( int size) {
		super();
		this.head = head;
		this.size = size;
	}

	@Override
	public void addFrist(T ele) {
		Node<T> newnode = new Node(ele);
		if(head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head.pre = newnode;
		
		
		head = newnode; 
		size++;
	}

	@Override
	public void addLast(T ele) {
		Node newnode = new Node(ele);
		if(head == null) {
			head = newnode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newnode;
		newnode.pre = curr;
		
		size++;

	}

	@Override
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		head = head.next;
		head.pre = null;
		size--;
		
	}

	@Override
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		size--;
	}

	@Override
	public void print() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data+ " <-> ");
			curr = curr.next;
		}
		System.out.println("end");
		
	}
	
	
	
}
