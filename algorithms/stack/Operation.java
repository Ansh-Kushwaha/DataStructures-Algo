// Author : Ansh Kushwaha | 14/01/2023

package algorithms.stack;

import stack.linkedstack.LStack;
import stack.staticstack.SStack;

public class Operation<T> {
	public SStack<T> tempS;
	public LStack<T> tempL;
	public Operation() { }
	
	public int size(SStack<T> stack) {
		tempL = new LStack<T>();
		int s = 0;
		while(!stack.isEmpty()) {
			s++;
			tempL.push(stack.peek());
			stack.pop();
		}
		
		while(!tempL.isEmpty()) {
			stack.push(tempL.peek());
			tempL.pop();
		}
		return s;
	}
	
	public int size(LStack<T> stack) {
		tempL = new LStack<T>();
		int s = 0;
		while(!stack.isEmpty()) {
			s++;
			tempL.push(stack.peek());
			stack.pop();
		}
		
		while(!tempL.isEmpty()) {
			stack.push(tempL.peek());
			tempL.pop();
		}
		return s;
	}
	
	public void reverse(SStack<T> stack) {
		tempS = new SStack<T>();
	}
}
