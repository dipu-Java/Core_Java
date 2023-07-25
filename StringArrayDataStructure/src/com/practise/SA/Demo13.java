package com.practise.SA;

public class Demo13 {
	public static void main(String[] args) {
//	String s="123";
//	String s1="";
//	for(int i=0;i<s.length();i++) {
//		for(int j=i+1;j<s.length();j++) {
//			System.out.println(s.substring(i,j+1));
//		}
//		
//	}
		String s = "core";
		String s1 = "java";
        for(int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        	if(s.indexOf(c)==-1) {
        		s1+=c;
        	}
        	 System.out.println(s1);
        }
       
	}
}
