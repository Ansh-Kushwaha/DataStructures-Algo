// Node for Stack
// Author : Ansh Kushwaha | 11/01/2023

package stack.linkedstack;

public class Node<T> {
	public T val;
	public Node next;
	
	Node() {
		val = null;
		next = null;
	}
	
	Node(T x) {
		val = x;
		next = null;
	}
}
