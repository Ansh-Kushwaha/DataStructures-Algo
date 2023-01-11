// Author : Ansh Kushwaha | 11/01/2023

package stack.linkedstack;

public class LStack<T> {
	private Node<T> top;
	
	LStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public boolean isFull() {
		Node<T> temp = new Node<T>();
		return (temp == null);
	}
	
	public void push(T x) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		Node<T> temp = new Node<T>(x);
		temp.next = top;
		top = temp;	
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return;
		}
		top = top.next;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else
			return top.val;
	}
	
	public int size() {
		int s = 0;
		Node <T>temp = top;
		while(temp != null) {
			s++;
			temp = temp.next;
		}
		return s;
	}
	
	public void output() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Node<T> temp = top;
		while(temp != null) {
			System.out.println(String.valueOf(temp.val));
			temp = temp.next;
		}
	}
}
