package com.dss;

public class Anagram {
	public static void main(String[] args) {
		String s = "madam";
		String s1="maamd";
		while(s.length()>0&&s.length()>0) {
			char c=s.charAt(0);
			s=s.replace(c+"", "");
			s1=s1.replace(c+"", "");			
		}
		if(s.equals(s1)) {
			System.out.println("anagram");
		}else {
			System.out.println("not a anagram");
		}
	}
}
