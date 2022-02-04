package com.backjoon.b200.q9012;

import java.util.Scanner;
import java.util.Stack;

public class Hyein {
	
	public static void main(String[] args) {
		
		//1. 입력받은 괄호 문자열을 매개변수로 하는 check 메소드 실행
		//2. 문자열 길이동안 for문
		//	2.1 '('이면 stack에 push, 아니면 pop
		//		- pop 할 때 stack 비어있는지 확인. 비어있으면 NO 반환
		//	2.2 for문이 끝나고 stack이 비어있는지 확인. 비어있으면 YES 반환. 아니면 NO반환
		//3. 출력
		
		Scanner input = new Scanner(System.in);
		
		//참나 nextInt 썼다고 런타임 에러 남; 주의하자!
		int T = input.nextInt();
		input.nextLine();
		
		for(int i=0; i < T; i++) {
			
			String str = input.nextLine();
			String result = check(str);
			
			System.out.println(result);
			
		}
	}

	private static String check(String str) {

		Stack<Integer> stack = new Stack<Integer>();
		
		String result = "NO";
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == '(') {
				stack.push(1);
			} else {
				if(stack.empty()) {
					return result;
				} else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			result = "YES";
		}
		
		return result;
		
	}
	
}
