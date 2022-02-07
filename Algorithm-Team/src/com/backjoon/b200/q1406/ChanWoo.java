package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChanWoo {
	public static void main(String[] args) throws IOException {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		String str = rd.readLine();
		int size = str.length()-1;
		
		int input = Integer.parseInt(rd.readLine());
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i = 0; i < str.length(); i++) {
			result.add(str.substring(i, i+1));
		}
		
		for(int i = 0; i < input; i++) {
			String ibruk = rd.readLine();
			ibruk = ibruk.trim();
			String[] array = ibruk.split(" ");
			
			if(ibruk.equals("L")) {
				size--;
			}else if(ibruk.equals("B")) {
				if(size != 0) {
					result.remove(size);
					size--;
				}
			}else if(ibruk.equals("D")) {
				size++;
			}else if(array[0].equals("P")) {
				result.add(size + 1, array[1]);
				size++;
			}
			
		}
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
		
	}
}
