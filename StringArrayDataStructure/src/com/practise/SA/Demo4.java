package com.practise.SA;

public class Demo4 {

	public static void main(String[] args) {
		String s = "coReJavA9";
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (c[i] >= 97 && c[i] <= 122) {
				c[i] = (char) (c[i] - 32);
			} else if (c[i] >= 65 && c[i] <= 90) {
				c[i] = (char) (c[i] + 32);
			} else {
				System.out.println("  you are enter wrong character");
			}
			System.out.print(c[i]);
		}
	}

}
