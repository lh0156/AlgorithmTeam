package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe2 {
	/*
		Stack으로 다시 풉니다,,
		
		설계>
		1. BufferedReader, Stack 선언
		2. 문자열과 갯수를 입력 받아 변수에 초기화함.
		3. setLeftStack 호출
		4. setLeftStack 메소드
			> for문 문자열 반복
			> stack에 i번째 문자를 push함. 
		4. for문 num 반복
			> 명령어 입력 받고 공백을 기준으로 쪼개서 명령 배열에 초기화함.
			> edit() 호출
		5. edit 메소드
			> 배열의 0번째 요소를 조건으로 switch문 생성
				> case L?
					> rightStack.push(leftStack.pop)
				> case D?
					> leftStack.push(rightStack.pop)
				> case B?
					> leftStack.pop
				> case P
					> leftStack.push
		6. getResult 호출
			> 향상된 for문 Stack 반복
				> print로 출력.
	 */
	private static Stack<Character> leftStack;
	private static Stack<Character> rightStack;
	
	static {
		leftStack = new Stack<>();
		rightStack = new Stack<>();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String content = reader.readLine();
		int num = Integer.parseInt(reader.readLine());
		
		setLeftStack(content);
		
		for(int i=0; i<num; i++) {
			String[] command = reader.readLine().split(" ");
			edit(command);
		}
		getResult();
	}

	private static void getResult() {
		while(!leftStack.empty()) {
			rightStack.push(leftStack.pop());
		}
		
		while(!rightStack.empty()) {
			System.out.print(rightStack.pop());
		}
	}

	private static void edit(String[] command) {
		switch(command[0]) {
			case "L":
				if(!leftStack.empty()) {
					rightStack.push(leftStack.pop());
				}
				break;
			case "D":
				if(!rightStack.empty()) {
					leftStack.push(rightStack.pop());
				}
				break;
			case "B":
				if(!leftStack.empty()) {
					leftStack.pop();
				}
				break;
			default :
				leftStack.push(command[1].charAt(0));
				break;
		}
	}

	private static void setLeftStack(String content) {
		for(int i=0; i<content.length(); i++) {
			leftStack.push(content.charAt(i));
		}
	}
}
