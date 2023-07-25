package com.abs.example;

public class Demo1 {
	public static void main(String[] args) {
		AlternativePrime.main(args);
		/*
		 * String s = "DipuBhai"; System.out.println(s.replace(s, "bbsr"));
		 * System.out.println(s); String h = new String("Naresh"); int len = s.length();
		 * System.out.println(len); String d = "mamaxaa"; StringBuffer sb = new
		 * StringBuffer(d); System.out.println(sb.reverse());
		 * System.out.println(sb.append(d));
		 */
	}
}

class AlternativePrime {
	public static void main(String[] args) {
		int temp = 0;
		for (int i = 1; i <= 15; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				if (temp % 2 == 0) {
					System.out.println(i);
				}
				temp++;
			}
		}
	}
}
