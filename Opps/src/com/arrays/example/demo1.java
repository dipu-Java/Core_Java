package com.arrays.example;

import java.util.Arrays;

public class demo1 {

	public static void main(String[] args) {
		String[] s = { "dipu", "mihir", "rashmi", "lipun", "siba", "t" };
		String temp = " ";

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) < 0) {
					temp = s[j];
					s[j] = s[i];
					s[i] = temp;
				}

			}
		}
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i] + " ");
//		}
		System.out.println(Arrays.toString(s));
	}

}
