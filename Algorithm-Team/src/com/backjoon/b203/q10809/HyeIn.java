package com.backjoon.b203.q10809;

import java.util.Arrays;
import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		int[] nums = new int[26];
		
		//Arrays.fill(nums, -1);
		for(int i=0; i<nums.length; i++) {
			nums[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			
			if(nums[input.charAt(i) - 'a'] == -1) {
				nums[input.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
}
