package com.backjoon.b300.q1929;

import java.util.HashMap;
import java.util.Scanner;

public class YouMe {
	/*
		M 이상 N 이하의 소수를 모두 출력하는 프로그램
			- 에라토스테네스의 체 사용; N 까지의 소수를 구할 경우
				- 2는 소수이므로 N이하 2의 배수를 모두 지움.
				- 남아있는 수 가운데 3은 소수이므로, 3의 배수를 모두 지움.
				- 위의 과정을 반복하며 구하는 구간의 소수를 제외한 배수들은 모두 지움.
				- N이 120일 경우 11^2 > 120 이므로 11보다 작은 수의 배수들만 지워도 충분함.
			- HashMap 사용 
		
		설계>
		1. Scanner 생성
		2. nextInt()로 입력 값을 min과 max에 초기화함.
		3. key가 int, 값이 boolean인 HashMap 선언
		4. for문 max까지 반복
			> if문 i가 min보다 작은지?
				> 작을 경우 map의 키를 i로, false 저장
				> 같거나 클 경우 true 저장
		5. setSieve 메소드 호출
			> if문 key 중 1이 있는지?
				> value를 false로 바꿈.
			> for문 2부터 map.size의 제곱근을 반복함.
				> if문 i를 매개로 isPirmeNum 호출.
					> i를 매개로 exceptCompositeNum 호출함.
		6. isPrimeNum 메소드 
			> if문 num이 2인지?
				> true 리턴함.
			> for문 2부터 num까지 반복
				> if문 num이 i로 나누어떨어지는지?
					> false 리턴함.
			> true 리턴함.
		7. exceptCompositeNum 메소드
			> for문 map.size 반복
				> if문 i로 나누어 떨어지는지?
					> value를 false로 바꿈
		8. for문 map.size 반복
			> if문 value?
				> i 출력함.
	 */
	private static HashMap<Integer, Boolean> map;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		
		map = new HashMap<>(max);
		for(int i=1; i<=max; i++) {
			if(i < min) {
				map.put(i, false);
			} else {
				map.put(i, true);
			}
		}
		
		setSieve();
		
		for(int i=min; i<=max; i++) {
			if(map.get(i)) {
				System.out.println(i);
			}
		}
	}

	private static void setSieve() {
		if(map.containsKey(1)) {
			map.put(1, false);
		}
		
		for(int i=2; i<Math.sqrt(map.size()); i++) {
			if(isPrimeNum(i)) {
				exceptCompositeNum(i);
			}
		}
		
	}

	private static void exceptCompositeNum(int num) {
		for(int i=1; i<=map.size(); i++) {
			if(map.containsKey(i) && i % num == 0 && i != num) {
				if(map.get(i)) {
					map.put(i, false);
				}
			}
		}
	}

	private static boolean isPrimeNum(int num) {
		if(num == 2) {
			return true;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
