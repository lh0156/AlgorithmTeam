package com.backjoon.b200.q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyeIn {

	static int[] stack;
	static int size = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1. stack은 정수를 저장할 배열, size는 정수가 저장된 현재 배열의 길이
		//2. 명령의 수 N 입력 받음
		//3. 길이가 N 배열 생성
		//4. N만큼 for문
		//		- push: stack[size]에 입력받은 숫자 저장, size++
		//		- pop: size가 0이면 -1 반환, 아니면 stack[size-1] 반환, size--
		//		- size: size 반환
		//		- empty: size가 0이면 1반환, 아니면 0반환
		//		- top: size가 0이면 -1 반환, 아니면 stack[size-1] 반환
		//5. 명령어가 push가 아닐때만 print
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		stack = new int[N];
		
		for(int i=0; i < N; i++) {
			
			int result = 0;
			String[] input = reader.readLine().split(" ");
			
			switch (input[0]) {
			
			case "push":
				push(Integer.parseInt(input[1]));
				break;
				
			case "pop":
				result = pop();
				break;
				
			case "size":
				result = size;
				break;
			
			case "empty":
				result = empty();
				break;
			
			case "top":
				result = top();
				break;

			default:
				break;
			}
			
			if(!input[0].equals("push")) {
				System.out.println(result);
			}
			
		}
		
	}


	private static int top() {
		
		if(size != 0) {
			return stack[size - 1];
		} else {
			return -1;
		}
	}


	private static int empty() {

		if(size == 0) {
			return 1;
		} else {
			return 0;
		}
		
	}

	private static int pop() {
				
		if(size != 0) {
			size--;
			return stack[size];
		} else {
			return -1;
		}

	}

	private static void push(int num) {
		
		stack[size] = num;
		size++;
		
	}
	
	
}
