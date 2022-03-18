package com.backjoon.b400.q9095;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(dp[scan.nextInt()]);
		}
	}
}
