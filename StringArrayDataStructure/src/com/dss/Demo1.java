package com.dss;

public class Demo1 {
	public static void main(String[] args) {

		String n1 = "dipu";//
		String n2 = "Bhai";// bhxai
		String s = "or92335uhg";
		int sum = 0;
		String temp = "";
		String x = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				sum += ch[i] - '0';
			} else {
				temp += ch[i];
			}
		}
		System.out.println(sum + " " + temp);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) {
				x += (char) (ch[i] - 32);
			}
		}
		System.out.println(x);

	}
}
/*
 * 1>length() 2>toCharArray() 3>charAt() 4>replace() 5>indexOf() 6>substring()
 * 7>valueOf() 8>toUpperCase 9>toLoweCase
 * 
 */
