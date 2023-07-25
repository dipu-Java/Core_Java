package com.String.example;

public class pallendrum2 {

	public static void main(String[] args) {
		String s = "madam";
		int start = 0;
		int end = s.length() - 1;
		if (isPalindrum(s, start, end))
			System.out.println("pallendrome");
	}

	static boolean isPalindrum(String s, int start, int end) {
		int i = start, j = end;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
//95236