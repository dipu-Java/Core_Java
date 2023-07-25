package com.dss;

public class set_Character {

	public static void main(String[] args) {
		String s = "man is name";
		String s2 = "";
		int j = 0;
		int k = 0;
		char t = ' ';
		char temp = ' ';
		char[] c = s.toCharArray();
		for (j = 0; j < s.length(); j++) {
			if (c[j] == ' ') {
				break;
			}
			temp = c[j];
		}
		for (k = s.length() - 1; k >= 0; k--) {
			if (s.charAt(k) == ' ') {
				break;
			}
			t = c[k];
		}
		if (temp == t) {
			System.out.println("set character...");
		} else {
			System.out.println("not a set character");
		}
	}

}
