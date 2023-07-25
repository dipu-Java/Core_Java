package com.String.example;
import java.util.Scanner;
public class displayFirst_nonRepeatCharacter {

	public static void main(String[] args) {
//       Scanner scan=new Scanner(System.in);
//       System.out.println("enter yout String");
//       String s=scan.next();
		String s="jjaga";
       for(int i=0;i<s.length();i++) {
    	   boolean b=true;
    	   for(int j=0;j<s.length();j++) {
    		   if(i!=j&&s.charAt(i)==s.charAt(j)){
    			   b=false;
    			   break;
    		   }
    	   }
    	   if(b) {
    		   System.out.println(s.charAt(i));
    		   break;
    	   }
       }
	}

}
