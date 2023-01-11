// Node for Queue
// Author : Ansh Kushwaha | 11/01/2023

package queue.linkedqueue;

public class Node<T> {
	T val;
	Node<T> next;
	
	Node() {
		val = null;
		next = null;
	}
	
	Node(T x) {
		val = x;
		next = null;
	}
}
