package com.backjoon.b201.q10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class HyunWoo {
	
	public static void main(String[] args) {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		char[] arr = null;
		int count = 0;
		try {
			arr = scan.readLine().toCharArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i] == '(') {
				stack.push(arr[i]);
			}else {
				stack.pop();
				if(arr[i-1] == '(') {
					count+=stack.size();
				}else {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
