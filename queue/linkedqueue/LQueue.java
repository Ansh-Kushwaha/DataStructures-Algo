// Author : Ansh Kushwaha | 11/01/0223

package queue.linkedqueue;

public class LQueue<T> {
	private Node<T> front;
	private Node<T> rear;
	
	LQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isFull() {
		Node<T> temp = new Node<T>();
		if(temp == null)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(front == null && rear == null)
			return true;
		return false;
	}
	
	public void enqueue(T x) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		
		if(isEmpty()) {
			Node<T> temp = new Node<T>(x);
			front = rear = temp;
		}
		else {
			Node<T> temp = new Node<T>(x);
			temp.next = rear.next;
			rear.next = temp;
			rear = temp;
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		
		if(front == rear) 
			front = rear = null;
		else {
			front = front.next;
		}
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		else
			return front.val;
	}
	
	public void output() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			System.out.print("Front");
			Node<T> temp = front;
			do {
				System.out.print(" -> " + String.valueOf(temp.val));
				temp = temp.next;
			}
			while(temp != rear.next); // Not correct
			System.out.print(" <- Rear");
		}
	}
}
