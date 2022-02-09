package com.backjoon.b200.q1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChanWoo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력 받기
		//받은 앞수만큼 배열 만들기
		//앞자리를 뒤로 보내기 + 뒷수만큼 돌았으면 그자리 수 result에 넣고 삭제 및 돌리는 수 0으로 저장
		
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine().trim();
		
		String[] str = input.split(" ");
		
		ArrayList<Integer> circle = new ArrayList<Integer>();
		ArrayList<String> result = new ArrayList<String>();
	
		
		int cir = 0;
		
		
		int count = Integer.parseInt(str[0]);
		int amount = Integer.parseInt(str[1]);
		

		for(int i = 1; i <= count; i++) {
			circle.add(i);
		}

		
		while(circle.size() != 0) {
			
			if(cir == amount -1) {
				result.add(circle.get(0)+"");
				circle.remove(0);
				cir = 0;
			}else {
				circle.add(circle.get(0));
				circle.remove(0);
				cir++;
				
			}
			
			
		}
		
		System.out.println(result);
		
		
	}
}
