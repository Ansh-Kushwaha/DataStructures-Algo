// Author : Ansh Kushwaha

package tree.binarysearchtree;

import algorithms.tree.Traversals;

public class Test {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(4);
		tree.insert(7);
		tree.insert(1);
		tree.insert(9);
		tree.insert(12);
		Traversals t = new Traversals();
		t.postorder(tree.root);
		System.out.println();
		t.postorderI(tree.root);
		System.out.println();
	}
}
