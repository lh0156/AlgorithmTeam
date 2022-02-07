package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HyunWoo {
	
	public static void main(String[] args) throws Exception {
//		L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
//		D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
//		B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
//		삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
//		P $	$라는 문자를 커서 왼쪽에 추가함
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int index =0;
		int count =0;
		char[] arr = scan.readLine().toCharArray();
		List<Character>list = new ArrayList<Character>();
		for(int i=0 ;i <arr.length;i++) {
			list.add(i,arr[i]);
		}
		index = list.size();
		count = Integer.parseInt(scan.readLine());
		StringBuilder result = new StringBuilder();
		
		for(int i=0 ; i<count; i++) {
			StringBuilder inputString = new StringBuilder(scan.readLine());
			switch (inputString.charAt(0)) {
				case 'L':
					index=index!=0?index-1:0;
					break;
				case 'D':
					index=index != list.size()?index+1:list.size();
					break;
				case 'B':
					if(index==0) {
					}else {
						list.remove(index-1);
						index=index!=0?index-1:0;
					}
					break;
				case 'P':
					list.add(index,inputString.charAt(2));
					index++;
					break;
			}
		}
		System.out.print(list.toString().replaceAll("[\\, \\s \\[ \\]]", "")); 
		
	}

}
