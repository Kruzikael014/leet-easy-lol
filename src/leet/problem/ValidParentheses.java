package leet.problem;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		if (s.length() % 2 != 0) return false;
		
		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek().compareTo(c) >= -2 && stack.peek().compareTo(c) <= -1) {
				stack.pop();
			}
			else {
				stack.push(c);
			}
		}
		return stack.isEmpty() ? true : false;
	}

}
