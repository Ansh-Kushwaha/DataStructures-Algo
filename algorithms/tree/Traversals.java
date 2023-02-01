// Author : Ansh Kushwaha 

package algorithms.tree;

import stack.staticstack.SStack;
import tree.binarysearchtree.*;

public class Traversals {
	
	//recursive
	public void preorder(Node root) {
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void inorder(Node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public void postorder(Node root) {
		if(root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	//iterative
	public void preorderI(Node root) {
		if(root == null)
			return;
		
		SStack<Node> st = new SStack<Node>();
		Node curr = null;
		st.push(root);
		while(!st.isEmpty()) {
			curr = st.peek();
			st.pop();
			System.out.print(curr.data + " ");
			if(curr.right != null)
				st.push(curr.right);
			if(curr.left != null)
				st.push(curr.left);
		}
	}
	
	public void postorderI(Node root) {
		if(root == null)
			return;
		
		SStack<Node> st = new SStack<Node>();
		Node curr = null;
		st.push(root);
		while(!st.isEmpty()) {
			curr = st.peek();
			if(curr.left != null)
				st.push(curr.left);
			System.out.print(curr);
		}
	}
}
