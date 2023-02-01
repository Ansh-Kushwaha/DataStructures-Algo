// Author : Ansh Kushwaha | 16/01/2023

package tree.binarysearchtree;

public class BST {
	
	public Node root;
	
	public BST() {
		root = null;
	}
	
	public BST(int x) { // initialize tree with root x
		root = new Node(x);
	}
	
	public void insert(int x) {
		if(root == null) {
			root = new Node(x);
			return;
		}
		Node parent = null, temp = root;
		while(temp != null) {
			if(x < temp.data) {
				parent = temp;
				temp = temp.left;
			}
			else if(x > temp.data){
				parent = temp;
				temp = temp.right;
			}
		}
		
		if(x < parent.data)
			parent.left = new Node(x);
		else
			parent.right = new Node(x);			
	}
	
//	public void delete(int key) {
//		
//	}
}
