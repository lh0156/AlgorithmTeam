package com.backjoon.b300.q6588;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouMe {
	/*
		짝수를 두 홀수 소수의 합으로 나타내는 프로그램
			- 0이 입력되면 종료
		
		설계>
		1. Scanner 생성
		2. while문 무한 루프
			> 입력 값을 input 변수에 초기화함.
			> if문 input이 0인지?
				> 루프 종료함.
				> 0이 아닐 경우 입력 값을 매개로 verify 메소드 호출함.
		3. verify; num을 두 홀수소수의 합으로 나타낼 수 있는지 검증하는 메소드
			> for문 2부터 num/2 반복
				> if문 i를 매개로 isPrimeNum을 조건으로 사용
					> if문 num - i를 매개로 isPirmeNum을 조건으로 사용
						> num = i + (num - i) 출력 후 return 함.
			> Goldbach's conjecture is wrong 출력함.
		4. isPrimeNum 메소드
			> if문 num이 2인지?
				> true를 리턴함.
			> for문 2부터 num의 제곱근까지 반복함.
				> if문 num이 i로 나누어 떨어지는지?
					> false를 리턴함.
			> true 리턴함.
	 */
	private static StringBuilder builder;
	private static BufferedReader reader;
	
	static {
		builder = new StringBuilder();
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) throws Exception {
		while(true) {
			int input = Integer.parseInt(reader.readLine());
			
			if(input == 0) {
				System.out.println(builder);
				break;
			} else {
				verify(input);
			}
		}
	}

	private static void verify(int num) {
		for(int i=2; i<=num/2; i++) {
			if(isPrimeNum(i)) {
				if(isPrimeNum(num-i)){
					builder.append(num + " = " + i + " + " + (num-i)).append("\n");
					return;
				}
			}
		}
		builder.append("Goldbach's conjecture is wrong.").append("\n");
	}

	private static boolean isPrimeNum(int num) {
		if(num == 2) {
			return true;
		} 

		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
