package com.dss;

public class firstNonRepeatedCharacter2 {
	public static void main(String[] args) {
		String s = "madam ";
		System.out.println(print(s));
	}

	public static Character print(String s) {
		char[] c = s.toCharArray();
		char temp = ' ';
		char ss = ' ';
		boolean b = false;
		while (s.length() > 0) {
			char x = s.charAt(0);
			String t = s.replace(x + "", "");
			int count = s.length() - t.length();
			if (count == 1) {
				if (temp < x) {
					ss = temp;// ' ',j,
					temp = x;// j
					b = true;

				}
				if (b) {
					if (ss != ' ' && ss < temp) {
						temp = ss;
					}
				}

			}
			s = t;

		}
		return temp;
	}
}
