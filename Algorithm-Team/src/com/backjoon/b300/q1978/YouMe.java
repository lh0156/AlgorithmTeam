package com.backjoon.b300.q1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouMe {
	/*
		소수가 몇 개인지 찾아서 출력하는 프로그램
		
		설계>
		1. BufferedReader 생성
		2. 입력 값을 int로 형변환 후 testCase 변수에 초기화함.
		3. primeNum 변수 선언
		4. for문 testCase 반복
			> 입력 값을 int로 형변환 후 input 변수에 초기화함.
				> if문 input 변수를 매개로 isPrimeNum을 호출함.
					> primeNum ++
		5. isPrimeNum 메소드
			> for문 2부터 num 전까지 반복
				> if문 num이 i로 나누어 떨어지는가?
					> return false
			> return true
		6. primeNum 출력함.
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(reader.readLine());
		int primeNum = 0;
		
		for(int i=0; i<testCase; i++) {
			int input = Integer.parseInt(reader.readLine());
			if(isPrimeNum(input)) {
				primeNum++;
			}
		}
		
		System.out.println(primeNum);
	}

	private static boolean isPrimeNum(int num) {
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
