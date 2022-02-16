package com.backjoon.b203.q1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import javax.swing.text.StyleConstants.CharacterConstants;

public class YouMe {
	/*
		중위 표기식을 후위 표기식으로 고치는 프로그램
		- stack 사용해 연산자일 경우 저장할 것.
		- 괄호를 포함한 연산 우선순위를 구분하는 게 중요함. () > *, / > +, -
		
		설계
		1. BufferedReader와 Stack 선언함.
		2. 입력 값을 변수에 초기화함.
		3. for문 입력의 길이
			> if i번째 글자가 숫자인지?
				> 글자를 출력함.
				> 아닐 경우, if ( 인지?
					> stack에 저장
				> if ) 인지
					> while문 pop하기 위함.
						> (가 아니면 출력함.
				> 연산인 경우이므로 비교 후 저장함.
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		String input = reader.readLine();
		for(int i=0; i<input.length(); i++) {
			char letter = input.charAt(i);
			if(letter >= 'A' && letter <= 'Z') {
				System.out.print(letter);
			} else {
				if(letter == '(') {
					stack.push(letter);
				} else if(letter == ')') {
					while(!stack.empty() && stack.peek() != '(') {
						System.out.print(stack.pop());
					}
					System.out.print(stack.pop());
				}
			}
		}
	}
}
