package com.String.example;

import java.util.Scanner;

public class OcuurenceOfCharacter {
	public static void main(String[] args) {
//		System.out.println("Enter your string ");
//		String s = new Scanner(System.in).next();
		String s = "banana";
		ocuurenece(s);
	}

	public static void ocuurenece(String s) {// anana
		while (s.length() > 0) {
			char c = s.charAt(0);// b//a
			String temp = s.replace(c + "", "");
			int count = s.length() - temp.length();
			System.out.println("the ocuurence char of " + c + " " + count);
			s = temp;
		}
	}
}
