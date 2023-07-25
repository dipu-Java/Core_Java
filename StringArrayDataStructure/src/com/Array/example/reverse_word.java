package com.Array.example;

public class reverse_word {
	public static void main(String[] args) {
		String s = "i love programming very much ";
		String temp = "";
		String s3 = "";
		char[] c = s.toCharArray();
		for (int a = s.length() - 1; a >= 0; a--) {
			temp += c[a];
		}
		s3 = temp;
		int len = s3.length();
		char[] c1 = s3.toCharArray();
		String s2 = "";
		int j = 0;
		int i = 0;
		while (j < len) {
			while (j < len && c1[j] != ' ') {
				j++;
			}
			int k = j - 1;
			String tem = "";
			while (i <= k) {
				tem += c1[k];
				k--;
			}
			s2 += tem + " ";
			j = j + 1;
			i = j;
		}
		System.out.println(s2);
	}
}
