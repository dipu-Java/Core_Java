package com.dss;

public class StringEx2 {
	public static void main(String[] args) {
		String s1 = "java is robust language";
		String s2 = "okay";
		int count = 1;
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
			}
		}
		String c = replace(s1, s2, count);
		System.out.println(c);

	}

	public static String replace(String s1, String s2, int count) {
		String temp = "";
		String[] split = s1.split(" ");
		int g = split.length;
		int i = 0;
		while (i < g - 1) {
			temp += " " + split[i];
			i++;
		}
		temp += "  " + s2;

		return temp;
	}
}
