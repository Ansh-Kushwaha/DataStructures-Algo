// Author : Ansh Kushwaha

package linkedlist.circularlinkedlist;

public class Test {
	public static void main(String[] args) {
		CircularLL<Integer> ll = new CircularLL<Integer>();
		ll.insert(1);
		ll.insert(5, 2);
		ll.insert(3);
		ll.insert(7, 2);
		System.out.println("Size : " + ll.size());
		ll.output(); // expected 3 7 1 5
		ll.delete(4);
		ll.delete(2);
		ll.output(); //expected 3 1
	}
}
