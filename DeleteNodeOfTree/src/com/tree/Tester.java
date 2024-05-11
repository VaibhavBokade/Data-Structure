package com.tree;

public class Tester {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.buildTree1();
		//tree.levelOrder(tree.root);
		System.out.println("\n");
		tree.inOrder();
		System.out.println("\n");
		tree.delete(17);
		//tree.levelOrder(tree.root);
		tree.inOrder();
		

	}

}
