package linkedlist.doublylinkedlist;

public class ListNode<E> {
	ListNode<E> next;
	ListNode<E> prev;
	E data;
	
	public ListNode(E theData) {
		this.data = theData;
	}
}
