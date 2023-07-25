package com.practise.SA;

public class RepeatCharTo_Number {
	public static void main(String[] args) {
		String str = "HelloWorld";
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 49;
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = (char) (count);
					}
				}
				if (count > 49)
					arr[i] = 49;
			}
		}
		String s = new String(arr);
		System.out.println(s);
	}
}
