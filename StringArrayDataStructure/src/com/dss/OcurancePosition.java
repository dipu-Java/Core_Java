package com.dss;

public class OcurancePosition {

	public static void main(String[] args) {
		String s = "jspiders";
		while(s.length()>0) {
			char c=s.charAt(0);
			String temp=s.replace(c+"","");
			int count=s.length()-temp.length();
System.out.println(c+"  ocurance position is : "+count);
        s=temp;
		}
	}
}

