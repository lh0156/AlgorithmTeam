package com.backjoon.b301.q17087;

import java.util.Arrays;
import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 * 1. N = 동생 수, N 크기의 배열 distances 생성
		 * 2. S = 내 위치
		 * 3. N만큼 for문
		 * 		3.1 distances[i] = |동생들 위치 - 내 위치|
		 * 4. distances의 최대공약수 구하기
		 * 5. 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] distances = new int[N];
		int S = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			distances[i] = Math.abs(S - scan.nextInt());
		}
		
		System.out.println(getGcd(distances));
	}

	private static int getGcd(int[] distances) {
				
		Arrays.sort(distances);

		for(int i=distances[0]; i>1; i--) {
			
			boolean ok = false;
			
			for(int distance : distances) {
				if(distance % i == 0) {
					ok = true;
				} else {
					ok = false;
					break;
				}
			}
			
			if(ok) {
				return i;
			}
		}
		
		return 1;
	}
}
