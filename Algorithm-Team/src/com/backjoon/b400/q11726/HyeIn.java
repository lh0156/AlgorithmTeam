package com.backjoon.b400.q11726;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		/*
		 * 2 x n 을 채우는 방법
		 * 1) n - 1 타일에서 2x1 타일 추가
		 * 2) n - 2 타일에서 1x2 타일 2개 추가
		 * 	=> 따라서 dp[n] = dp[n-1] + dp[n-2]
		 * 
		 * ※ n = 1일 때, dp[2] = 2 에서 ArrayIndexOutOfBounds 에러 발생
		 * 	=> new int[n + 1] 에서 new int[n + 2]로 수정
		 * 
		 * ※ 마지막 결과만 모듈 연산하면 Overflow 발생
		 * 	=> dp[i - 1] + dp[i - 2] 에서 (dp[i - 1] + dp[i - 2]) % 10007로 수정
		 */

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] dp = new int[n + 2];
		
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		
		System.out.println(dp[n]);
	}
}
