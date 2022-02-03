package com.backjoon.b200.q10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe {
	/*
		정수를 저장하는 스택을 구현한 다음, 
		입력으로 주어지는 명령을 처리하는 프로그램 작성
		
		설계>
		1. 필드에 Integer로 Stack 객체 생성
		2. Scanner
		3. 숫자 입력 받음
		4. for문 숫자 만큼 반복
			> 문자열 입력 받음.
			> 공백을 기준으로 쪼개서 String 배열 생성
			> 배열을 매개로 getResult 호출후 result에 초기화함.
			> if 명령이 push가 아닌지?
				> 결과 출력
		5. getResult 메소드
			> switch문 생성 조건은 temp[0]
					> case pop; 마지막 값 꺼내서 반환
					> case size; 요소 개수 반환
					> case empty
						> if stack이 비었는지? 
								> 1 반환
								> 비었으면 0 
					> case top; 마지막 값을 그냥 반환
					> default 
						> stack에 temp[1] 추가
						> -2 반환
	 */
	private static Stack<Integer> stack;
	private static BufferedReader reader;
	
	static {
		stack = new Stack<>();
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<n; i++) {
			String input = reader.readLine();
			String[] command = input.split(" ");
			
			int result = getResult(command);
			
			if(!command[0].equals("push")) {
				System.out.println(result);
			}
		}
	}

	private static int getResult(String[] command) {
		switch (command[0]) {
			case "pop":
				if(stack.empty()) {
					return -1;
				} else {
					return stack.pop();
				}
				
			case "empty":
				if(stack.empty()) {
					return 1;
				} else {
					return 0;
				}
				
			case "top":
				if(stack.empty()) {
					return -1;
				} else {
					return stack.peek();
				}
				
			case "size":
				return stack.size();
				
			default:
				int num = Integer.parseInt(command[1]);
				stack.push(num);
				return -2;
		}
	}
}
