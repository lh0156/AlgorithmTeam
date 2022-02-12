package com.backjoon.b201.q10799;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe {
	/*
		잘려진 쇠막대기 조각의 총 개수 구하기
		- 모든 ( )는 반드시 레이저를 표현함. 
		- Stack 사용해서 ( 는 push, ) 는 pop
		
		설계>
		1. BufferedReader, Stack, peace 선언
		2. 괄효 표현 입력 받음.
		3. for 괄호의 길이
			> input의 i번째 char 변수에 초기화함.
			> if ( 인지?
				> stack에 push함.
				> 아니면 stack을 pop함.
				> peace에 stack의 size를 더함.
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		int peace = 0;
		
		String input = reader.readLine();
		
		for(int i=0; i<input.length(); i++) {
			char edge = input.charAt(i);
			
			if(edge == '(') {
				stack.push(edge);
			} else {
				stack.pop();
				peace += stack.size();
			}
		}
		
		System.out.println(peace);
	}
}
