package com.practise.SA;

public class Reverse_javaIsEasy {
	public static void main(String[] args) {
		String s = "java is easy";
		String s1 = "";
		int i = 0;
		int j = 0;
		int len = s.length();
		char[] c = s.toCharArray();
		while (j < len) {
			while (len > j && c[j] != ' ') {
				j++;
			}
			int k = j - 1;
			String temp = "";
			while (k >= i) {
				temp += c[k];
				k--;
			}
			s1 += temp + " ";
			j = j + 1;
			i = j;
		}
		System.out.println(s1);
	}
}
