package com.dss;
import java.util.Scanner;
public class calculator1 {
	
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String s = "4+8";
			System.out.println("enter symbol " + "+,-,*,/,%");
			String c = scn.next();
			int res = 0;
			switch (c) {
			case "+": {
				res = 0;
				char[] ch = s.toCharArray();
				int sum = 0;
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] >= '0' && ch[i] <= '9') {
						sum += ch[i] - '0';
					}
				}
				System.out.println(sum);
				break;
			}
			case "-": {
				res = 0;
				int count = 0;
				int n1 = 0;
				int n2 = 0;
				char[] ch1 = s.toCharArray();
				for (int i = 0; i < ch1.length; i++) {
					if (ch1[i] >= '0' && ch1[i] <= '9') {
						count++;

						if (count == 1) {
							n1 = ch1[i] - '0';
						} else {
							n2 = ch1[i] - '0';
						}
					}
				}
				res = n1 - n2;
				System.out.println(res);
				break;
			}
			case "*": {
				res = 0;
				int count = 0;
				int n1 = 0;
				int n2 = 0;
				char[] ch1 = s.toCharArray();
				for (int i = 0; i < ch1.length; i++) {
					if (ch1[i] >= '0' && ch1[i] <= '9') {
						count++;

						if (count == 1) {
							n1 = ch1[i] - '0';
						} else {
							n2 = ch1[i] - '0';
						}
					}
				}
				res = n1 * n2;
				System.out.println(res);
				break;
			}
			case "/": {
				res = 0;
				int count = 0;
				int n1 = 0;
				int n2 = 0;
				char[] ch1 = s.toCharArray();
				for (int i = 0; i < ch1.length; i++) {
					if (ch1[i] >= '0' && ch1[i] <= '9') {
						count++;

						if (count == 1) {
							n1 = ch1[i] - '0';
						} else {
							n2 = ch1[i] - '0';
						}
					}
				}
				res = n1 / n2;
				System.out.println(res);
				break;
			}
			case "%": {
				double t = 0;
				int count = 0;
				int n1 = 0;
				int n2 = 0;
				char[] ch1 = s.toCharArray();
				for (int i = 0; i < ch1.length; i++) {
					if (ch1[i] >= '0' && ch1[i] <= '9') {
						count++;

						if (count == 1) {
							n1 = ch1[i] - '0';
						} else {
							n2 = ch1[i] - '0';
						}
					}
				}
				t = n1 % n2;
				System.out.println(t);
				break;
			}

			}
		}
	}

