package com.dss;

public class Maximum_occurance_position {

	public static void main(String[] args) {
		String s = "aaabbcdddeeeee";
		char len = ' ';
		int max = 0;
		while (s.length() > 0) {
			char c = s.charAt(0);
			String temp = s.replace(c + "", "");
			int count = s.length() - temp.length();
			if (max < count) {
				len = c;
			}
			s = temp;

		}
		System.out.println(len);

	}

}
