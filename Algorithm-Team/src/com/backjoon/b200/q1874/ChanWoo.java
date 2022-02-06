package com.backjoon.b200.q1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(rd.readLine());
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<String> array = new ArrayList<String>();
		
		Stack<Integer> stack = new Stack<>();
		int a = 1;
		
		for(int i = 0; i< input; i++) {
			int amount = Integer.parseInt(rd.readLine());
			result.add(amount);
		}
		
		
		stack.push(a);
		array.add("+");
		a++;
		
		for(int i = 0; i < result.size();) {
			
			int s = stack.peek();
			int r = result.get(i);
			if(s == r) {
				
				stack.pop();
				array.add("-");
				i++;
				
				if(stack.empty() == true) {
					if(result.size() == i) {
						break;
					}else {
						array.clear();
						array.add("NO");
						break;
					}
				}
			}else{
				stack.push(a);
				array.add("+");
				a++;
			}
		}
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
