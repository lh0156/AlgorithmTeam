package com.backjoon.b300.q2004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		nCm의 끝자리 0의 개수를 출력하는 프로그램
		-n!/(n-m!)m!
		
		설계>
		1. BufferedReader 입력 받음.
		2. long 변수로 선언한 n과 m을 입력 값으로 초기화함.
		3. cntFive 변수에 getFivePower(n) - getFivePower(n-m) - getFivePower(m) 메소드 호출 후 저장함.
		4. getFivePower
			> cnt 변수 선언 후 0으로 초기화함.
			> while문 num이 5이상일 경우를 조건으로 사용
				> cnt 변수에 num을 5로 나눈 값 더함.
				> num을 5로 나눔.
			> cnt 리턴함.
		5. cntTwo 변수에 getTwoPower(n) - getTwoPower(n-m) - getTwoPower(m) 메소드 호출 후 저장함.
		6. getTwoPower; getFivePower의 5를 2로 변경한 메소드임.
		7. cntFive와 cntTwo 중 작은 값 출력함.
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		
		long n = Long.parseLong(input[0]);
		long m = Long.parseLong(input[1]);
		
		long cntFive = getFivePower(n) - getFivePower(n-m) - getFivePower(m);
		long cntTwo = getTwoPower(n) - getTwoPower(n-m) - getTwoPower(m);

		System.out.println(Math.min(cntFive, cntTwo));
	}

	private static long getTwoPower(long num) {
		int cnt = 0;
		
		while(num >= 2) {
			cnt += num / 2;
			num /= 2;
		}
		return cnt;
	}

	private static long getFivePower(long num) {
		int cnt = 0;
		
		while(num >= 5) {
			cnt += num / 5;
			num /= 5;
		}
		return cnt;
	}
}
