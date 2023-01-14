// Node for Doubly Linked List

package linkedlist.doublylinkedlist;

public class Node<T> {
	public T val;
	public Node<T> prev;
	public Node<T> next;
	
	public Node() {
		val = null;
		prev = null;
		next = null;
	}
	
	public Node(T x) {
		val = x;
		prev = null;
		next = null;
	}
}
