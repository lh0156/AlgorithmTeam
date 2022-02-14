package com.backjoon.b201.q17299;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Hyein {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[] nums = new int[N];
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for(int i=0; i<N; i++) {
			nums[i] = input.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(count.get(nums[i]) != null) {				
				count.put(nums[i], 1 + count.get(nums[i]));
			} else {
				count.put(nums[i], 1);
			}
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<N; i++) {
			
			while(!stack.isEmpty() && count.get(nums[i]) > count.get(nums[stack.peek()]) ) {
				
				nums[stack.pop()] = nums[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			nums[stack.pop()] = -1;
		}
		
		
		for(int i=0; i<N; i++) {
			sb.append(nums[i]).append(' ');
		}
		
		System.out.println(sb);
		
	}
}