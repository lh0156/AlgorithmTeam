package com.backjoon.b203.q1918;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class HyeIn {

	public static void main(String[] args) {
		
		//1. 문자		-> 그냥 출력
		//2. 연산자	-> 연산자끼리 우선순위 비교
		//		> 스택에 있는 연산자 우선순위가 더 크거나 같으면 pop
		//		> 아니면 push
		//3. '('	-> 스택에 push
		//4. ')'	-> ( 나올때까지 pop
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		StringBuilder output = new StringBuilder();
		
		Stack<Character> stack = new Stack<Character>();
		
		HashMap<Character, Integer> map =new HashMap<>();
		map.put('(', 0);
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		
		for(int i=0; i<input.length(); i++) {
			
			char c = input.charAt(i);
			
			switch (c) {
			case '+':
			case '-':
			case '*':
			case '/':
				while(!stack.isEmpty() && map.get(stack.peek()) >= map.get(c)) {
					output.append(stack.pop());
				}
				stack.push(c);
				break;
				
			case '(':
				stack.push(c);
				break;
				
			case ')':
				while(!stack.isEmpty()) {
					if(stack.peek() != '(') {
						output.append(stack.pop());						
					} else {
						stack.pop();
						break;
					}
				}
				break;
				
			default:
				output.append(c);
				break;
			}
		}
		
		while(!stack.isEmpty()) {
			output.append(stack.pop());
		}
		
		System.out.println(output);
	}
}
