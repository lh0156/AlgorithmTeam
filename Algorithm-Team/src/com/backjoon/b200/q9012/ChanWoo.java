package com.backjoon.b200.q9012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ChanWoo {
	public static void main(String[] args) throws Exception{
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(rd.readLine());
		
		ArrayList<String> array = new ArrayList<String>();
		
		for(int i = 0; i < input; i++) {
			int start = 0;
			String result = "NO";
			
			String str = rd.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				if(start == 0 && str.substring(j,j+1).equals(")")) {
					result = "NO";
					break;
				}else {
					if(str.substring(j,j+1).equals("(")) {
						start++;
					}else if(str.substring(j,j+1).equals(")")) {
						start--;
						result="YES";
					}
				}
			}
			if(start != 0) {
				result = "NO";
			}
			array.add(result);
		}
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
	}
}

