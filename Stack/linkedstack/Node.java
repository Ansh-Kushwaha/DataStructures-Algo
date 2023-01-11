// Author : Ansh Kushwaha | 11/01/2023

package Stack.linkedstack;

public class Node<T> {
	T val;
	Node next;
	
	Node() {
		val = null;
		next = null;
	}
	
	Node(T x) {
		val = x;
		next = null;
	}
}
