package com.String.example;

public class StringAnagram {
	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
//		System.out.println(isAnagram(s1, s2));
		if (isAnagram(s1, s2) == 1) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}

	public static int isAnagram(String s1, String s2) {
		int flag = 1;
		while (s1.length() > 0 && s2.length() > 0) {
			char c = s1.charAt(0);
			s1 = s1.replace(c + "", "");
			s2 = s2.replace(c + "", "");
			if (s1.length() != s2.length())
				flag = 0;
		}
		return flag;
	}
}
