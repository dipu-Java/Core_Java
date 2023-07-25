package com.practise.SA;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Demo2 d = new Demo2();
			d.isNegative(-1);
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}

	void isNegative(int input) {
		if (input >= 0) {
			throw new RuntimeException();
		}

	}
}
