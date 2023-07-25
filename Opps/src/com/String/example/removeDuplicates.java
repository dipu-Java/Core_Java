package com.String.example;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mihir";
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (temp.indexOf(c) == -1) {
				temp += c;
			}
		}
		System.out.println(temp);
	}

}
