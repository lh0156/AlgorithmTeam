package com.backjoon.b201.q10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hyein {

	public static void main(String[] args) throws IOException {
		
		/*
		 * stack을 사용해서 '(' 이면 push ')'이면 pop
		 * pop할 때 
		 * 		> 이전 괄호가 '('이면 count에 남아있는 '(' 개수 누적 > 레이저
		 * 		> 아니라면 count++ > 막대기끝
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		
		String input = reader.readLine();
		
		for(int i=0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			} else {
				stack.pop();
				
				if(input.charAt(i-1) == '(') {
					count += stack.size();					
				} else {
					count++;
				}
			}
			
		}
		
		System.out.print(count);
	}
}
