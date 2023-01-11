package Stack.linkedstack;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		LStack<String> stack = new LStack<String>();
		String s;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			s = sc.nextLine();
			stack.push(s);
		}
		sc.close();
		System.out.println("Stack Output :");
		stack.output();
	}
}

