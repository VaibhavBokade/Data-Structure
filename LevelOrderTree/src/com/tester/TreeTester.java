package com.tester;

import com.tree.BinaryTree;

public class TreeTester {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(8);
		tree.insert(4);
		tree.insert(9);
		tree.insert(3);
		tree.insert(10);
		tree.insert(5);
		//tree.buildTree1();
		System.out.println("inside inorder");
		tree.inOrder();
		System.out.println("inside levelorder");
		System.out.println("before mirroring");
		tree.levelOrder(tree.root);
		//System.out.println("\n after mirroring");
		//tree.mirror();
		//tree.levelOrder(tree.root);
		System.out.println("\n inside iterative inorder");
		tree.iterativeInorder(tree.root);
		System.out.println("\n inside iterative preorder");
		tree.iterativePreorder(tree.root);
		System.out.println("\n inside iterative postorder");
		tree.iterativePostorder(tree.root);
	}

}
