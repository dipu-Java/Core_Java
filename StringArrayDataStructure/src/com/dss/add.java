package com.dss;

public class add {
	public static void main(String[] args) {
		String s = "7+8";
		int sum = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				sum += c[i] - '0';
			}
		}
		System.out.println(sum);
	}
}