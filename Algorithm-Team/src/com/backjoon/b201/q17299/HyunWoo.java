package com.backjoon.b201.q17299;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HyunWoo {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int size = Integer.parseInt(reader.readLine());
		String[] arr = reader.readLine().split(" ");
		int[] countArr =new int[arr.length];
		
		
		for(int i = 0 ; i < size ; i++) {
			int count=0;
			for(int j = 0 ; j < size ; j++) {
				if(Integer.parseInt(arr[i]) == Integer.parseInt(arr[j])) {
					count++;
				}
			}
			countArr[i]=count;
		}
		for(int i = 0 ; i < size ; i++) {
			if(i==size-1) {
				sb.append(-1);
				break;
			}else {
				for(int j = i+1 ; j < size ; j++) {
					if(countArr[i] < countArr[j]) {
						sb.append(arr[j]).append(" ");
						break;
					}else if(j==size-1) {
						sb.append(-1).append(" ");
						break;
					}
				}
			}
			
		}
		System.out.println(sb.toString());
	}
}
