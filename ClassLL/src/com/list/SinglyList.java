package com.list;



public class SinglyList implements LinkedList{
	Node head;
	Node tail;



	@Override
	public void addFirst(String element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = head;
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void addLast(String element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;

		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;

	}

	@Override
	public void deleteFirst() {
		Node newNode = new Node();
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		head = head.next;

	}

	@Override
	public void deleteLast() {
		//Node newNode = new Node();
		//Node currNode = tail;
		tail = head;
		if(head == null)  {
			System.out.println("List is empty");
			return;
		}

		Node secLastNode = tail;
		Node lastNode = tail.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secLastNode = secLastNode.next;
		}
		secLastNode.next = null;


	}

	public void deleteBetween(int position) {

		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		if(position == 0) {
			head = head.next;
			return;
		}

		for(int i=0; currNode != null && i< position-1; i++) {
			currNode = currNode.next;
		}

		if(currNode == null || currNode.next == null)
			return;

		// Node currNode->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node last = currNode.next.next;

		currNode.next = last;// Unlink the deleted node from list


	}

	public void reverseList() {
		if(head == null) {
			System.out.println("List is empty");
			//return head;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current != null) {

			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		//node =previous;
		//return previous;
		head = previous;

	}

	@Override
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data +"->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	public void removeduplicate() {
		Node curr = head.next;
		Node pre = head;
		
		while(curr != null) {
			if(pre.data == curr.data) {
				pre.next = curr.next;
				curr = curr.next;				
			}else {
			
			pre =curr;
			curr = curr.next;
			}
			
		}
		
		
	}

}
