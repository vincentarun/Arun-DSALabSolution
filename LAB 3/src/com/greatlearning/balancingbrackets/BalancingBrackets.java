package com.greatlearning.balancingbrackets;

import java.util.Stack;

public class BalancingBrackets {

	static Stack<Character> bracket = new Stack<Character>();

	public static boolean hasBalancedBrackets(String str) {
		Stack<Character> stack = new Stack<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char c = ch[i];
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (c == ')') {
					char temp = stack.pop();
					if (temp != '(') {
						return false;
					}
				} else if (c == ']') {
					char temp = stack.pop();
					if (temp != '[') {
						return false;
					}
				} else if (c == '}') {
					char temp = stack.pop();
					if (temp != '{') {
						return false;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		String inputString = "([[{}]])";

		if (hasBalancedBrackets(inputString)) {
			System.out.println("The given String is having balanced brackets");
		} else {
			System.out.println("The given String is not having balanced brackets");
		}

	}

}
