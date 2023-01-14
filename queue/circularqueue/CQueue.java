// Author : Ansh Kushwaha | 14/01/2023
// Circular Queue for int data type only*

package queue.circularqueue;

public class CQueue {
	private int queue[];
	private int maxsize, front, rear;
	
	public CQueue() {
		queue = new int[10];
		maxsize = 10;
		front = rear = -1;
	}
	
	public CQueue(int n) {
		queue = new int[n];
		maxsize = n;
		front = rear = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if((rear + 1 % maxsize) == front)
			return true;
		return false;
	}
	
	public void enqueue(int x) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(isEmpty()) {
			front = rear = 0;
			queue[rear] = x;
			return;
		}
		else {
			rear = (rear + 1) % maxsize;
			queue[rear] = x;
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		else if(front == rear) {
			System.out.println("Deleted : " + queue[front]);
			front = rear = -1;
		}
		else {
			System.out.println("Deleted : " + queue[front]);
			front = (front + 1) % maxsize;
		}
	}
	
	public void output() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			System.out.print("front -> ");
			if(rear >= front) {
				for(int i = front; i <= rear; i++)
					System.out.print(queue[i] + " ");
			}
			else {
				for(int i = front; i < maxsize; i++)
					System.out.print(queue[i] + " ");
				for(int j = 0; j <= rear; j++)
					System.out.print(queue[j] + " ");
			}
			System.out.print("<- rear\n");
		}
	}
}
