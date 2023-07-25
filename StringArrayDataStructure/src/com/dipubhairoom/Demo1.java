package com.dipubhairoom;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choices");
		int n = s.nextInt();
		int k = s.nextInt();
		String[] ss = new String[5];
		for (int i = 0; i < n; i++) {
			ss[i] = s.next();
		}
		System.out.println(ArrayFrequent(n, k, ss));
	}

	public static int ArrayFrequent(int n, int k, String[] ss) {
		HashMap<String, Integer> hs = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String key = ss[i];
			hs.put(key, hs.getOrDefault(key, 0) + 1);
		}
		int sum = 0;
		for (Map.Entry<String, Integer> e : hs.entrySet()) {
			int ff = e.getValue();
			if (ff % k == 0) {
				sum += Integer.parseInt(e.getKey());
			}
		}
		return sum;
	}

}
