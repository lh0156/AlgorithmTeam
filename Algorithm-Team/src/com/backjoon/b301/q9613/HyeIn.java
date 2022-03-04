package com.backjoon.b301.q9613;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 * 1. 테스트 케이스 개수 입력
		 * 2. 테스트 케이스만큼 반복
		 * 		2.1 n = 양의 정수 개수
		 * 		2.2 n길이의 배열에 정수 넣어줌
		 * 		2.3 이중포문 돌면서 각 gcd 구해주고 sum에 누적
		 * 		2.4 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			
			int n = scan.nextInt();
			int[] nums = new int[n];
			long gcdSum = 0;
			
			for(int i=0; i<n; i++) {
				nums[i] = scan.nextInt();
			}
			
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					gcdSum += getGcd(nums[i], nums[j]);
				}
			}
			
			System.out.println(gcdSum);
		}
	}

	private static int getGcd(int num1, int num2) {
		
		int gcd = 1;
		int smallNum = num1 > num2 ? num2 : num1;
		
		for(int i=smallNum; i > 1; i--) {
			
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}
}
