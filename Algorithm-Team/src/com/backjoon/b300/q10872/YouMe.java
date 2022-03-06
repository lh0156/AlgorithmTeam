package com.backjoon.b300.q10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouMe {
	/*
		N!을 출력하는 프로그램
		
		설계>
		1. BufferedReader 생성
		2. 숫자 입력 받은 후 num 변수에 초기화하고 factorial 변수에 1을 초기화함.
		3. if 입력 값이 0이 아닌지?
			> for문 숫자의 갯수 역반복
				> factorial 변수에 i를 곱함.
		4. factorial 출력
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int factorial = 1;
		
		for(int i=num; i>0; i--) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}
}
