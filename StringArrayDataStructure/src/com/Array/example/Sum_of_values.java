package com.Array.example;

public class Sum_of_values {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 6, 7, 8 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

}
