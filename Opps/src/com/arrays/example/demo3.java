package com.arrays.example;

public class demo3 {
	public static void main(String[] args) {
		String s = "abcaaccccbddddd";
		char a = ' ';
		int t = 0;
		while (s.length() > 0) {
			char c = s.charAt(0);
			String temp = s.replace(c + "", "");
			int count = s.length() - temp.length();
			if (count > t) {
				t = count;
				a = c;
			}

			s = temp;
		}
		System.out.println(a + "  " + t);
	}
}