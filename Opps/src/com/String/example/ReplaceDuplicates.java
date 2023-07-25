package com.String.example;

public class ReplaceDuplicates {
	public static void main(String[] args) {
		String s = "mihir";
		String temp = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[i] = ' ';
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				temp += ch[i];
			}
		}
		System.out.println(temp);
	}
}
