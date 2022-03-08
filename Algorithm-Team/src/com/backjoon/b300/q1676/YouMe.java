package com.backjoon.b300.q1676;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		N!에서 뒤에서 처음 0이 아닌 숫자가 나올 때까지 0의 개수 구하는 프로그램
		- 2 * 5 = 10
		
		설계>
		1. Buffered Reader 생성
		2. 입력 값을 num에 초기화 후, cnt 변수에 0 저장
		3. while문 num이 5보다 클 때
			> cnt에 num을 5로 나눈 값 저장
			> num을 5로 나눔.
	 	4. cnt 출력  
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int cnt = 0;
		
		while(num >= 5) {
			cnt += num / 5;
			num /= 5;
		}
		
		System.out.println(cnt);
	}
}
