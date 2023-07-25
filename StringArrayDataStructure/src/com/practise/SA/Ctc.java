package com.practise.SA;

public class Ctc {
	public static void main(String[] args) {
		String s = "malayalam";
		String s1 = "";
		String s2 = "";
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (Pallendrome.ispalendrome(s, i, j)) {
					temp = s.substring(i, j + 1);
				}
				if (!(temp).equals(s) && temp.length() > s1.length()) {
					s1 = temp;
				}
			}
		}
		System.out.println(s1);
	}
}
