package com.backjoon.b400.q11727;

import java.util.Scanner;

public class HyeIn {
	
	public static void main(String[] args) {
		
		/*
		 * dp[n] = dp[n-1] + dp[n-2] * 2
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] dp = new int[n+2];
		
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2] * 2) % 10007;
		}
		
		System.out.println(dp[n]);
	}

}
