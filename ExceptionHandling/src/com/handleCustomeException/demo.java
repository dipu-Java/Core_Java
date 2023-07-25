package com.handleCustomeException;

public class demo {
	public static void main(String[] args) {
		int i = 1000;
		for (int n = 1; n <= i; n++) {
			if (isHappy(n) == 1)
				System.out.println(n);

		}
	}

	static int isHappy(int n) {

		int flag = 0;
		int sum = 0;
		while (n > 9) {
			sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem * rem;
				n /= 10;
			}
			n = sum;
		}
		if (n == 1) {
//			System.out.println("ha");
			flag = 1;
		}
		return flag;
	}
}
