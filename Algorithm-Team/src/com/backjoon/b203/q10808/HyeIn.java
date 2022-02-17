package com.backjoon.b203.q10808;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		int[] nums = new int[26];
		
		for(int i=0; i<input.length(); i++) {
			nums[input.charAt(i) - 'a'] += 1;
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");			
		}
		
	}
}
