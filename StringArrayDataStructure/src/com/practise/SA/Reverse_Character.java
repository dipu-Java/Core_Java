package com.practise.SA;

public class Reverse_Character {
	public static void main(String[] args) {
		String s = "java is easy";
		String s1 = "";
		String s3 = "";
		char[] c = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += c[i];
		}
		String s2 = s1;
		char[] c1 = s2.toCharArray();
		int len = s2.length();
		int i = 0;
		int j = 0;
		while (len > j) {
			while (len > j && c1[j] != ' ') {
				j++;
			}
			int k = j - 1;
			String tem = "";
			while (k >= i) {
				tem += c1[k];
				k--;
			}
			s3 += tem + " ";
			j = j + 1;
			i = j;
		}
		System.out.println(s3);
	}
}
