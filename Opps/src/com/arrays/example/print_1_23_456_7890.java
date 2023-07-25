package com.arrays.example;

public class print_1_23_456_7890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (count >= a.length) {
					break;

				}
				System.out.print(a[count++] + " ");

			}
			System.out.println();
		}
	}

}
