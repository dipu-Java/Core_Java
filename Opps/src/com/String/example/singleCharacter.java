package com.String.example;
//   import java.util.Scanner;
public class singleCharacter {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter your character");
//		String c=scan.next();
   String s="mihri";
   char c1='i';
   int count=0;
   for(int i=0;i<s.length();i++) {
	   if(s.charAt(i)==c1) {
		   count++;
	   }
   }
   System.out.println(count);	}

}
