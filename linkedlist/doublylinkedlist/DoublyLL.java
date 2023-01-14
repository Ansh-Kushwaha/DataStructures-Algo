// Author : Ansh Kushwaha | 14/01/2023

package linkedlist.doublylinkedlist;

import linkedlist.doublylinkedlist.Node;

public class DoublyLL<T> {
	
	private Node<T> head;
	
	public DoublyLL() {
		head = null;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	public boolean isFull() {
		Node<T> temp = new Node<T>();
		if(temp == null)
			return true;
		return false;
	}
	
	public int size() {
		if(isEmpty())
			return 0;
		else {
			int s = 0;
			Node<T> temp = head;
			while(temp != null) {
				s++;
				temp = temp.next;
			}
			return s;
		}
	}
	
	public void insert(T x, int pos) {
		int size = size();
		if(pos < 1 || pos > size+1) {
			System.out.println("Invalid position");
			return;
		}
		else if(isEmpty() && pos != 1) {
			System.out.println("Invalid position list empty");
			return;
		}
		else if(isEmpty() && pos == 1) {
			Node<T> temp = new Node<T>(x);
			head = temp;
			return;
		}
		else if(pos == 1) {
			Node<T> temp = new Node<T>(x);
			temp.next = head;
			head.prev = temp;
			head = temp;
			return;
		}
		else if(pos == size+1) {
			Node<T> last = head;
			while(last.next != null)
				last = last.next;
			Node<T> temp = new Node<T>(x);
			temp.prev = last;
			last.next = temp;
			return;
		}
		else {
			Node<T> last = head;
			for(int i = 2; i < pos; i++)
				last = last.next;
			Node<T> temp = new Node<T>(x);
			temp.next = last.next;
			temp.prev = last;
			last.next.prev = temp;
			last.next = temp;
		}
	}
	
	public void delete(int pos) {
		int size = size();
		
		if(pos < 1 || pos > size || (size == 1 && pos !=1)) {
			System.out.println("Invalid position");
			return;
		}
		else if(size == 1 && pos == 1) {
			Node<T> temp = head;
			System.out.println("Deleted : " + String.valueOf(temp.val));
			head = null;
			return;
		}
		else if(pos == 1) {
			Node<T> temp = head;
			System.out.println("Deleted : " + String.valueOf(temp.val));
			head = head.next;
			head.prev = null;
			return;
		}
		else if(pos == size) {
			Node<T> temp = head;
			while(temp.next.next != null)
				temp = temp.next;
			System.out.println("Deleted : " + String.valueOf(temp.next.val));
			temp.next = null;
			return;
		}
		else {
			Node<T> last = head;
			for(int i = 2; i < pos; i++)
				last = last.next;
			System.out.println("Deleted : " + String.valueOf(last.next.val));
			last.next = last.next.next;
		}
	}
	
	public void output() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		else {
			Node<T> temp = head;
			// head to last
			System.out.print("head -> ");
			
			while(temp != null) {
				System.out.print(String.valueOf(temp.val) + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
