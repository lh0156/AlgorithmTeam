package com.backjoon.b200.q10828;

import java.util.ArrayList;
import java.util.Scanner;

public class ChanWoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean q = true;
		ArrayList<Integer> stack = new ArrayList<Integer>();
		int check = -1;
		while(q) {
			String str = sc.nextLine();
			
			str = str.trim();
			
			if(str.indexOf("push") > -1) {
				
				str = str.substring(4,str.length()).trim();
				int add = Integer.parseInt(str);
				stack.add(add);
				check++;
				
			}else {
				switch(str) {
					case "q":
						q = false;
						break;
					case "empty":
						if(stack.isEmpty() == true) {
							System.out.println("1");
							break;
						}else {
							System.out.println("0");
							break;
						}
					case "size":
						System.out.println(stack.size());
						break;
					case "top":
						if(check == -1) {
							System.out.println("-1");
							break;
						}else {
							System.out.println(stack.get(check));
							break;
						}
					case "pop":
						if(check == -1) {
							System.out.println("-1");
						}else {
							System.out.println(stack.get(check));
							stack.remove(check);
							check--;
							break;
						}
				}
			}
		}
	}
}
