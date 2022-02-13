package com.backjoon.b201.q17298;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HyunWoo {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int size = Integer.parseInt(reader.readLine());
		String[] arr = reader.readLine().split(" ");
		
		for(int i = 0 ; i < size ; i++) {
			int nge=Integer.parseInt(arr[i]);
			if(i == size-1) {
				sb.append(-1);
				break;
			}else {
				for(int j=i; j<size ; j++) {
					if(nge < Integer.parseInt(arr[j])) {
						sb.append(Integer.parseInt(arr[j])).append(" ");
						break;
					}else if(j == size-1) {
						sb.append(-1).append(" ");
						break;
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}
