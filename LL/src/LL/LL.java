package LL;

import java.util.Stack;

public class LL implements LLInterface{
	 Node head;
	 int size;

	public LL() {
		super();
	}

	public LL( int size) {
		super();
		this.head = head;
		this.size = size;
	}

	@Override
	public void addFirst(int ele) {
		Node newnode = new Node(ele);
		//newnode.next = head;
//		if(head == null) {
//			head= newnode;
//			return;
//		}
//		newnode.next = head;
//		head=newnode;
//
//		size++;
				Node curr = head;
				Node pre = null;
				while(curr != null) {
					if(curr.data > ele) {
						break;
					}
					pre = curr;
					curr = curr.next;
				}
				if(curr == head) {
					newnode.next = head;
					head = newnode;
					return;
				}
				if(curr == null) {
					pre.next = newnode;
					return;
				}
				if(pre.data < ele && curr.data > ele ) {
					newnode.next = curr;
					pre.next = newnode;
					return;
					
				}

	}

	@Override
	public void addLast(int ele) {
		Node newnode = new Node(ele);
		if(head == null) {
			head= newnode;
		}
		if(head.next == null) {
			head.next = newnode;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode; 
		size++;
	}

	@Override
	public void deleteFirst() {
		Node newnode = new Node();
		if(head == null) {
			head= newnode;
		}
		head = head.next;
		return;
	}

	@Override
	public void daleteLast() {
		Node temp = head;
		while(temp.next.next != null) {

			temp = temp.next;
		}
		temp.next = null;
		return;
	}

	@Override
	public void printList() {
		if(head == null) {
			System.out.println("list is null");
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ->");
			temp = temp.next;
		}
		System.out.println("end");

	}

	public void reverse() {
		if(head == null) {
			System.out.println("List is empty");

		}
		Node pre = null;
		Node next = null;
		Node curr = head;
		while(curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;

		}
		head = pre;

	}

	public void deleteInBetween(int ele) {
		if(head == null) {
			System.out.println("List is empty");
			return;

		}
		Node curr = head;
		Node pre = null;
		if(head.data == ele) {
			head = head.next;
			return;
		}

		while(curr != null ) {

			if(curr.data == ele) {
				pre.next = curr.next;
				curr.next = null;
				return;

			}
			pre = curr;
			curr = curr.next;
		}

	}

	public void removeDuplicate() {
		Node curr = head;
		//Node pre = null;
//		if(head.data == head.next.data) {
//			head= head.next;
//			return;
//		}
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
				curr.next = null;
				return;
			}
			else {
				curr = curr.next;
			}
			
		}


	}
	
	public void add(int ele) {
		Node newnode = new Node(ele);
		//newnode.next = head;
		if(head == null) {
			head= newnode;
			return;
		}
		head.next = newnode;
		//newnode.next = newnode.next.next;
	}

//	public Node mergeList(LL list1, LL list2) {
//		Node list1ptr = list1.head;
//		Node list2ptr = list2.head;
//		Node result = new Node(-1);
//
//		if(list1ptr == null) {
//			return list2ptr;
//		}
//		if(list2ptr == null) {
//			return list1ptr;
//		}
//
//		while(list1ptr != null && list2ptr != null) {
//			if(list1ptr.data > list2ptr.data) {
//
//				result.next = list1ptr;
//				list1ptr = list1ptr.next;
//			}
//			else {
//				result.next = list2ptr;
//				list2ptr = list2ptr.next;
//			}
//		}
//		while(list2ptr != null && list1ptr == null) {
//			result.next = list2ptr;
//			list2ptr = list2ptr.next;
//		}
//		while(list1ptr != null && list2ptr == null) {
//			result.next = list1ptr;
//			list1ptr = list1ptr.next;
//		}
//		
//		
//		return result.next;
//
//	}
	
	public Node mergeList(Node head1, Node head2) {
		Node p1 = head1;
		Node p2 = head2;
		Node dummynode = new Node(-1);
		Node p3 = dummynode;
		
		while(p1 != null && p2 != null) {
			if(p1.data < p2.data) {
				p3.next = p1;
				p1 = p1.next;
			}
			else {
				p3.next = p2;
				p2 = p2.next;
			}
			p3 = p3.next;
		}
		while(p1 != null) {
			p3.next = p1;
			p1 = p1.next;
			p3 = p3.next;
		}
		
		while(p2 != null) {
			p3.next = p2;
			p2 = p2.next;
			p3 = p3.next;
		}
		return dummynode.next;
	}
	
//	public boolean palindrome(Node head) {
//		if(head == null) 
//			return true;
//		Node mid = middle(head);
//		Node last = reverse(mid);
//		Node curr = head;
//		
//		while(last != null) {
//			if(last.data != curr.data) 
//				return false;
//			last = last.next;
//			curr = curr.next;
//			return true;
//		}
//	}
//	
	public Node middle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast !=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public boolean isPalindrome(Node head)
    {
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
 
        while (head != null) {
 
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
	
}



