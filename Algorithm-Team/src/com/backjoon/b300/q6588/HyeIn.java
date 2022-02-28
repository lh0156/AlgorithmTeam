package com.backjoon.b300.q6588;

import java.util.Arrays;
import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 * 1. 1000000까지 소수인지 아닌지 담을 배열 isPrime 초기화
		 * 2. n = 입력된 정수
		 * 		> n == 0 이면 break
		 * 		> 아니면 3 ~ n/2 까지 for문
		 * 			> isPrime[i] 와 isPrime[n-i]가 소수라면 골드바흐O -> 출력
		 * 		> 만족하는 소수가 없으면 "Goldbach's conjecture is wrong." 출력
		 */
		
		Scanner scan = new Scanner(System.in);

		final int MAX = 1000000;
		boolean[] isPrime = new boolean[MAX + 1];
		Arrays.fill(isPrime, true);
		
		for(int i=2; i<=Math.sqrt(MAX); i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					isPrime[j] = false;
				}
			}
		}

		while(true) {	
			
			int n = scan.nextInt();
			boolean correct = false;
			
			if(n == 0) {
				break;
			}
			
			for(int i=3; i<=n/2; i+=2) {
				if(isPrime[i] && isPrime[n-i]) {
					System.out.println(n + " = " + i + " + " + (n-i));
					correct = true;
					break;
				}
			}
			
			if(!correct) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			
		}
		
	}
}
