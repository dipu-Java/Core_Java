package com.String.example;

public class compare_2_String {

	public static void main(String[] args) {
		String s = "my self dipu";
		String s1 = "dipu";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isContains(s, s1, i, j)) {
					System.out.println(s1);
					return;
				}
			}
		}
	}

	public static boolean isContains(String s, String s1, int i, int j) {
		char[] c = s.toCharArray();
		String temp = "";
		while (i <= j) {
			temp += c[i];
			i++;
		}
		return (temp.equals(s1));
	}
}
