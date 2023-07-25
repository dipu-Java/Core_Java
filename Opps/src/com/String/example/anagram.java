package com.String.example;

public class anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String s1="mdmaa";
		while(s.length()>0&&s1.length()>0) {
			char c=s.charAt(0);
			s=s.replace(c+"","");
			s1=s1.replace(c+"","");
			
		}
		if(s.equals(s1)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}
}
