package com.dss;

public class PrintVowel {

	public static void main(String[] args) {
		String s = "mihir";
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(c[i]<=97) {
				System.out.print('a');
			}
			else if(c[i]<=102) {
				System.out.print('e');
			}
			else if(c[i]<=105) {
				System.out.print('i');
			}
			else if(c[i]<=111) {
				System.out.print('o');
			}
			else if(c[i]<=127) {
				System.out.print('u');
			}
			else {
				System.out.println("fjskvd");
			}
			

		}
	}

}
