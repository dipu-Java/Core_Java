package com.interfaces.example;
import java.util.Scanner;
public class payOption {
   public  mobikwik getpayment() {
	  Scanner s=new Scanner(System.in);
	  System.out.println("upi option \n");
	  System.out.println("1.cash on\n"+"2.netBanking\n"+"3.creditCard\n"
	  +"4.debitcard");
	  int choice =s.nextInt();
	  if(choice==1)return new cashOn();
	  if(choice==2)return new netBanking();
	  if(choice==3)return new creditCard();
	  if(choice==4)return new debitCard();
	  System.out.println("payment not selected");
	return null;
	   
   }
}
