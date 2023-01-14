// Author : Ansh Kushwaha

package queue.circularqueue;

public class Test {
	public static void main(String[] args) {
		CQueue cq = new CQueue(4);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.dequeue();
		cq.enqueue(5);
		cq.output();
	}
}
