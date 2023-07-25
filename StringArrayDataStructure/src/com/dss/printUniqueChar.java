package com.dss;

public class printUniqueChar {

	public static void main(String[] args) {
		String s = "java";
		while (s.length() > 0) {
			char c = s.charAt(0);
			String temp = s.replace(c + "", "");
			int count = s.length() - temp.length();
			if (count == 1)
				System.out.println("unique character is  " + c);
			s = temp;
		}
	}

}
