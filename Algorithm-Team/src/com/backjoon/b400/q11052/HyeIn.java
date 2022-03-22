package com.backjoon.b400.q11052;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();

		int[] arr = new int[N + 1];
		int[] dp = new int[N + 1];

		for (int i=1; i<=N; i++) {
		    arr[i] = scan.nextInt();
		}

		for (int i=1; i<=N; i++) {
		    for (int j=1; j<=i; j++) {
			dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
		    }
		}

		System.out.println(dp[N]);

	}
}
