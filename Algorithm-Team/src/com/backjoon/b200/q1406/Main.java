package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
//		L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
//		D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
//		B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
//		삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
//		P $	$라는 문자를 커서 왼쪽에 추가함
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = null;
		int index=0;
		int count =0;
		try {
			String[] arr = scan.readLine().split("");
			list = new ArrayList<String>();
			for(int i=0 ;i <arr.length;i++) {
				list.add(i,arr[i]);
			}
			index = list.size();
			count = Integer.parseInt(scan.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder result = new StringBuilder();
		
		for(int i=0 ; i<count; i++) {
			StringBuilder inputString = null;
			try {
				inputString = new StringBuilder(scan.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			switch (inputString.toString().charAt(0)) {
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
					list.add(index,inputString.toString().charAt(2)+"");
					index++;
					break;
			}
		}
		
		for(int i=0;i<list.size();i++) {
			result.append(list.get(i));
		}
		
		System.out.println(result.toString());
		
	}

}
