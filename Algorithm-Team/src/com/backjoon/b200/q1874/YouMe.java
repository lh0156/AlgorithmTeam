package com.backjoon.b200.q1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe {
	/*
		수열을 만들 수 있는지 없는지 계산하는 프로그램
		- push  연산은 +, pop 연산은 -로 표현함.
		- 최대 값이 나오면 이후 값들은 내림차순임.
		
		설계>
		1. BufferedReader, StringBuilder, Stack 필드에 선언
		2. Stack에 넣을 데이터인 num 변수 선언 후 1로 초기화함.
		3. max 변수에 입력 값을 초기화함.
		4. for문 max 반복
			> tern 선언 후 입력 값을 초기화
			> getTern 호출
		5. getTern 메소드
			> if문 tern이 num보다 큰지
				> temp 선언 후 num으로 초기화 
				> for문 temp부터 num까지
					> stack에 i를 push함.
					> sb에 '+' 저장
					> num ++
			> if문 stack의 peek값이 num이 아닌지?
				> "NO" 출력
				> 프로그램 끝내기
			> pop 호출 후 "-" 저장
			> num --
	 */
	private static BufferedReader reader;
	private static StringBuilder builder;
	private static Stack<Integer> stack;
	private static int num;
	
	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		builder = new StringBuilder();
		stack = new Stack<>();
		num = 0;
	}
	
	public static void main(String[] args) throws Exception {	
		int max = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<max; i++) {
			int tern = Integer.parseInt(reader.readLine());
			getTern(tern);
		}
		
		System.out.println(builder);
	}

	private static void getTern(int tern) {
		System.out.println(stack.empty() ? "empty" : stack.peek()+","+tern);
		if(tern > num) {
			for(int i=num+1; i<=tern; i++) {
				stack.push(i);
				builder.append("+\r\n");
			}
			num = tern;
			
		} else if(stack.peek() != tern) {
			System.out.println("NO");
			System.exit(0);
		}
		
		stack.pop();
		builder.append("-\r\n");
	}
}
