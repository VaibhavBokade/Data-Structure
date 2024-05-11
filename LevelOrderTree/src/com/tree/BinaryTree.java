package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	public Node root;
	int count;

	public BinaryTree() {

	}

	public BinaryTree( int count) {

		this.root = null;
		this.count = count;
	}

	public void buildTree1() {
//		root= new Node(5);
//		root.Lchild= new Node(6);
//		root.Rchild= new Node(7);
//		root.Lchild.Lchild= new Node(8);
//		root.Lchild.Rchild= new Node(9);
		
		Node root = new Node(1);
        root.Lchild = new Node(2);
        root.Rchild = new Node(3);
        root.Lchild.Lchild = new Node(4);
        root.Rchild.Lchild = new Node(5);
        root.Rchild.Rchild = new Node(6);
        root.Rchild.Lchild.Lchild = new Node(7);
        root.Rchild.Lchild.Rchild = new Node(8);

	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public Node insert(Node root, int value) {
		if(root == null) {
			root = new Node(value);
			return root;
		}
		if( value < root.data) {
			root.Lchild = insert(root.Lchild , value);
		}
		else {
			if(value > root.data) {
				root.Rchild = insert(root.Rchild , value);
			}
		}
		return root;
	}


	public void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(temp == null) {
				if(!queue.isEmpty()) {
					queue.add(null);
				System.out.println();
				}
			}
			else {
				System.out.print(temp.data + " ");
				if(temp.Lchild != null) {
					queue.add(temp.Lchild);
				}
				if(temp.Rchild != null) {
					queue.add(temp.Rchild);
				}
				
			}
		}
	}

	public void inOrder() {
		count = 0;
		inOrder(root);
		System.out.println("\nCount is "+count);
	}
	
	public void inOrder(Node root) {
		++count;
		if(root == null) {
		//System.out.println("Tree is empty....");
		return;
		}
		inOrder(root.Lchild);
		
		System.out.print(root.data + " ");
		
		inOrder(root.Rchild);
	}
	
	public void mirror() {
		mirror(root);
	}
	
	public Node mirror(Node root) {
		if(root == null) {
			return null;
		}
		if(root.Lchild != null)
			mirror(root.Lchild);
		
		if(root.Rchild != null)
			mirror(root.Rchild);
		
		Node temp = root.Lchild;
		root.Lchild = root.Rchild;
		root.Rchild = temp;
		return root;
	}
	
	public void iterativeInorder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> st = new Stack<>();
		Node temp = root;
		while(! st.isEmpty() || temp != null) {
			if(temp != null) {
				st.push(temp);
				temp = temp.Lchild;
			}
			else {
				temp = st.pop();
				
				System.out.print(temp.data + " ");
				temp = temp.Rchild;
			}
		}
		
	}
	
//	public void iterativePreorder(Node root) {
//		if(root == null) {
//			return;
//		}
//		Stack<Node> st = new Stack<>();
//		st.push(root);
//		while(! st.isEmpty()) {
//			Node temp = st.pop();
//			System.out.print(temp.data +" ");
//			if(root.Rchild != null) {
//				st.push(temp.Rchild);
//			}
//			if(root.Lchild != null) {
//				st.push(temp.Lchild);
//			}
//		}
//	}
	
	public void iterativePreorder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.print(temp.data +" ");
			if(temp.Rchild !=null) {
				stack.push(temp.Rchild);
			}
			if(temp.Lchild != null) {
				stack.push(temp.Lchild);
			}
		}
	}
	
	public void iterativePostorder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> st = new Stack<>();
		Node current = root;
		while(current != null || !st.isEmpty()) {
			if(current != null) {
				st.push(current);
				current = current.Lchild;
			}
			else {
				Node temp = st.peek().Rchild;
				if(temp == null) {
				temp = st.pop();
				System.out.print(temp.data +" ");
				while(!st.isEmpty() && temp == st.peek().Rchild) {
					temp = st.pop();
					System.out.print(temp.data +" ");
				}
				}else {
					current = temp;
				}
			}
		}
	}


}
