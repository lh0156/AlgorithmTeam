package com.backjoon.b200.q1158;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		//스캐너로 읽어보자
		Scanner scan = new Scanner(System.in);
		
		//n하구 k 입력받아야지
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		//입력값을 잘라서 더하기 위해 StringBuilder 사용
		StringBuilder sb = new StringBuilder();
		
		//맨 앞에 괄호
		sb.append("<");
		
		//새로운 queue를 생성 선입선출로 빼야하니까
		Queue<Integer> list = new LinkedList<>();
		
		//list에 숫자를 담아보자
		for (int i=1; i<=n; i++) {
			list.offer(i); 
		}
		
		//위칫값을 받아주는 index
		int index = 0;
		
		//인덱스 값을 하나씩 늘리면서 뺑뺑이 입력값 k로 나눈값을 poll하여 sb에 담기
		while(!list.isEmpty()) {
			
			index++;
			if(index % k == 0) {
				sb.append(list.poll()+", "); 
			}
			else list.offer(list.poll()); 
		}
		
		//마지막 줄 append , 제거
		sb.delete(sb.length()-2, sb.length());
		
		//닫아주기
		sb.append(">");
		
		//결과 출력
		System.out.println(sb.toString());
	}


	
}
