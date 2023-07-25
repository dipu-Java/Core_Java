package com.dss;

public class example {
	public static void main(String[] args) {
		String s = "malayalam";
		String temp = "";
		String t = "";
		String empty = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isPallendrome(s, i, j)) {
//					if (s.substring(i, j).length() > temp.length()) {
//						temp = s.substring(i, j + 1);
//					}
					temp = s.substring(i, j + 1);
					if (t.length() < temp.length()) {
						t = temp;
						if (empty.length() < temp.length()) {
							empty = temp;
						}
					} else if (empty.length() < temp.length()) {
						empty = temp;
					}
				}
			}
		}
		System.out.println(temp + " " + empty);
	}

	public static boolean isPallendrome(String s, int i, int j) {
//		int i=start,j=end;
		while (i < +j) {
			if (s.charAt(i) != s.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}
}
