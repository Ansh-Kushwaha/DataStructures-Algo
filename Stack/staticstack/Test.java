package stack.staticstack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		SStack<Integer> stack = new SStack<Integer>(5);
		int x;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			x = sc.nextInt();
			stack.push(x);
		}
		sc.close();
		System.out.println("Stack Output :");
		stack.output();
	}
}
