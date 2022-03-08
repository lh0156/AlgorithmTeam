package com.backjoon.b300.q1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouMe {
	/*
		N!에서 뒤에서 처음 0이 아닌 숫자가 나올 때까지 0의 개수 구하는 프로그램
		-> indexOf 사용
		
		설계>
		1. Buffered Reader 생성
		2. 입력 값을 num에 초기화 후, factorial 변수에 1 저장
		3. for문 num 역반복
			> factorial에 i 값 곱하기
	 	4. factorial의 길이 - factorial에서 0이 나온 index를 출력함. 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int factorial = 1;
		
		for(int i=num; i>0; i--) {
			factorial *= i;
		}
		
		System.out.println((factorial + "").length() - (factorial + "").indexOf("0"));
	}
}
