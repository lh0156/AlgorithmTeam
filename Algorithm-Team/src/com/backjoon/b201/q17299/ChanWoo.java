package com.backjoon.b201.q17299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열의 입력
		int num = Integer.parseInt(bf.readLine());
		String[] input = bf.readLine().split(" ");
		
		// 결과값을 넣을 배열
		int[] result = new int[num];
		
		// 입력된 숫자를 담는 배열
		int[] nums = new int[num];
		for(int i = 0; i < num; i++)
			nums[i] = Integer.parseInt(input[i]);
		
		// 숫자들의 등장한 횟수를 담는 배열
		// 숫자가 100000까지 나오니 100000의 배열을 만들어 나오는 모든 수의 개수를 배열에 저장
		int[] nums_count = new int[1000001];
		for(int i = 0; i < num; i++)
			nums_count[nums[i]]+=1;
		
		// 인덱스 담을 Stack
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < num; i++) {
			//스택이 비어있는지 검사 비어있다면 i 푸쉬
			if(stack.isEmpty())
				stack.push(i);
			//개수배열과 현재 수를 전체 검색하여 
			while(!stack.isEmpty() && 
					//첫번째 루프 stack.peek() == 1, nums[1], nums_count[1] == 3
					//두번째 루프 stack.peek() == 2, nums[2], nums_count[2] == 1
					nums_count[nums[stack.peek()]] < nums_count[nums[i]]) {
				
				
				result[stack.pop()] = nums[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty())
			result[stack.pop()] = -1;
		
		for(int i = 0; i < num; i++)
			System.out.print(result[i]+" ");
		
	}
}
