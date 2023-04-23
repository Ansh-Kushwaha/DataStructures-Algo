package linkedlist.doublylinkedlist;

public class MyLinkedList<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public MyLinkedList() {
		size = 0;
		head = new ListNode<E>(null);
		tail = new ListNode<E>(null);
		head.next = tail;
		tail.prev = head;
	}
}
