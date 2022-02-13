package com.backjoon.b201.q17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HyunWoo {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		int size = 0;
		String[] arr = null;
		try {
			size = Integer.parseInt(reader.readLine());
			arr = reader.readLine().split(" ");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < size ; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		
		for(int i = 0 ; i < size ; i++) {
			int max = 0;
			int nge=list.get(i);
			for(int j=i; j<size ; j++) {
				if(nge < list.get(j)) {
					max = list.get(j);
					result.add(list.get(j));
					break;
				}
				if(j == size-1 && max==0) {
					result.add(-1);
					break;
				}
			}
		}
		result.forEach(s->sb.append(s+" "));
		System.out.println(sb.toString().substring(0,sb.length()-1));

	}

}
