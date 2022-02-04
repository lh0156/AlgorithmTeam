package com.backjoon.b200.q9093;

import java.util.Scanner;

public class ChanWoo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		Scanner rpl = new Scanner(System.in);
		
		for(int i = 0; i < input; i++) {
			
			String str = rpl.nextLine();
			String[] array = str.split(" ");
			String sum = "";
			for(int k = 0; k < array.length; k++) {
				for(int j = array[k].length()-1; j > -1; j--) {
					sum += array[k].substring(j,j+1);
				}
				sum += " ";
			}
			sum = sum.trim();
			System.out.println(sum);
			
		}
		rpl.close();
		sc.close();
	}
	
}
