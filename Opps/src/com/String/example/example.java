package com.String.example;

public class example {

	public static void main(String[] args) {
		String s = "dipu nayak";
		String s2 = "";
		int i = 0;
		int len = s.length();
		int j = 0;
		char[] c = s.toCharArray();
		while (j < len) {
			while (j < len && c[j] != ' ') {
				j++;
			}
			int k = j - 1;
			String temp = "";
			while (i <= k) {
				temp += c[k];
				k--;
			}
			s2 += temp + " ";
			j = j + 1;
			i = j;
		}
		System.out.println(s2);
	}

}
