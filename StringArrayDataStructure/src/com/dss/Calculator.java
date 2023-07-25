package com.dss;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number");
		String n = s.next();
		System.out.println("chose one : " + "    +,-,*,/,%");
		String s1 = s.next();
		System.out.println("enter 2nd number");
		String n1 = s.next();
		String s2 = "";
		int res = 0;
		switch (s1) {
		case "+": {
			res=0;
			int sum = 0;
			char[] c = s2.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] >= '0' && c[i]<= '9') {
					sum += c[i] - '0';
				}
			}
			System.out.println(sum);
			break;
		}

		}
	}

}
