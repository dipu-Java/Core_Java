package com.practise.SA;

public class Demo14 {
	public static void main(String[] args) {
		String s = "java is easy";
		int count = 0;
		int i = 0;
		int j = 0;
		String s1 = "";
		String e = "";
		int k = 0;
		int store = 0;
		int l = s.length();
		char[] c = s.toCharArray();
		while (j < l) {
			while (j < l && c[j] != ' ') {
				j++;
			}
			count++;
			if (count == 2) {
				k = j - 1;
				while (store < k) {
					e += c[k];
					k--;
				}
				s1 += e + " ";
				j = j + 1;
				i = j;

			} else {
				if (count == 1) {
					store = j;
				}
				k = j - 1;
				String temp = "";
				while (i <= k) {
					temp += c[i];
					i++;
				}
				s1 += temp + " ";
				j = j + 1;
				i = j;
			}
		}
		System.out.println(s1);
	}
}
