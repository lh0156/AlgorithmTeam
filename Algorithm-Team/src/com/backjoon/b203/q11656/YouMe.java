package com.backjoon.b203.q11656;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class YouMe {
	/*
		문자열의 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램
		
		설계>
		1. BufferedReader, suffix 배열 생성함. 
		2. 입력 값을 input 변수에 초기화함.
		3. for문 input의 길이 반복
			> substring으로 문자를 i번째 글자까지 잘라 i번째 배열에 초기화함.
		4. Arrays의 sort 메소드 사용해 정렬함.
		5. for문 suffix 반복 출력
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		String[] suffix = new String[input.length()];
		
		for(int i=0; i<input.length(); i++) {
			suffix[i] = input.substring(i);
		}
		
		Arrays.sort(suffix);
		
		for(int i=0; i<suffix.length; i++) {
			System.out.println(suffix[i]);
		}
	}
}
