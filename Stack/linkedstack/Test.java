package stack.linkedstack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		LStack<Integer> stack = new LStack<Integer>();
		int s;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			s = sc.nextInt();
			stack.push(s);
		}
		sc.close();
		System.out.println("Stack Output :");
		stack.output();
	}
}

