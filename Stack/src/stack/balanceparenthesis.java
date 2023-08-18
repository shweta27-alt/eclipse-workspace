package stack;

import java.util.Stack;

public class balanceparenthesis {
	public static void main(String[] args) {
		String ele = "a*(b+c)-(d*e)";
		System.out.println(checkparenthesis(ele));
	}
	
	static String checkparenthesis(String ele) {
		if(ele.isEmpty())
			return "balanced";
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<ele.length();i++) {
			char current = ele.charAt(i);
			
			if(current =='{' || current=='(' || current=='[') {
				stack.push(current);
			}
			
			if(current=='}'|| current==')' || current==']') {
				if(stack.isEmpty())
					return "not balanced";
				
				char last = stack.peek();
				
				if(current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					stack.pop();
				
				else
					return "not balanced";
			}
		}
		
		return stack.isEmpty()?"Balanced":"Not Balanced";
	}
}
