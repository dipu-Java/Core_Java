package com.dss;

public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "java is very easy";
		String s2 = "hard";
		int len = s1.length();
		int i = 0;
		int j = 0;
		char[] ch = s1.toCharArray();
		char[] x2 = s2.toCharArray();
		while (j < len) {
			while (j != len) {
				j++;
			}
			int k = j - 1;
			String temp = "";
			while (ch[k] != ' ') {
				k--;
			}
			int tem = k + 1;
			while (tem < j) {
				temp += ch[tem];
				tem++;
			}
			s1 = s1.replace(temp, "");
			s1 = s1 + s2;
			break;
		}
		System.out.println(s1);
	}
}
