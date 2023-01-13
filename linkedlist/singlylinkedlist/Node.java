// Node for Linked Lists (Single reference)
// Author : Ansh Kushwaha

package linkedlist.singlylinkedlist;

public class Node<T> {
    public T val;
    public Node<T> next;

    public Node() {
    	val = null;
    	next = null;
    }

    public Node(T x) {
        val = x;
        next = null;
    }
}
