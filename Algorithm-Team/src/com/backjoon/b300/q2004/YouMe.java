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
		3. cntFive 변수에 getNthRootOf(n, 5) - getNthRootOf(n-m, 5) - getNthRootOf(m, 5) 메소드 호출 후 저장함.
		4. cntTwo 변수에 getNthRootOf(n, 2) - getNthRootOf(n-m, 2) - getNthRootOf(m, 2) 메소드 호출 후 저장함.
		5. getNthRootOf 메소드;
			> cnt 변수 선언 후 0으로 초기화함.
			> while문 input이 num 이상일 경우를 조건으로 사용
				> cnt 변수에 input을 num으로 나눈 값 더함.
				> input을 num으로 나눔.
			> cnt 리턴함.
		6. cntFive와 cntTwo 중 작은 값 출력함.
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		
		long n = Long.parseLong(input[0]);
		long m = Long.parseLong(input[1]);
		
		long cntFive = getNthRootOf(n, 5) - getNthRootOf(n-m, 5) - getNthRootOf(m, 5);
		long cntTwo = getNthRootOf(n, 2) - getNthRootOf(n-m, 2) - getNthRootOf(m, 2);

		System.out.println(Math.min(cntFive, cntTwo));
	}

	private static long getNthRootOf(long input, int num) {
		int cnt = 0;
		
		while(input >= num) {
			cnt += input / num;
			input /= num;
		}
		return cnt;
	}
}
