package com.backjoon.b203.q2743;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		단어의 길이를 출력하는 프로그램
		
		설계
		1. BufferedReader 생성
		2. 입력 값을 input 변수에 초기화함.
		3. input의 길이를 출력
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(reader.readLine().length());
	}
}
