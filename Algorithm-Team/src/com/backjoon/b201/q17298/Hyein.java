package com.backjoon.b201.q17298;

import java.util.Scanner;
import java.util.Stack;

public class Hyein {

	public static void main(String[] args) {
		
		/*
		 * 이중 for문을 써야 하나..?  -> 시간초과..
		 * 
		 * 1. 입력
		 * 2. N번동안 for문
		 * 		2.1 stack이 비었는지 확인 && 현재 숫자가 stack에서 꺼낸 인덱스의 숫자보다 크면
		 * 		> nums[stack에서 꺼낸 인덱스] = 현재 숫자
		 * 		2.2 현재 인덱스 push
		 * 2. nums[스택에 남아있는 인덱스] = -1
		 * 3. 출력
		 * 
		 */

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = input.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<N; i++) {
			
			while(!stack.isEmpty() && nums[i] > nums[stack.peek()] ) {
				
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
