package com.String.example;

import java.util.Scanner;

public class removeDuplicate_printUnquie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your string");
		String s = scan.next();
		while (s.length() > 0) {
			char a = s.charAt(0);
			String temp = s.replace(a + "", "");
			int count = s.length() - temp.length();
			if (count == 1) {
				System.out.println(a);
			}
			s = temp;
		}
	}

}
