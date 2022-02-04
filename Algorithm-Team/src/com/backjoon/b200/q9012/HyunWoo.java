package com.backjoon.b200.q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyunWoo {

	public static void main(String[] args) {
//		문자 입력 받기 
//		stack 에 ( 면 1 을 추가 ) 면 1을 뺴기 
//		최종 num가 0 이면 yes or no
		
		int count = 0;
		String result = "";
		BufferedReader scan = null;
		
		scan = new BufferedReader(new InputStreamReader(System.in));
		try {
			count = Integer.parseInt(scan.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i< count ;i++) {
			try {
				String vps = scan.readLine();
				int check = 0;
				for(int j=0 ; j<vps.length() ; j++) {
					if(vps.charAt(j)=='(') {
						check++;
					}else {
						check--;
					}
					if(check<0) {
						break;
					}
				}
				result+=check==0?"YES\n":"NO\n";
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);

	}

}
