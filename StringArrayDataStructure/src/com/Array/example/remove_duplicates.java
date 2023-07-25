package com.Array.example;

public class remove_duplicates {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 7, 2, 5, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[i] = ' ';
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ') {
				temp = a[i];
				System.out.println(temp);
			}

		}

	}

}
