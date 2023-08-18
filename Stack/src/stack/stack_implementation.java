package stack;

import java.util.Stack;

public class stack_implementation {
	static final int MAX=10;
	int top;
	int[] a = new int[MAX];
	
	
	 stack_implementation() {
		top = -1;
	}
	
	 
	boolean push(int x) {
		if(top>= (MAX-1)) {
			System.out.println("Stack is overflow");
			return false;
		} 
		else {
			a[++top]=x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
	
	
	
	
	int pop() {
		if(top<0) {
			System.out.println(" Stack underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
		
	}
	
	
	
	int peek() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x =a[top];
			return x;
		}
	}
	
	
	int size() {
		return (top+1);
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	
	boolean isFull() {
		return top==MAX-1;
	}

}


class main{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop()+" popped from the stack");
		System.out.println(s.size());
		System.out.println(s.peek()+ " is top element");
		String result;
		System.out.println(result= (s.isEmpty())? "stack is empty": "stack is not empty");
		System.out.println(result= (s.isFull())? "stack is full": "stack is not full");
		
	}
}

















