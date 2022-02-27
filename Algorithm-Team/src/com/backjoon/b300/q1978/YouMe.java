package com.backjoon.b300.q1978;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		소수가 몇 개인지 찾아서 출력하는 프로그램
		
		설계>
		1. BufferedReader 생성
		2. 입력 값을 int로 형변환 후 testCase 변수에 초기화함.
		3. 입력 값을 쪼개 input 배열에 초기화함.
		4. primeNum 변수 선언
		5. for문 testCase 반복
			> if문 input 배열의 i번째 요소를 매개로 isPrimeNum을 호출함.
				> primeNum ++
		6. isPrimeNum 메소드
			> if문 num이 1인지?
				> return false
			> for문 2부터 num 전까지 반복
				> if문 num이 i로 나누어 떨어지는가?
					> return false
			> return true
		7. primeNum 출력함.
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(reader.readLine());
		String[] input = reader.readLine().split(" ");
		int primeNum = 0;
		
		for(int i=0; i<testCase; i++) {
			if(isPrimeNum(Integer.parseInt(input[i]))) {
				primeNum++;
			}
		}
		
		System.out.println(primeNum);
	}

	private static boolean isPrimeNum(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
