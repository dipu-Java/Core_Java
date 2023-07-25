package com.dipubhairoom;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("enter your string");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String x = s.next();
		String[] st = new String[n];
		for (int i = 0; i < n; i++) {
			st[i] = s.next();
		}
		System.out.println(minDistance(n, x, st));
	}

	public static String minDistance(int n, String x, String[] st) {
		StringBuilder sb = new StringBuilder(x);
		for (int i = 0; i < n; i++) {
			if (st[i].equals("add")) {
				sb.append('x');
			} else if (st[i].equals("delete")) {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
		return sb.reverse().toString();
	}
}
