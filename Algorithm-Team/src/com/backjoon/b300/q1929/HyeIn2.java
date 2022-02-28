package com.backjoon.b300.q1929;

import java.util.Arrays;
import java.util.Scanner;

public class HyeIn2 {
	
	/*
	 * 1. start, end 입력
	 * 2. prime = 소수인지 아닌지 담을 배열
	 * 3. prime 길이 = end+1
	 * 4. prime을 모두 true로 초기화, 모든 수를 소수라고 가정
	 * 5. 소수 찾는 메소드 호출
	 * 		> 1 = 소수 아님. false
	 * 		> 2 ~ 루트 end까지 for문
	 * 			> i가 소수가 아니라면 건너뜀
	 * 			> i가 소수라면 i의 제곱수부터 i의 배수들을 false로 만든다. (소수가 아님. i를 제외한 i배수들을 지우는 과정)
	 * 6. start ~ end for문
	 * 		> 소수면 출력
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		boolean[] prime = new boolean[end+1];
		Arrays.fill(prime, true);
		getPrime(prime);
		
		for(int i=start; i <= end; i++) {
			
			if(prime[i]) {
				System.out.println(i);
			}
		}
	}

	private static void getPrime(boolean[] prime) {
		
		prime[1] = false;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			
			if(!prime[i]) continue;
			
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = false;
			}
			
		}
	}
}
