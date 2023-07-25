package com.project.example;

import java.util.Arrays;

public class example {

	public static void main(String[] args) {

		int[] a = { 12, 43, 5, 6, 0, 7, 8 };

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[i] = 'a';
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
