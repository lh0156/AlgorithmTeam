package com.backjoon.b300.q1929;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		//1. start, end 입력 
		//2. start ~ end for문
		//	2.1 i가 소수인지 확인
		//	2.2 소수면 출력
		
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for(int i=start; i <= end; i++) {
			
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int num) {
		
		if(num == 1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
