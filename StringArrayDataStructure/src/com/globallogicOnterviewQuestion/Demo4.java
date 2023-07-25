package com.globallogicOnterviewQuestion;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 3, 9, 10 };
		System.out.println(theLastElement(a.length, a));
	}

	public static int theLastElement(int n, int[] a) {
		Arrays.sort(a);
		return a[n / 2];
	}
}
