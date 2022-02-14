package com.backjoon.b201.q17299;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class YouMe {
	/*
		오등큰수 구하기
		- A1 오등큰수? 오른쪽에 있으면서 수열 A에서 등장한 횟수가 A1보다 큰 수 중에서 가장 왼 쪽에 있는 수
		- 오등큰수가 없으면 -1 반환
		- HashMap 사용
		
		설계>
		1. BufferedReader, HashMap 선언
		2. 입력 값을 size에 초기화함.
		3. term 배열 선언 후 공백을 기준으로 입력을 쪼개서 배열에 초기화함.
		4. for문 size 반복
			> if문 map에 term의 i번째 요소가 있는지? ; map.get(term[i])
				> map에 i번째 요소를 key로 갖는 value ++
			 	> 없으면 map에 i번째 요소를 key로 value는 1으로 설정함.
		5. for문 size 반복
			> flag 선언
			> for문 1 ~ size
				> map.get(term[j])가 map.get(term[i]) 보다 큰지?
				> flag true로 저장함.
				> map.get(term[j]) 출력
			> if flag가 false?
				> -1 출력
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<>();
		
		int size = Integer.parseInt(reader.readLine());
		String[] term = reader.readLine().split(" ");
		
		for(int i=0; i<size; i++) {
			if(map.containsKey(term[i])) {
				map.put(term[i], map.get(term[i]) + 1);
			} else {
				map.put(term[i], 1);
			}
		}
		
		for(int i=0; i<size; i++) {
			boolean flag = false;
			
			for(int j=i; j<size; j++) {
				if(map.get(term[j]) > map.get(term[i]) && !flag) {
					flag = true;
					System.out.print(term[j] + " ");
				}
			}
			
			if(!flag) {
				System.out.print(-1 + " ");
			}
		}
	}
}
