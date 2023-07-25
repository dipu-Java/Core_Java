package com.ClassCalling.example;
import java.util.Scanner;
public class Code {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("wel come to my logic world");
     for(;;) {
    	 System.out.println("1. length");
    	 System.out.println("2. factorial");
    	 System.out.println("3. power");
    	 System.out.println("4. reverse");
    	 System.out.println("5. armstrong");
    	 System.out.println("6. strong");
    	 System.out.println("7. rangeArmstrong");
    	 System.out.println("8. rangeStrong");
    	 System.out.println("9. Automorphic");
	   System.out.println("Enter your choice");
	   int choice=s.nextInt();
	   if(choice==1) {
		   System.out.println("length");
		   System.out.println("Enter number: ");
		   int n=s.nextInt();
		   int res=utility.length(n);
		   System.out.println(res);   
	   }
	   else if(choice==2){
		   System.out.println("factorial");
		   System.out.println("Enter number: ");
		   int n=s.nextInt();
		   int res=utility.factor(n);
		   System.out.println(res);   
	   }
	   else if(choice==3) {
		   System.out.println("power");
		   System.out.println("Enter base: ");
		   int base=s.nextInt();
		   System.out.println("Enter exponent: ");
		   int exp=s.nextInt();
		   int res=utility.power(base,exp);
		   System.out.println(res);   
	   }
	   else if(choice==4){
		   System.out.println("reverse");
		   System.out.println("Enter number: ");
		   int n=s.nextInt();
		   int res=utility.reverse(n);
		   System.out.println(res);   
	   }
	   else if(choice==5){
		   System.out.println("armstrong");
		   System.out.println("Enter number: ");
		   int n=s.nextInt();
		   int res=utility.armstrong(n);
		   if(n==res)  System.out.println("armstrong");
		   else  System.out.println("not armstrong");
	   }
	   else if(choice==6){
		   System.out.println("strong");
		   System.out.println("Enter number: ");
		   int n=s.nextInt();
		   int res=utility.strong(n);
		   if(n==res) System.out.println("strong");
		   else  System.out.println("not strong");
	   }
	   else if(choice==7){
		   
		   System.out.println("rangeArmstrong");
		   System.out.println("Enter 1st number: ");
		   int start=s.nextInt();
		   System.out.println("Enter 2nd number: ");
		   int end=s.nextInt();
		   for(int n=start;n<=end;n++) {
		   if(n==utility.rangeArmstrong(n)) {	
			   System.out.println(n);
		   }
		   }
	   }
		   else if(choice==8){
			   
			   System.out.println("rangeStrong");
			   System.out.println("Enter 1st number: ");
			   int start=s.nextInt();
			   System.out.println("Enter 2nd number: ");
			   int end=s.nextInt();
			   for(int n=start;n<=end;n++) {
			   if(n==utility.rangeStrong(n)) {	
				   System.out.println(n);
			   }
			   } 
	   }
		   else if(choice==9){
			   System.out.println("automorphic");
			   System.out.println("Enter number: ");
			   int n=s.nextInt();
			   int res=utility.automorphic(n);
			   if(n==res) System.out.println("automorphic");
			   else  System.out.println("not automorphic");
		   }
	   System.out.println("do you want to continue:y");
	   char ch=s.next().charAt(0);
	   if(ch=='y' || ch=='Y') {
		   continue;
	   }
	   else {
		   System.out.println("sir/madam thats okay");
		   System.out.println("thank you for using my code");
		   System.out.println("visit again");
		   break;
	   }
     }
	}

	
}
