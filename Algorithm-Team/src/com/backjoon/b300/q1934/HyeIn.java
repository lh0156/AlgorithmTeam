package com.backjoon.b300.q1934;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 	1. T = 테스트 케이스 개수
		 	2. T만큼 for문
		 		2.1 A, B = 정수
		 		2.2 최소공배수 구하기
		 			2.2.1 A,B 중 작은 수 구하기
		 			2.2.2 작은 수 ~ 2 까지 for문
		 			2.2.3 i로 나눌 때 A, B 둘 다 나누어 떨어지면 그 수가 최대공약수. break
		 			2.2.4 return a * b / 최대공약수
		 		2.3 최소공배수 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println(getCommonMultiple(A, B));
			
		}
		
	}

	private static Integer getCommonMultiple(int a, int b) {
		
		int smallNum = (a > b) ? b : a;
		int commonDivisor = 1;
		
		for(int i=smallNum; i>1; i--){
			
			if(a%i == 0 && b%i == 0) {
				commonDivisor = i;
				break;
			}
		}
		
		return a * b / commonDivisor;
	}
}
