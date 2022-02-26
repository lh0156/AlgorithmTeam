package com.backjoon.b300.q1978;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 	소수찾기
		 	1. N = 소수인지 판별할 정수 개수
		 	2. count = 소수 개수
		 	3. N번 동안 for문
		 		3.1 num = 소수인지 판별할 정수
		 		3.2 2~num-1 동안 for문
		 			3.2.1 num%i == 0 이면 break
		 			3.2.2 for문 끝까지 돌면 count++
		 	4. count 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		
		while(N-- > 0) {
			
			int num = scan.nextInt();
			
			if(isPrime(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static boolean isPrime(int num) {
		
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
