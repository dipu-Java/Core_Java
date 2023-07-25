package com.ClassCalling.example;

import java.util.Scanner;

public class SumOfDigit_Using_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		String n = s.next();
		sumOfDigit(n);
	}// 1234

	private static void sumOfDigit(String n) {
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			sum = sum + n.charAt(i) - 48;
			/*
			 * String a = String.valueOf(n.charAt(i)); System.out.println(a); / *
			 */
		}
		System.out.println("sum" + sum);
	}
}
