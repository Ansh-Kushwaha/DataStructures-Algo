package queue.linkedqueue;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		LQueue<Character> queue = new LQueue<Character>();
		char s;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			s = sc.nextLine().charAt(0);
			queue.enqueue(s);
		}
		sc.close();
		System.out.println("Queue Output :");
		queue.output();
	}
}

