package com.globallogicOnterviewQuestion;

public class Aa {
	public static void main(String[] args) {
		int[] x = { 12, 54, 22, 98, 76, 19 };
		int length = x.length;
		int num1 = 0, num2 = 0;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			int temp = x[i];
			sum = 0;
			num1 = 0;
			num2 = 1;
			while (temp > 0) {
				int r = temp % 10;
				num1 += r;
				num2 *= r;
				temp = temp / 10;
			}
			//System.out.println(num1 + " " + num2);
			if (num1 % length == 0 && num2 % length == 0) {
				System.out.println(x[i]%10);
			}
		}
	}
}
