// Author : Ansh Kushwaha | 13/01/2023

package linkedlist.circularlinkedlist;

import linkedlist.singlylinkedlist.Node;

public class CircularLL<T> {
	
	private Node<T> last;
	
	CircularLL() {
		last = null;
	}
	
	public boolean isEmpty() {
		if(last == null)
			return true;
		return false;
	}
	
	public int size() {
		int s = 0;
		if(isEmpty())
			return 0;
		else {
			Node<T> temp = last.next;
			do {
				s++;
				temp = temp.next;
			}
			while(temp != last.next);
		}
		return s;
	}
	
	public void insert(T x) { //always insert at first
		if(isEmpty()) {
			Node<T> temp = new Node<T>(x);
			temp.next = temp;
			last = temp;
		}
		else {
			Node<T> temp = new Node<T>(x);
			temp.next = last.next;
			last.next = temp;
		}
	}
	
	public void insert(T x, int pos) {
		int size = size();
		
		if(pos < 1 || pos > size+1) {
			System.out.println("Invalid position");
			return;
		}
		if(size == 0 && pos != 1) {
			System.out.println("Invalid position list empty.");
			return;
		}
		else if(size == 0 && pos == 1) {
			Node<T> temp = new Node<T>(x);
			temp.next = temp;
			last = temp;
		}
		else if(pos == 1) {
			Node<T> temp = new Node<T>(x);
			temp.next = last.next;
			last.next = temp;
		}
		else if(pos == size+1) {
			Node<T> temp = new Node<T>(x);
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		else {
			Node<T> prev = last.next;
			
			for(int i = 2; i < pos; i++)
				prev = prev.next;
			
			Node<T> temp = new Node<T>(x);
			temp.next = prev.next;
			prev.next = temp;
		}
	}
	
	public void delete(int pos) {
		int size = size();
		
		if(pos < 1 || pos > size || (size == 1 && pos !=1)) {
			System.out.println("Invalid position");
			return;
		}
		else if(size == 1 && pos == 1) {
			Node<T> temp = last.next;
			System.out.println("Deleted : " + String.valueOf(temp.val));
			last = null;
		}
		else if(pos == 1) {
			Node<T> temp = last.next;
			System.out.println("Deleted : " + String.valueOf(temp.val));
			last = temp.next;
		}
		else if(pos == size) {
			Node<T> temp = last.next;
			while(temp.next != last)
				temp = temp.next;
			System.out.println("Deleted : " + String.valueOf(temp.next.val));
			temp.next = last.next;
			last = temp;
		}
		else {
			Node<T> prev = last.next;
			for(int i = 2; i < pos; i++)
				prev = prev.next;
			System.out.println("Deleted : " + String.valueOf(prev.next.val));
			prev.next = prev.next.next;
		}
	}
	
	public void output() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node<T> temp = last.next;
		do {
			System.out.print(String.valueOf(temp.val) + " ");
			temp = temp.next;
		}
		while(temp != last.next);
	}
}
