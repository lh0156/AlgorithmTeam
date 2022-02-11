package com.backjoon.b201.q17413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChanWoo {
	public static void main(String[] args) throws Exception {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		String str = rd.readLine();
		
		int check = 0;
		String q = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("<")) {
				if (q.length() != 0) {
					for (int j = q.length() - 1; j >= 0; j--) {
						System.out.print(q.charAt(j));
					}
					q = "";
				}
				check = 1;
				System.out.print(str.substring(i, i + 1));
			} else if (str.substring(i, i + 1).equals(">")) {
				check = 0;
				System.out.print(str.substring(i, i + 1));
			} else if (check == 0) {
				if (str.charAt(i) == ' ') {
					if (q.length() != 0) {
						for (int j = q.length() - 1; j >= 0; j--) {
							System.out.print(q.charAt(j));
						}
						q = "";
					}
					System.out.print(" ");
				} else if (i == str.length() - 1) {
					if (q.length() != 0) {
						q += str.charAt(i);
						for (int j = q.length() - 1; j >= 0; j--) {
							System.out.print(q.charAt(j));
						}
					}
				} else {
					q += str.charAt(i);
				}
			} else if (check == 1) {
				System.out.print(str.charAt(i));
			}
		}
	}
}