package com.practise.SA;

public class Java_is_Easy {
	public static void main(String[] args) {
		String s = "java is easy";
		String s2 = "";
		int i = s.length() - 1;
		int j = s.length() - 1;
		char[] c = s.toCharArray();
		while (j >=0) {
			while (j >=0 && c[j] != ' ') {
				j--;
			}
			int k = j + 1;
			String temp = "";
			while (k <= i) {
				temp += c[k];
				k++;
			}
			s2 += temp + " ";
			j = j - 1;
			i = j;

		}
		System.out.println(s2);
	}
}
