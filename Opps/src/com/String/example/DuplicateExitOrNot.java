package com.String.example;

public class DuplicateExitOrNot {
public static void main(String[] args) {
	String s1="dipu is a good boy";
	String s2="dipu boy a ";
	String []s3=s1.split(" ");
	String []s4=s2.split(" ");
	System.out.println(isExit( s3, s4));
}

private static boolean isExit(String[] s3, String[] s4) {
	for (int i=0;i<s3.length;i++) {
		for(int j=0;j<s4.length;j++) {			
			if(s3[i].equals(s4[j])) {
				return true;
			}
		}
	}
	return false;
}
}
