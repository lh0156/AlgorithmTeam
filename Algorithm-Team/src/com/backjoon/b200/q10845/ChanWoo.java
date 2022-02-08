package com.backjoon.b200.q10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ChanWoo {
	public static void main(String[] args) throws Exception{
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(rd.readLine());
		
		ArrayList<String> queue = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i = 0; i < input; i++) {
			
			String question = rd.readLine().trim();
			String[] str = question.split(" ");
			
			if(str[0].equals("push")) {
				queue.add(str[1]);
				System.out.println(queue);
				
			}else if(str[0].equals("pop")){
				if(queue.isEmpty() == true) {
					result.add(-1+"");
				}else {
					System.out.println("삭제 : "+queue.get(0));
					result.add(queue.get(0));
					queue.remove(0);
					System.out.println(queue);
				}
			}else if(str[0].equals("size")) {
				result.add(queue.size()+"");
			}else if(str[0].equals("empty")) {
				if(queue.isEmpty() == true) {
					result.add(1+"");
				}else{
					result.add(0+"");
				}
			}else if(str[0].equals("front")) {
				if(queue.isEmpty() == true) {
					result.add(-1+"");
				}else {
					System.out.println("프론트 : "+queue.get(0));
					result.add(queue.get(0));
					System.out.println(queue);
				}
				
			}else if(str[0].equals("back")) {
				if(queue.isEmpty() == true) {
					result.add(-1+"");
				}else {
					System.out.println("백 : "+queue.get(queue.size()-1));
					result.add(queue.get(queue.size()-1));
					System.out.println(queue);
				}
			}

		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		
		
	}
	
}
	


//String question = rd.readLine().trim();
//String[] str = question.split(" ");
//
//if(str[0].equals("push")) {
//	queue.add(str[1]);
//	System.out.println(queue);
//	
//}else if(str[0].equals("pop")){
//	if(queue.isEmpty() == true) {
//		result.add(-1+"");
//	}else {
//		System.out.println("삭제 : "+queue.get(0));
//		result.add(queue.get(0));
//		queue.remove(0);
//		System.out.println(queue);
//	}
//}else if(str[0].equals("size")) {
//	result.add(queue.size()+"");
//}else if(str[0].equals("empty")) {
//	if(queue.isEmpty() == true) {
//		result.add(1+"");
//	}else{
//		result.add(0+"");
//	}
//}else if(str[0].equals("front")) {
//	if(queue.isEmpty() == true) {
//		result.add(-1+"");
//	}else {
//		System.out.println("프론트 : "+queue.get(0));
//		result.add(queue.get(0));
//		System.out.println(queue);
//	}
//	
//}else if(str[0].equals("back")) {
//	if(queue.isEmpty() == true) {
//		result.add(-1+"");
//	}else {
//		System.out.println("백 : "+queue.get(queue.size()-1));
//		result.add(queue.get(queue.size()-1));
//		System.out.println(queue);
//	}
//}
//
//}
//
//for(int i = 0; i < result.size(); i++) {
//System.out.println(result.get(i));
//}