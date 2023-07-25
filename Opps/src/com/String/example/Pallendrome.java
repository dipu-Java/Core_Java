package com.String.example;
import java.util.Scanner;
public class Pallendrome {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your required name");
	String s=scan.next();
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(rev.equals(s)) {
		System.out.println("pallendrome");
	}
	else {
		System.out.println("not a pallendrome");
	}
	}

}
