package com.backjoon.b300.q2004;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int twoCount = calcFactor(n, 2) - calcFactor(m, 2) - calcFactor(n - m, 2);
		int fiveCount = calcFactor(n, 5) - calcFactor(m, 5) - calcFactor(n - m, 5);

		int zeroCount = twoCount > fiveCount ? fiveCount : twoCount;
		
		System.out.println(zeroCount);
	}

	private static int calcFactor(int num, int factor) {
		
		int count = 0;
		
		while (num >= factor) {
			num /= factor;
			count += num;
		}
		
		return count;
	}

}