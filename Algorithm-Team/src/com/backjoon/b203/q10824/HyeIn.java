package com.backjoon.b203.q10824;

import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nums = scan.nextLine().split(" ");
		
		long num1 = Long.parseLong(nums[0] + nums[1]);
		long num2 = Long.parseLong(nums[2] + nums[3]);
		
		System.out.println(num1 + num2);
		
	}
}
