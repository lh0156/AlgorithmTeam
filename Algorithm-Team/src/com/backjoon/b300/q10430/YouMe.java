package com.backjoon.b300.q10430;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class YouMe {
	/*
		(A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C 구하는 프로그램
		
		설계>
		1. BufferedReader 생성
		2. 공백을 기준으로 입력 값을 쪼개 String input 배열에 초기화함.
		3. input 변수를 stream을 사용해 int형으로 형변환함.
		4. 결과 출력 
			> (num[1]+num[2])%num[3]
			> ((num[1]%num[3])+(num[2]%num[3]))%num[3] 
			> (num[1]*num[2])%num[3]
			> ((num[1]%num[3])*(num[2]%num[3]))%num[3]
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int[] num = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
		
		System.out.println((num[0]+num[1])%num[2]);
		System.out.println(((num[0]%num[2])+(num[1]%num[2]))%num[2]);
		System.out.println((num[0]*num[1])%num[2]);
		System.out.println(((num[0]%num[2])*(num[1]%num[2]))%num[2]);
	}
}
