package com.dss;

public class firstChar_into_capital {
	public static void main(String[] args) {
		String s = "my name is java";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				ch[i] = (char) (ch[i] - 32);
			}
			if (ch[i] == ' ' && ch[i + 1] != ' ') {
				ch[i + 1] = (char) (ch[i + 1] - 32);
			}
		}
		System.out.println(ch);
	}
}
