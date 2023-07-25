package com.app;

public class example2 {

	public static void main(String[] args) {
		String s = "madam";
		while(s.length()>0) {
			char c=s.charAt(0);
			String temp=s.replace(c+"","");
			int count=s.length()-temp.length();
			System.out.println(c+"  "+count);
			s=temp;
		}
	}

	

}
