package com.backjoon.b203.q11656;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HyeIn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		ArrayList<String> subwords = new ArrayList<String>();
		
		for(int i=0; i<word.length(); i++) {
			subwords.add(word.substring(i));
		}
		
		Collections.sort(subwords);
		
		for(String subword : subwords) {
			System.out.println(subword);
		}
		
	}
}
