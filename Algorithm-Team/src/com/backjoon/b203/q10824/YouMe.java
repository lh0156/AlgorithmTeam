package com.backjoon.b203.q10824;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		AB + CD 구하는 프로그램
		
		설계> 
		1. BufferedReader 선언
		2. 입력 값을 쪼개 num 배열에 초기화
		3. AB와 BC를 형변환 후 더해 sum 변수에 초기화함.
		4. sum 출력
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] num = reader.readLine().split(" ");
		
		long sum = Long.parseLong(num[0] + num[1])
					+ Long.parseLong(num[2] + num[3]);
		
		System.out.println(sum);
	}
}
