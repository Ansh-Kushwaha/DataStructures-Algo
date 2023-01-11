// Author : Ansh Kushwaha | 11/01/2023

package Stack.staticstack;

import java.util.ArrayList;

public class SStack<T> {
	
	private ArrayList<T> stackArr;
	private int maxSize;
	private int top;
	
	SStack() {
		stackArr = new ArrayList<T>(10);
		maxSize = 10;
		top = -1;
	}
	
	SStack(int n) {
		stackArr = new ArrayList<T>(n);
		maxSize = n;
		top = -1;
	}
	
	public boolean isFull() {
		if(top == maxSize - 1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
	}
	
	public void push(T x) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			if(stackArr.size() > top) //Overriding
				stackArr.set(top, x);
			else
				stackArr.add(x);
		}
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Stack Underflow");
		else
			top--;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		else
			return stackArr.get(top); 
	}
	
	public void output() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			for(int i = top; i >=0; i--) {
				System.out.println(String.valueOf(stackArr.get(i)));
			}
		}
	}
}
