package com.tree;

import java.util.LinkedList;
import java.util.Queue;

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
		root= new Node(15);
		root.Lchild= new Node(13);
		root.Rchild= new Node(17);
		root.Lchild.Lchild= new Node(1);
		root.Lchild.Rchild= new Node(14);
//		
		

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
		queue.offer(root);
		queue.offer(null);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(temp == null) {
				if(!queue.isEmpty()) {
				queue.add(null);
				System.out.println();
				}
			}
			else {
				System.out.print(temp.data +" ");
				
				if(temp.Lchild !=null) {
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
	
	public void delete(int element) {
		Node parent = null;
		Node current = root;
		
		while(current != null) {
			
			if(current.data == element) 
				break;
			
			if(element < current.data) {
				parent = current;
				current = current.Lchild;
			}
			else {
				parent = current;
				current = current.Rchild;
			}
		}
		
		if(current == null) {
			return;
		}
		
		if((current.Lchild == null) && (current.Rchild == null)) {
			if(current == root) {
			root= null;
			return;
			}
		
		if(current == parent.Lchild)
			parent.Lchild = null;
		else
			parent.Rchild = null;
		return;
		 
	}
		Node childOfCurrent = null;
		if(current.Lchild == null)
			childOfCurrent = current.Rchild;
		if(current.Rchild == null)
			childOfCurrent = current.Lchild;
		if(childOfCurrent != null) {
		if(current == parent.Lchild)
			parent.Lchild = childOfCurrent;
		else
			parent.Rchild = childOfCurrent;
		return;
		}
		
		// Deleting node with two children.
				// Find inorder successor.
		Node inorderSuccessor = current.Rchild;
		Node inorderSuccessorParent = current;
		while (inorderSuccessor.Lchild != null) {
			inorderSuccessorParent = inorderSuccessor;
			inorderSuccessor = inorderSuccessor.Lchild;
		}
		// Swap data of current and inorder successor
		int t = current.data;
		current.data = inorderSuccessor.data;
		inorderSuccessor.data = t;

		if (inorderSuccessor == inorderSuccessorParent.Lchild)
			inorderSuccessorParent.Lchild = inorderSuccessor.Rchild;
		else
			inorderSuccessorParent.Rchild = inorderSuccessor.Rchild;
		}
			
		
	}
	
	
	

