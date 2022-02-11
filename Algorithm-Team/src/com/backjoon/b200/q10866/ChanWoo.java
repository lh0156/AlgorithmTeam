package com.backjoon.b200.q10866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ChanWoo {
	public static void main(String[] args) throws Exception{
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(rd.readLine());
		
		ArrayList<String> deck = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		

		for(int i = 0; i < input; i++) {
		
			String question = rd.readLine().trim();
			String[] str = question.split(" ");
			
			if(str[0].equals("push_front")) {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(str[1]);
				for(int j = 0; j < deck.size() ; j++) {
					temp.add(deck.get(j));
				}
				deck = temp;
				
				
			}else if(str[0].equals("push_back")){
				
				deck.add(str[1]);
				
				
			}else if(str[0].equals("pop_front")){
				if(deck.isEmpty() == true) {
					result.add(-1+"");
				}else {
					result.add(deck.get(0));
					deck.remove(0);
				}
				
			}else if(str[0].equals("pop_back")){
				if(deck.isEmpty() == true) {
					result.add(-1+"");
				}else {
					result.add(deck.get(deck.size()-1));
					deck.remove(deck.size()-1);
				}
				
			}else if(str[0].equals("size")) {
				result.add(deck.size()+"");
				
			}else if(str[0].equals("empty")) {
				if(deck.isEmpty() == true) {
					result.add(1+"");
				}else{
					result.add(0+"");
				}
				
			}else if(str[0].equals("front")) {
				if(deck.isEmpty() == true) {
					result.add(-1+"");
				}else {
					result.add(deck.get(0));
				}
			}else if(str[0].equals("back")) {
				if(deck.isEmpty() == true) {
					result.add(-1+"");
				}else {
					result.add(deck.get(deck.size()-1));
				}
			}
		
		}
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}	
	}
}