package com.practise.SA;

public class Repeated_Char_to_Number {
	public static void main(String[] args) {
		String s = "madm";
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
//			boolean b = true;
			int count = 49;
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = (char) (count);
//					b = false;
				}
			}
			if (count>49) {
				c[i] = 49;

			}
		}
		System.out.println(c);

	}
}
