package com.backjoon.b201.q17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChanWoo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(rd.readLine());
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		
		String amount = rd.readLine().trim();
		
		String[] deck = amount.split(" ");
		
		for(int i = 0; i < input; i++) {
			number.add(Integer.parseInt(deck[i]));
		}
		
		
		for(int i = 0; i < input; i++) {

			if(i == input-1) {
				result.add(-1);
				break;
			}
			
			for(int j = i+1; j < input; j++) {
				
				if(number.get(i) <= number.get(j)) {
					result.add(number.get(j));
					break;
				}
				
				if(j == input-1) {
					result.add(-1);
				}
			}
			
		}
		
		for(int i = 0; i < result.size(); i++) {
			if(i == result.size()-1) {
				System.out.print(result.get(i));
			}else {
				System.out.print(result.get(i) + " ");
			}
			
			
		}
	
		
		
	}
}
