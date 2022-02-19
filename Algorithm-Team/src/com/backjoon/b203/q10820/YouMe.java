package com.backjoon.b203.q10820;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램
		
		설계>
		1. BufferedReader
		2. while문 무한루프
			> 문자열을 입력 받음.
			> 해당 문자열을 매개로 각각의 숫자를 구하는 메소드인 countEachCase 호출
		3. print 메소드 
			>소문자, 대문자, 숫자, 공백 변수를 정수형으로 선언
			> for문 문자열의 길이
				> i번째 글자를 char 변수에 초기화함.
				> if 대문자인지?
					> 대문자 ++
				> else if 소문자인지?
					> 소문자 ++
				> else if 공백인지?
					> 공백 ++
				> else if 숫자인지?
					> 숫자 ++
			> 소문자, 대문자, 숫자, 공백 변수를 순서대로 출력함.
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			countEachCase(reader.readLine());
		}
		
	}

	private static void countEachCase(String input) {
		int lowerCase = 0;
		int upperCase = 0;
		int num = 0;
		int blank = 0;
		
		for(int i=0; i<input.length(); i++) {
			char letter = input.charAt(i);
			
			if(letter >= 'a' && letter <= 'z') {
				lowerCase++;
			} else if(letter >= 'A' && letter <= 'Z') {
				upperCase++;
			} else if(letter >= '0' && letter <= '9') {
				num++;
			} else {
				blank++;
			}
		}
		
		System.out.printf("%d %d %d %d", lowerCase, upperCase, num, blank);
	}
}
