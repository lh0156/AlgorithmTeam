package com.backjoon.b200.q1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Hyein {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = reader.readLine();
		int M = Integer.parseInt(reader.readLine());
		
		Stack<Character> lStack = new Stack<Character>();
		Stack<Character> rStack = new Stack<Character>();
		
		for(int i = 0; i < input.length(); i++) {
			
			lStack.push(input.charAt(i));
		}
				
		for(int i = 0; i < M; i++) {
			
			String command = reader.readLine();
			
			switch (command.charAt(0)) {
			
			case 'L' :
				if(!lStack.empty()) {
					rStack.push(lStack.pop());					
				}
				break;
				
			case 'D' :
				if(!rStack.empty()) {
					lStack.push(rStack.pop());
				}
				break;
				
			case 'B' :
				if(!lStack.empty()) {
					lStack.pop();
				}
				break;
				
			case 'P' :
				lStack.push(command.charAt(2));
				break;

			default:
				break;
			}
			
		}
		
		while(!lStack.empty()) {
			rStack.push(lStack.pop());
		}
		
		while(!rStack.empty()) {
			writer.write(rStack.pop());
		}
		writer.flush();
		writer.close();
		
	}
}
