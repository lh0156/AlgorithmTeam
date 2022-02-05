package com.backjoon.b200.q9012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe {
	/*
		괄호가 닫힌 문자열인지 판단
		-문자열의 길이는 2이상 50이하
		
		설계>
		1. 필드에 boolean result 선언
		2. BufferedReader 생성
		3. 테스트 케이스 변수 선언 후 입력 받은 문자열을 정수로 형변환함.
		4. for 테스트 케이스 반복
			> input 변수를 입력 값으로 초기화
			> input을 매개로 isVps 호출해 result에 초기화함.
		5. isVps
			> Stack 선언
			> for문 input의 길이 반복
				> input의 i번째 문자를 char 변수에 초기화함.
				> if ps가 ( 인지?
					> 해당 값을 push함
					> if stack이 비었는지?
						> false를 리턴함.
						> stack이 존재하고 ps가 )일 경우는 pop 실행
			> if stack이 비었는지?
				> true를 반환
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<testCase; i++) {
			String input = reader.readLine();
			System.out.println(isVps(input) ? "YES" : "NO");
		}
	}

	private static boolean isVps(String input) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ps = input.charAt(i);
			
			if(ps == '(') {
				stack.push(ps);
			
			} else {
				if(stack.empty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		return stack.empty() ? true : false;
	}
}
