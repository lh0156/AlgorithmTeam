package com.backjoon.b301.q9613;

import java.util.Scanner;

public class YouMe {
	/*
		양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성
		
		1. Scanner 생성
		2. 입력 값을 int형으로 형변환 후 t에 초기화함.
		3. for문 t 반복
			> 입력 값을 길이로 하는 int 배열 선언
			> for문 입력 값 반복
				> 배열의 i번째 요소에 입력 값 저장
			> 배열을 매개로 getSumGcd 호출 후 출력함.
		4. getSumGcd 메소드; 
			> sum 변수 선언
			> for문 배열의 크기 반복
				> for문 배열의 크기 반복
					> i와 j를 매개로 getGcd 호출 후 sum에 더함
			> sum 리턴
		5. getGcd 메소드 
			> for문 둘 중 더 작은 수 역으로 반복
				> if n과 m이 i로 나누어 떨어지는지?
					> i 리턴함.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int[] nums = new int[n];
			
			for(int j=0; j<n; j++) {
				nums[j] = scan.nextInt();
			}
			
			System.out.println(getSumGcd(nums));
		}
		
	}

	private static long getSumGcd(int[] nums) {
		long sum = 0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				sum += getGcd(nums[i], nums[j]);
			}
		}
		
		return sum;
	}

	private static int getGcd(int n, int m) {
		for(int i=Math.min(n, m); i>0; i--) {
			if(n % i == 0 && m % i == 0) {
				return i;
			}
		}
		
		return 0;
	}
}
