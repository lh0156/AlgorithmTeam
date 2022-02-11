package com.backjoon.b201.q17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class YouMe {
	/*
	  문자열에서 단어만 뒤집기
	  	- 소문자, 숫자, 공백, <, >로 이루어짐.
	  	- 괄호(< >)사이의 단어는 뒤집지 않음.
	  
	  설계>
	  1. BufferedReader, stack, queue, isTag 선언
	  2. 문자열 입력 받기
	  3. for문 문자열의 길이
	  	> if i번째 글자가 < 인지?
	  		> isTag 변수에 true를 저장함
	  	> if isTag?
	  		> i번째 글자를 queue에 push함.
	  		> if i번째 글자가 공백인지?
	  			> reverse 메소드 호출
	  			> 모두 아니면 stack에 push함.
	  	> if i번째 글자가 > 인지?
	  		> isTag 변수에 false를 저장함.
	  4. reverse 메소드; stack의 값을 queue에 넣기 위한 메소드
	  	> 향상된 for문 stack 
	  		> queue에 push
	  5. getResult 메소드
	  	> 향상된 for문 queue
	  		> queue 출력
	 */
	private static BufferedReader reader;
	private static Stack<Character> stack;
	private static Queue<Character> queue;
	
	static {
		reader = new BufferedReader(new InputStreamReader(System.in)); 
		stack = new Stack<>();
		queue = new LinkedList<Character>();
	}

	public static void main(String[] args) throws Exception {
		String input = reader.readLine();
		boolean isTag = false;
		
		for(int i=0; i<input.length(); i++) {
			char letter = input.charAt(i);
			
			if(letter == '<') {
				isTag = true;
			}
			
			if(isTag) {
				queue.add(letter);
			} else if(letter == ' ') {
				reverse();
			} else {
				stack.push(letter);
			}
			
			if(letter == '>') {
				isTag = false;
			}
		}
		
		getResult();
	}

	private static void getResult() {
		for(char letter : queue) {
			System.out.print(letter);
		}
	}

	private static void reverse() {
		for(char letter : stack) {
			queue.add(letter);
		}
	}
}
