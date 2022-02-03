package com.backjoon.b200.q10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe {
	/*
		정수를 저장하는 스택을 구현한 다음, 
		입력으로 주어지는 명령을 처리하는 프로그램 작성
		
		설계>
		1. 필드에 Stack 객체 생성
		2. Scanner
		3. 숫자 입력 받음
		4. for문 숫자 만큼 반복
			> 문자열 입력 받음.
			> 공백을 기준으로 쪼개서 String 배열 생성
			> 배열을 매개로 getResult 호출
		5. getResult 메소드
			> switch문 생성 조건은 temp[0]
					> case push; stack에 temp[1] 추가
					> case pop; 마지막 값을 꺼내 출력
					> case size; 요소 개수 출력
					> case empty
						> if stack이 비었는지? 
								> 1 출력
								> 비었으면 0 출력
					> case top; 마지막 값을 그냥 출력
	 */
	private static Stack<String> stack;
	private static BufferedReader reader;
	
	static {
		stack = new Stack<String>();
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<n; i++) {
			String input = reader.readLine();
			String[] command = input.split(" ");
			
			getResult(command);
		}
	}

	private static void getResult(String[] command) {
		switch (command[0]) {
			case "push":
				stack.push(command[1]);
				break;
				
			case "size":
				System.out.println(stack.size());
				break;
				
			case "pop":
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				break;
				
			case "empty":
				if(stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
				
			case "top":
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				break;
		}
	}
}
