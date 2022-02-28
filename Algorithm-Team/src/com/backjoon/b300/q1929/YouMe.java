package com.backjoon.b300.q1929;

import java.util.Scanner;

public class YouMe {
	/*
		M 이상 N 이하의 소수를 모두 출력하는 프로그램
		
		설계>
		1. Scanner 생성
		2. nextInt()로 입력 값을 min과 max에 초기화함.
		3. for문 min부터 max까지 반복
			> if문 i가 매개인 isPrimeNum 메소드를 조건으로 사용
				> 소수일 경우 i 출력함
		4. isPrimeNum
			> if문 num이 2인지?
				> true 리턴함.
			> for문 2부터 num까지 반복
				> if문 num이 i로 나누어떨어지는지?
					> false 리턴함.
			> true 리턴함.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		
		for(int i=min; i<=max; i++) {
			if(isPrimeNum(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrimeNum(int num) {
		if(num == 2) {
			return true;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
