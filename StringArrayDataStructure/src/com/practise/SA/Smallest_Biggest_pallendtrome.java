package com.practise.SA;
public class Smallest_Biggest_pallendtrome {
	public static void main(String[] args) {
		String s = "malayalam";
		String temp = "";
		String t = "";
		String e = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ispalendrome(s, i, j)) {
					temp = s.substring(i, j + 1);
				}
				if (t.length() < temp.length()) {
					t = temp;
				}
			}
		}System.out.println(temp + " " + t );		
	}
	static boolean ispalendrome(String s, int i, int j) {
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}return true;
	}
}
