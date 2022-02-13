package com.backjoon.b201.q17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class YouMe {
	/*
		오큰수 구하기
		- 수열의 오른쪽에 있으면서 해당 항보다 큰 수 중에서 가장 왼쪽에 있는 수
		- 없으면 -1
		
		설계>
		1. ArrayList, BufferedReader 선언
		2. 수열의 크기 입력 받은 후 변수에 초기화, 해당 크기로 list 생성함.
		3. for문 크기 반복
			> list 에 add함.
		4. for문 크기 반복
			> flag 변수 선언함.
			> for문 크기 반복
				> if list의 i보다 i+1이 큰지?
					> print로 출력 후 break함.
			> flag가 false면 -1 출력함.
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(reader.readLine());
		String[] sequence = reader.readLine().split(" ");
		
		ArrayList<Integer> list = new ArrayList<>(size);
		
		for(int i=0; i<size; i++) {
			list.add(Integer.parseInt(sequence[i]));
		}
		
		for(int i=0; i<size; i++) {
			boolean flag = false;
			
			for(int j=i+1; j<size; j++) {
				if(list.get(i) < list.get(j)) {
					System.out.print(list.get(j) + " ");
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.print("-1 ");
			}
		}
	}
}
