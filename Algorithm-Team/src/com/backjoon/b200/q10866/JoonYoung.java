package com.backjoon.b200.q10866;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class JoonYoung {

	public static void main(String[] args) {
		
		//명령수 읽어보자
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //덱을 만들어보자
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        //뺑뺑이 돌려
        for (int i = 0; i < n; i++) {
        	
        	//명령어 입력받기
            String input = scan.next();
            
            //push_front일 경우 앞에 추가
            if(input.equals("push_front")){
            	
                deque.addFirst(scan.nextInt());
            
            //push_back일 경우 뒤에 추가
            } else if (input.equals("push_back")){
            	
                deque.addLast(scan.nextInt());
            
            //없으면 -1 아니면 앞에서 빼내기
            } else if (input.equals("pop_front")){
            	
                if (deque.size()<1) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }
            
            //없으면 -1 아니면 뒤에서 빼내기
            } else if (input.equals("pop_back")){
            	
                if(deque.size()<1){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            
            //덱 사이즈
            } else if (input.equals("size")){
            	
                System.out.println(deque.size());
            
            //비었니?
            } else if (input.equals("empty")){
            	
                if(deque.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            
            //맨 앞의 값 출력
            } else if (input.equals("front")){
            	
                if (deque.size()<1) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
             
            //맨 뒤의 값 출력 
            } else if (input.equals("back")){
                if (deque.size()<1) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }

            }
        }

    }

	
}
