package com.tree;

public class Node {
	
		Node Lchild;
		Node Rchild;
		int data;
		
		public Node() {
			super();
		}

		public Node( int data) {
			super();
			Lchild = null;
			Rchild = null;
			this.data = data;
		}
}
