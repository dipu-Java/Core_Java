package com.dss;

public class example2 {
	public static void main(String[] args) {
		String s = "My Name Is java";
		int count = 0;
		int i = 0;
		String x = "";
		int t = 0;
		String s2 = "";
		String s3 = "";
		char[] c = s.toCharArray();
		while (i < s.length()) {
			if (c[i] == ' ') {
				i = i + 1;
				count = 0;
			}
			count++;
			if (count == 1 && c[i] >= 97 && c[i] <= 122 && c[i] != ' ') {
				x += (char) (c[i] - 32);
			} else {
				s2 += c[i];
			}
			s3 = x + s2 + " ";

			i++;
		}

		System.out.println(s3);
	}
}
