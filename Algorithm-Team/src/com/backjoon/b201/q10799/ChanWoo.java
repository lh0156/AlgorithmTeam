package com.backjoon.b201.q10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		String str = rd.readLine();
		
		Stack<String> stack = new Stack<String>(); 
		
		int result = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.add("(");
			}else if(str.charAt(i) == ')') {
				stack.pop();
				if(str.charAt(i-1) == '(') {
					result += stack.size();
				}else {
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
}
