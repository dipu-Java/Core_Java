package com.practise.SA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("eneter your String");
		Scanner scn = new Scanner(System.in);
		String[] s = new String[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = scn.next();
		}
		System.out.println(checkFrequency(s));

	}

	public static int checkFrequency(String[] c) {
		int num = 2;
		Map<String, Integer> m = new HashMap<String, Integer>();
		int ff = 0;
		for (int i = 0; i < c.length; i++) {
			String key = c[i];
			m.put(key, m.get(key) == null ? 1 : m.get(key) + 1);

		}
		for (int i = 0; i < c.length; i++) {
			ff = m.get(c[i]);
			if (ff % num == 0) {
				System.out.println(c[i]);
			}
		}
		return ff;

	}

}
