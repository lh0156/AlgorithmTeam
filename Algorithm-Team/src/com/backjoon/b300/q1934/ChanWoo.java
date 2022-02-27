package com.backjoon.b300.q1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int amount = Integer.parseInt(rd.readLine());
		
		String[] input = rd.readLine().split(" ");
		
		int result = 0 ;
		
		for(int i = 0; i < amount; i++) {
			if(i == 1) {
				continue;
			}
			
			int check = 0;
			
			for(int j = 1; j < 101; j++) {
				
				if(check < 3) {
					
					if((Integer.parseInt(input[i]) % j) == 0) {
						check++;
					}
					
				if(j == 100) {
					result++;
				}
				
				}else {
					break;
				}
			}
		}
		
		System.out.println(result);
		
		
	}
}
