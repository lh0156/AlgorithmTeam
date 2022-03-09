package com.backjoon.b301.q17103;

import java.util.Scanner;

public class HyeIn {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		final int MAX = 1000000;
		boolean[] isNotPrime = setPrime(MAX);

		while(T-- > 0) {
			
			int N = scan.nextInt();
			int count = 0;
			
			for(int i=2; i<=N/2; i++) {
				if(!(isNotPrime[i] || isNotPrime[N-i])) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}
	}

	private static boolean[] setPrime(int MAX) {
		
		boolean[] isNotPrime = new boolean[MAX+1];
				
		for(int i=2; i<=Math.sqrt(MAX); i++) {
			if(!isNotPrime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					isNotPrime[j] = true;
				}
			}
		}
		
		return isNotPrime;
	}

}
