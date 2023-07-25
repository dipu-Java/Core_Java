package com.project.example;

import com.interfaces.example.*;
import com.interfaces.example.payOption;

public class flipkart {
	static int count;
	int fid;
	String name;
	String gender;
	static {
		count = 1000;
	}
	{
		count++;
		fid = count;
	}
   flipkart(String name,String gender){
	   this.name=name;
	   this.gender=gender;
   }
   public void purchase() {
	   System.out.println("flipkart.purchase()");
   }
   public void continuepayment() {
	   payOption p=new payOption();
		mobikwik m=p.getpayment();
		m.pay();
   }
   public String toString() {
	return "fid  "+fid+" \n name "+name+"\n gender "+gender ;
	   
   }
}
